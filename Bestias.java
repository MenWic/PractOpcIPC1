public class Bestias extends Personaje {

    //Variable estatica unica de la clase Bestias//
    private static int ataqueMaximo = 90;
    
    //Constructor de Bestias//
    public Bestias(String nombre, int vida, int armadura){
        super(nombre, vida, armadura, Bestias.ataqueMaximo, false);
    }
}
