import java.util.HashMap;

public class Phonebook {
    public static void main(String[] args) {
    var PhoneBook = new HashMap<String, String>();
    PhoneBook.put("45353543", "Petrov");
    PhoneBook.put("2423432", "Petrov");
    PhoneBook.put("23232332", "Sinitsina");
    PhoneBook.put("56546", "Petrov");
    PhoneBook.put("65464565", "Ivanov");
    PhoneBook.put("7868678", "Kutuzov");
    PhoneBook.put("786876867", "Sinitsina");
    System.out.println(PhoneBook);
    var sort = get(PhoneBook);
    sort.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + "=" + k.getValue()));
                System.out.println(PhoneBook);
}
public static HashMap<String, Integer> get(HashMap<String, String> PhoneBook){
    var count = new HashMap<String, Integer>();
    for (var item : PhoneBook.entrySet()) {
        if (count.containsKey(item.getValue())) {
            var key = item.getValue();
            var value = count.get(item.getValue());
            count.replace(key, value + 1);
        } else {
            count.put(item.getValue(), 1);
        }
    }
    return count;
}
}
