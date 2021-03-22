package Clase3;

import sun.util.calendar.Gregorian;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Fecha {
    private LocalDate fecha;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Fecha(){
        GregorianCalendar cal = new GregorianCalendar();
        this.fecha = LocalDate.now();
    }

    private void Add(String campo){
        GregorianCalendar cal = new GregorianCalendar();
        switch (campo){
            case "Dia":
                cal.add(3,1);
                break;
            case "Mes":
                cal.add(2,1);
                break;
            case "Anio":
                cal.add(1, 1);
                break;
            default:
                cal.add(3,1);
                break;
        }
    }

    private boolean isValid(){
        return true;
    }
}
