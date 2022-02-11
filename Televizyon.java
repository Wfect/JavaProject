import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;


public class Televizyon {
	private String marka;
	private String boyut;
	// Arraylist oluþtur. Arraylistin içerisinde de kanal sýnýfý olacak.
	private ArrayList<Kanal> kanallar;
	//Televizyonun açýlýp kapanmasý için deðer.
	private boolean acik;
	private int ses;
	//açýk olan kanal
	private int aktifKanal;
	private int Ayarsecim;
	private boolean bagli;
	private int uygulamasecimi;
	
	// constructorlarý oluþturuyoruz.
	public Televizyon(String marka,String boyut) {
		this.marka=marka;
		this.boyut=boyut;
		//bellekte bir yapý oluþturuyoruz. NULL exception hatasý almamak için
		kanallar=new ArrayList<>();
		ses = 10;
		//kanal 1 den baþlýyor. O yüzden 1 diyoruz.
		aktifKanal=1;
		//televizyonu oluþturunca kanallarýda yükleyen metod.
		kanallariOlustur();
		//Televizyon kapalý bile olsa kanallarý kuracak. Açýk deðerini false a atadým.
		this.acik=false;
	}
	public void FavoriKanallarim(int favorikanalsecimi) {
		if(acik) {
		
			System.out.println("Favorilerime eklenen kanal" +kanallar.get(favorikanalsecimi).kanalBilgisiniGoster());
		}
		else {
			System.out.println("Önce tv yi açýnýz");
		}
	}

	public void AyarlarýGöster() {
		if(acik) {

		AbstractAyarlar ayar = new GörüntüAyarlarý();
		ayar.AyarlarýAl();
		AbstractAyarlar ayar1 = new EkranAyarlarý();
		ayar1.AyarlarýAl();
		}
		else
			System.out.println("Önce tv yi açýn");
	}
	public void AyarlarýGüncelle() {
		if(acik) {
		System.out.println("Seçmek istediðiniz ayarlarý seçiniz");
		System.out.println("1080 ve Film Ekraný için 1 i seçiniz.\n 720 ve Oyun Ekraný için 2 yi seçiniz.");
		Scanner istek = new Scanner(System.in);
		int Ayarsecim = istek.nextInt();
		
		if(Ayarsecim==0) {
		AbstractAyarlar ayar = new GörüntüAyarlarý();
		ayar.AyarlarýAl();
		AbstractAyarlar ayar1 = new EkranAyarlarý();
		ayar1.AyarlarýAl();
		}
		if(Ayarsecim==1) {
			AbstractAyarlar ayar = new GörüntüAyarlarý();
			ayar.AyarlarýGüncelle2();
			AbstractAyarlar ayar1 = new EkranAyarlarý();
			ayar1.AyarlarýGüncelle2();
			}
		if(Ayarsecim==2) {
			AbstractAyarlar ayar = new GörüntüAyarlarý();
			ayar.AyarlarýGüncelle3();
			AbstractAyarlar ayar1 = new EkranAyarlarý();
			ayar1.AyarlarýGüncelle3();
			}
		}
		else
			System.out.println("Önce tv yi açýn");
		
	}
	
	public void sesArttir() {
		//Sesi 1 arttýrýr. Ve televizyon açýk ise arttýrýr.
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
		//Eðer televizyon kapalýysa
		if(acik==false) {
			acik=true;
			System.out.println("Tv açýldý");
		}else {
			System.out.println("Tv zaten açýk");
		}
	}
	public void InterneteBaglan() {
		if(acik){
		if(bagli==false) {
			  bagli=true;
			System.out.println("Ýnternet baðlantýsý saðlandý");
		}else {
			System.out.println("Ýnternete zaten baðlýsýnýz");}
		}
		else
		{
			System.out.println("Ýnternete baðlanmak için önce tv yi açýnýz");
		}
	}
	public void InternetBaglantisiKapat() {
		if(acik) {
		if(bagli==true) {
			bagli=false;
			System.out.println("Ýnternet Baðlantýsýný Kapatýldý");
		}else {
			System.out.println("Baðlantý Zaten Kapalý");
		}
		}
		else
		{
			System.out.println("Ýnternete baðlantýsýný kapatmak için önce tv yi açýnýz");
		}
	}
	public void ÝnternetUygulamalarý() {
		if(acik){
				  System.out.println("Uygulamalarýnýz:");
				  Uygulamalar youtube = new Youtube();
			      Uygulamalar amazon = new Amazon();
			      youtube.log();
			      amazon.log();
			      System.out.println("Yapmak Ýstediðiniz iþlemi seçiniz:\n 1-Youtube Aç\n 2-Amazon aç");
			      Scanner uygulamaistek = new Scanner(System.in);
					int uygulamasecimi = uygulamaistek.nextInt();
			      if(bagli==true) {
					  if(uygulamasecimi==1) {
						  System.out.println("Youtube Açýldý");
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
						  System.out.println("Amazon Açýldý");
						  Desktop d = Desktop.getDesktop();
							try {
								d.browse(new URI("https://www.amazon.com"));
							} catch (IOException e) {
								//hataya neyin neden olduðunu ve nerede hata olduðunu gösterir. Printscack
								
								e.printStackTrace();
							} catch (URISyntaxException e) {
								
								e.printStackTrace();
							}  
					  }
					  }
			      else {
			    	  System.out.print("Önce internete baglanýn\n");
			      }
			
		}
		else {
			System.out.println("Önce tvyi açýnýz");
		}
	}

	
	public void tvKapat() {
		if(acik==true) {
			acik=false;
			System.out.println("Tv kapandý");
		}else {
			System.out.println("Tv zaten kapalý");
		}
	}
	public void aktifKanaliGoster() {
		if(acik)
		System.out.println("Aktif kanal:"+kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
		else
			System.out.println("Önce tv yi açýn");
	}
	//Polym.
	// Bu metodun dýþarýdan bir kullanýmý olmayacak. Yani mainden eriþilmeyecek
	private void kanallariOlustur() {
		//Kanal nesnelerini oluþturduk. Daha sonra oluþturulan kanallarý arrayliste attýk.
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
	// Kullanýcý int tipinde bir açýlmasý istenen kanal deðeri yollayabilir.
	public void kanalDegistir(int acilmasiIstenenKanal) {
		if(acik) {
			if(acilmasiIstenenKanal != aktifKanal) {
				if(acilmasiIstenenKanal<=kanallar.size()&& acilmasiIstenenKanal>=0) {
					aktifKanal= acilmasiIstenenKanal;
					// index numarasý olduðu için -1 yapýyoruz.
					System.out.println("Kanal:"+acilmasiIstenenKanal+"\t"+"Bilgi :"+kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
					
				}else {
					System.out.println("Geçerli bir kanal numarasý giriniz");
				}
			}else {
				System.out.println("Zaten"+aktifKanal+". kanaldasiniz");
			}
		}
		else {
			System.out.println("Önce televizyonu açýnýz");
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
	// to string televizyonu oluþturmak için
	@Override
	public String toString() {
		return "Marka: "+  marka +"Boyut: " + boyut+" olan tv oluþturuldu";
	}

}
