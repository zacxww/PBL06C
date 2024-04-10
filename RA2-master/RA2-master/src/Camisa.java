public class Camisa extends Main{
    private String estiloManga;
    private String gola;
    private String estiloCorte;
    private int botoes;

    public Camisa(String nome, String preco, int codigo, String marca,
                  String cor, String material, String tamanho, String estiloManga,
                  String gola, String estiloCorte, int botoes){
        super(nome, preco, codigo, marca, cor, material, tamanho);
        this.estiloManga = estiloManga;
        this.gola = gola;
        this.estiloCorte = estiloCorte;
        this.botoes = botoes;
    }

    public String obterDescricao() {
        return super.obterDescricao() + ", Estilo Manga: " + estiloManga +
                ", Gola: " + gola + ", Estilo de Corte: " + estiloCorte +
                ", Botões: " + botoes;
    }

}
