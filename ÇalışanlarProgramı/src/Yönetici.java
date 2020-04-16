
public class Yönetici extends Çalýþan {
	
	private int sorumlu_kisi_sayisi;	
	public Yönetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
		super(ad, soyad, id);
		this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
	}
	@Override
	public void bilgilerigöster() {		
		super.bilgilerigöster();
		System.out.println("Yöneticinin sorumlu olduðu kiþi sayýsý: " + sorumlu_kisi_sayisi);
	}
	public void zamYap(int zamMiktarý) {
		
		System.out.println(getAd() + "çalýþanlara " + zamMiktarý + " kadar zam yapýyor..");
	}
	

}
