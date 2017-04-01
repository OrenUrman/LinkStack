package ru.OrenUrman.LinkStackClass;

/**
 * Created by Пользователь on 01.04.2017.
 */
public class StackLink<E> {
    private Node<E> first;
    private static final int sizeStack = 10;
    private int top = -1;


    public StackLink() {
        this.first = null;
    }


    /**
     * Метод вставки в стек
     *
     * @param item - значение, которое необходимо вставить
     */
    public void push(E item) {
        if (top == sizeStack - 1)
            throw new ArrayIndexOutOfBoundsException("The stack is full");
        Node<E> newLink = new Node<E>(item);
        newLink.next = first;
        first = newLink;
        ++top;
    }

    /**
     * удаление верхнего элемента из стека
     *
     * @return - возвращает удаленный элемент
     */
    public E pop() {
        Node<E> temp = first;
        first = first.next;
        return temp.Data;
    }

    /**
     * Возврат верхнего значения стека, без удаления
     *
     * @return - возвращает значение
     */
    public E peek() {
        return ((E) first.Data);
    }

    /**
     * Проверка. пуст ли стек, вызывает метод из связного списка
     *
     * @return - булевское значение
     */
    public boolean isEmpty() {
        return (this.first == null);
    }

    /**
     * возвращает размер стека
     * @return
     */
    public int size() {
        return (top + 1);
    }

}
