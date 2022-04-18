
package pkg05200000054;


public class Truck extends Vehicle{ // Inherited from Vehicle
    private double kapasite;
    
    public Truck(){
    
    }
    public Truck(String marka, int silindir, Person owner, double kapasite){
        super(marka, silindir, owner); // Calling Vehicle Constructure
        setKapasite(kapasite);
        
    }
    public Truck(Truck t1){
        super(t1.getMarka(), t1.getSilindir(), t1.getOwner());
        setKapasite(t1.getKapasite());
    }

    
    public double getKapasite() {
        return kapasite;
    }

    
    public void setKapasite(double kapasite) {
        this.kapasite = kapasite;
    }
    
    public String toString(){
        return ("Marka: " + getMarka() + " Silindir: " + getSilindir() + " Sahip: " + getOwner() + " Kapasite: " + getKapasite());
    }
    
    public boolean equals(Truck t1){
        if((t1.getKapasite() == getKapasite()) && (t1.getMarka().equals(getMarka())) && (t1.getOwner().equals(getOwner())) && (t1.getSilindir() == getSilindir()))
            return true;
        else
            return false;
    }
    
}
