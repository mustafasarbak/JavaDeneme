
public class Y�netici extends �al��an {
	
	private int sorumlu_kisi_sayisi;	
	public Y�netici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
		super(ad, soyad, id);
		this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
	}
	@Override
	public void bilgilerig�ster() {		
		super.bilgilerig�ster();
		System.out.println("Y�neticinin sorumlu oldu�u ki�i say�s�: " + sorumlu_kisi_sayisi);
	}
	public void zamYap(int zamMiktar�) {
		
		System.out.println(getAd() + "�al��anlara " + zamMiktar� + " kadar zam yap�yor..");
	}
	

}
