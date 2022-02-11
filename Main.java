import java.util.Scanner;

public class Main {
	// Kullan�c�dan de�er almak i�in scanner olu�turuyoruz.
	// static olarak tan�ml�yoruz ki static olan veya olmayan heryerde kullanabilelim
	static Scanner tara=new Scanner(System.in);
	// 1 kullan�c� 1 televizyon kullans�n diye static olarak tan�ml�yoruz.
	static Televizyon tv;
	public static void main(String[] args) {
		
		menuGoster();
		// kullan�c� 0 a basana kadar men�y� g�ster.
		boolean cikis=false;
		
		while(cikis==false) {
			System.out.println("Se�iminiz: (Men�y� g�rmek i�in 8 i tu�lay�n�z)");
		    int secim =tara.nextInt();
		    
		    switch(secim) {
		    case 1:
		    	//metod �a��r�yoruz.
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
		    	Ayarlar�G�ster();
		    	break;
		    case 9:
		    	Ayarlar�G�ncelle();
		    	break;
		    case 10:
		    	FavoriKanallariniBelirle();
		    	break;
		    case 11:
		    	�nterneteBaglan();
		    	break;
		    case 12:
		    	�nternetBaglantisiniKapat();
		    	break;
		    case 13:
		    	�nternetUygulamalar�n�G�ster();
		    	break;
		    case 14:
		    	menuGoster();
		    	break;
		    	
		    case 0:
		    	System.out.println("Sistemden ��k�l�yor");
		    	//cikis de�erini birdaha girmemek i�in true yap�yoruz.
		    	cikis=true;
		    	break;
		    	default:
		    		System.out.println("0 ile 14 aras�nda de�er giriniz:");
		    		break;
		    }
		
		}
	}
			
	
	private static void �nternetUygulamalar�n�G�ster() {
		if(tv!=null) {
			tv.�nternetUygulamalar�();
		}
		else {
			System.out.println("�nce tvyi kurun");
		}
	}


	private static void �nternetBaglantisiniKapat() {
		if(tv!=null) {
			tv.InternetBaglantisiKapat();
		}
		else {
			System.out.println("�nce tvyi kurun");
		}
	}


	private static void �nterneteBaglan() {
		if(tv!=null) {
			tv.InterneteBaglan();
		}	else {
			System.out.println("�nce tvyi kurun");
		}
		
	}


	private static void FavoriKanallariniBelirle() {
		if(tv!=null) {
			System.out.println("Hangi kanal� eklemek istiyorsunuz");
			int favorikanalsecimi=tara.nextInt();
			tv.FavoriKanallarim(favorikanalsecimi);
		}else {
			System.out.println("�nce tv yi kur sonra kanallar� olu�turun");
		}
		
	}
	private static void Ayarlar�G�ncelle() {
		if(tv!=null) {
			tv.Ayarlar�G�ncelle();
			}
		else {
			System.out.println("�nce tv yi kur sonra yeniden deneyin");
		}
		
	}
	private static void Ayarlar�G�ster() {
		if(tv!=null) {
			tv.Ayarlar�G�ster();
		}else {
			System.out.println("�nce tv yi kur sonra TV yi a�. yeniden deneyin");
		}
	
	}
	private static void kanalBilgisiniGoster() {
		if(tv!=null) {
			tv.aktifKanaliGoster();
		}else {
			System.out.println("�nce tv yi kur sonra kanallar� olu�turun");
		}
		
	}
	private static void kanalDegistir() {
		if(tv!=null) {
			System.out.println("Hangi kanal� g�rmek istiyorsunuz");
			int acilmasiIstenenKanal=tara.nextInt();
			tv.kanalDegistir(acilmasiIstenenKanal);
		}else {
			System.out.println("�nce tv yi kur sonra kanallar� olu�turun");
		}
		
	}
	
	private static void sesArttir() {
		if(tv!=null) {
			tv.sesArttir();
		}else {
			System.out.println("�nce tvyi kurun");
		}
	}
	private static void sesAzalt() {
		if(tv!=null) {
			tv.sesAzalt();
		}else {
			System.out.println("�nce tvyi kurun");
		}
	}
	
	private static void tvKapat() {
		//kontrolleri televizyon s�n�f� yap�yor.
		if(tv!=null) {
			tv.tvKapat();
		}	else {
			System.out.println("�nce tvyi kurun");
		}
			
	}
	
	private static void tvAc() {
		if(tv!=null) {
			tv.tvAc();
		}	else {
			System.out.println("�nce tvyi kurun");
		}
			
	}
	
	private static void tvKurveKanallariOlustur() {
		//Televizyon null a e�itse tv olu�tur
	    if(tv==null) {
	    	tara.nextLine();
			System.out.println("Televizyonun Markas�n� Giriniz");
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
	//men� g�stermek i�in metod

	private static void menuGoster() {
		System.out.println("*****MENU*****");
		System.out.println("0-��k��\n"
				+ "1-Televizyonu Kur\n"
				+ "2-Televizyonu A�\n"
				+ "3-Sesini Artt�r\n"
				+ "4-Sesi Azalt\n"
				+ "5-Kanal De�i�tir\n"
				+ "6-Kanal Bilgisini G�ster\n"
				+ "7-Televizyonu Kapat\n"
				+ "8-Ayarlar� G�ster\n"
				+ "9-Ayarlar� G�ncelle\n"
				+ "10-Favori Kanallarini Belirle\n"
				+ "11-�nternete Ba�lan\n"
				+ "12-�nternet Ba�lant�s�n� kapat\n"
				+ "13-�nternet Uygulamalar�n� G�ster\n"
				+ "14-Men�y� G�ster\n");
	}

}
