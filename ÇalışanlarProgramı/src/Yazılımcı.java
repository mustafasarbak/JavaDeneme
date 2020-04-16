
public class Yazılımcı extends Çalışan {
	private String diller;

	public Yazılımcı(String ad, String soyad, int id, String diller) {		
		super(ad, soyad, id);
		this.diller = diller;		
	}
	public String getDiller() {
		return diller;
	}
	public void setDiller(String diller) {
		this.diller = diller;
	}
	public void formatAt(String isletim_sistemi) {
		System.out.println(getAd() + " " + isletim_sistemi + "ni yüklüyor..");
	}
	@Override
	public void bilgilerigöster() {		
		super.bilgilerigöster();
		System.out.println("Yazılımcını bildiği diller: " + diller);
	}  
	

}
