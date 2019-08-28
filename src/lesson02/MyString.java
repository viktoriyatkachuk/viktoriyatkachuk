package lesson02;
 //  В пакете lesson02 создать класс с методом eachNth, который принимает непустую строку и номер n.
 //  Метод должен возвращать строку, состоящую из каждого n-го символа, начия с 0-го.
 //  Например, для n=3, должны возвращаться 0, 3, 6, ... символы исходной строки, т.е.
 //       everyNth("Miracle", 2) → "Mrce"
 //       everyNth("abcdefg", 2) → "aceg"
 //       everyNth("abcdefg", 3) → "adg"

public class MyString {
    public String eachNth(String str, int n){
        String result = "";
//        System.out.println("input= "+str);
        if (str.isEmpty ()) return result;

        for (int i = 0; i <str.length();) {
//            System.out.println (i + " = " + result);
            result = result + str.charAt (i);
            i=i+n;
        }
        return result;
    }
}
