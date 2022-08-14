package Revision;

public class Ilu {



    public static void main(String[] args) {

        String s = "I love you India";
        String b = "";
        char a;

        for (int i = 0; i<s.length();i++)
        {
            a = s.charAt(i);
            b = a+b;
        }
        System.out.println(b);

    }
}
