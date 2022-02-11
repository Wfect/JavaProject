import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;


public class Televizyon {
	private String marka;
	private String boyut;
	// Arraylist olu�tur. Arraylistin i�erisinde de kanal s�n�f� olacak.
	private ArrayList<Kanal> kanallar;
	//Televizyonun a��l�p kapanmas� i�in de�er.
	private boolean acik;
	private int ses;
	//a��k olan kanal
	private int aktifKanal;
	private int Ayarsecim;
	private boolean bagli;
	private int uygulamasecimi;
	
	// constructorlar� olu�turuyoruz.
	public Televizyon(String marka,String boyut) {
		this.marka=marka;
		this.boyut=boyut;
		//bellekte bir yap� olu�turuyoruz. NULL exception hatas� almamak i�in
		kanallar=new ArrayList<>();
		ses = 10;
		//kanal 1 den ba�l�yor. O y�zden 1 diyoruz.
		aktifKanal=1;
		//televizyonu olu�turunca kanallar�da y�kleyen metod.
		kanallariOlustur();
		//Televizyon kapal� bile olsa kanallar� kuracak. A��k de�erini false a atad�m.
		this.acik=false;
	}
	public void FavoriKanallarim(int favorikanalsecimi) {
		if(acik) {
		
			System.out.println("Favorilerime eklenen kanal" +kanallar.get(favorikanalsecimi).kanalBilgisiniGoster());
		}
		else {
			System.out.println("�nce tv yi a��n�z");
		}
	}

	public void Ayarlar�G�ster() {
		if(acik) {

		AbstractAyarlar ayar = new G�r�nt�Ayarlar�();
		ayar.Ayarlar�Al();
		AbstractAyarlar ayar1 = new EkranAyarlar�();
		ayar1.Ayarlar�Al();
		}
		else
			System.out.println("�nce tv yi a��n");
	}
	public void Ayarlar�G�ncelle() {
		if(acik) {
		System.out.println("Se�mek istedi�iniz ayarlar� se�iniz");
		System.out.println("1080 ve Film Ekran� i�in 1 i se�iniz.\n 720 ve Oyun Ekran� i�in 2 yi se�iniz.");
		Scanner istek = new Scanner(System.in);
		int Ayarsecim = istek.nextInt();
		
		if(Ayarsecim==0) {
		AbstractAyarlar ayar = new G�r�nt�Ayarlar�();
		ayar.Ayarlar�Al();
		AbstractAyarlar ayar1 = new EkranAyarlar�();
		ayar1.Ayarlar�Al();
		}
		if(Ayarsecim==1) {
			AbstractAyarlar ayar = new G�r�nt�Ayarlar�();
			ayar.Ayarlar�G�ncelle2();
			AbstractAyarlar ayar1 = new EkranAyarlar�();
			ayar1.Ayarlar�G�ncelle2();
			}
		if(Ayarsecim==2) {
			AbstractAyarlar ayar = new G�r�nt�Ayarlar�();
			ayar.Ayarlar�G�ncelle3();
			AbstractAyarlar ayar1 = new EkranAyarlar�();
			ayar1.Ayarlar�G�ncelle3();
			}
		}
		else
			System.out.println("�nce tv yi a��n");
		
	}
	
	public void sesArttir() {
		//Sesi 1 artt�r�r. Ve televizyon a��k ise artt�r�r.
		if(ses<=20 && acik==true) {
			ses++;
			System.out.println("Ses seviyesi: "+ses);
		}else {
			System.out.println("Ses maksimumda");}
	}
	public void sesAzalt() {
		if(ses>0 && acik) {
			ses--;
			System.out.println("Ses seviyesi: "+ses);
		}else {
			System.out.println("Ses minimumda");}
	}
	
