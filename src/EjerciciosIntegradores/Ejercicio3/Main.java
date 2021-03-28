package EjerciciosIntegradores.Ejercicio3;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Invitado invitado1 = new InviadoStandar("Yo",123);
        Invitado invitadoMeli1 = new InvitadoMeli("Yo2",134,1234);
        FuegoArtificial fuego1 = new FuegoIndividual();
        fuego1.setMarca("Cienfuegos");
        fuego1.setNombre("Araña");
        fuego1.setRuido("boom");
        PackFuegos packFuegos = new PackFuegos();
        FuegoArtificial fuego2 = new FuegoIndividual();
        fuego2.setNombre("ASas");
        fuego2.setMarca("Cienfuegos");
        fuego2.setRuido("bam");
        FuegoArtificial fuego3 = new FuegoIndividual();
        fuego3.setNombre("ASaasds");
        fuego3.setMarca("Cienfuegos");
        fuego3.setRuido("bem");
        ArrayList<FuegoArtificial> fuegos = new ArrayList<>();
        fuegos.add(fuego1);
        ArrayList<FuegoArtificial> asd = new ArrayList<>();
        asd.add(fuego2);
        asd.add(fuego3);
        packFuegos.setFuegos(asd);
        ArrayList<Invitado> invitados = new ArrayList<>();
        invitados.add(invitado1);
        invitados.add(invitadoMeli1);
        Fiesta fiesta = new Fiesta();
        fiesta.setFuegos(fuegos);
        fiesta.setInvitados(invitados);
        fiesta.setPackFuegos(asd);

        fiesta.servirTorta();
    }
}
