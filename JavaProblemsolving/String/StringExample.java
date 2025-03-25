package JavaProblemsolving.String;

import java.util.StringJoiner;

public class StringExample {
    public static void concatenationString_literal() {
        String ch = "Kiru";
        String s = new String("Kiruthika");
        String concatenationString = ch + "thika!";

        System.out.println(ch + concatenationString + s);
        int length = ch.length();
        System.out.println(length);

    }

    public static void tokenizer() {
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("kiru");
        joiner.add("Priya");
        joiner.add("Dharshini");
        System.out.println(joiner.toString());

    }

    public static void stringBuffer() {
        StringBuffer sb = new StringBuffer("Kiru Priya");
        sb.append("Dharshini");
        sb.delete(0, 5);
        System.out.println(sb);
        sb.insert(3, "Dhar");
        System.out.println(sb);
        sb.delete(3, 7);
        System.out.println(sb);

    }

    public static void StringImmutability() {
        String originalString = "Kiruthika";
        String modifiedString = originalString.concat(" Priyadharshini");
        System.out.println(modifiedString);
        System.out.println(originalString.concat("p"));
        originalString.toUpperCase();
        System.out.println(originalString);
        System.out.println(originalString.toUpperCase());
        String upperString = originalString.toUpperCase();
        System.out.println(upperString);
        System.out.println(originalString);

    }

    public static void main(String[] args) {
        // concatenationString_literal();
        // stringBuffer();
        // tokenizer();
        // StringImmutability();
        String s1 = "Harish";
        String S2 = "Harish";
        System.out.println(s1.hashCode());
        System.out.println(S2.hashCode());
        S2 = "Suresh";
        String S3 = "Harish";
        System.out.println(S2.hashCode() + " " + S3.hashCode());

        String str = "Java";
        str = "har";
        // s = s.replace('a', 'o').replace('o', 'i');
        System.out.println(str);
        // System.out.println(a);
    }

}
