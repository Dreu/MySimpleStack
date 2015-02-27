package dcll.akgas.MySimpleStack;

import interfaces.SimpleStack;

import java.util.EmptyStackException;

/**
 * Created by gassama on 09/02/15.
 */
public class MySimpleStack implements SimpleStack {
    @Override
    public boolean isEmpty() {
        if(this.getSize()==0){
            return true;
        }
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}
