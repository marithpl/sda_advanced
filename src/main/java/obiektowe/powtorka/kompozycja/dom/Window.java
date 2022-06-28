package obiektowe.powtorka.kompozycja.dom;

public class Window {
    private boolean isOpen = false;

    public void openWindow() {
        isOpen = true;
    }

    public boolean isOpened() {
        return this.isOpen;
    }

    @Override
    public String toString() {
        return "Window{" +
                "isOpen=" + isOpen +
                '}';
    }
}
