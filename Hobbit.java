public class Hobbit extends Heroes{
    
    //Metodo: contador de Instancias//
    private static int contadorInstancias;
    public static int getInstancias(){
        return Hobbit.contadorInstancias;
    }

    //Constructor de Hobbit//
    public Hobbit(String nombre){
        super(nombre, 200, 40);
        Hobbit.contadorInstancias++;
    }

    //Metodo: presentar Hobbit//
    @Override
    public void saludar(){
        System.out.println(" Hola mi Señor, soy:  " + this.nombre + ", el Hobbit ");
    }
}
