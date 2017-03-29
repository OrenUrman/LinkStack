package ru.OrenUrman.LinkStackClass;

import ru.OrenUrman.LinkStackClass.LinkList;

/**
 * Created by OrenUrman on 28.03.2017.
 * Стек реализованный на связном списке
 * хранит в себе связный список
 * работает с любыми типами данных
 */
public class LinkStack<E> {
    private LinkList<E> theList;
    private static final int sizeStack = 10;
    private int top = -1;

    public LinkStack() {
        theList = new LinkList<E>();
    }

    /**
     * Метод вставки в стек
     *
     * @param item - значение, которое необходимо вставить
     */
    public void push(E item) {
        if (top == sizeStack - 1)
            throw new StackOverflowError("The stack is full");
        theList.insertFirst(item);
        ++top;
    }

    /**
     * удаление верхнего элемента из стека
     *
     * @return - возвращает удаленный элемент
     */
    public synchronized E pop() {
        return (theList.deleteFirst());
    }

    /**
     * Проверка. пуст ли стек, вызывает метод из связного списка
     *
     * @return - булевское значение
     */
    public boolean isEmpty() {
        return (theList.isEmpty());
    }

    /**
     * Возврат верхнего значения стека, без удаления
     *
     * @return - возвращает значение
     */
    public E peek() {
        return ((E) theList.first.Data);
    }

    /**
     * возвращает размер стека
     * @return
     */
    public int size() {
        return (top + 1);
    }

}
