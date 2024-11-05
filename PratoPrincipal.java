public class PratoPrincipal extends Refeicao {
    private String nomePratoPrincipal;
    private int quantidade;
    private int preco;

    public TipoRefeicao tiporefeicao;

    public PratoPrincipal(String nomePratoPrincipal, int quantidade, int preco, TipoRefeicao tiporefeicao) {
        super();
    }

    public String getNomePratoPrincipal() {
        return nomePratoPrincipal;
    }

    public void setNomePratoPrincipal(String nomePratoPrincipal) {
        this.nomePratoPrincipal = nomePratoPrincipal;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int getPreco() {
        return preco;
    }

    @Override
    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public void preparar() {

    }

    @Override
    public void servir() {

    }
}
