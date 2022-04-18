
package pkg05200000054;


public class Person {
    private String name;
    
    
    public Person(){
        setName(null);
    }
    
    public Person(String name){
        setName(name);
    }
    
    public Person(Person p1){
        setName(p1.getName());
    }

  
    public String getName() {
        return name;
    }

 
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){ // Print
        return (name);
    }
    
    public boolean equals(Person p1){ //Check if it equals
        if(p1.getName().equals(getName())){
            return true;
        }
        else
            return false;
                
        
    }
    
}
