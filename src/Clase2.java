import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Clase2 {
    public static void radixSort(int []arr)
    {
        String arrayString[] = StringUtil.toStringArray(arr);
        StringUtil.lNormalize(arrayString, '0');
        int maxLength = StringUtil.maxLength(arrayString);
        int place = maxLength - 1;

        sort(place, arrayString);
        arr = StringUtil.toIntArray(arrayString);

    }

    public static void sort(int place, String[] arr){
        ArrayList<String> arrFi = new ArrayList<>();
        ArrayList<String> L0 = new ArrayList<>();
        ArrayList<String> L1 = new ArrayList<>();
        ArrayList<String> L2 = new ArrayList<>();
        ArrayList<String> L3 = new ArrayList<>();
        ArrayList<String> L4 = new ArrayList<>();
        ArrayList<String> L5 = new ArrayList<>();
        ArrayList<String> L6 = new ArrayList<>();
        ArrayList<String> L7 = new ArrayList<>();
        ArrayList<String> L8 = new ArrayList<>();
        ArrayList<String> L9 = new ArrayList<>();
        Map<Character, ArrayList<String>> dict = new HashMap<Character, ArrayList<String>>();
        dict.put('0', L0);
        dict.put('1', L1);
        dict.put('2', L2);
        dict.put('3', L3);
        dict.put('4', L4);
        dict.put('5', L5);
        dict.put('6', L6);
        dict.put('7', L7);
        dict.put('8', L8);
        dict.put('9', L9);

        for(int i = 0; i < arr.length; i++){
            String str = arr[i];
            Character c = str.charAt(place);
            dict.get(c).add(str);
        }

        for(Map.Entry<Character, ArrayList<String>> entry: dict.entrySet()) {
            ArrayList<String> value = entry.getValue();
            if (value.size() > 0 ) {
                arrFi.addAll(value);
            }
        }

        arr = arrFi.toArray(new String[0]);
        place = place - 1;
        if (place > 0) {
            sort(place, arr);
        }



    }



    public static void main(String[] args)
    {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        radixSort(arr);
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+(i<arr.length-1?",":""));
        }
    }
}
