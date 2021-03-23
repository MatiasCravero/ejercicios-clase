package Clase4.Parte3;

public class PasswordFuerte extends Password{
    public PasswordFuerte(String con) throws Exception{
        this.regex = "^(?=.*\\d)(?=.*[\\u0021-\\u002b\\u003c-\\u0040])(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$";
        setMessage("La contraseña fuerte no coincide");
        setPassword(con);
    }
}
