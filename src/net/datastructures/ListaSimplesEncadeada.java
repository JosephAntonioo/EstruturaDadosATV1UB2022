package net.datastructures;

public class ListaSimplesEncadeada<E> {
    //nó da cabeça da lista
    protected Node<String> head;
    protected long size;

    public ListaSimplesEncadeada(){
        head = null;
        size = 0;
    }

    // Adiciona um novo elemento na cabeça da lista, deslocando a cabeça atual
    //  @param elemento Elemento a ser inserido
    public void push(String elemento){
        Node<String> n = new Node<>();
        n.setElement(elemento);
        n.setNext(this.head);
        this.head = n;
        this.size++;
    }

    //Remove o nó da cabeça da lista
    public void removeNode(){
        this.head = this.head.getNext();
        this.size--;
    }

    //Remove o nó da cabeça da lista e retorna ""
    public String removeNodeReturn(){
        this.head = this.head.getNext();
        this.size--;
        return "";
    }

    //Remove todos
    public void removeAll(){
        while (this.head != null){
            this.removeNode();
        }
    }

    //Sobreescreve o metodo toString para retornar a lista encadeada dos items da classe
    @Override
    public String toString(){
        String itemsLista = "";
        Node<String> i = this.head;
        while(i != null){
            itemsLista += i.getElement() + " \n";
            i = i.getNext();
        }
        return "\nUltimo elemento da Lista Simples Encadeada: " +
               "\n{\nhead= " + head + "\nsize= " + size +"\n}"+
               "\n\nElementos da lista: \n{\n" + 
               "" +itemsLista + "}";
    }

    public String toStringText(){
        String itemsLista = "";
        Node<String> i = this.head;
        while(i != null){
            itemsLista += i.getElement() + " \n";
            i = i.getNext();
        }
        return "Elementos da lista: \n{\n" + 
               "" +itemsLista + "}";
    }

    public String pop(){ //throws Exception{
        Node<String> i = this.head;
        if(i != null){
            // Exception acerto = new Exception("POP - Ultimo Elemento: " +
            // "\n{\nhead= " + head + "\nsize= " + size + "\n}" + removeNodeReturn());
            return "POP - Retira ultimo elemento adicionado e retorna o elemento: " +
            "\n{\nhead= " + head + "\nsize= " + size + "\n}" + removeNodeReturn();
        }else{
            ExceptionCustom erro = new ExceptionCustom();
            return erro.ExceptionNull();
        }

    }
    public static void main(String[] args){

    }
}
