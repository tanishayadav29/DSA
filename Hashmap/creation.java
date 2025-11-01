package Hashmap;
import java.util.HashMap;
public class creation {
    public static void main(String[] args) {
        HashMap <Integer,String> hm= new HashMap<>();
        hm.put(1,"TANISHA");
        hm.put(2,"YADAV");
        System.out.println(hm.get(2));
        System.out.println(hm.containsKey(1));

        for(int key:hm.keySet()){
            System.out.println(key+"->"+hm.get(key));
        }
    }
}
