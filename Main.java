import java.util.Scanner;

public class Main {
	// Kullanýcýdan deðer almak için scanner oluþturuyoruz.
	// static olarak tanýmlýyoruz ki static olan veya olmayan heryerde kullanabilelim
	static Scanner tara=new Scanner(System.in);
	// 1 kullanýcý 1 televizyon kullansýn diye static olarak tanýmlýyoruz.
	static Televizyon tv;
	public static void main(String[] args) {
		
		menuGoster();
		// kullanýcý 0 a basana kadar menüyü göster.
		boolean cikis=false;
		
		while(cikis==false) {
			System.out.println("Seçiminiz: (Menüyü görmek için 8 i tuþlayýnýz)");
		    int secim =tara.nextInt();
		    
		    switch(secim) {
		    case 1:
		    	//metod çaðýrýyoruz.
		    	tvKurveKanallariOlustur();
		    	break;
		    case 2:
		    	tvAc();
		    	break;
		    case 3:
		    	sesArttir();
		    	break;
		    case 4:
		    	sesAzalt();
		    	break;
		    case 5:
		    	kanalDegistir();
		    	break;
		    case 6:
		    	kanalBilgisiniGoster();
		    	break;
		    case 7:
		    	tvKapat();
		    	break;  
		    case 8:
		    	AyarlarýGöster();
		    	break;
		    case 9:
		    	AyarlarýGüncelle();
		    	break;
		    case 10:
		    	FavoriKanallariniBelirle();
		    	break;
		    case 11:
		    	ÝnterneteBaglan();
		    	break;
		    case 12:
		    	ÝnternetBaglantisiniKapat();
		    	break;
		    case 13:
		    	ÝnternetUygulamalarýnýGöster();
		    	break;
		    case 14:
		    	menuGoster();
		    	break;
		    	
		    case 0:
		    	System.out.println("Sistemden Çýkýlýyor");
		    	//cikis deðerini birdaha girmemek için true yapýyoruz.
		    	cikis=true;
		    	break;
		    	default:
		    		System.out.println("0 ile 14 arasýnda deðer giriniz:");
		    		break;
		    }
		
		}
	}
			
	
	private static void ÝnternetUygulamalarýnýGöster() {
		if(tv!=null) {
			tv.ÝnternetUygulamalarý();
		}
		else {
			System.out.println("Önce tvyi kurun");
		}
	}


	private static void ÝnternetBaglantisiniKapat() {
		if(tv!=null) {
			tv.InternetBaglantisiKapat();
		}
		else {
			System.out.println("Önce tvyi kurun");
		}
	}


	private static void ÝnterneteBaglan() {
		if(tv!=null) {
			tv.InterneteBaglan();
		}	else {
			System.out.println("Önce tvyi kurun");
		}
		
	}


	private static void FavoriKanallariniBelirle() {
		if(tv!=null) {
			System.out.println("Hangi kanalý eklemek istiyorsunuz");
			int favorikanalsecimi=tara.nextInt();
			tv.FavoriKanallarim(favorikanalsecimi);
		}else {
			System.out.println("Önce tv yi kur sonra kanallarý oluþturun");
		}
		
	}
	private static void AyarlarýGüncelle() {
		if(tv!=null) {
			tv.AyarlarýGüncelle();
			}
		else {
			System.out.println("Önce tv yi kur sonra yeniden deneyin");
		}
		
	}
	private static void AyarlarýGöster() {
		if(tv!=null) {
			tv.AyarlarýGöster();
		}else {
			System.out.println("Önce tv yi kur sonra TV yi aç. yeniden deneyin");
		}
	
	}
	private static void kanalBilgisiniGoster() {
		if(tv!=null) {
			tv.aktifKanaliGoster();
		}else {
			System.out.println("Önce tv yi kur sonra kanallarý oluþturun");
		}
		
	}
	private static void kanalDegistir() {
		if(tv!=null) {
			System.out.println("Hangi kanalý görmek istiyorsunuz");
			int acilmasiIstenenKanal=tara.nextInt();
			tv.kanalDegistir(acilmasiIstenenKanal);
		}else {
			System.out.println("Önce tv yi kur sonra kanallarý oluþturun");
		}
		
	}
	
	private static void sesArttir() {
		if(tv!=null) {
			tv.sesArttir();
		}else {
			System.out.println("Önce tvyi kurun");
		}
	}
	private static void sesAzalt() {
		if(tv!=null) {
			tv.sesAzalt();
		}else {
			System.out.println("Önce tvyi kurun");
		}
	}
	
	private static void tvKapat() {
		//kontrolleri televizyon sýnýfý yapýyor.
		if(tv!=null) {
			tv.tvKapat();
		}	else {
			System.out.println("Önce tvyi kurun");
		}
			
	}
	
	private static void tvAc() {
		if(tv!=null) {
			tv.tvAc();
		}	else {
			System.out.println("Önce tvyi kurun");
		}
			
	}
	
	private static void tvKurveKanallariOlustur() {
		//Televizyon null a eþitse tv oluþtur
	    if(tv==null) {
	    	tara.nextLine();
			System.out.println("Televizyonun Markasýný Giriniz");
			String marka = tara.nextLine();
			System.out.println("Televizyonun Boyutunu Giriniz");
			String boyut = tara.nextLine();
	    	tv=new Televizyon(marka,boyut);
	    	System.out.println(tv);
	    }
	    else {
	    	System.out.println(tv);
	    }
		
	}
	//menü göstermek için metod

	private static void menuGoster() {
		System.out.println("*****MENU*****");
		System.out.println("0-Çýkýþ\n"
				+ "1-Televizyonu Kur\n"
				+ "2-Televizyonu Aç\n"
				+ "3-Sesini Arttýr\n"
				+ "4-Sesi Azalt\n"
				+ "5-Kanal Deðiþtir\n"
				+ "6-Kanal Bilgisini Göster\n"
				+ "7-Televizyonu Kapat\n"
				+ "8-Ayarlarý Göster\n"
				+ "9-Ayarlarý Güncelle\n"
				+ "10-Favori Kanallarini Belirle\n"
				+ "11-Ýnternete Baðlan\n"
				+ "12-Ýnternet Baðlantýsýný kapat\n"
				+ "13-Ýnternet Uygulamalarýný Göster\n"
				+ "14-Menüyü Göster\n");
	}

}
