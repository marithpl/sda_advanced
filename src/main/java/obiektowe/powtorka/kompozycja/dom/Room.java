package obiektowe.powtorka.kompozycja.dom;

import java.util.Arrays;

public class Room {
    private Bed bed;
    private Window[] windows;

    public Room() {
        this.bed = new Bed();
        this.windows = new Window[]{ new Window(), new Window()};
    }

    public void cleanRoom(){
    bed.cleanBed();
        for (Window item: windows) {
            if (!item.isOpened()) {
                item.openWindow();
            }

        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", windows=" + Arrays.toString(windows) +
                '}';
    }
}
