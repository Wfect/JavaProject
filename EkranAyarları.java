
public class EkranAyarlar� extends AbstractAyarlar{
	private String ekranboyutu="TamEkran";
	private String ekranboyutu2="FilmEkran�";
	private String ekranboyutu3="OyunEkran�";
	@Override
	void Ayarlar�G�ncelle() {
		
		System.out.println("Ekran Ayarlar� G�ncellendi");
	}
	
	@Override
	void Ayarlar�G�ncelle2() {
		
		System.out.println("Ekran boyutu : " +getEkranboyutu2()+"\t"+ "olarak g�ncellendi");
	}
	@Override
	void Ayarlar�G�ncelle3() {
		
		System.out.println("Ekran boyutu : " +getEkranboyutu3()+"\t"+ "olarak g�ncellendi");
	}

	@Override
	void Ayarlar�Al() {
		
		System.out.println("Ekran boyutu : " +getEkranboyutu() +"\t"+ "olarak otomatik ayarland�");
		
	}
	
	public String getEkranboyutu() {
		return ekranboyutu;
	}

	public void setEkranboyutu(String ekranboyutu) {
		this.ekranboyutu = ekranboyutu;
	}

	public String getEkranboyutu2() {
		return ekranboyutu2;
	}

	public void setEkranboyutu2(String ekranboyutu2) {
		this.ekranboyutu2 = ekranboyutu2;
	}

	public String getEkranboyutu3() {
		return ekranboyutu3;
	}

	public void setEkranboyutu3(String ekranboyutu3) {
		this.ekranboyutu3 = ekranboyutu3;
	}

}
