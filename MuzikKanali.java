
public class MuzikKanali extends Kanal {
	private String muzikTuru;

	public MuzikKanali(String adi, int kanalNo, String muzikTuru) {
		super(adi, kanalNo);
		this.setMuzikTuru(muzikTuru);
	}

	public String getMuzikTuru() {
		return muzikTuru;
	}

	public void setMuzikTuru(String muzikTuru) {
		this.muzikTuru = muzikTuru;
	}
	

}
