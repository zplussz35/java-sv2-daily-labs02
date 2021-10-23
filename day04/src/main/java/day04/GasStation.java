package day04;

public class GasStation {
    private double price;

    public GasStation(double price){
        this.price=price;
    }

    public double tank(Car car,double gasLitre){
        car.setGasLitre(gasLitre);
        return price*gasLitre;
    }
}
