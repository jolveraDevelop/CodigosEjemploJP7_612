
package modulo10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSerializable {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("alumno.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                FileInputStream fis = new FileInputStream("alumno.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);){
            Alumno a = new Alumno("Roberto", 40,"hoy");
            oos.writeObject(a);
            Alumno a2 = (Alumno)ois.readObject();
            System.out.println(a);
            System.out.println(a2);
            System.out.println("a==a2: "+(a==a2));
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } 
    }
}

class Alumno implements Serializable{
    
    private String nombre;
    private Integer edad;
    private transient String cumpleanios;

    public Alumno(String nombre, Integer edad, String cumpleanios) {
        this.nombre = nombre;
        this.edad = edad;
        this.cumpleanios = cumpleanios;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCumpleanios() {
        return cumpleanios;
    }

    public void setCumpleanios(String cumpleanios) {
        this.cumpleanios = cumpleanios;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", cumpleanios=" + cumpleanios + '}';
    }
    
    
    
}
