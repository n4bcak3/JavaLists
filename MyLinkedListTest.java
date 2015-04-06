import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void testAdd() throws Exception {
        MyLinkedList s = new MyLinkedList("node0");
        s.add("node1");
        s.add(2,"node2");
        String[] a = new String[]{"node3","node4"};
        s.addAll(3, a );
        assertEquals("[node0][node1][node2][node3][node4]", s.toString());

    }

    @Test
    public void testGet() throws Exception {
        MyLinkedList s = new MyLinkedList("node0");
        String[] a = new String[]{"node1","node2","node3"};
        s.addAll(3, a );
        assertEquals("node2",s.get(2));
    }

    @Test
    public void testSize() throws Exception{
        MyLinkedList s = new MyLinkedList("hello");
        s.add("ww");
        s.add("ww2");
        s.add("w22");
        assertEquals(3,s.size());
    }

    @Test
    public void testIndexOf() throws Exception{
        MyLinkedList s = new MyLinkedList("yoky");
        s.add("privet");
        s.add("qwerty");
        assertEquals(2,s.indexOf("privet"));
    }

    @Test
    public void testSet() throws Exception{
        MyLinkedList s = new MyLinkedList("qwe");
        s.add("222s");
        s.add("asda");
        s.set(2,"setvalue");
        assertEquals("setvalue",s.get(2));
    }

}