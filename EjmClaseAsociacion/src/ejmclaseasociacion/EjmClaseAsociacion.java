
package ejmclaseasociacion;

public class EjmClaseAsociacion {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre="Carlos";
        
        inmueble i1 = new inmueble();
        i1.calle="AV. Peru";
        i1.nro=306;
        
        Renta r1 = new Renta();
        r1.costomensual=250;
        r1.duracionmeses=12;
        r1.departamento=i1;
        r1.habitante=p1;
        
        r1.VerDatos();
    }
    
}
