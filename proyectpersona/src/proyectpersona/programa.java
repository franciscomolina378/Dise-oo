package proyectpersona;

public class programa {
    public static void main(String[] args) {
        
        Student student = new Student("Francisco Pérez", "Calle 27", "Ingeniería de Software", 3, 4000000.00);
        System.out.println(student);

        
        Staff staff = new Staff("Ana Gómez", "Avenida Siempreviva ", "Escuela de marquetalia ", 5000.00);
        System.out.println(staff);
    }
}

