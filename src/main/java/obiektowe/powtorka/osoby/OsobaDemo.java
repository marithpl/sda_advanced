package obiektowe.powtorka.osoby;

public class OsobaDemo {
    public static void main(String[] args) {
        int liczba = 10;
        String tekst = new String("abc");

        Osoba osoba1 = new Osoba();
        osoba1.imie = "Radek";
        osoba1.wiek = 30;


        Osoba osoba2 = new Osoba();
        osoba2.imie = "Marta";
        osoba2.wiek = 26;

        System.out.println(osoba1.imie);
        System.out.println(osoba2.imie);
        osoba1.przywitajSie();
        osoba1.wyprawUrodziny();
        osoba1.przywitajSie();

    }
}
