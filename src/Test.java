public class Test {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.addFirst("Ngo Quoc Khanh");
        ll.addFirst("CTDL&GT");
        ll.addFirst("IT");
       //ll.traverse();

        ll.addLast("ST23A");
        //ll.traverse();

        ll.insertAfter("IT", "23C");
        ll.traverse();
        System.out.println("-------------");
        System.out.println(ll.remove("23C"));
        System.out.println(ll.remove("23c"));
        System.out.println("------------");
        ll.traverse();

        System.out.println("Check empty: " +ll.isEmpty());
        System.out.println("Size: "+ll.size());
    }
}
