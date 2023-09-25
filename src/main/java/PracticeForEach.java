import java.util.ArrayList;
import java.util.List;

public class PracticeForEach {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hara");
        list.add("Nootbaar");
        list.add("Kondoh");
        list.add("Ohtani");
        list.add("Murakami");
        list.add("Yoshida");
        list.add("Okamoto");
        list.add("Yamada");
        list.add("Genda");
        list.add("Nakamura");

        for (String name : list) {
            System.out.println(name);
        }
    }
}