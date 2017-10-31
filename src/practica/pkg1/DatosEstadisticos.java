public class DatosEstadisticos {
    long timeData;
    public DatosEstadisticos(){
        
    }
    private void añadeTiempo(long tiempo){
        
    }
    private void estableceTiempo(long tiempo){
        timeData = tiempo;
    }
    public double devuelveTiempo(){
        double seconds = (double)timeData / 1000000000.0;
        return seconds;
    }
}