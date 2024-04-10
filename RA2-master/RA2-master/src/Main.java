//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.ArrayList;
public class Main {

    protected String nome;
    protected String preco;
    protected int codigo;
    protected String marca;
    protected String cor;
    protected String material;
    protected String tamanho;



    public Main(String nome, String preco, int codigo, String marca, String cor, String material, String tamanho) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.material = material;
        this.tamanho = tamanho;

    }

    public String obterDescricao() {
        return "Nome: " + nome + ", Preço: " + preco + ", Código: " + codigo +
                ", Marca: " + marca + ", Cor: " + cor + ", Material: " + material +
                ", Tamanho: " + tamanho;
    }

    public static void main(String[] args) {
        ArrayList<Main> itens = new ArrayList<>();

        itens.add(new Camisa("Camisa Polo", "39.99", 1234, "Polo", "Azul", "Algodão", "M", "Curta", "Gola V", "Slim Fit", 3));
        itens.add(new Calca("Calça Jeans", "59.99", 5678, "Levi's", "Preto", "Denim", "30", "Slim", 5, "Masculino"));
        itens.add(new Meia("Meia Esportiva", "9.99", 9012, "Nike", "Branco", "Algodão", "Único", "Cano Alto", "Esportiva", "Listrada", "Algodão"));

        for (Main item : itens) {
            System.out.println(item.obterDescricao());
        }
    }

}
