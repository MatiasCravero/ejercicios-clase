package Clase4.Parte3;

public class PasswordDebil extends Password{
    PasswordDebil(String con) throws Exception{
        this.regex = "^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$";
        setMessage("La contraseña debil no coincide");
        setPassword(con);
    }
}
