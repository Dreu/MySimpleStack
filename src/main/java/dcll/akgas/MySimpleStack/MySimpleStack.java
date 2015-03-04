package dcll.akgas.MySimpleStack;

import interfaces.SimpleStack;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * Created by gassama on 09/02/15.
 *
 * Un commentaire répondant à l'exigence #3
 */
public class MySimpleStack implements SimpleStack {

    private LinkedList<Item> list = new LinkedList<Item>();
    @Override
    public boolean isEmpty() {

        if(list.size()==0){
            return true;
        }
        else{return false;}
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public void push(Item item) {
        list.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        Item it = list.peek();
        return it;
    }

    @Override
    public Item pop() throws EmptyStackException {

        Item it = list.pop();

        return it;
    }
}
