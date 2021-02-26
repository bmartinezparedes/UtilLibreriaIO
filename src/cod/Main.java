package cod;
import cod.metodos.PorTerminal;
import cod.metodos.PorVentana;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PorTerminal pt=new PorTerminal("Hola");
        pt.visualiza();
        PorVentana pv=new PorVentana("Adios");
        pv.visualiza();
    }
}
