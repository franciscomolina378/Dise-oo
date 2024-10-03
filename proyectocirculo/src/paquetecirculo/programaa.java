package paquetecirculo;

public class programaa {
    public static void main(String[] args) {
        
        Circle circle = new Circle(2.5, "azul");
        System.out.println(circle);
        System.out.println("Área del círculo: " + circle.getArea());

        
        Cylinder cylinder = new Cylinder(2.5, 5.0, "verde");
        System.out.println(cylinder);
        System.out.println("Volumen del cilindro: " + cylinder.getVolume());
    }
}

