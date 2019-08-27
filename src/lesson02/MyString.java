package lesson02;
 //  В пакете lesson02 создать класс с методом eachNth, который принимает непустую строку и номер n.
 //  Метод должен возвращать строку, состоящую из каждого n-го символа, начия с 0-го.
 //  Например, для n=3, должны возвращаться 0, 3, 6, ... символы исходной строки, т.е.
 //       everyNth("Miracle", 2) → "Mrce"
 //       everyNth("abcdefg", 2) → "aceg"
 //       everyNth("abcdefg", 3) → "adg"

public class MyString {

    public static void main(String[] args) {
        System.out.println("abcdef");
        String cde = "cde12345";
        System.out.println("abc" + cde);
        String c = "012345".substring(1,3);
        System.out.println(c);
        String d = cde.substring(1, 4);
        System.out.println(d);
        String e = "012345";
        System.out.println(e);

    }

}

