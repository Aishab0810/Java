
import java.util.*;
class ArrayJava{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Aish");//Adding object in arraylist
        list.add("mike");
        list.add("Ash");
        list.add("ket");
//Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}