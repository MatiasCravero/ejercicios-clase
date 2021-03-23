package Clase4.Parte3;

public class Demo {
    public static void main(String[] args) {
        try{
            PasswordFuerte passFuerte = new PasswordFuerte("Hola1231$");
            PasswordDebil passDebil = new PasswordDebil("Hola123$");
            PasswordIntermedia passIntermedia = new PasswordIntermedia("alguien@example.com");

        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
