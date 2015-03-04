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
        // Setup the "state of the world"
        MySimpleStack stack = new MySimpleStack();
        Item item = new Item();
        // Code under test
        stack.push(item);
        // assertions (oracle)
        assertEquals("The stack constains 1 item", 1, stack.getSize());
        assertSame("The pushed item is on top of the stack", item,
                stack.peek());
    }

    public void testPeek() throws Exception {
        MySimpleStack stack = new MySimpleStack();
        Item item = new Item();
        // Code under test
        stack.push(item);

        // assertions
       assertSame("The pushed item is on top of the stack", item,
                stack.peek());

    }

    public void testPop() throws Exception {
        MySimpleStack stack = new MySimpleStack();
        Item item = new Item();
        // Code under test
        stack.push(item);

        // assertions
        assertSame("The pushed item is on top of the stack", item,
                stack.pop());
    }
}