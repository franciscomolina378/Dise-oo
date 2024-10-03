package proyectforma;

public class programa {
    public static void main(String[] args) {
        
        Circle circle = new Circle(2.5, "azul", false);
        System.out.println(circle);
        System.out.println("Área del círculo: " + circle.getArea());
        System.out.println("Perímetro del círculo: " + circle.getPerimeter());

        
        Rectangle rectangle = new Rectangle(2.0, 4.0, "verde", true);
        System.out.println(rectangle);
        System.out.println("Área del rectángulo: " + rectangle.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangle.getPerimeter());

        
        Square square = new Square(3.0, "amarillo", true);
        System.out.println(square);
        System.out.println("Área del cuadrado: " + square.getArea());
        System.out.println("Perímetro del cuadrado: " + square.getPerimeter());
    }
}

