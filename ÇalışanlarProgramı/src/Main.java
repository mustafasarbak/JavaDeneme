import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Çalýþanlar Programýna Hoþgeldiniz...");
		
		String islemler = "Ýþlemler..\n"
				          +"1. Yazýlýmcý Ýþlemleri\n"
				          +"2. Yönetici Ýþlemleri\n"
				          +"Çýkýþ için q'ya basýnýz..";
		System.out.println(islemler);
		
		while (true) {
			System.out.println("Ýþlemi Seçiniz ");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan Çýkýlýyor...");
				break;
			}
			else if(islem.equals("1")) {
				Yazýlýmcý yazýlýmcý = new Yazýlýmcý("Mustafa Onur", "Þarbak", 1714, "C#, Java");
				String yazýlýmcý_iþlem = "Yazýlýmcý Ýþlemleri\n"
						                 +"1. Format At\n"
						                 +"2. Bilgileri Göster\n"
						                 +"Çýkýþ için q'ya basýnýz";
				System.out.println(yazýlýmcý_iþlem);
				while (true) {
					System.out.println("Ýþlemi Seçiniz: ");
					String y_iþlem = scanner.nextLine();
					if(y_iþlem.equals("q")) {
						System.out.println("Yazýlýmcý iþlemlerinden Çýkýlýyor...");
						break;
					}
					else if(y_iþlem.equals("1")) {
						System.out.println("Ýþletim Sistemi: ");
						String isletim_sistemi = scanner.nextLine();
						yazýlýmcý.formatAt(isletim_sistemi);
					}
					else if(y_iþlem.equals("2")) {
						yazýlýmcý.bilgilerigöster();
					}
					else
						System.out.println("Geçersiz Yazýlýmcý Ýþlemi...");
				}
				
			}
			else if(islem.equals("2")) {
				Yönetici yönetici = new Yönetici("Neslihan", "Demir Güler", 17, 20);
				String yönetici_iþlem = "Yönetici Ýþlemleri\n"
				                         +"1. Zam Yap\n"
		                                 +"2. Bilgileri Göster\n"
		                                 +"Çýkýþ için q'ya basýnýz";
				System.out.println(yönetici_iþlem);
				
				while(true) {
					System.out.println("Ýþlemi Seçiniz: ");
					String y_iþlem = scanner.nextLine();
					if(y_iþlem.equals("q")) {
						System.out.println("Yönetici iþlemlerinden Çýkýlýyor...");
						break;
					}
					else if(y_iþlem.equals("1")) {
						System.out.println("Yöneticinin ne kadar zam yapmasýný istiyorsunuz: ");
						int zamMiktarý = scanner.nextInt();
						scanner.nextLine();
						yönetici.zamYap(zamMiktarý);
					}
					else if(y_iþlem.equals("2")) {
						yönetici.bilgilerigöster();
					}
					else
						System.out.println("Geçersiz Yazýlýmcý Ýþlemi...");
				}
			}
			else
				System.out.println("Geçersiz Ýþlem..");
			
			
		}

	}

}
