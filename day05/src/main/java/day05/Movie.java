package day05;

public class Movie {
    private String cim;
    private int gyartasEv;
    private double atlagErtekeles;
    private int ertekelesDb;
    private int sumErtekeles;

    public Movie(String cim,int gyartasEv){
        this.cim=cim;
        this.gyartasEv=gyartasEv;
    }
    public double ertekeles(int ertek){
        ertekelesDb++;
        sumErtekeles+=ertek;
        atlagErtekeles=(double)sumErtekeles/(double)ertekelesDb;
        return atlagErtekeles;

    }

    public String getCim() {
        return cim;
    }

    public int getGyartasEv() {
        return gyartasEv;
    }

    public double getAtlagErtekeles() {
        return atlagErtekeles;
    }
}
