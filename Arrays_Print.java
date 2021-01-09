package happynewyear;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arrays_Print{
    public static void main(String[] args){
        //array 順序是亂的
        String[] str1 = {"a","b","c","d","e","g","f","h","j","k","i","l","m","n","o","p","q","r","s","t","u","v","z","x","y","w"};
        
        for(String s : str1){
            System.out.printf(s+"1"+"、");
        }
        System.out.println();
        
        //依順序排列
        List _str1 = Arrays.asList(str1);        
        Set result = new HashSet();
        result.addAll(_str1);
        System.out.println(result);
    }
}
