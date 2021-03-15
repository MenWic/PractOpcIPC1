public class Trasgo extends Bestias{

    //Metodo: contador de Instancias//
    private static int contadorInstancias;

    //Metodo estatico//
    public static int getInstancias(){
        return Trasgo.contadorInstancias;
    }

    //Constructor de Trasgo//
    public Trasgo(String nombre){
        super(nombre, 325, 46);
    }
}
