import java.util.Random;
import java.util.Scanner;

public class FutbolOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int oyuncuSkor = 0;
        int bilgisayarSkor = 0;

        System.out.println("Futbol Oyunu Başlıyor!");

        while (true) {
            System.out.println("Oyuncu Skor: " + oyuncuSkor);
            System.out.println("Hangi yöne vurmak istersiniz? (sol, orta, sağ): ");
            String oyuncuVurus = scanner.nextLine();

            // Bilgisayarın kaleci hareketini rastgele seç (sol, orta, sağ)
            String[] bilgisayarKaleciHareketleri = {"sol", "orta", "sağ"};
            int bilgisayarKaleciRastgeleIndex = random.nextInt(bilgisayarKaleciHareketleri.length);
            String bilgisayarKaleciHareketi = bilgisayarKaleciHareketleri[bilgisayarKaleciRastgeleIndex];

            // Oyuncunun vuruşunu rastgele hedef seçerek kontrol et
            String[] hedefler = {"sol", "orta", "sağ"};
            int oyuncuHedefIndex = random.nextInt(hedefler.length);
            String oyuncuHedef = hedefler[oyuncuHedefIndex];

            System.out.println("Bilgisayar kaleci " + bilgisayarKaleciHareketi + " tarafına gidiyor.");

            // Gol atma kontrolü
            if (!oyuncuHedef.equals(bilgisayarKaleciHareketi)) {
                System.out.println("Gol! Tebrikler, oyuncu gol attı!");
                oyuncuSkor++;
            } else {
                System.out.println("Kaleci kurtardı. Bilgisayar gol atamadı.");
            }

            // Oyunun sonunu kontrol et
            if (oyuncuSkor >= 5 || bilgisayarSkor >= 3) {
                if (oyuncuSkor > bilgisayarSkor) {
                    System.out.println("Oyuncu kazandı!");
                } else if (bilgisayarSkor > oyuncuSkor) {
                    System.out.println("Bilgisayar kazandı!");
                } else {
                    System.out.println("Berabere!");
                }
                break;
            }
        }

        scanner.close();
    }
}
