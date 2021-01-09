package happynewyear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayList_MAX {
    public static void main(String[] args){
        // 假設拿到 一個 int[] 一個 Integer[] 的 Array
        int[] array = {1, 3, 8, 7, 9, 11, 5, 12, 10};
        Integer[] b = new Integer[] {4, 2, 6, 9, 13, 12, 7, 11};
        
        //List<Integer> _a = Arrays.asList(1, 3, 8, 7, 9, 11, 5, 12, 10); 假設一凱始就拿到這個可以省略下面一些轉換
        
        //轉Integer[] 才能比大小 方法1
        Integer[] a = Arrays.stream(array).boxed().toArray(Integer[]::new);
        
        //轉Integer[] 才能比大小 方法2
        //List<Integer> list1 = Arrays.stream(data).boxed().collect(Collectors.toList());
        //Integer[] a = list1.toArray(new Integer[0]);
        
        List _a = Arrays.asList(a);
        List _b = Arrays.asList(b);
        
        Collection realA = new ArrayList<Integer>(_a);
        Collection realB = new ArrayList<Integer>(_b);
        
        System.out.println("List a 最大值 : " + Collections.max(realA));
        System.out.println("List b 最小值 : "+Collections.min(realB));
        
        realA.retainAll(realB);
        System.out.println("重複內容 : " + realA);
        
        ArrayList resu = new ArrayList();
        resu.addAll(_a);
        resu.addAll(_b);
        System.out.println("全集結果: " + resu);
        
        //用SET 會去除重複並自動排列
        Set result = new HashSet();
        result.addAll(_a);
        result.addAll(_b);
        System.out.println("去除重複的全集結果 : " + result);
        
        Collection aa = new ArrayList(realA);
        Collection bb = new ArrayList(result);
        bb.removeAll(aa);
        System.out.println("將重複完全移除的最終結果：" + bb);
        
        //將int arrays 轉 String arrays
        String[] str = new String[] {Arrays.toString(array)};
        for(int i = 0; i<str.length; i++){
            System.out.println(str[i]);
        }
    }
}
