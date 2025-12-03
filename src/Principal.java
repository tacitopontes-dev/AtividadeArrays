import java.util.ArrayList;

public class Principal {
    static void main() {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        pessoa1.setNome("Jaline Oliveira");
        pessoa1.setIdade(15);
        pessoa2.setNome("Tácito Amaral");
        pessoa2.setIdade(17);
        pessoa3.setNome("Gerald De Rivia");
        pessoa3.setIdade(115);

        ArrayList<Pessoa> listaPesssoa = new ArrayList<>();
        listaPesssoa.add(pessoa1);
        listaPesssoa.add(pessoa2);
        listaPesssoa.add(pessoa3);

        System.out.println("O tamanho da Lista é: " + listaPesssoa.size());
        System.out.println("A primeira pessoa da lista é: " + listaPesssoa.getFirst());
        System.out.println(listaPesssoa);



    }
}
