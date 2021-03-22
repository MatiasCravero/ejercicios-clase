import java.util.ArrayList;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n)
    {
        String s = "";
        int i;
        for (i = 0; i < n; i++ ){
            s = s + c;
        }

        return s;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c)
    {
        int l = n - s.length();
        String str = replicate(c, l );
        String finalStr = str + s;
        return finalStr;
    }

    public static String rpad(String s, int n,char c){
        int l = n - s.length();
        String str = replicate(c, l);
        String finalStr = s + str;
        return finalStr;
    }


    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[])
    {
        String[] arrString = new String[arr.length];
        int i;
        ArrayList<Integer> arrayInt = new ArrayList<>();

        for(i = 0; i < arr.length; i++){
            arrString[i] = Integer.toString(arr[i]);
        }

        return arrString;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[])
    {
        int[] arrayInt = new int[arr.length];
        int i;
        for(i = 0; i == arr.length; i++ ){
            arrayInt[i] = Integer.parseInt(arr[i]);
        }
        return arrayInt;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[])
    {
        int maxLength = 0;
        for(String s: arr){
            int l = s.length();
            if (l > maxLength){
                maxLength = l;
            }
        }

        return maxLength;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c)
    {
        int maxLength = maxLength(arr);
        int i;
        for (i = 0; i < arr.length; i++){
            if (arr[i].length() < maxLength) {
                String sPad = lpad(arr[i], maxLength, c);
                arr[i] = sPad;
            }
        }
    }


}
