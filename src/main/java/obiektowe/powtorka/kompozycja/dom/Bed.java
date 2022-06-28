package obiektowe.powtorka.kompozycja.dom;

import java.util.Random;

public class Bed {
    private int bedsheetDaysCounter;



    public Bed() {
        Random rnd = new Random();
        this.bedsheetDaysCounter = rnd.nextInt(30) + 1;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "bedsheetDaysCounter=" + bedsheetDaysCounter +
                '}';
    }
}
