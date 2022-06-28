package obiektowe.powtorka.kompozycja.dom;

import obiektowe.powtorka.samochod.Samochod;

public class Main {
    public static void main(String[] args) {
//        Window[] WindowList = {
//                new Window(),
//                new Window(),
//                new Window(),
//                new Window()
//        };
//
//        Bed[] BedList = {
//                new Bed(),
//                new Bed(),
//                new Bed()
//        };

        Room[] RoomList = {
          new Room(),
          new Room()
        };

//        for (Window okno : WindowList) {
//            System.out.println(okno.toString());
//        }
//
//        for (Bed lozko : BedList) {
//            System.out.println(lozko.toString());
//        }
        for (Room pokoj : RoomList) {
            System.out.println(pokoj.toString());
        }
    }
}

