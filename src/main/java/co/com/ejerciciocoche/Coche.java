package co.com.ejerciciocoche;

//* 1. Crear una clase coche.*/
public class Coche {

 //     2. Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
   int numeroP=0;

    Coche() {

        System.out.println( "Constructor Coche de la clase coche " );

    }

    public Coche(int numeroP) {
        this.numeroP = numeroP;
    }

    //  3. Crear Una función que incremente el número de puertas que tiene el coche. */
    public void agregarP() {
        numeroP++;
        System.out.println(" Se agrego una puerta "  );
        System.out.println(" La cantidad de puertas es: " +numeroP  );
    }
    /*5.Mostrar el número de puertas que tiene el objeto.*/
    public void  mostrarP () {
        System.out.println("Ervin " );

    }


}





