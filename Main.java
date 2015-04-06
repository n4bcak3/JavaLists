public class Main {

    public static void main(String[] args) {
        MyArrayList<String> l = new MyArrayList<String>();
        MyLinkedList<String> a = new MyLinkedList<String>("q0");

        a.add("q1");
        a.add("q2");
        a.add("q3");
        a.remove(3);
        a.add(5,"q5");
        a.add("q6");
        a.add("q7");

        l.add("s0");
        l.add("s1");
        l.remove(1);
        l.add("s2");
        l.add("s3");
        l.add("s4");
        l.add("s5");

            System.out.println(String.format("linkedlist:\n %s\n size:%d",
                    a.get(4),
                    a.size()));
            System.out.println(String.format("arraylist:\n %s\n size:%d",
                    l.get(2),
                    l.size()));
    }
}
