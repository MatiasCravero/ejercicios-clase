import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.ArrayList;
import java.util.Scanner;

public class Clase1 {
    public static void main(String[] args) {
        Ejercicio5();
    }



    public static void Ejercicio1(){
        //Mostrar los primeros n números pares
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de pares que quiere ver: ");
        int n = scanner.nextInt();
        int i = 1; int x = 1;
        while(x <= n){
            if (i%2 == 0){
                lista.add(i);
                x++;
            }
            i++;
        }

        scanner.close();

        for (Integer j: lista) { System.out.println(j); }
    }


    public static void Ejercicio2(){
        // mostrar los primeros n multiplos de m
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de múltiplos a ver: ");
        int n = scanner.nextInt();
        System.out.println("Ingrese el número m: ");
        int m = scanner.nextInt();

        int x = 1; int j = 1;
        while(x <= n){
            if(esMultiplo(j,m)){
                System.out.println(j);
                x++;
            }
            j++;
        }
    }

    public static boolean esMultiplo(int a, int b){
        return a%b == 0;
    }

    public static void Ejercicio3(){
        //Muestra si es primo o no
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número n: ");
        int n = scanner.nextInt();

        if (esPrimo(n)){
            System.out.println("Es primo");
        }
        else{
            System.out.println("No es primo");
        }

    }


    public static boolean esPrimo(int x){
        int n = 1;
        int p = 0;
        for(n = 1; n <= x; n++){
            if (x%n == 0){
                p++;
            }
            if(p == 2 && n < x){
                return false;
            }
        }

        if(p==2){
            return true;
        }
        else{
            return false;
        }

    }


    public static void Ejercicio4(){
        //Muestra los primeros n numeros primos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número n: ");
        int n = scanner.nextInt();
        int x = 1;
        int i = 3;
        while (x <= n){
            if(esPrimo(i)){
                x++;
                System.out.println(i);
            }
            i++;
        }

    }

    public static void Ejercicio5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = scan.nextInt();
        System.out.println("Ingresa m: ");
        int m = scan.nextInt();
        System.out.println("Ingresa d: ");
        int d = scan.nextInt();
        aux(n,m,d);
        scan.close();
    }

    public static int countOfRepetitiveNumber(int n, int d) {
        int count = 0;

        while (n > 0) {
            count = (n % 10 == d) ? count + 1 : count;
            n = n / 10;
        }

        return count;
    }

    public static void aux(int n, int m, int d) {
        int aux = 0;
        int count;
        for (int i = 0; aux != n; i++) {
            count = countOfRepetitiveNumber(i, d);
            if (count >= m) {
                aux++;
                System.out.println(i);
            }
        }
    }
}
