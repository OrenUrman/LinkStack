package ru.OrenUrman.LinkStackClass;

/**
 * Created by OrenUrman on 28.03.2017.
 * Элемент списка, хранит:
 * Data - данные помещенные в элемент
 * next - ссылка на следующий элемент
 */
class Link<E> {
    public E Data;
    public Link next;

    /**
     *
     * @param Data - данные, которые необходимо внести в стек
     */
    public Link(E Data) {
        this.Data = Data;
    }
}
