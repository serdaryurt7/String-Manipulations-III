package ders11_stringManipulation;

public class C05_repeat_trim {

    public static void main(String[] args) {

        String str = "Java guzeldir\n";

        System.out.println(str.repeat(4)); // Java guzeldir Java guzeldir Java guzeldir Java guzeldir

        str = "   Java guzeldir   ";

        System.out.println(str.length()); // 19 karakter uzunluğunda

        str = str.trim();  // Başındaki ve sonundaki boşlukları silen method trim

        System.out.println(str);  // Java guzeldir
        System.out.println(str.length());  // 13

    }
}
