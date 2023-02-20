package ders11_stringManipulation;

public class C01_nullPointer {

    public static void main(String[] args) {

        String str1 = ""; // str1'e değer atanmıştır.

        System.out.println(str1.concat("Java")); // hiçliğe Java eklendi.

        String str2;  // str2 oluşturuldu ama değer atanmadı

        // System.out.println(str2);  // str2'ye değer atanmadığı için yazdırılamaz, CTE verir

        // System.out.println(str2.concat("Java"));  // değer atanmadığı için method'la kullanılmaz

        str2 = "Java candir";

        System.out.println(str2);  // Java candir
        System.out.println(str2.concat("."));  // Java candir.

        String str3 = null;  // str3'e değer atanmamıştır.
                            // Null pointer ile Java'ya değer atamadığımızın farkında olduğumuzu söylüyoruz.

        System.out.println(str3); // null işaretlendiğini yazdırır.

        // System.out.println(str3.concat("Java")); //.NullPointerException

        System.out.println(str3 + "Java");  // nullJava yazrırır.

        // System.out.println(str3.toUpperCase()); //.NullPointerException

        

    }
}
