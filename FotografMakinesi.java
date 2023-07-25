
import java.util.Scanner;
//alınacak girdi için gerekli import komudunu yazdım.

public class FotografMakinesi extends Urun {
    private int dijitalZoom;
    private int optikZoom; //tekrardan gerekli tanımlamalar yaptım.

    public int getDijitalZoom() {
        return dijitalZoom;
    }

    public void setDijitalZoom(int dijitalZoom) {
        this.dijitalZoom = dijitalZoom;
    }
    //get ve set metotlarını tanımladım.
    public int getOptikZoom() {
        return optikZoom;
    }

    public void setOptikZoom(int optikZoom) {
        this.optikZoom = optikZoom;
    }
    //ilgili girdileri alması için ve kaydetmesi için urunGir metodunu tanımladım.
    public Object urunGir(Object urun) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Marka Giriniz: ");
        String marka = scanner.nextLine();
        setMarka(marka);

        System.out.print("Dijital Zoom giriniz: ");
        int dijitalZoom = scanner.nextInt();
        setDijitalZoom(dijitalZoom);

        System.out.print("Optik Zoom giriniz: ");
        int optikZoom = scanner.nextInt();
        setOptikZoom(optikZoom);

        System.out.print("Fiyat giriniz (TL): ");
        double fiyat = scanner.nextDouble();
        setFiyat(fiyat);

        System.out.print("Adet giriniz: ");
        int adet = scanner.nextInt();
        setAdet(adet);

        scanner.nextLine(); 

        return urun;
    }
    //çıktı vermesi için urunSorgula metodunu tanımladım.
    public void urunSorgula(Object urun) {
        System.out.println("---------------------------");
        System.out.println("Marka: " + getMarka());
        System.out.println("Dijital zoom: " + getDijitalZoom() + "X");
        System.out.println("Optik zoom: " + getOptikZoom() + "X");
        System.out.printf("Fiyat: " + getFiyat());
        System.out.println("Adet: " + getAdet());
    }

}
