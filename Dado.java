public class Dado {
    
    //Variable//
    String lanzarDado;
    
    //Arreglo: lanzar dados// 
    public static int lanzarDado(int valorMin, int valorMax, int cantDados, boolean mostrarMsj){
        int dado = valorMin;
        int resultado = valorMin;
        for (int i = 1; i <= cantDados; i++) {
            dado =(int) Math.floor(Math.random()*(valorMax-valorMin+1)+valorMin);
            if(mostrarMsj)
                System.out.println("Se lanzó el "+i+" dado y su resultado fue: "+ dado);
            if(resultado < dado)
                resultado = dado;
        }
        if(cantDados > 1)
            if(mostrarMsj)
                System.out.println(" El resultado mayor de los " + cantDados + " lanzados es: "+ resultado);
        return resultado;
    }
}
