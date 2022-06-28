package obiektowe.powtorka.kompozycja.dom;

import obiektowe.powtorka.samochod.Samochod;

public class Main {
    public static void main(String[] args) {
        Window[] WindowList = {
                new Window(),
                new Window(),
                new Window(),
                new Window()
        };
        for (Window okno : WindowList) {
            System.out.println(okno.toString());
        }
    }
}

