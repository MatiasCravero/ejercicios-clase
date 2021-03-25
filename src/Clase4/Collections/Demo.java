package Clase4.Collections;

import Clase4.Collections.ComparatorsImple.ComparatorDNIAscendente;

import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Matias", 40126671);
        Persona persona2 = new Persona("Juan", 12312343);
        Persona persona3 = new Persona("Pedro", 87463344);
        Persona persona4 = new Persona("Roque", 66786786);
        Persona persona5 = new Persona("Alberto", 78978972);
        Persona persona6 = new Persona("Lucas", 45245423);

        Persona[] arr = new Persona[6];
        arr[0] = persona1;
        arr[1] = persona2;
        arr[2] = persona3;
        arr[3] = persona4;
        arr[4] = persona5;
        arr[5] = persona6;

        Celular arrCe[] = new Celular[]{new Celular(34,"Matias"),
        new Celular(23, "Pedro"),
        new Celular(43,"Juan")};

       // SortUtil.Ordenar(arrCe);

       // for (int i = 0; i < arrCe.length; i++){
       //     System.out.println(arrCe[i].getNumero() + "  " + arrCe[i].getTitular());
       // }

        // Usar ordenarGen

       // SortUtil.ordenarGen(arr, new ComparatorDNIAscendente());
      // for (int i = 0; i < arr.length; i++){
      //     System.out.println(arr[i].getDni() + "  " + arr[i].getNombre());
      // }

        // par los comparator podemos usar también expresiones lambda
        Comparator<Persona> c1 = (a,b) -> a.getDni() - b.getDni();
        SortUtil.ordenarGen(arr, c1);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i].getDni() + "  " + arr[i].getNombre());
        }


    }
}
