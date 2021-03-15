public class Heroes extends Personaje {

    //Variables estatica unica de clase Heroes//
    private static int ataqueMaximo = 100;
    
    private static int instanciasHeroes;

    //Metodo estatico: obtener Instancias//
    public static int getInstancias(){
        return Heroes.instanciasHeroes;
    }

    //Constructor de Heroes//
    public Heroes(String nombre, int vida, int armadura){
        super(nombre, vida, armadura, ataqueMaximo, true);
        Heroes.instanciasHeroes++;
    }

    //Metodo: ataque lanzando dados//
    @Override
    public int getAtaque(){
        return Dado.lanzarDado(0, Heroes.ataqueMaximo, 2, true);
    }
}
