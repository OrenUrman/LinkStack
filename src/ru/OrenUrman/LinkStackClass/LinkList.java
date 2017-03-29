package ru.OrenUrman.LinkStackClass;

import ru.OrenUrman.LinkStackClass.Link;

/**
 * Created by OrenUrman on 28.03.2017.
 * Связный список, хранить ссылку на первый элемент списка
 * (последний вставленный в список)
 */
class LinkList<E> {
    public Link first;

    public LinkList() {
        this.first = null;
    }

    /**
     *
     * @return  - проверяет, пуст ли стек
     */
    public boolean isEmpty() {
        return (this.first == null);
    }

    /**
     * метод для вставки в список
     * @param item - значение, которое нужно поместить в список
     */
    public void insertFirst(E item) {
        Link<E> newLink = new Link<E>(item);
        newLink.next = first;
        first = newLink;
    }

    /**
     * удаляет элементы из списка
     * @return - возвращяет удаленный элемент из списка
     */
    public E deleteFirst() {
        Link<E> temp = first;
        first = first.next;
        return temp.Data;
    }
}
