package Clase4.Parte3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Password {
    protected String password;
    protected String message;
    protected String regex;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getPassword() {
        return password;
    }

    protected void setPassword(String password) throws Exception {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean match = matcher.find();
        if (match){
            this.password = password;
        }
        else{
            throw new Exception(this.message);
        }
    }
}
