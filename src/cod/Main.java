package cod;

import cod.metodos.FactoriaDeSalidas;
import cod.metodos.InterfacesMetodosComunes;
import cod.metodos.PorTerminal;
import cod.metodos.PorVentana;

public class Main {

    public static void main(String[] args) {
        // write your code here
        InterfacesMetodosComunes miSalidaT;
        InterfacesMetodosComunes miSalidaV;
        InterfacesMetodosComunes miSalidaI;
        miSalidaT = FactoriaDeSalidas.getProducto(1, "Hola desde la fabrica");
        miSalidaT.visualiza();
        miSalidaV = FactoriaDeSalidas.getProducto(2, "Adios desde la factoria");
        miSalidaV.visualiza();
        miSalidaI = FactoriaDeSalidas.getProducto(3, "Por Impresora");
        miSalidaI.visualiza();

    }
}
