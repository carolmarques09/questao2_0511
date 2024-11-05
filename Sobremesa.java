public class Sobremesa {

    private String nomeSobremesa;
    private int quantidade;
    private int preco;

    public Sobremesa(String nomeSobremesa, int quantidade, int preco, TipoRefeicao tiporefeicao) {
    }

    public String getNomeSobremesa() {
        return nomeSobremesa;
    }

    public void setNomeSobremesa(String nomeSobremesa) {
        this.nomeSobremesa = nomeSobremesa;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Sobremesa(String nomeSobremesa, int quantidade, int preco) {
        this.nomeSobremesa = nomeSobremesa;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
