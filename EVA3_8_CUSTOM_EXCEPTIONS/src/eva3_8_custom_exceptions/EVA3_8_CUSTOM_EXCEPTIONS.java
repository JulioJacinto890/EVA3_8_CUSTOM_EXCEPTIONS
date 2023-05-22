/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_custom_exceptions;

/**
 *
 * @author hp
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // persona pers1 = new persona ();//"juan","peres",-9);
        Persona perso = new Persona();
        perso.setNombre("Antonio");
        perso.setApellido("Jacinto");
        try {
            perso.setEdad(-30);
        } catch (DatoEnCheckedEx e) {
            System.out.println(e.getMessage());
        }

    }

}

class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "---";
        this.apellido = "---";
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoEnCheckedEx {
        if (edad < 0) {
            throw new DatoEnCheckedEx();
        }
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad) throws DatoEnCheckedEx {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }

}

class DatoEnException extends RuntimeException {

    public DatoEnException() {
        super("Dato incorrecto, el valor debe de ser positivo.");
    }

}

class DatoEnCheckedEx extends Exception {

    public DatoEnCheckedEx() {
        super("Dato incorrecto, el valor debe de ser positivo.");
    }

}
