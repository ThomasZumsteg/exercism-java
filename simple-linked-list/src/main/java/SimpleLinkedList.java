import java.util.NoSuchElementException;
import java.lang.reflect.Array;

public class SimpleLinkedList<T> {
    private Element<T> root = null;
    private Integer size = 0;

    //SimpleLinkedList creates a linked list with no values
    public SimpleLinkedList() { }

    public SimpleLinkedList(T[] values) {
        //SimpleLinkedList creaets a linked list from an array of values
        for(T value: values)
            push(value);
    }

   public Integer size() {
       //size the size of the linked list
       return size;
   } 

   public T pop() throws NoSuchElementException {
       //pop return and remove the top element of the linked list
       if(root == null)
           throw new NoSuchElementException();
       T value = root.value;
       root = root.next;
       size--;
       return value;
   }
       
   public void push(T value) {
       //push adds a new element to the top of the linked list
       Element<T> e = new Element<T>();
       e.value = value;
       e.next = root;
       root = e;
       size++;
   }

   public T[] asArray(Class<T> type) {
       //asArray creates an array from the linked list
       T[] array = (T[])Array.newInstance(type, size());
       Element<T> e = root;
       for(int i = 0; e != null; e = e.next, i++)
           array[i] = e.value;
       return array;
   }

   public void reverse() {
       //reverse puts the elements of the linked list in the opposite order
       Element<T> next = root.next;
       Element<T> prev = null;
       root.next = prev;
       while(next != null ) {
           prev = root;
           root = next;
           next = next.next;
           root.next = prev;
       }
    }
}

class Element<T> {
    //Element is an element in the linked list
    public T value;
    public Element<T> next;
}
