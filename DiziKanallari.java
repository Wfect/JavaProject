
public class DiziKanallari extends Kanal {
	private String diziTürü;
	
	public DiziKanallari(String adi, int kanalNo, String diziTürü ) {
		super(adi, kanalNo);
		this.diziTürü=diziTürü;
	}


	public String getDiziTürü() {
		return diziTürü;
	}

	public void setDiziTürü(String diziTürü) {
		this.diziTürü = diziTürü;
	}

}
