package Clase4.Parte3;

public class PasswordIntermedia extends  Password{
    PasswordIntermedia(String con) throws Exception{
        this.regex = "^[^@]+@[^@]+\\.[a-zA-Z]{2,}$";
        setMessage("La contraseña intermedia no coincide");
        setPassword(con);
    }

}
