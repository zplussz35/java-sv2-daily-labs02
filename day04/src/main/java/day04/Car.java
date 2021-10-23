package day04;

public class Car {
    private double gasLitre;
    private double kmWithGas;

    public void setGasLitre(double gasLitre) {
        this.gasLitre = gasLitre;
    }

    public void setKmWithGas(double kmWithGas) {
        this.kmWithGas = kmWithGas;
    }

    public double calculateConsumption(){
        return 100/kmWithGas*gasLitre;
    }
}