	public void tvAc() {
		//E�er televizyon kapal�ysa
		if(acik==false) {
			acik=true;
			System.out.println("Tv a��ld�");
		}else {
			System.out.println("Tv zaten a��k");
		}
	}
	public void InterneteBaglan() {
		if(acik){
		if(bagli==false) {
			  bagli=true;
			System.out.println("�nternet ba�lant�s� sa�land�");
		}else {
			System.out.println("�nternete zaten ba�l�s�n�z");}
		}
		else
		{
			System.out.println("�nternete ba�lanmak i�in �nce tv yi a��n�z");
		}
	}
	public void InternetBaglantisiKapat() {
		if(acik) {
		if(bagli==true) {
			bagli=false;
			System.out.println("�nternet Ba�lant�s�n� Kapat�ld�");
		}else {
			System.out.println("Ba�lant� Zaten Kapal�");
		}
		}
		else
		{
			System.out.println("�nternete ba�lant�s�n� kapatmak i�in �nce tv yi a��n�z");
		}
	}
	public void �nternetUygulamalar�() {
		if(acik){
				  System.out.println("Uygulamalar�n�z:");
				  Uygulamalar youtube = new Youtube();
			      Uygulamalar amazon = new Amazon();
			      youtube.log();
			      amazon.log();
			      System.out.println("Yapmak �stedi�iniz i�lemi se�iniz:\n 1-Youtube A�\n 2-Amazon a�");
			      Scanner uygulamaistek = new Scanner(System.in);
					int uygulamasecimi = uygulamaistek.nextInt();
			      if(bagli==true) {
					  if(uygulamasecimi==1) {
						  System.out.println("Youtube A��ld�");
						  Desktop d = Desktop.getDesktop();
							try {
								d.browse(new URI("https://www.youtube.com"));
							} catch (IOException e) {
								
								e.printStackTrace();
							} catch (URISyntaxException e) {
								
								e.printStackTrace();
							}
					  }
					  if(uygulamasecimi==2) {
						  System.out.println("Amazon A��ld�");
						  Desktop d = Desktop.getDesktop();
							try {
								d.browse(new URI("https://www.amazon.com"));
							} catch (IOException e) {
								//hataya neyin neden oldu�unu ve nerede hata oldu�unu g�sterir. Printscack
								
								e.printStackTrace();
							} catch (URISyntaxException e) {
								
								e.printStackTrace();
							}  
					  }
					  }
			      else {
			    	  System.out.print("�nce internete baglan�n\n");
			      }
			
		}
		else {
			System.out.println("�nce tvyi a��n�z");
		}
	}

	
	public void tvKapat() {
		if(acik==true) {
			acik=false;
			System.out.println("Tv kapand�");
		}else {
			System.out.println("Tv zaten kapal�");
		}
	}
	public void aktifKanaliGoster() {
		if(acik)
		System.out.println("Aktif kanal:"+kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
		else
			System.out.println("�nce tv yi a��n");
	}
	//Polym.
	// Bu metodun d��ar�dan bir kullan�m� olmayacak. Yani mainden eri�ilmeyecek
	private void kanallariOlustur() {
		//Kanal nesnelerini olu�turduk. Daha sonra olu�turulan kanallar� arrayliste att�k.
		HaberKanali cnn=new HaberKanali("CNN", 1, "GenelHaber");
	    kanallar.add(cnn);
	    HaberKanali A=new HaberKanali("A", 2, "GenelHaber");
	    kanallar.add(A);
	    MuzikKanali dream=new MuzikKanali("Dream",3,"Yerli");
	    kanallar.add(dream);
	    MuzikKanali D=new MuzikKanali("D",4,"Yerli");
	    kanallar.add(D);
	    DiziKanallari diziKanali1=new DiziKanallari("diziKanali1",5,"Aksiyon");
	    kanallar.add(diziKanali1);
	    DiziKanallari diziKanali2=new DiziKanallari("diziKanali2",5,"Komedi");
	    kanallar.add(diziKanali2);
	}
	// Kullan�c� int tipinde bir a��lmas� istenen kanal de�eri yollayabilir.
	public void kanalDegistir(int acilmasiIstenenKanal) {
		if(acik) {
			if(acilmasiIstenenKanal != aktifKanal) {
				if(acilmasiIstenenKanal<=kanallar.size()&& acilmasiIstenenKanal>=0) {
					aktifKanal= acilmasiIstenenKanal;
					// index numaras� oldu�u i�in -1 yap�yoruz.
					System.out.println("Kanal:"+acilmasiIstenenKanal+"\t"+"Bilgi :"+kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
					
				}else {
					System.out.println("Ge�erli bir kanal numaras� giriniz");
				}
			}else {
				System.out.println("Zaten"+aktifKanal+". kanaldasiniz");
			}
		}
		else {
			System.out.println("�nce televizyonu a��n�z");
		}
	}
	//enc.
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getBoyut() {
		return boyut;
	}
	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}
	// to string televizyonu olu�turmak i�in
	@Override
	public String toString() {
		return "Marka: "+  marka +"Boyut: " + boyut+" olan tv olu�turuldu";
	}

}
