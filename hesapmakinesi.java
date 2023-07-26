import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("Basit Hesap Makinesi");
        System.out.println("İşlem yapmak için iki sayı ve bir operatör girin.");
        System.out.println("Operatörler: + (toplama), - (çıkarma), * (çarpma), / (bölme)");
        
        while (true) {
            System.out.print("Birinci sayıyı girin veya çıkmak için 'q' tuşuna basın: ");
            String girdiStr = girdi.next();
            
            if (girdiStr.equalsIgnoreCase("q")) {
                System.out.println("Program sonlandırılıyor...");
                break;
            }

            double sayi1 = Double.parseDouble(girdiStr);

            System.out.print("İkinci sayıyı girin: ");
            double sayi2 = girdi.nextDouble();

            System.out.print("Operatörü girin (+, -, *, /) veya çıkmak için 'q' tuşuna basın: ");
            char operator = girdi.next().charAt(0);

            if (operator == 'q' || operator == 'Q') {
                System.out.println("Program sonlandırılıyor...");
                break;
            }

            double sonuc = 0.0;
            boolean gecerliOperator = true;

            switch (operator) {
                case '+':
                    sonuc = sayi1 + sayi2;
                    break;
                case '-':
                    sonuc = sayi1 - sayi2;
                    break;
                case '*':
                    sonuc = sayi1 * sayi2;
                    break;
                case '/':
                    if (sayi2 != 0) {
                        sonuc = sayi1 / sayi2;
                    } else {
                        System.out.println("Hata: Bölen sıfır olamaz.");
                        gecerliOperator = false;
                    }
                    break;
                default:
                    System.out.println("Hata: Geçersiz operatör girdiniz.");
                    gecerliOperator = false;
            }

            if (gecerliOperator) {
                System.out.println("Sonuç: " + sonuc);
            }
        }

        girdi.close();
    }
}
