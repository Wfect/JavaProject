
public class G�r�nt�Ayarlar� extends AbstractAyarlar{
	private int G�r�nt�Kalitesi=1920;
	private int G�r�nt�Kalitesi2=1080;
	private int G�r�nt�Kalitesi3=720;

	@Override
	void Ayarlar�G�ncelle() {
		
		System.out.println("G�r�nt� Ayarlar� G�ncellendi"+getG�r�nt�Kalitesi());
	}

	@Override
	void Ayarlar�Al() {
		
		System.out.println("G�r�nt� Kalitesi : " +getG�r�nt�Kalitesi() + "\t"+"otomatik olarak ayarland�");
		
	}
	@Override
	void Ayarlar�G�ncelle2() {
		
		System.out.println("G�r�nt� Kalitesi : " +getG�r�nt�Kalitesi2()+"\t"+ "olarak g�ncellendi");
		
	}
	@Override
	void Ayarlar�G�ncelle3() {
		
		System.out.println("G�r�nt� Kalitesi : " +getG�r�nt�Kalitesi3()+"\t"+ "olarak g�ncellendi");
		
	}
	

	public int getG�r�nt�Kalitesi() {
		return G�r�nt�Kalitesi;
	}

	public void setG�r�nt�Kalitesi(int g�r�nt�Kalitesi) {
		G�r�nt�Kalitesi = g�r�nt�Kalitesi;
	}

	public int getG�r�nt�Kalitesi2() {
		return G�r�nt�Kalitesi2;
	}

	public void setG�r�nt�Kalitesi2(int g�r�nt�Kalitesi2) {
		G�r�nt�Kalitesi2 = g�r�nt�Kalitesi2;
	}

	public int getG�r�nt�Kalitesi3() {
		return G�r�nt�Kalitesi3;
	}

	public void setG�r�nt�Kalitesi3(int g�r�nt�Kalitesi3) {
		G�r�nt�Kalitesi3 = g�r�nt�Kalitesi3;
	}

	
}
