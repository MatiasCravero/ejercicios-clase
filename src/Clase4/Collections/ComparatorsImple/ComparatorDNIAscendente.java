package Clase4.Collections.ComparatorsImple;

import Clase4.Collections.Persona;

import java.util.Comparator;

public class ComparatorDNIAscendente implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getDni() - o2.getDni();
    }
}
