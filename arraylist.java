import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        //wrapper classes
       // Integer i=Integer.valueOf(4);
        //System.out.println(i);
        //Float f=Float.valueOf(4.5f);
        //System.out.println(f);

        ArrayList<Integer> l1= new ArrayList<>();
    //add new elements
l1.add(5);
l1.add(6);
l1.add(7);
l1.add(8);

    //get an element at  index i
    System.out.println(l1.get(0));

    //print with for loop
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    //printing the arraylist directly
    System.out.println(l1);

    //adding element at some index i
    l1.add(1,100);
    System.out.println(l1);

    //modifying element at index i
    l1.set(1,10);
    System.out.println(l1);

    //removing an element at index i
    l1.remove(1);
    System.out.println(l1);

    //removing an element e
    l1.remove(Integer.valueOf(7));
    System.out.println(l1);

    //checking if an element exist
    boolean ans=l1.contains(Integer.valueOf(6));
    System.out.println(ans);

    //if you don't specify class,you can put anything inside l
        ArrayList l=new ArrayList();
        l.add("pqres");
        l.add(1);
        System.out.println(l);
    }

    
}
