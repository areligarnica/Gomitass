/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gomitass;

/**
 *
 * @author areli
 */
public class Gomitass {

   
    private String nombre;
    private String saborBase;
    private double precio;

    
    public Gomitass(String nombre, String saborBase, double precio) {
        this.nombre = nombre;
        this.saborBase = saborBase;
        this.precio = precio;
    }

   
    public void mostrarDetalles() {
        System.out.println("--- Detalle del Producto ---");
        System.out.println("Gomita: " + nombre);
        System.out.println("Sabor de la base: " + saborBase);
        System.out.println("Precio: $" + precio);
    }

   
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}