package proyectoanimales;

public class Cat extends Mammal {

    
    public Cat(String name) {
        super(name);
    }
    
    public void greets() {
        System.out.println("Miau");
    }
    
    @Override
    public String toString() {
        return "Gato[" + super.toString() + "]";
    }
}
