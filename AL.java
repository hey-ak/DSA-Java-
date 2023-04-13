import java.util.ArrayList;
public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(68);
        list.add(69);
        list.set(0, 99);
        list.remove(2);
        list.add(70);
        System.out.println(list);
    }
    
}
