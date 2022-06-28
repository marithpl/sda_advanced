package obiektowe.powtorka.kompozycja;

import java.util.Arrays;

public class Blok {
    private Mieszkanie[] mieszkania;

    public Blok(final Mieszkanie[] mieszkania) {
        this.mieszkania = mieszkania;
    }

    public Mieszkanie znajdzMieszkanie(int nrMieszkania) {
        for (Mieszkanie x : mieszkania) {
            if (x.getNumer() == nrMieszkania) {
                return x;
            }
        }
        return  null;

    }

    @Override
    public String toString() {
        return "Blok{" +
                "mieszkania=" + Arrays.toString(mieszkania) +
                '}';
    }
}
