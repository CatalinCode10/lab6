import java.util.ArrayList;

public class lab6p1 {
    public static void main(String arg[]) {
        ArrayList<String> studenti = new ArrayList<>();
        studenti.add("Flaviu");
        studenti.add("Sebi");
        studenti.add("Mihaita");
        studenti.add("Daniel");
        for (int i = 0; i < studenti.size(); i++) {
            System.out.println(studenti.get(i));
        }
        studenti.remove(0);
        System.out.println();
        for (int i = 0; i < studenti.size(); i++) {
            System.out.println(studenti.get(i));

        }
    }
}

