package LinkList;

public class LinkedListDefinition<E> implements LinkListADT {
    private Node<E> head = null;
    private int size = 0;

    public int getSize() {
        return size;
    }

    private Node<E> getNode(int index) {
        Node<E> response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    private void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    private void addAfter(Node<E> node, E item) {
        node.next = new Node<>(item, node.next);
        size++;
    }

    public void add(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            addFirst(item);
        } else {
            Node<E> temp = getNode(index - 1);
            addAfter(temp, item);
        }
    }

    @Override
    public void add(E item) {
        add(size, item);
    }

    @Override
    public E remove() {
        return remove(size - 1);
    }

    public E remove(int index) {
        E response = null;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            response = removeFirst();
        } else {
            Node<E> previousNode = getNode(index - 1);
            response = removeAfter(previousNode);
        }
        return response;
    }


}
