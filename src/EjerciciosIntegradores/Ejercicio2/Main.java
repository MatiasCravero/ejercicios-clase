package EjerciciosIntegradores.Ejercicio2;

public class Main {

    public static void main(String[] args) {
        SocorristaAuto sAuto = new SocorristaAuto(100, 10, 10, "AAA111");
        SocorristaMoto sMoto = new SocorristaMoto(100, 10, 10, "BBB222");
        Carrera carrera = new Carrera(100, 10000, "Carrera de prueba", 4,
                sAuto, sMoto);

        carrera.darDeAltaAuto(150, 20, 20, "PGH444");
        carrera.darDeAltaAuto(180, 30, 25, "FGR123");
        carrera.darDeAltaMoto(99, 15, 18, "GHT888");
        carrera.darDeAltaMoto(97, 15, 18, "WWW888");
        carrera.darDeAltaAuto(50, 30, 25, "TTT123");

        System.out.println(carrera.determinarGanador().getPatente());

        carrera.socorrerAuto("PGH444");
        carrera.socorrerMoto("WWW888");

        Auto auto1 = new Auto(150, 20, 20, "PGH444");
        carrera.eliminarVehiculo(auto1);


    }
}
