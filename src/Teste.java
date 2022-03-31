import net.datastructures.ListaSimplesEncadeada;
public class Teste {
    private static void testarPop(ListaSimplesEncadeada listaSimples){
        System.out.println("TestarPop exception:\n" + listaSimples.pop());
        System.out.println("--------\nTestarPop:\n");
        listaSimples.push("Jose Antonio Favaro Trugilio Filho ");
        System.out.println(listaSimples.toStringText() + "\n"+ listaSimples.pop());
        System.out.println(listaSimples.toStringText() + "\n--------");
    }
    private static void testarPush(ListaSimplesEncadeada listaSimples){
        System.out.println("TestarPush");
        listaSimples.push("Joao ");
        listaSimples.push("Maria ");
        listaSimples.push("Antonio ");
        listaSimples.push("Unibrasil ");
        listaSimples.push("Marcos ");
        listaSimples.push("Eugenio ");
        listaSimples.push("Leao ");
        listaSimples.push("Joaquim ");
        listaSimples.push("Jose ");
        listaSimples.push("Jose Antonio Favaro Trugilio Filho ");
        System.out.println(listaSimples.toStringText());
        System.out.println("--------");
    }
    private static void testeAtividade(ListaSimplesEncadeada listaSimples){
        System.out.println("Teste Atividade");
        listaSimples.push("Joao ");
        listaSimples.push("Maria ");
        listaSimples.push("Antonio ");
        listaSimples.push("Unibrasil ");
        listaSimples.push("Marcos ");
        listaSimples.push("Eugenio ");
        listaSimples.push("Leao ");
        listaSimples.push("Joaquim ");
        listaSimples.push("Jose ");
        listaSimples.push("Jose Antonio Favaro Trugilio Filho ");
        System.out.println(listaSimples.toStringText() + " \nRemove todos");
        listaSimples.removeAll();
        System.out.println(listaSimples.toStringText() + "\nPOP\n" + listaSimples.pop());
        System.out.println("--------");
    }
    public static void execute(){
        ListaSimplesEncadeada listaSimples = new ListaSimplesEncadeada<>();
        testarPop(listaSimples);
        testarPush(listaSimples);
        listaSimples = new ListaSimplesEncadeada<>();
        testeAtividade(listaSimples);
    } 

    public static void main(String[] args) {
    }
}
