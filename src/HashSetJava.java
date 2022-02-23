
import java.util.*;
public class HashSetJava{
    public static void main(String args[]){
//Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Aisha");
        set.add("aish");
        set.add("aishly");
        set.add("ash");
//Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}