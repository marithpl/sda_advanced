package obiektowe.powtorka.kompozycja;

public class SerwisSpoldzielni {

    private Blok blok = null;

    public SerwisSpoldzielni(final Blok blok) {
        this.blok = blok;
    }

    public void oplacCzynsz(int numerMieszkania) {
        Mieszkanie mieszkanie = blok.znajdzMieszkanie(numerMieszkania);
        if (mieszkanie == null) {
            return;
        }
        mieszkanie.oplac();
    }
}
