public class Entrada {

    private String nomeEntrada;
    private int quantidade;
    private double preco;

    public Entrada(String nomeEntrada, int quantidade, int preco, TipoRefeicao tiporefeicao) {
    }

    public String getNomeEntrada() {
        return nomeEntrada;
    }

    public void setNomeEntrada(String nomeEntrada) {
        this.nomeEntrada = nomeEntrada;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
