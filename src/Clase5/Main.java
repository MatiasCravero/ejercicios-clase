package Clase5;

import Clase4.Collections.Celular;
import Clase4.Collections.Persona;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Celular arr[] = new Celular[]{new Celular(34,"Matias"),
                new Celular(23, "Pedro"),
                new Celular(43,"Juan")};
        Comparator<Celular> c = (a,b) -> a.getNumero() - b.getNumero();
        QuickSortSorterImple.quicksort(arr, 0, arr.length-1, c);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i].getNumero() + "  ---  "+ arr[i].getTitular());
        }
    }
}
