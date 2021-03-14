public class Heroes extends Personaje {

    //Variables estaticas de Heroes//
    private static int ataqueMaximo = 100;
    private static int instanciasHeroes;

    //Constructor de Heroes//
    public Heroes(String nombre, int vida, int armadura){
        super(nombre, vida, armadura, ataqueMaximo, true);
        Heroes.instanciasHeroes++;
    }

    public static int getInstancias(){
        return Heroes.instanciasHeroes;
    }
}
