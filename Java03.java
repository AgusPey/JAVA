public class Person() {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

public class Main {
    public static void main(String[] args) {
        Persona persona = new persona();

        // Utilizar los setters para asignar valores a las propiedades
        persona.setEdad(19);
        persona.setNombre("Simone");
        persona.setTelefono(+542213312321);

        // Utilizar los getters para obtener los valores de las propiedades y mostrarlos por consola
        system.out.printLn("Edad " + persona.getEdad());
        system.out.printLn("Nombre " + persona.getNombre());
        system.out.printLn("Telefono " + persona.getTelefono());
    }
}