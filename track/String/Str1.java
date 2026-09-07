package track.String;

public class Str1 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        if (s1 == s2) {
            System.out.println("Ref is equal");
        } else {
            System.out.println("Ref is not equal");
        }
        if (s1.equals(s2)) {
            System.out.println("String is equal");
        } else {
            System.out.println("String is not equal");
        }
    }

}
