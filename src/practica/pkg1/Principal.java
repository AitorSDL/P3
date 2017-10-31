public class Principal {
    public static void main(String[] args){
        int[] vector = GeneraCaso.generaVector(5,false);
       CompruebaCaso.compruebaVector(vector,5);
       DatosEstadisticos a = new DatosEstadisticos();
       Ordenar1Vector ord = new Ordenar1Vector();
       ord.ordena(vector,a);
       CompruebaCaso.compruebaVector(vector,5);
       System.out.println("Tiempo de ejecución:\n"+a.devuelveTiempo()+" segundos.\n"+a.timeData+" milisegundos.");
       System.out.println("\nDone.");
    }
}