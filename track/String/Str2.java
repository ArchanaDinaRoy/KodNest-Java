package track.String;

public class Str2 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");

        if (s1 == s2) {
            System.out.println("Ref is equal");
        } else {
            System.out.println("Ref is not equal");
        }

        if (s1.equals(s2)) {
            System.out.println("String are same");
        } else {
            System.out.println("String is not same");
        }
    }

}
