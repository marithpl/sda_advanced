package obiektowe.powtorka.kompozycja.dom;

public class Main {
    public static void main(String[] args) {

        Room[] RoomList = {
          new Room(),
          new Room()
        };

        for (Room pokoj : RoomList) {
            System.out.println(pokoj.toString());
        }
    }
}

