import java.util.Scanner;
public class DersIstatistik {
	public static int notAA;
    public static int notBA;
    public static int notBB;
    public static int notCB;
    public static int notCC;            	     //notların değerlerini int olarak tanımladım.
    public static int notDC;
    public static int notDD;
    public static int ToplamOgrenciSayisi;

    
    public int getNotAA() {
        return notAA;
    }
    public void setNotAA(int notAA) {                      
        DersIstatistik.notAA = notAA;
    }

   
    public int getNotBA() {
        return notBA;
    }
    public void setNotBA(int notBA) {
        DersIstatistik.notBA = notBA;
    }

   
    public int getNotBB() {
        return notBB;
    }
    public void setNotBB(int notBB) {
        DersIstatistik.notBB = notBB; 				
    }

    
    public int getNotCB() {
        return notCB;
    }
    public void setNotBC(int notCB) {
        DersIstatistik.notCB = notCB;
    }

    
    public int getNotCC() {
        return notCC;
    }
    public void setNotCC(int notCC) {
        DersIstatistik.notCC = notCC;			 //getter ve setter metotlarını tanımladım.
    }

    
    public int getNotDC() {
        return notDC;
    }
    public void setNotDC(int notDC) {
        DersIstatistik.notDC = notDC;
    }

    
    public int getNotDD() {
        return notDD;
    }
    public void setNotDD(int notDD) {
        DersIstatistik.notDD = notDD;
    }
    public static int doplam() {
    	return ToplamOgrenciSayisi;
    }
    public void setdoplam(int doplam) {							
    	DersIstatistik.ToplamOgrenciSayisi=doplam;
    }
	//başlık yazdırma metodunu tanımladım.
    public static void baslikYazdir() {
		System.out.println("******************************************* DERS NOTLARI İSTATİSTİK PROGRAMI *******************************************");
	}
    public static void menuYazdir() {
    	Scanner veri = new Scanner(System.in);
    	int islem;
        while (true) {
         System.out.println("MENÜ");
       	 System.out.println("(1) Her bir harfli başarı notu için öğrenci sayısı gir");
       	 System.out.println("(2) Metinsel istatistik yazdır");
       	 System.out.println("(3) Grafiksel istatistik yazdır");
       	 System.out.println("(4) Tüm verileri sıfırla");
       	 System.out.println("(5) Programı sonlandır");	//Print edilmesi gereken ve 
         System.out.print("İşlem seçiniz: ");			//veri almamız gereken komutları yazdım.
            islem = veri.nextInt();
            System.out.println("----------------");

            if (islem == 5) {
            	System.out.println("Program sonlandırılıyor...");
            	System.out.println("----------------");
                break;
            }
            if(islem==1) {
            	notSayisiGir();	//if ve else if komutları ile menünün 
            	}				//belirli bir döngüde kalmasını sağladım.
            if(islem==2) {
            	metinselIstatistikYazdir();
            }
            if(islem==3) {
            	grafikselIstatikYazdir();
            }
            if(islem==4) {
            	verileriSifirla();
            }
            else if (islem >= 1 && islem <= 4) {
                
                System.out.println("----------------");
            } 
            else {
                System.out.println("Lütfen menüdeki rakamları kullanarak bir işlem seçiniz.");
                System.out.println("----------------");
            }//istenilen rakamları girilmemesi durumunda yazılacak çıktının kodunu yazdım.
        	}
    		}
            
	//not sayılarını gireceğimiz olan metodu tanımladım.
    public static void notSayisiGir() { //DersIstatistik sınıfı sayesinde değerleri 
		Scanner not=new Scanner(System.in); //sonradan kullanılmak üzere atadım.
		 System.out.print("AA alan öğrenci sayısını giriniz : ");
		    DersIstatistik.notAA = not.nextInt();
		 System.out.print("BA alan öğrenci sayısını giriniz : ");
		    DersIstatistik.notBA = not.nextInt();
		 System.out.print("BB alan öğrenci sayısını giriniz : ");
		   DersIstatistik.notBB = not.nextInt();
		 System.out.print("CB alan öğrenci sayısını giriniz : ");
		    DersIstatistik.notCB = not.nextInt();
		 System.out.print("CC alan öğrenci sayısını giriniz : ");
		    DersIstatistik.notCC = not.nextInt();
		 System.out.print("DC alan öğrenci sayısını giriniz : ");
		    DersIstatistik.notDC = not.nextInt();
		 System.out.print("DD alan öğrenci sayısını giriniz : ");
		    DersIstatistik.notDD = not.nextInt();
		 ToplamOgrenciSayisi=DersIstatistik.notAA+DersIstatistik.notBA+DersIstatistik.notBB+DersIstatistik.notCB+ DersIstatistik.notCC+ DersIstatistik.notDC+ DersIstatistik.notDD ;
		 System.out.println("Toplam öğrenci sayısı: " + ToplamOgrenciSayisi);
		    }
	public static void metinselIstatistikYazdir() {
		//burada kullanacağımız yüzdeler için birtakım matematiksel hesaplamalar yaptım 
		int d; //ve kolaylık olması için toplam kısmına d değişkenini atadım.
		if(ToplamOgrenciSayisi==0) {
			System.out.println("UYARI: Harfli başarı notları için henüz sayısal veriler girilmemiştir!");
					
		}
		 ToplamOgrenciSayisi=DersIstatistik.notAA+DersIstatistik.notBA+DersIstatistik.notBB+DersIstatistik.notCB+ DersIstatistik.notCC+ DersIstatistik.notDC+ DersIstatistik.notDD ;
		 d=doplam();
		 System.out.print("AA:%");
		 System.out.println(DersIstatistik.notAA*100/d);
		 System.out.print("BA:%");
		 System.out.println(DersIstatistik.notBA*100/d);
		 System.out.print("BB:%");
		 System.out.println(DersIstatistik.notBB*100/d);
		 System.out.print("CB:%");
		 System.out.println(DersIstatistik.notCB*100/d);
		 System.out.print("CC:%");
		 System.out.println(DersIstatistik.notCC*100/d);
		 System.out.print("DC:%");
		 System.out.println(DersIstatistik.notDC*100/d);
		 System.out.print("DD:%");
		 System.out.println(DersIstatistik.notDD*100/d);
		}
	
