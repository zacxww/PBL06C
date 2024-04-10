public class Meia extends Main {
    private String altura;
    private String finalidade;
    private String padrao;
    private String tecido;

    public Meia(String nome, String preco, int codigo, String marca,
                String cor, String material, String tamanho, String altura,
                String finalidade, String padrao, String tecido){
        super(nome, preco, codigo, marca, cor, material, tamanho);
        this.altura = altura;
        this.finalidade = finalidade;
        this.padrao = padrao;
        this.tecido = tecido;
    }

    public String obterDescricao() {
        return super.obterDescricao() + ", Altura: " + altura +
                ", Finalidade: " + finalidade + ", Padrao: " + padrao +
                ", Tecido: " + tecido;
    }

}
