package proyectoanimales;

public class Dog extends Mammal {

    
    public Dog(String name) {
        super(name);
    }

    
    public void greets() {
        System.out.println("Guau");
    }

   
    public void greets(Dog another) {
        System.out.println("Guauuu");
    }

    
    @Override
    public String toString() {
        return "Perro[" + super.toString() + "]";
    }
}

