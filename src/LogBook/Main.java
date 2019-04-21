package LogBook;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Zadane1();
        Zadane2();
    }

    private static void Zadane1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Coffee", "Potato", "Alpha",
                "Cheese", "Beta", "Humster",
                "Dog", "Cat", "Java",
                "Yava", "Kent", "Coffee",
                "Dog", "Beta", "Humster",
                "Cat", "Java", "Yava", "Dog"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void Zadane2() {
        Directory directory = new Directory();

        directory.add("Antonyan", "8999123321");
        directory.add("Antonyan", "8912155326");
        directory.add("Bobov", "8917155552");
        directory.add("Bobov", "8913455672");
        directory.add("Antonyan", "899999999");
        directory.add("Igoryan", "899111111");
        directory.add("Bobov", "89923231999");
        directory.add("Smetanov", "8888123113");
        directory.add("Igoryan", "8324325234");

        System.out.println();

        System.out.println( "Bobov     " + directory.get("Bobov"));
        System.out.println( "Antonyan  " + directory.get("Antonyan"));
        System.out.println( "Igoryan   " + directory.get("Igoryan"));
        System.out.println( "Smetanov  " + directory.get("Smetanov"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}
