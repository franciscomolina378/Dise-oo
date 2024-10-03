package proyectoanimales;

public class programa {
    public static void main(String[] args) {
        
        Cat cat = new Cat("Tom");
        System.out.println(cat);
        cat.greets(); 
        
        Dog dog = new Dog("Rex");
        System.out.println(dog);
        dog.greets(); 

        
        Dog anotherDog = new Dog("Buddy");
        dog.greets(anotherDog); 
    }
}

