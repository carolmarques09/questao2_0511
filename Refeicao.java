public class Refeicao {

    private String nomeRefeicao;
    private int quantidade;
    private int preco;

    public TipoRefeicao tiporefeicao;

    public Refeicao(String nomeRefeicao, int quantidade, int preco, TipoRefeicao tipoRefeicao) {
    }

    public Refeicao() {

    }

    public String getNomeRefeicao() {
        return nomeRefeicao;
    }

    public void setNomeRefeicao(String nomeRefeicao) {
        this.nomeRefeicao = nomeRefeicao;
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

    public Refeicao(String nomeRefeicao, int quantidade, int preco) {
        this.nomeRefeicao = nomeRefeicao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void preparar() {

    }

    public void servir() {

    }
}
