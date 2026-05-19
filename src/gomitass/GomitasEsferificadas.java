/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gomitass;

/**
 *
 * @author areli
 */

    public class GomitasEsferificadas extends Gomitass {

    
    private String ingredienteCentro;
    private String tipoEsferizacion;

   
    public GomitasEsferificadas(String nombre,String saborBase,double precio,String ingredienteCentro,String tipoEsferizacion) {

        
        super(nombre, saborBase, precio);

        this.ingredienteCentro = ingredienteCentro;
        this.tipoEsferizacion = tipoEsferizacion;
    }

    
    @Override
    public void mostrarDetalles() {

    System.out.println("Mostrar Detalles");
    super.mostrarDetalles();
    System.out.println(" Cuenta con un centro esferificado.");
    System.out.println("Líquido del centro: " + ingredienteCentro);
    System.out.println("Técnica utilizada: Esferificación " + tipoEsferizacion);
    }
}
    

