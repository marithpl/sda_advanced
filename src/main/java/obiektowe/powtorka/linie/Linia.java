package obiektowe.powtorka.linie;

public class Linia {
    int lineLength;
    char fill;
    public String toString() {
        return "Linia o długości: " + lineLength + " wypelniona znakiem: "+fill;
    }

    public Linia(final int lineLength, final char fill) {
        this.lineLength = lineLength;
        this.fill = fill;
    }

    void printLine(){
        for (int i = 0; i < this.lineLength; i++) {
            System.out.print(this.fill);
        }
        System.out.println();
    }
}
