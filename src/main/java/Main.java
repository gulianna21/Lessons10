import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Аня");
        names.add("Алекс");
        names.add("Муся");
        names.add("Юля");
        names.add("Юля");
        names.add("Ольга");
        names.add("Владислав");
        names.add("Кира");
        names.add("Мирослава");
        names.add("Инга");
        names.add("Инга");
        names.add("Леша");
        names.add("Леша");

        Set<String> names2 = new LinkedHashSet<>(names);
        System.out.println("Уникальные имена: " + names2);

        HashMap<String, Integer> doubleNames = new HashMap<>();
        Integer doubleName;
        for (String i : names) {
            doubleName = doubleNames.get(i);
            doubleNames.put(i, doubleName == null ? 1 : doubleName + 1);
        }

        System.out.println("Количество имен в списке: " + doubleNames);


        Phonebook phoneBook = new Phonebook();

        phoneBook.add("Аня", "89403492880");
        phoneBook.add("Аня", "89205501227");
        phoneBook.add("Карл", "2993355");
        phoneBook.add("Карл", "+79202411937");
        phoneBook.add("Маша", "2539055");


        phoneBook.get("Аня");
        phoneBook.get("Карл");
        phoneBook.get("Оля");
    }
}
