package obiektowe.powtorka.osoby;

public class Osoba {

    String imie;
    int wiek;

    public Osoba() {
    }

    public Osoba(final String imie, final int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    void przywitajSie() {
        System.out.println("Witaj, jestem " + this.imie + " mam " + this.wiek+ " lat");
    }

    void wyprawUrodziny() {
        wiek++;
    }

    public void setWiek() {

    }
}
