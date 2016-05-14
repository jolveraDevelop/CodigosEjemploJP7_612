/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo5.emunsV2;

/**
 *
 * @author Humberto
 */
public enum Cafe {
    CHICO("Chico"),MEDIANO(300,15,"Mendiano"),GRANDE(400,20,"Grande"),EXTRA_GRANDE(500,25,"Extra Grande");
//
//    CHICO(120.5, 15.5),
//    MEDIANO(180, 20.43),
//    GRANDE();
//    static{
//    
//    }
//    {
//    
//    }
    private double mililitros;
    private double precio;
    private String descripcion;

    private Cafe(double mililitros, double precio,String descripcion) {
        //System.out.println("Cafe(double mililitros, double precio)");
        this.mililitros = mililitros;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    private Cafe() {
        //System.out.println("Cafe()");
        mililitros = 250.0;
        precio = 10;
    }

    private Cafe(String descripcion) {
        this();
        this.descripcion = descripcion;
    }
    
    
//
    public double getMililitros() {
        return mililitros;
    }

    public void setMililitros(double mililitros) {
        this.mililitros = mililitros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
}
