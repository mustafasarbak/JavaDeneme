import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�al��anlar Program�na Ho�geldiniz...");
		
		String islemler = "��lemler..\n"
				          +"1. Yaz�l�mc� ��lemleri\n"
				          +"2. Y�netici ��lemleri\n"
				          +"��k�� i�in q'ya bas�n�z..";
		System.out.println(islemler);
		
		while (true) {
			System.out.println("��lemi Se�iniz ");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			}
			else if(islem.equals("1")) {
				Yaz�l�mc� yaz�l�mc� = new Yaz�l�mc�("Mustafa Onur", "�arbak", 1714, "C#, Java");
				String yaz�l�mc�_i�lem = "Yaz�l�mc� ��lemleri\n"
						                 +"1. Format At\n"
						                 +"2. Bilgileri G�ster\n"
						                 +"��k�� i�in q'ya bas�n�z";
				System.out.println(yaz�l�mc�_i�lem);
				while (true) {
					System.out.println("��lemi Se�iniz: ");
					String y_i�lem = scanner.nextLine();
					if(y_i�lem.equals("q")) {
						System.out.println("Yaz�l�mc� i�lemlerinden ��k�l�yor...");
						break;
					}
					else if(y_i�lem.equals("1")) {
						System.out.println("��letim Sistemi: ");
						String isletim_sistemi = scanner.nextLine();
						yaz�l�mc�.formatAt(isletim_sistemi);
					}
					else if(y_i�lem.equals("2")) {
						yaz�l�mc�.bilgilerig�ster();
					}
					else
						System.out.println("Ge�ersiz Yaz�l�mc� ��lemi...");
				}
				
			}
			else if(islem.equals("2")) {
				Y�netici y�netici = new Y�netici("Neslihan", "Demir G�ler", 17, 20);
				String y�netici_i�lem = "Y�netici ��lemleri\n"
				                         +"1. Zam Yap\n"
		                                 +"2. Bilgileri G�ster\n"
		                                 +"��k�� i�in q'ya bas�n�z";
				System.out.println(y�netici_i�lem);
				
				while(true) {
					System.out.println("��lemi Se�iniz: ");
					String y_i�lem = scanner.nextLine();
					if(y_i�lem.equals("q")) {
						System.out.println("Y�netici i�lemlerinden ��k�l�yor...");
						break;
					}
					else if(y_i�lem.equals("1")) {
						System.out.println("Y�neticinin ne kadar zam yapmas�n� istiyorsunuz: ");
						int zamMiktar� = scanner.nextInt();
						scanner.nextLine();
						y�netici.zamYap(zamMiktar�);
					}
					else if(y_i�lem.equals("2")) {
						y�netici.bilgilerig�ster();
					}
					else
						System.out.println("Ge�ersiz Yaz�l�mc� ��lemi...");
				}
			}
			else
				System.out.println("Ge�ersiz ��lem..");
			
			
		}

	}

}
