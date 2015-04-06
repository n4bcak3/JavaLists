import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {
    @Test
    public void testAdd() throws Exception {
        MyArrayList<String> s = new MyArrayList<String>();
        MyArrayList<String> ss = new MyArrayList<String>();
        s.add("node1");
        s.add("node2");
        s.add(1,"nodeee2");
        String[] a = new String[]{"node3","node4"};
        s.addAll(a);
        ss.add("node5");
        ss.addAll(0, a);
        assertEquals("[node1][nodeee2][node2][node3][node4]", s.toString());
        assertEquals("[node3][node4][node5]",ss.toString());
    }

    @Test
    public void testGet() throws Exception {
        MyArrayList<String> s = new MyArrayList<String>();
        String[] a = new String[]{"node1","node2","node3"};
        s.addAll(a);
        assertEquals("node3",s.get(2));
    }

    @Test
    public void testSize() throws Exception{
        MyArrayList<String> s = new MyArrayList<String>();
        s.add("ww");
        s.add("ww2");
        s.add("w22");
        assertEquals(3,s.size());
    }

    @Test
    public void testIndexOf() throws Exception{
        MyArrayList<String> s = new MyArrayList<String>();
        s.add("privet");
        s.add("qwerty");
        assertEquals(0, s.indexOf("privet"));
        assertEquals(1,s.indexOf("qwerty"));
    }

    @Test
    public void testSet() throws Exception{
        MyArrayList<String> s = new MyArrayList<String>();
        s.add("222s");
        s.add("asda");
        s.set(1,"setvalue");
        assertEquals("setvalue",s.get(1));
    }
}