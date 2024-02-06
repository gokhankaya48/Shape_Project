import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secim;
        do {

            System.out.println("1 - Kare");
            System.out.println("2 - Dikdörtgen");
            System.out.println("3 - Daire");
            System.out.println("4 - Üçgen");
            System.out.print("Lütfen hesaplamak istediğiniz şekli seçin (Çıkmak için 0'a basın): ");

            secim = scanner.nextInt();
            double sonuc;

            switch (secim) {
                case 0:
                    System.out.println("Program sonlandırıldı");
                    break;
                case 1:
                    System.out.print("Karenin kenar uzunluğunu girin: ");
                    double kenar = scanner.nextDouble();
                    Kare kare = new Kare(kenar);
                    sonuc = kare.alanHesapla();
                    System.out.println("Karenin alanı: " + sonuc);
                    sonuc = kare.cevreHesapla();
                    System.out.println("Karenin çevresi: " + sonuc);
                    break;
                case 2:
                    System.out.print("Dikdörtgenin uzun kenarını girin: ");
                    double uzunKenar = scanner.nextDouble();
                    System.out.print("Dikdörtgenin kısa kenarını girin: ");
                    double kisaKenar = scanner.nextDouble();
                    Dikdortgen dikdortgen = new Dikdortgen(uzunKenar, kisaKenar);
                    sonuc = dikdortgen.alanHesapla();
                    System.out.println("Dikdörtgenin alanı: " + sonuc);
                    sonuc = dikdortgen.cevreHesapla();
                    System.out.println("Dikdörtgenin çevresi: " + sonuc);
                    break;
                case 3:
                    System.out.print("Dairenin yarıçapını girin: ");
                    double yaricap = scanner.nextDouble();
                    Daire daire = new Daire(yaricap);
                    sonuc = daire.alanHesapla();
                    System.out.println("Dairenin alanı: " + sonuc);
                    sonuc = daire.cevreHesapla();
                    System.out.println("Dairenin çevresi: " + sonuc);
                    break;
                case 4:
                    System.out.print("Üçgenin a kenarını girin: ");
                    double a = scanner.nextDouble();
                    System.out.print("Üçgenin b kenarını girin: ");
                    double b = scanner.nextDouble();
                    System.out.print("Üçgenin c kenarını girin: ");
                    double c = scanner.nextDouble();
                    Ucgen ucgen = new Ucgen(a, b, c);
                    sonuc = ucgen.alanHesapla();
                    System.out.println("Üçgenin alanı: " + sonuc);
                    sonuc = ucgen.cevreHesapla();
                    System.out.println("Üçgenin çevresi: " + sonuc);
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }

        } while (secim != 0);


    }



}

