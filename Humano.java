public class Humano extends Heroes{

    //Metodo: contador de Instancias// 
    private static int contadorInstancias;
    public static int getInstancias(){
        return contadorInstancias;
    }

    //Constructor de Humano//
    public Humano(String nombre){
        super(nombre, 180, 80);
        Humano.contadorInstancias++;
    }

    //Metodo: presentar Humano//
    @Override
    public void saludar(){
        System.out.println(" Hola, soy un Humano y mi nombre es:  " + this.nombre);
    }
}
