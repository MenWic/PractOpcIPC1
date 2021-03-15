public class Personaje {   
    
    //Atributos/Variables de Personaje// 
    protected String nombre;
    protected int vida;
    protected int armadura;
    protected int ataque;
    protected boolean esHeroe;

    //Variable estatica de personaje//
    private static int instanciasPersonajes;

    //Constructor de personaje//
    public Personaje(String nombre, int vida, int armadura, int ataque, boolean esHeroe) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
        this.esHeroe = esHeroe;
        instanciasPersonajes++;
    }

    //1)Metodo get: obtener armadura//
    public int obtenerArmadura(Personaje atacante){
        return this.getArmadura();
    }
    
    //2)Metodo get: obtener ataque//
    public int obtenerAtaque(Personaje defensor){
        return this.getAtaque();
    }

    //3)Metodo: recibir ataque del atacante//
    public void recibirAtaque(Personaje atacante){
        System.out.println(" " + atacante.getNombre() + " atacará a "+ this.getNombre());

    //4)Metodo Defensor: variable daño por recibir//
        int dañoPorRecibir = this.obtenerArmadura(atacante) - atacante.obtenerAtaque(this);
        if (dañoPorRecibir <= 0){
            this.vida += dañoPorRecibir;
        }
        else{
            dañoPorRecibir = 0;
        }
        System.out.println(" "+ atacante.getNombre()+ " atacó a  " + this.getNombre() + ", inflingió un año de: " + dañoPorRecibir  + ", le queda vida: "+ this.getVida());
    }

    //Metodo: presentar al Personaje//
    public void saludar(){
        System.out.println("Hola,soy  " + this.nombre + ", nos vemos en la batalla! ");
    }

    //Metodo para obtener datos almacenados en variables//
    public String getNombre(){
        return this.nombre;
    }

    public int getVida(){
        return this.vida;
    }

    public int getAtaque(){
        return this.ataque;
    }
    public int getArmadura(){
        return this.armadura;
    }

    public boolean get(){
        return this.esHeroe;
    }

    public static int getInstancias(){
        return Personaje.instanciasPersonajes;
    }
}
