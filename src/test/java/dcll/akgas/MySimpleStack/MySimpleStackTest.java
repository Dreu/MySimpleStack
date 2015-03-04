package dcll.akgas.MySimpleStack;

import junit.framework.TestCase;

public class MySimpleStackTest extends TestCase {

    public void testIsEmpty() throws Exception {

        // Given

        MySimpleStack mystack = new MySimpleStack();

       //When

       //Then
        assertTrue(mystack.isEmpty());
        assertEquals(mystack.getSize(),0);

     }

    public void testGetSize() throws Exception {

        //Given
        MySimpleStack mystack = new MySimpleStack();
        Item it = new Item();
        // when
        mystack.push(it);
        // then
        assertEquals(mystack.getSize(),1);
    }

    public void testPush() throws Exception {

    }

    public void testPeek() throws Exception {

    }

    public void testPop() throws Exception {

    }
}