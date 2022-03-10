package Herança.EXE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/* Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque,
o programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
public class EstoqueDeLoja {
    private ArrayList<String> lista = new ArrayList<>();
    private ArrayList<Double> quantidade = new ArrayList<>();
    private int escolha,eRemove;
    private String escolhaA;
    Scanner input = new Scanner(System.in);
    void armazena(){
    while(true){
            System.out.println("Qual Produto você deseja adicionar no estoque? ");
            getLista().add((input.next()));
            System.out.println("Qual quantidade você deseja adicionar desse produto? ");
            getQuantidade(0).add(input.nextDouble());
            System.out.println("Você deseja adicionar outro produto\n1=Sim\n2=Não");
            setEscolha(input.nextInt());
            if (getEscolha() == 2){
                System.out.println("Todos os produtos foram adicionados com sucesso.");
                System.out.println();
                break;
            }}
    }
    void remover (){
        while (true){
                int c;
                System.out.println("Você deseja remover algum produto\n1=Sim\n2=Não");
                seteRemove(input.nextInt());
                if(geteRemove()==2){
                System.out.println("Os produtos foram removidos com sucesso.");
                System.out.println();
                break;}
               System.out.print("Qual produto você gostaria de remover: ");
                c = lista.indexOf(input.next());
                lista.remove(c);
                quantidade.remove(c);
       }
        // criar uma condição que se a lista na posição zero == 0 impedir a atualização
        // ou remoção de produtos.
    }
    void atualizar(){
        int c,d;
        double calculo =0;
        System.out.println("Lista de produtos\n" + lista +"\n" + quantidade);
        System.out.println("Qual produto você gostaria de atualizar a quantidade? ");
        setEscolhaA(input.next());
        c = lista.indexOf(getEscolhaA());
        System.out.println("Qual a quantidade quer modificar, use + na frente do valor" +
                " para adicionar e - para retirar");
        d = input.nextInt();
        calculo = getQuantidade(0).get(c) + d;
        getQuantidade(0).add(c,calculo);
    }
    void status(){
        System.out.println("A lista de produtos armazenados no estoque são: ");
        System.out.println(getLista());
        System.out.println("A quantidade de cada produto armazenado no estoque são: ");
        System.out.println(getQuantidade(0)); }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public int geteRemove() {
        return eRemove;
    }

    public void seteRemove(int eRemove) {
        this.eRemove = eRemove;
    }

    public ArrayList<Double> getQuantidade(double v) {
        return quantidade;
    }

    public void setQuantidade(ArrayList<Double> quantidade) {
        this.quantidade = quantidade;
    }

    public String getEscolhaA() {
        return escolhaA;
    }

    public void setEscolhaA(String escolhaA) {
        this.escolhaA = escolhaA;
    }
}
