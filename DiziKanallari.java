
public class DiziKanallari extends Kanal {
	private String diziT�r�;
	
	public DiziKanallari(String adi, int kanalNo, String diziT�r� ) {
		super(adi, kanalNo);
		this.diziT�r�=diziT�r�;
	}


	public String getDiziT�r�() {
		return diziT�r�;
	}

	public void setDiziT�r�(String diziT�r�) {
		this.diziT�r� = diziT�r�;
	}

}
