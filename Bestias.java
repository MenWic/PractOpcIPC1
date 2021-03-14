public class Bestias extends Personaje {

    //Variable estatica de Bestias//
    private static int ataqueMaximo = 90;
    
    //Constructor de Bestias//
    public Bestias(int vida, int armadura, String nombre){
        super(nombre, vida, armadura, Bestias.ataqueMaximo, false);
    }
    

}
