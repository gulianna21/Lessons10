import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    private final HashMap<String, HashSet<String>> phoneBook;

    Phonebook() {
        this.phoneBook = new HashMap<>();
    }

    void add(String name, String num) {
        HashSet<String> newPhonebook = phoneBook.getOrDefault(name, new HashSet<>());
        newPhonebook.add(num);
        phoneBook.put(name, newPhonebook);
    }

    void get(String name) {
        System.out.println(name+": "+ phoneBook.getOrDefault(name, new HashSet<>()));
    }
}
