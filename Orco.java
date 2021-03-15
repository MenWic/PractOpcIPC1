public class Orco extends Bestias{

    //Metodo: contador de Instancias// 
    private static int contadorInstancias;
    public static int getInstancias(){
        return Orco.contadorInstancias;
    }

    //Constructor de Orco//
    public Orco(String nombre){
        super(nombre, 300, 50);
    }
}
