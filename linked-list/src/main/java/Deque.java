public class Deque<T> {
    /* Deque is an ordered set of items that can add or remove from the
     * beginning or end */
    private Element<T> root;

    public void push(T item) {
        /* push adds an item to the end of the list */
        Element<T> e = new Element<T>(item);
        if( root != null ) {
            e.next = root;
            e.prev = root.prev;
            root.prev.next = e;
            root.prev = e;
        }
        root = e;
    }

    public void unshift(T item) {
        /* unshift adds an item to the beginning of the list */
        push(item);
        root = root.prev;
    }

    public T pop() {
        /* pop removes and returns the last item in the list */
        Element<T> e = root;
        root.prev.next = root.next;
        root.next.prev = root.prev;
        root = root.next;
        e.next = null;
        e.prev = null;
        return e.value;
    }

    public T shift() {
        /* shift removes and returns the first item in the list */
        root = root.prev;
        return pop();
    }

}

 class Element<E> {
     /* Element holds a value and links to the next and previous items in a list */
    public E value;
    public Element<E> next, prev;
    
    public Element(E value) {
        this.value = value;
        next = this;
        prev = this;
    }
}

