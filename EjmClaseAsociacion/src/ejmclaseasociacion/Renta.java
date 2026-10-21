
package ejmclaseasociacion;

public class Renta {
    public double costomensual;
    public double duracionmeses;
    public Persona habitante;
    public inmueble departamento;
    
    public void VerDatos(){
        System.out.println("Renta costo mensual: "+ this.costomensual + "Duracion de meses: "+ this.duracionmeses);
        System.out.println("Rentado por: "+ this.habitante.nombre);
        System.out.println("El inmueble esta ubicado en la calle: "+ this.departamento.calle + " y el numero es: "+ this.departamento.nro);
    }
}
