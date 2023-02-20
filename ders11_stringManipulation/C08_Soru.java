package ders11_stringManipulation;

public class C08_Soru {
    public static void main(String[] args) {

        // Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve
        // kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        // if - else if durumunda hangisi doğru ise o scope u çalıştırır.
        // fakat ayrı if'lerde bütün şartları sağlaması gerekiyor, bunu da kontrol etmek için flag taktiği kullandık.


        String sifre = "Nasilsin Kardes";
        int flag = 0;


        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("Ilk harf küçük harf olmalıdır.");
            flag ++;
        }

        if(!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("Son karakter rakam olmalıdır.");
            flag++;
        }

        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemelidir.");
            flag++;
        }

        if (!(sifre.length()>=10)){
            System.out.println("Şifre en az 10 haneli olmalıdır.");
            flag++;
        }

        if (flag==0){
            System.out.println("Şifreniz başarı ile kaydedildi");
        }

    }
}
