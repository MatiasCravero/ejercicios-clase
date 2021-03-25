package Clase4.Collections;

import java.util.Comparator;

public class SortUtil {
    public static <T> void Ordenar(Precedable<T> arr[]) {
        Precedable<T> temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - 1); j++) {
                int result = arr[j].PrecedeA((T) arr[j + 1]);
                if (result > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }



    //Para hacerlo más genérico
    public static <T> void ordenarGen(T arr[], Comparator<T> c){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(c.compare(arr[j],arr[j+1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
