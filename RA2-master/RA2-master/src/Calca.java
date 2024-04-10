public class Calca extends Main{
    private String estilo;
    private int numeroDeBolsos;
    private String genero;

    public Calca(String nome, String preco, int codigo, String marca,
                 String cor, String material, String tamanho, String estilo,
                 int numeroDeBolsos, String genero){
        super(nome, preco, codigo, marca, cor, material, tamanho);
        this.estilo = estilo;
        this.numeroDeBolsos = numeroDeBolsos;
        this.genero = genero;
    }

    public String obterDescricao() {
        return super.obterDescricao() + ", Estilo: " + estilo +
                ", Número de Bolsos: " + numeroDeBolsos + ", Gênero: " + genero;
    }

}
