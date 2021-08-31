public class Bai_1 {
    /**
     * Cho chuỗi sau: You Only Live Once. But if You do it right. once is Enough
     * Đếm số từ viết in hoa trong chuỗi (VD: chuỗi trên có 7 ký tự in hoa)
     * Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó
     * (VD: You Only Live Once. But If You Do It Right. Once Is Enough)
     * Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa,
     * các chữ con lại viết thường (VD: You only live once. But if you do it right. Once is enough)
     */

    private static String string = "You Only Live Once. But if You do it right. once is Enough";

    public static int countUpperCase(String s) {
        int count = 0;
        char[] arrChar = s.toCharArray();
        for (int i = 0; i < arrChar.length; i++) {
            if (Character.isUpperCase(arrChar[i])) {
                count++;
            }
        }
        return count;
    }

    public static String getUpperCase(String s) {
        String re = "";
        String[] arrS = s.split(" +");
        for (int i = 0; i < arrS.length; i++) {
            re += arrS[i].substring(0, 1).toUpperCase();
            re += arrS[i].substring(1) + " ";
        }
        return re;
    }

    public static String changeChar(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '.')
                arr[i + 2] = Character.toUpperCase(arr[i + 2]);
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {

//        System.out.print("The number of capital letters in the string: " + countUpperCase(string));
//        System.out.println();
//        System.out.print("Capitalize all first letters of words in a string: " + getUpperCase(string));
        System.out.println();
        System.out.print("Change char in a string: " + changeChar(string));
    }
}
