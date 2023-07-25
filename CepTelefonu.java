
import java.util.Scanner; //girdi alacağımız için gerekli importu aldım.

public  class CepTelefonu extends Urun {
    private int ekranYenilemeHizi;
    private int bellekKapasitesi;
    private int kameraCozunurluk;
    //ürün sınıfının alt sınıfı olarak CepTelefonu sınıfı tanımladım ve tanımlamalar yaptım.
    public void setEkranYenilemeHizi(int ekranYenilemeHizi) {
        this.ekranYenilemeHizi = ekranYenilemeHizi;
    }

    public void setBellekKapasitesi(int bellekKapasitesi) {
        this.bellekKapasitesi = bellekKapasitesi;
    }

    public void setKameraCozunurluk(int kameraCozunurluk) {
        this.kameraCozunurluk = kameraCozunurluk;
    }
    //gerekli get ve set metotlarını tanımladım.
    public int getEkranYenilemeHizi() {
        return ekranYenilemeHizi;
    }

    public int getBellekKapasitesi() {
        return bellekKapasitesi;
    }

    public int getKameraCozunurluk() {
        return kameraCozunurluk;
    }
    //urunGir metodunu tanımladım alınan girdileri kaydettim.
    public Object urunGir(Object urun) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Marka Giriniz: ");
        setMarka(scanner.nextLine());
        System.out.print("Ekran yenileme hızı giriniz (Hz): ");
        setEkranYenilemeHizi(scanner.nextInt());
        System.out.print("Bellek kapasitesi giriniz (GB): ");
        setBellekKapasitesi(scanner.nextInt());
        System.out.print("Kamera çözünürlük giriniz (MB): ");
        setKameraCozunurluk(scanner.nextInt());
        System.out.print("Fiyat giriniz (TL): ");
        setFiyat(scanner.nextInt());
        System.out.print("Adet giriniz: ");
        
        setAdet(scanner.nextInt());
        return scanner.nextLine();
    }
    //urunSorgula metodunu tanımladım ve gerekli çıktıları veren kodu yazdım.
    public void urunSorgula(Object urun) {
        if (urun.getClass() == CepTelefonu.class) {
            CepTelefonu cepTelefonu = (CepTelefonu) urun;
            System.out.println("Ekran Yenileme Hızı: " + cepTelefonu.getEkranYenilemeHizi()+"Hz");
            System.out.println("Bellek Kapasitesi: " + cepTelefonu.getBellekKapasitesi()+("GB"));
            System.out.println("Kamera Çözünürlük: " + cepTelefonu.getKameraCozunurluk()+("MB"));
        } else {
            System.out.println("Hatalı ürün türü!");
        }
    }
    
	}
