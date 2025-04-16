public class Main {

    public static void main(String[] args) {
        Arbitro arbitroPrincipal = new Arbitro("Carlos Silva", 40, "Brasil");
        Arbitro quartoArbitro = new Arbitro("Lucas Mendes", 38, "Brasil");
        Arbitro bandeirinha1 = new Arbitro("João Souza", 35, "Brasil");
        Arbitro bandeirinha2 = new Arbitro("Pedro Lima", 36, "Brasil");
        Arbitro var = new Arbitro("Ana Beatriz", 41, "Brasil");

        EquipeDeArbitragem equipe = new EquipeDeArbitragem(
            arbitroPrincipal, quartoArbitro, bandeirinha1, bandeirinha2, var
        );

        equipe.exibirEquipe();
    }
}

class Arbitro {
    private String nome;
    private int idade;
    private String nacionalidade;

    public Arbitro(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void exibirInformacoes() {
        System.out.println(nome + " (" + idade + " anos, " + nacionalidade + ")");
    }
}

class EquipeDeArbitragem {
    private Arbitro arbitroPrincipal;
    private Arbitro quartoArbitro;
    private Arbitro bandeirinha1;
    private Arbitro bandeirinha2;
    private Arbitro var;

    public EquipeDeArbitragem(Arbitro arbitroPrincipal, Arbitro quartoArbitro,
                              Arbitro bandeirinha1, Arbitro bandeirinha2, Arbitro var) {
        this.arbitroPrincipal = arbitroPrincipal;
        this.quartoArbitro = quartoArbitro;
        this.bandeirinha1 = bandeirinha1;
        this.bandeirinha2 = bandeirinha2;
        this.var = var;
    }

    public void exibirEquipe() {
        System.out.println("=== Equipe de Arbitragem ===");
        System.out.print("Árbitro Principal: ");
        arbitroPrincipal.exibirInformacoes();

        System.out.print("Quarto Árbitro: ");
        quartoArbitro.exibirInformacoes();

        System.out.print("Bandeirinha 1: ");
        bandeirinha1.exibirInformacoes();

        System.out.print("Bandeirinha 2: ");
        bandeirinha2.exibirInformacoes();

        System.out.print("VAR: ");
        var.exibirInformacoes();
    }
}
