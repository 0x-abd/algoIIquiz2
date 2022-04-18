/*
    05200000054 Ahmet Burak Dinc || Algoritma ve Programlama II Quiz 2
 */
package pkg05200000054;


public class deneme {
    public static void main(String[] args) {
        
        Person p1 = new Person("Ahmet Burak");
        Truck t1 = new Truck("Mercedes",5, p1, 4.5);
        System.out.println(t1.toString());
        Truck t2 = new Truck(t1); //Copy Constructure
        System.out.println(t1.equals(t2)); // true
        
        
        
        
    }
    
}
