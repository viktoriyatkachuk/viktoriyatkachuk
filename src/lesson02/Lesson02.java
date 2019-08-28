package lesson02;

public class Lesson02 {

public static void main(String [] args){
        String s1 = "abrakadabra string for test";
        String s2 = "Miracle";
        String s3 = "abcdefg";
        MyString stringN = new MyString ();
        System.out.println ("Input:" + s1);
        s1 = stringN.eachNth (s1, 2);
        System.out.println ("Result:" + s1);
        s2 = stringN.eachNth (s2, 2);
        System.out.println ("Result:" + s2);
        s3 = stringN.eachNth (s3, 3);
        System.out.println ("Result:" + s3);

    }
}
