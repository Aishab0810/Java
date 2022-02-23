
import java.util.*;
public class LinkedListJava{
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Aish");
        al.add("aisha");
        al.add("ash");
        al.add("aishly");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}