package obiektowe.powtorka.samochod;

import java.sql.Array;
import java.util.ArrayList;

public class SamochodDemo {
    public static void main(String[] args) {
//        Samochod Audi = new Samochod("Audi", 15600);
//        Samochod BMW = new Samochod("BMW", 6853);
//        Samochod Fiat = new Samochod("BMW", 19500);

        Samochod[] ListaSamochodow = {new Samochod("Toyota", 67000), new Samochod("Honda", 17000), new Samochod("BMW", 11000), new Samochod("Audi", 43000)};


        for(Samochod auto : ListaSamochodow) {
            auto.presentBrandAndMillage();
            auto.millageToNextService();
            auto.addTraveledDistance(850);
            auto.millageToNextService();
        }
//        Audi.presentBrandAndMillage();
//        Audi.millageToNextService();
//        Audi.addTraveledDistance(850);
//        Audi.millageToNextService();
//
//        BMW.presentBrandAndMillage();
//        BMW.millageToNextService();
//        BMW.addTraveledDistance(2359);
//        BMW.millageToNextService();
//
//        Fiat.presentBrandAndMillage();
//        Fiat.millageToNextService();
//        Fiat.addTraveledDistance(291);
//        Fiat.millageToNextService();
    }
}
