
public class Kanal {
	private String adi;
    private int kanalNo;
    // constructor
	public Kanal(String adi, int kanalNo) {
		this.adi = adi;
		this.kanalNo = kanalNo;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public int getKanalNo() {
		return kanalNo;
	}
	public void setKanalNo(int kanalNo) {
		this.kanalNo = kanalNo;
	}
	public String kanalBilgisiniGoster() {
		return "Ad?: "+adi+"\t"+"Numaras?:"+kanalNo;
		
	}

}
