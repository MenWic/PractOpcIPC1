public class Elfo extends Heroes{

     //Metodo: contador de Instancias//
    private static int contadorInstancias;

    //Metodo estatico: obtener Instancias//
    public static int getInstancias(){
        return contadorInstancias;
    }
    
    //Constructor de Elfo//
    public Elfo(String nombre){
        super(nombre, 250, 70);
    }
    
    //Metodo: presentar Elfo//
    @Override
    public void saludar(){
        System.out.println(" Hola, soy un Elfo, llamame:  " + this.nombre);
    }

    //Metodo: furia contra los Orcos//
    @Override
    public int obtenerAtaque(Personaje defensor){
        if(defensor instanceof Orco){
            System.out.println(" "+ this.getNombre() + " desata furia elfica! ");
            return this.getAtaque() + 10;
        }
        else{
            return this.getAtaque();
        }
    }
}
