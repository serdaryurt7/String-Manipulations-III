package ders11_stringManipulation;

public class C07_Soru {

    public static void main(String[] args) {

        //  Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        //  ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //  esit veya soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        String ad = "SErdAr";
        String soyad = "YUrt";
        String yeniAdSoyad;
        
        if (ad.length()>soyad.length()){

            // isim ve soyismi ilk harf buyuk kalanlar kucuk

                    yeniAdSoyad = ad.substring(0,1).toUpperCase() +
                    ad.substring(1).toLowerCase() + " " +
                    soyad.substring(0,1).toUpperCase() +
                    soyad.substring(1).toLowerCase();

            
        } else  {

            // ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle

                    yeniAdSoyad = ad.substring(0,1).toUpperCase() +
                    ad.substring(1).toLowerCase() + " " +
                    soyad.toUpperCase();
            
        }

        System.out.println(yeniAdSoyad);


    }
}
