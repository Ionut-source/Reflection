package ro.ctrln.java.generics;

import ro.ctrln.java.inheritance.Battleship;
import ro.ctrln.java.inheritance.Rocket;
import ro.ctrln.java.inheritance.Starship;
import ro.ctrln.java.model.Person;

import java.util.Arrays;

public class GenericListMultipleBounds<T extends Battleship & Starship & Rocket> {

    private static final int INITIAL_SIZE = 10;
    private Object[] list = new Object[INITIAL_SIZE];
    private int size = 0;

    public void addElement(T element) {
        if (size == list.length) {
            increaseSize();
        }
        list[size] = element;
        size++;
    }

    private void increaseSize() {
        list = Arrays.copyOf(list, list.length * 2);
    }

    public int getSize() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public T getElement(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Indexul este in afara intervalului 0 - size-1");
        }
        return (T) list[index];
    }

    public void removeElement(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Indexul este in afara intervalului 0 - size-1");
        }
        System.arraycopy(list, index+1, list, index, size - index);
        size--;
    }

    public boolean contains(T searchedElement) {
        for (Object element : list) {
            if (searchedElement.equals(element)) {
                return true;
            }
        }
        return false;
    }
}