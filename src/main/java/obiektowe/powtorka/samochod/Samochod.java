package obiektowe.powtorka.samochod;

public class Samochod {
    String brand;
    int millage;

    @Override
    public String toString() {
        return "Samochod{" +
                "brand='" + brand + '\'' +
                ", millage=" + millage +
                ", nextService=" + nextService +
                '}';
    }

    int nextService = 20000;

    public Samochod(final String brand, final int millage) {
        this.brand = brand;
        this.millage = millage;
    }

    void presentBrandAndMillage() {
        System.out.println(this.brand + " | " + this.millage);
    }

    void addTraveledDistance(int setDistance){
        this.millage = this.millage + setDistance;
        System.out.println("Samochód pokonał: " + setDistance + "km");
    }

    void millageToNextService() {
        System.out.println("Następny serwis za: "+ (nextService - this.millage));
    }
}
