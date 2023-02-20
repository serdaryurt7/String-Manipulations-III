package ders11_stringManipulation;

public class C04_replaceAll {

    public static void main(String[] args) {

        // Kullanicinin girdigi metinde harf disinda kalan tum karakterleri temizleyen bir kod yazin NOT: Space Silinmemeli

        String input= "9%H2av*(a  co_k 1*guzel";

        input = input.replaceAll("\\d",""); // %Hav*(a  co_k *guzel --> Rakamları(kaldırdık) hiçlik yaptık.
        System.out.println(input);
        input = input.replace(" ", "5");  // %Hav*(a55co_k5*guzel --> Boşlukları Digit(5) e çevirdi. %Hav*(a55co_k5*guzel
        System.out.println(input);
        input = input.replaceAll("\\W",""); // Hava55cok5guzel  --> Harf ve rakam olmayan herşeyi(kaldırdı) "" yaptı. (W).

        input = input.replace("_","");  // Alt tireyi hiçlik yaptık.
        System.out.println(input);
        input = input.replace("5", " ");  // Rakamları Space yaptık.
        System.out.println(input);
        input = input.replaceAll("\\s+"," ");  // Yanyana birden fazla space varsa tek space yaptık.
        System.out.println(input);

    }
}
