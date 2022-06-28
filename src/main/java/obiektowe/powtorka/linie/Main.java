package obiektowe.powtorka.linie;

public class Main {
    public static void main(String[] args) {

        Linia[] liny = {new Linia(5, '@'),
                new Linia(10, '!'),
                new Linia(7, '&')
        };

        for (Linia x : liny) {
            System.out.println(x.toString());
            x.printLine();
            System.out.println(" ");
        }


    }
}
