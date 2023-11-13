import java.util.ArrayList;
import java.util.HashSet;

public class lab6p2 {
    public static void main(String arg[]) {
        HashSet<ArrayList> biblioteca = new HashSet<ArrayList>();
        ArrayList<String> carte1=new ArrayList<String>();
        ArrayList<String> carte2=new ArrayList<String>();
        ArrayList<String> carte3=new ArrayList<String>();

        carte1.add("Ion");
        carte2.add("Moara cu Noroc");
        carte3.add("Luceafarul");
        biblioteca.add(carte1);
        biblioteca.add(carte2);
        biblioteca.add(carte3);
        System.out.println(biblioteca);
    }
}
