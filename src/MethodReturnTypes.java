public class MethodReturnTypes {
    public static void main(String[] args) {
        String word = words();
        System.out.println(word);
        int num = number();
        System.out.println(num);
        boolean isFalse = bool();
        System.out.println(isFalse);
    }

    public static String words() {
        return "Matt, can you bring beer from Town next thursday?";
    }

    public static int number() {
        return 1;
    }

    public static boolean bool() {
        return number() == 1;
}
}
