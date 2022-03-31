package net.datastructures;
/**
 * Node of a singly linked list, which stores references to its
 * element and to the next node in the list.
 *
 * @author Natasha Gelfand
 * @author Roberto Tamassia
 * @author Michael Goodrich
 * Adaptação efetuada
 * @author Abimael
 */
//begin#fragment Node
public class Node<E> {
    // Instancia variaveis:
    private E element;
    private Node<E> next;
    /** Cadastra novo Node nulo para o elemento e o next node  */
    public Node() {
        this(null, null);
    }
    /** Cadastra novo Node com valor de Elemento e Next Element*/
    public Node(E e, Node<E> n) {
        element = e;
        next = n;
    }
    // Metodos de acesso:
    //Pega o elemento
    public E getElement() {
        return element;
    }
    //Pega o Next Element
    public Node<E> getNext() {
        return next;
    }
    // Metodos de moficação:
    //Seta o elemento
    public void setElement(E newElem) {
        element = newElem;
    }
    //Seta o Next Element
    public void setNext(Node<E> newNext) {
        next = newNext;
    }

    //Reescreve o metodo toString() para retornar o elemento de Node
    @Override
    public String toString() {
        return ""+this.element;
    }
}