	public static int getToplamOgrenciSayisi() { //Toplam öğrenci sayısını getiren getter ve setter komutları
		return ToplamOgrenciSayisi;
	}
	public static void setToplamOgrenciSayisi(int ToplamOgrenciSayisi) {
		DersIstatistik.ToplamOgrenciSayisi = ToplamOgrenciSayisi;
	}
	public static  void grafikselIstatikYazdir() {
		if(ToplamOgrenciSayisi==0) {
			System.out.println("UYARI: Harfli başarı notları için henüz sayısal veriler girilmemiştir!");
					
		}
		if(ToplamOgrenciSayisi>0) {
			System.out.println("    10      50        100");
			System.out.println("   | | | | | | | | | | |");
		}
		
		System.out.print("AA:");
		for (int i = 0; i < DersIstatistik.notAA*20/ToplamOgrenciSayisi; i++) {
            System.out.print("*");
            }
		System.out.println();
		System.out.print("BA:");
		for (int i = 0; i < DersIstatistik.notBA*20/ToplamOgrenciSayisi; i++) {
            System.out.print("*");
            }
		System.out.println();
		System.out.print("BB:");
		for (int i = 0; i < DersIstatistik.notBB*20/ToplamOgrenciSayisi; i++) {
            System.out.print("*");
            }
		System.out.println();	//alınan verilerin yüzdesini bulabilmek için toplama böldüm ve ardından
		System.out.print("CB:");	//* karakterine 5 değerini vermek için yüzdeleri 5'e böldüm. 
		for (int i = 0; i < DersIstatistik.notCB*20/ToplamOgrenciSayisi; i++) {
            System.out.print("*"); //ardından işlem sonucu kadar * print etmesi için for döngülerini kullandım.
            }
		System.out.println();
		System.out.print("CC:");
		for (int i = 0; i < DersIstatistik.notCC*20/ToplamOgrenciSayisi; i++) {
            System.out.print("*");
            }
		System.out.println();
		System.out.print("DC:");
		for (int i = 0; i < DersIstatistik.notDC*20/ToplamOgrenciSayisi; i++) {
            System.out.print("*");
            }
		System.out.println();
		System.out.print("DD:");
		for (int i = 0; i < DersIstatistik.notDD*20/ToplamOgrenciSayisi; i++) {
            System.out.print("*");
            }
		System.out.println();
		System.out.println("----------------");
		System.out.println("Her bir ''*'' %5 değerini taşımaktadır.");
			} 			
		private static void verileriSifirla() {
			DersIstatistik.notAA=0;
			DersIstatistik.notBA=0;
			DersIstatistik.notBB=0; //verileriSifirla metodu sayesinde atadığımız değerleri tekrardan 0'a çevirdim.
			DersIstatistik.notCB=0;
			DersIstatistik.notCC=0;
			DersIstatistik.notDC=0;
			DersIstatistik.notDD=0;
			DersIstatistik.ToplamOgrenciSayisi=0;
			System.out.println("Değerler başarıyla sıfırlandı!");
			System.out.println("----------------");
			}
		public void yapici(int notAA, int notBA, int notBB, int notCB, int notCC, int notDC, int notDD, int doplam) {
			DersIstatistik.ToplamOgrenciSayisi=notAA+notBA+notBB+notCB+notCC+notDC+notDD;
		}	//7 parametreli bir yapıcı tanımladım.
		
			//menü yazdırma metodunu tanımladım.
	   
			public static void  main (String args []) {
			baslikYazdir();
			menuYazdir(); 	
			//main metotuyla yazılan menü ve başlık metotlarını çağırdım ve uygulama çalışmaya başladı.
			}
			}
			
		

