package EjerciciosIntegradores.Ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Invitado invitado1 = new InviadoStandar("Yo",123);
        Invitado invitadoMeli1 = new InvitadoMeli("Yo2",134,1234);
        FuegoArtificial fuego1 = new FuegoIndividual();
        fuego1.setMarca("Cienfuegos");
        fuego1.setNombre("Araña");
        fuego1.setRuido("boom");
        ArrayList<FuegoArtificial> fuegos = new ArrayList<>();
        fuegos.add(fuego1);
        ArrayList<Invitado> invitados = new ArrayList<>();
        invitados.add(invitado1);
        invitados.add(invitadoMeli1);
        Fiesta fiesta = new Fiesta();
        fiesta.setFuegos(fuegos);
        fiesta.setInvitados(invitados);

        fiesta.servirTorta();
    }
}
