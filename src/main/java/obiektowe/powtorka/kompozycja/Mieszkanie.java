package obiektowe.powtorka.kompozycja;

public class Mieszkanie {

    public int getNumer() {
        return numer;
    }

    private boolean oplacono;
    private int numer;

    public Mieszkanie(final int numer) {
        this.numer = numer;
    }

    public void oplac() {
        oplacono = true;
    }

    @Override
    public String toString() {
        return "Mieszkanie{" +
                "oplacono=" + oplacono +
                ", numer=" + numer +
                '}';
    }
}
