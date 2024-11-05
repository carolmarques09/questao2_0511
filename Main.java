import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Refeicao r = new Refeicao("Filé à Parmegiana", 1, 45, TipoRefeicao.TRADICIONAL);
        PratoPrincipal p = new PratoPrincipal("Cogumelos", 1, 35, TipoRefeicao.GLUTENFREE);
        Entrada e = new Entrada("Batata Frita", 1, 23, TipoRefeicao.VEGANA);
        Sobremesa s = new Sobremesa("Petit Gateau", 1, 20, TipoRefeicao.GLUTENFREE);
    }
}