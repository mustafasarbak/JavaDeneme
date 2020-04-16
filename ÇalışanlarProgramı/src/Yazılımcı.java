
public class Yaz�l�mc� extends �al��an {
	private String diller;

	public Yaz�l�mc�(String ad, String soyad, int id, String diller) {		
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
		System.out.println(getAd() + " " + isletim_sistemi + "ni y�kl�yor..");
	}
	@Override
	public void bilgilerig�ster() {		
		super.bilgilerig�ster();
		System.out.println("Yaz�l�mc�n� bildi�i diller: " + diller);
	}  
	

}
