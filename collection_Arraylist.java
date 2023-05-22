import java.util.ArrayList;
// import java.utill.*;
public class collection_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> sname = new ArrayList<>();
        ArrayList<String> newname = new ArrayList<>();
        sname.add("Rakesh");
        sname.add("Mahesh");
        newname.add("Rakesh");
        newname.add("Mahesh");
        sname.add(2, "Rakesh");
        sname.addAll(newname);
        System.out.println(sname);
        System.out.println(sname.get(0));
        sname.remove(2);
        sname.remove(String.valueOf("Rakesh"));
        System.out.println(sname);
        // sname.clear();
        sname.set(2, "Akshay");
        System.out.println(sname);
        System.out.println(sname.contains("Akshay"));
        
        for (int i = 0; i < sname.size(); i++) {
            System.out.println(sname.get(i));
            
        }
        
    }
    
}
