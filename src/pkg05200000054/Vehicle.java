
package pkg05200000054;


public class Vehicle {
    private String marka;
    private int silindir;
    private Person owner;
    
    
    public Vehicle(){
        
    }
    public Vehicle(String marka, int silindir, Person owner){
        setMarka(marka);
        setSilindir(silindir);
        setOwner(owner);
    }
    public Vehicle(Vehicle v1){
        setMarka(v1.getMarka());
        setOwner(v1.getOwner());
        setSilindir(v1.getSilindir());
    }
    
    

    
    public String getMarka() {
        return marka;
    }

   
    public void setMarka(String marka) {
        this.marka = marka;
    }

   
    public int getSilindir() {
        return silindir;
    }

   
    public void setSilindir(int silindir) {
        this.silindir = silindir;
    }

   
    public Person getOwner() {
        return owner;
    }

   
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    
    public String toString(){
        return ("Marka: " + getMarka() + "Silindir: " + getSilindir() + "Sahip: " + getOwner());
    }
    public boolean equals(Vehicle v1){
        if ((v1.getMarka().equals(getMarka())) && (v1.getOwner().equals(getOwner())) && (v1.getSilindir() == getSilindir())) {
            return true;
        }
        else
            return false;
    }
    
}
