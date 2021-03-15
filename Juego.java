public class Juego {
    
    //Variables para Arreglo//
    private Bestias ejercitoBestias[];
    private Heroes ejercitoHeroes[];
    private final int CANTIDAD = 5;
    //private int contadorHumanos;
    
    //Declarar variables para el Juego//
    public Juego(){
        ejercitoBestias = new Bestias[CANTIDAD];
        ejercitoHeroes = new Heroes[CANTIDAD];
    }

    //Metodo: presentar personajes previo al inicio del Juego//
    public void presentarPersonajes(Personaje ejercito[]){

        if(ejercito.length> 0 ){
            String raza = "";
            if(ejercito[0] instanceof Heroes){
                raza = "Heroe";
            }
            else{
                raza = "Bestia";
            }

            System.out.println("\nPresentando al Ejercito de "+ raza);
            //ejemplo con operador ternario
            /**System.out.println("\nPresentando ejercito de "+
                            (ejercito[0] instanceof Bestias?"Bestias":"Herores")
                            );**/

            for (int i = 0; i < ejercito.length; i++) {
                ejercito[i].saludar();
            }
        }
        else{
            System.out.println(" No hay un Ejercito para jugar ");
        }
    }

    //Iniciar el Juego//
    public void jugar(){
        System.out.println("\n\n Bienvenido al juego del Señor de los Anillos: \n\n");
        
        //Se deebe crear el metodo de Inicializacion de cada Ejercito//
        this.inicializarHeroes();
        this.inicializarBestias();

        //Presentar los 2 ejercitos//
        this.presentarPersonajes(ejercitoBestias);
        this.presentarPersonajes(ejercitoHeroes);

        //Se debe crear el arreglo de Pelea para el juego//
        System.out.println("\n\n\n");
        this.pelea();
    }

    //Arreglo: pelea//
    public void pelea(){
        ejercitoBestias[0].recibirAtaque(ejercitoHeroes[0]);
        ejercitoHeroes[0].recibirAtaque(ejercitoBestias[0]);
    }

    //Metodo: inicializar Heroes//
    public void inicializarHeroes(){
        int random = 0;
        for(int i = 0; i < ejercitoHeroes.length; i++){
            random = Dado.lanzarDado(0, 2, 1, false);
            switch (random){
                case 0:
                    ejercitoHeroes[i] = new Humano("Humano "+Humano.getInstancias());
                    break;
                case 1:
                    ejercitoHeroes[i] = new Elfo("Elfo "+Elfo.getInstancias());
                    break;
                case 2:
                    ejercitoHeroes[i] = new Hobbit("Hobbit "+Hobbit.getInstancias());
                    break;
                default:
                    ejercitoHeroes[i] = new Elfo("Elfo "+Elfo.getInstancias());
                    break;
            }
        }
    }

    //Metodo: inicializar Bestias//
    public void inicializarBestias(){
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Dado.lanzarDado(0, 1, 1, false);
            switch (random) {
                case 0:
                    ejercitoBestias[i] = new Trasgo("Trasgo "+Trasgo.getInstancias());
                    break;
                case 1:
                    ejercitoBestias[i] = new Orco("Orco "+Orco.getInstancias());
                    break;
                default:
                    ejercitoBestias[i] = new Orco("Orco "+Orco.getInstancias());
                    break;
            }
        }
    }
}
