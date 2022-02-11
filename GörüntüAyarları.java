
public class GörüntüAyarları extends AbstractAyarlar{
	private int GörüntüKalitesi=1920;
	private int GörüntüKalitesi2=1080;
	private int GörüntüKalitesi3=720;

	@Override
	void AyarlarıGüncelle() {
		
		System.out.println("Görüntü Ayarları Güncellendi"+getGörüntüKalitesi());
	}

	@Override
	void AyarlarıAl() {
		
		System.out.println("Görüntü Kalitesi : " +getGörüntüKalitesi() + "\t"+"otomatik olarak ayarlandı");
		
	}
	@Override
	void AyarlarıGüncelle2() {
		
		System.out.println("Görüntü Kalitesi : " +getGörüntüKalitesi2()+"\t"+ "olarak güncellendi");
		
	}
	@Override
	void AyarlarıGüncelle3() {
		
		System.out.println("Görüntü Kalitesi : " +getGörüntüKalitesi3()+"\t"+ "olarak güncellendi");
		
	}
	

	public int getGörüntüKalitesi() {
		return GörüntüKalitesi;
	}

	public void setGörüntüKalitesi(int görüntüKalitesi) {
		GörüntüKalitesi = görüntüKalitesi;
	}

	public int getGörüntüKalitesi2() {
		return GörüntüKalitesi2;
	}

	public void setGörüntüKalitesi2(int görüntüKalitesi2) {
		GörüntüKalitesi2 = görüntüKalitesi2;
	}

	public int getGörüntüKalitesi3() {
		return GörüntüKalitesi3;
	}

	public void setGörüntüKalitesi3(int görüntüKalitesi3) {
		GörüntüKalitesi3 = görüntüKalitesi3;
	}

	
}
