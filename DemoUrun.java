
import java.util.Scanner;

public class DemoUrun {
    private static Urun[] urunListesi;
    private static int girilenUrunSayisi;
    private static Scanner scanner;
    public DemoUrun(int stokAdet) {
        urunListesi = new Urun[stokAdet];
        girilenUrunSayisi = 0;
    }
    //DemoUrun sınıfı için tanımlamalar yaptım ve yeni bir ürünlistesi oluşturdum.
    public void urunGir() {
        System.out.println("Ürün Giriş");
        menuUrunSec();
        //ürüngir metodu tanımladım ve ürüngir metodu çağrılınca çalışması gereken kodları yazdım.

        int secim = scanner.nextInt();
        scanner.nextLine(); // Boş satırı okumak için
        //maksimum girilmesi gereken ürünün kodlamasını yaptım.
        if (girilenUrunSayisi >= urunListesi.length) {
            System.out.println("Maksimum ürün sayısı: " + urunListesi.length);
            System.out.println("Girilen ürün sayısı: " + girilenUrunSayisi);
            System.out.println("Yeni ürün girilemez!");
            return;
        }

        switch (secim) {
            case 1:
                CepTelefonu cepTelefonu= new CepTelefonu();
                cepTelefonu.urunGir(cepTelefonu);
                urunListesi[girilenUrunSayisi] = cepTelefonu;
                girilenUrunSayisi++;
                break;
            case 2:
                FotografMakinesi fotografMakinesi = new FotografMakinesi();
                fotografMakinesi.urunGir(fotografMakinesi);
                urunListesi[girilenUrunSayisi] = fotografMakinesi;
                girilenUrunSayisi++;
                break;
            default:
                System.out.println("Ürün seçimi için 1 ya da 2 değerini giriniz!");
                break;
                //urunGir metodu çalıştıktan sonra 2 kategori arasından seçim yapabilmesi ve bunun döngüye girebilmesi için switch kullandım.
        }
    }

    public void urunSorgula() {
        System.out.println("Ürün Sorgulama");
        menuUrunSec();

        int secim = scanner.nextInt();
        scanner.nextLine(); // Boş satırı okumak için
        //urunSorgula metodunda telefon ve fotoğraf makinesinin olup olmadığını kontrol eden kodlamaları yaptım.
        if (secim == 1) { //herhangi bir kategoride ürün olmadığı taktirde de gerekli yazıyı print edecek korlamayı yaptım.
            boolean cepTelefonuBulundu = false;
            //instanceof operatörü kullanarak türe ait olup olmadığını sorguladım.
            for (int i = 0; i < girilenUrunSayisi; i++) {
                if (urunListesi[i] instanceof CepTelefonu) {
                    CepTelefonu cepTelefonu = (CepTelefonu) urunListesi[i];
                    System.out.println("---------------------------");
                    System.out.println("Marka: " + cepTelefonu.getMarka());
                    System.out.println("Ekran Yenileme Hızı: " + cepTelefonu.getEkranYenilemeHizi() + " Hz ");
                    System.out.println("Bellek Kapasitesi: " + cepTelefonu.getBellekKapasitesi() + " GB ");
                    System.out.println("Kamera Çözünürlük: " + cepTelefonu.getKameraCozunurluk() + " MB ");
                    System.out.println("Fiyat: " + cepTelefonu.getFiyat() + " TL");
                    System.out.println("Adet: " + cepTelefonu.getAdet());
                    cepTelefonuBulundu = true;
                }
            }//if else yardımıyla bu metodu tamamladım.
            if (!cepTelefonuBulundu) {
                System.out.println("Ürün listesinde cep telefonu bulunamadı!");
            }
        } else if (secim == 2) {
            boolean fotografMakinesiBulundu = false;
            for (int i = 0; i < girilenUrunSayisi; i++) {
                if (urunListesi[i] instanceof FotografMakinesi) {
                    FotografMakinesi fotografMakinesi = (FotografMakinesi) urunListesi[i];
                    System.out.println("---------------------------");
                    System.out.println("Marka: " + fotografMakinesi.getMarka());
                    System.out.println("Dijital zoom: " + fotografMakinesi.getDijitalZoom() + "X");
                    System.out.println("Optik zoom: " + fotografMakinesi.getOptikZoom() + "X");
                    System.out.println("Fiyat: " + fotografMakinesi.getFiyat()+" TL");
                    System.out.println("Adet: " + fotografMakinesi.getAdet());
                    fotografMakinesiBulundu = true;
                }
            }
            if (!fotografMakinesiBulundu) {
                System.out.println("Ürün listesinde fotoğraf makinesi bulunamadı!");
            }
        }
    }


    public static void baslikYazdir() {
        System.out.println("*********************************************");
        System.out.println("*** STOK ÜRÜN GİRİŞ VE SORGULAMA PROGRAMI ***");
        System.out.println("*********************************************");
    } //başlık yazdıran metodu tanımladım.

    public static void menuYazdir() {
        System.out.println("\nMENÜ:");
        System.out.println("(1) Ürün gir");
        System.out.println("(2) Ürün sorgula");
        System.out.println("(3) Ürün listesi sıfırla");
        System.out.println("(4) Programı sonlandır\n");
        System.out.print("İşlem seçiniz: ");
        //menü yazdıran metodu tanımladım.
        
    }

    public static void menuUrunSec() {
        System.out.println("(1) Cep Telefonu");
        System.out.println("(2) Fotoğraf Makinesi");
        System.out.print("Seçiminizi yapınız: ");
    }
    //ürün gir seçeneği kullanılması halinde gelecek 2. menüyü tanımladım.

    public static void urunListesiSifirla() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Stoka girilecek ürün sayısı:  ");
        int yeniUrunSayisi = scanner.nextInt();
        scanner.nextLine(); 
        //menüdeki 3. seçenek olan ürünsıfırla metodunu ve yeni ürün sayısını girdi alacağım kodu yazdım.
        urunListesi = new Urun[yeniUrunSayisi];
        girilenUrunSayisi = 0;
        
    }

    public static void programiSonlandir() {
        System.out.println("Program sonlandırıldı!");
        System.exit(0);
        //programı sonlandır metodunu yazdım.
    }

    public static void main(String[] args) {
    	baslikYazdir();
    	System.out.println(" ");
    	scanner = new Scanner(System.in);
        System.out.print("Stoka girilecek ürün sayısı: ");
        int maxUrunSayisi = scanner.nextInt();
        scanner.nextLine(); 

        DemoUrun demoUrun = new DemoUrun(maxUrunSayisi);
        //main metodunu ve programın sonsuz döngüye girmesini sağlayan kodları yazdım.
        //gerekli düzen için boş print yazdırdım.

        boolean devam = true;

        while (devam) { 
            menuYazdir();
            int secim = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("----------------");

            switch (secim) {
                case 1:
                	demoUrun.urunGir();
                    break;
                case 2:
                    demoUrun.urunSorgula();
                    break;
                case 3:
                	System.out.println("Ürün Listesi sıfırlandı!");
                	urunListesiSifirla();
                    break;
                case 4:
                    programiSonlandir();
                    devam = false;
                    break;
                default:
                    System.out.println("İşlem seçimi için 1 ve 4 arasında bir sayı giriniz!");
                    		
                    break;
            }
        }
    }
}