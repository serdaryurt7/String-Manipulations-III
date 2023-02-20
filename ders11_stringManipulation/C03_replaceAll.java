package ders11_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str = "J1ava2 G9uzel5dir8";

        // str'daki sayıları silip metni Java Guzeldir haline dönüştürelim.

        // str.replaceAll() metodu ile sadece bir harf veya char sequence'i değil
        // genelleme ile söyleyebileceğimiz ortak özellikteki tüm karakterleri değiştirir.

        System.out.println(str.replaceAll("\\d", "")); // Java Guzeldir

        System.out.println(str.replaceAll("\\D", "")); // 12958


        String s1 = "ilk urun fiyati : 1250 tl";
        String s2 = "ikinci urun fiyati : 1500 tl";

        s1 = s1.replaceAll("\\D",""); // "1250"

        s2 = s2.replaceAll("\\D", ""); // "1500"

        System.out.println(s1+s2); // String olduğu için rakamları yanyana toplayacak bu yüzden Convert etmemiz lazım.  12501500

        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2)); // 2750

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println(str);

        System.out.println(str.replaceAll("a", "x"));  //replaceAll'da char kullanılmaz fakat replace()' te char kullanılabilir.

        // System.out.println(str.replaceAll('a', 'x')); -----------  olmaz....

        System.out.println(str.replace('J', 'H'));
    }
}
