import java.util.*;

public class Ordenar1Vector implements OrdenarVector {
    public String nombreMetodo (){
        return "Inserción lineal";
    }
    public void ordena (int[] v, DatosEstadisticos de){
        /**int aux=0;
        int j=0;
        for (int i=0;i<v.length-1;i++){
            if (v[i]>v[i+1]){
                aux = v[i];
                v[i] = v[i+1];
                v[i+1]=aux;
                j=i-1;
                while (j>=0 && v[j]>v[j+1]){
                    aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                }
            } 
        }**/
        long startTime = System.nanoTime();
        int aux;
        for(int i=0;i<v.length-1;i++) {
            for(int j=0;j<v.length-1-i;j++) {
                if (v[j]>v[j+1]) {
                    aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                }
            }
        }
        de.timeData = System.nanoTime() - startTime;
    }
}

        /**int[] ordenado = new int[v.length];
        int j=0;
        for (int i=1;i<v.length;i++){
            while ((j<i) && (ordenado[j] <= v[i])){
                j++;
            }
            for (int k=i-1;k<j;k++){
                ordenado[k+1] = ordenado[k];
            }
            ordenado[j] = v[i];
        }
        for (int i=0;i<v.length;i++){
            v[i] = ordenado[i];
        }**/