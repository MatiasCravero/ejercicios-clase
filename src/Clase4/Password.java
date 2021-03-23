package Clase4;

import java.util.regex.Pattern;

public class Password {
    private String contraseña;

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Password(String pass){
        String patron = "/^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,15}$/";

        try {
            if(pass.matches(patron)){
                this.contraseña = pass;
            }
            else{
                throw new Exception("No coincide rey");
            }

        }
        catch (Exception ex){
            System.out.println("La contraseña no coincide con el patron deseado");
            System.out.println(ex.getMessage());


        }


    }
}
