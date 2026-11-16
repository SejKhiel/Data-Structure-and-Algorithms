import java.util.LinkedList;
abstract class AbstractClassLinkedList {
    protected LinkedList<String> list = new LinkedList<>();
    abstract void add(String spot);
    abstract void show(String title);
    abstract boolean search(String spot);
    abstract void remove(String spot);
}
class SubClassLinkedList extends AbstractClassLinkedList {
    void add(String spot) { list.add(spot); }
    boolean search(String spot) { return list.contains(spot); }
    void remove(String spot) { list.remove(spot); }
    void show(String title) {
        System.out.println(title);
        for (String s : list) System.out.println(" -> " + s);
    }
}
public class MainLinkedList {
    public static void main(String[] args) {
        SubClassLinkedList trip = new SubClassLinkedList();
        trip.add("Boracay");
        trip.add("Chocolate Hills");
        trip.add("Palawan Underground River");

        trip.show("Itinerary (Forward Only):");
        System.out.println("\nSearch 'Chocolate Hills': " + (trip.search("Chocolate Hills") ? "Found" : "Not Found"));

        trip.remove("Chocolate Hills");
        trip.show("\nUpdated Itinerary:");
    }
}