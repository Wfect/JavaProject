
public class EkranAyarlarý extends AbstractAyarlar{
	private String ekranboyutu="TamEkran";
	private String ekranboyutu2="FilmEkraný";
	private String ekranboyutu3="OyunEkraný";
	@Override
	void AyarlarýGüncelle() {
		
		System.out.println("Ekran Ayarlarý Güncellendi");
	}
	
	@Override
	void AyarlarýGüncelle2() {
		
		System.out.println("Ekran boyutu : " +getEkranboyutu2()+"\t"+ "olarak güncellendi");
	}
	@Override
	void AyarlarýGüncelle3() {
		
		System.out.println("Ekran boyutu : " +getEkranboyutu3()+"\t"+ "olarak güncellendi");
	}

	@Override
	void AyarlarýAl() {
		
		System.out.println("Ekran boyutu : " +getEkranboyutu() +"\t"+ "olarak otomatik ayarlandý");
		
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
