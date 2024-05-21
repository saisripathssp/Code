public class EndsWithstr {
    public static void main(String[] args) {
        String s1 = "Python Exercises";
        String s2 = "Python Exercise";
        String end_str = "se";

        boolean e1 = s1.endsWith(end_str);
        
        boolean e2 = s2.endsWith(end_str);

        System.out.println("\"" + s1 + "\" ends with " +
            "\"" + end_str + "\"? " + e1);
        System.out.println("\"" + s2 + "\" ends with " +
            "\"" + end_str + "\"? " + e2);
    }
}
