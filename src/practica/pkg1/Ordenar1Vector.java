import java.util.*;

public class Ordenar1Vector implements OrdenarVector {
    public String nombreMetodo (){
        return "Selección Lineal con Intercambio.";
    }
    public void ordena (int[] v, DatosEstadisticos de){        
        int menor,pos,i,j;
        long startTime = System.nanoTime();
        for(i=0;i<v.length-1;i++) {
            menor=v[i];
            pos=i;
            for(j=i+1;j<v.length;j++) {
                if (menor>v[j]) {                    
                    menor=v[j];
                    pos=j;
                }
            }
            v[pos]=v[i];
            v[i]=menor;
        }        
        de.timeData = System.nanoTime() - startTime;
    }
}