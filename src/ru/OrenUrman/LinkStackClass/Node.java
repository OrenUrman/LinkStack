package ru.OrenUrman.LinkStackClass;

/**
 * Created by OrenUrman on 28.03.2017.
 * Элемент списка, хранит:
 * Data - данные помещенные в элемент
 * next - ссылка на следующий элемент
 */
class Node<E> {
    E Data;
    Node next;

    public Node(E Data) {
        this.Data = Data;
    }
}
