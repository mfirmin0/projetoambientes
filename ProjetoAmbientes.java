import java.util.ArrayList;
import java.util.List;

// Classe que representa o motorista
class Motorista {
    private String nome;
    private double pontuacao;

    public Motorista(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void adicionarPontuacao(double pontuacao) {
        this.pontuacao += pontuacao;
    }
}

// Classe que representa o passageiro
class Passageiro {
    private String nome;

    public Passageiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void pontuarMotorista(Motorista motorista, double pontuacao) {
        motorista.adicionarPontuacao(pontuacao);
        System.out.println("Você pontuou o motorista " + motorista.getNome() + " com " + pontuacao + " pontos.");
    }
}

// Classe que representa uma corrida
class Corrida {
    private Motorista motorista;
    private Passageiro passageiro;
    private double distancia;
    private double valor;

    public Corrida(Motorista motorista, Passageiro passageiro, double distancia) {
        this.motorista = motorista;
        this.passageiro = passageiro;
        this.distancia = distancia;
        this.valor = calcularValor();
    }

    public double calcularValor() {
        // Cálculo simples do valor da corrida baseado na distância
        return distancia * 2.5;
    }

    public void exibirRecibo() {
        System.out.println("Recibo da Corrida:");
        System.out.println("Motorista: " + motorista.getNome());
        System.out.println("Passageiro: " + passageiro.getNome());
        System.out.println("Distância: " + distancia + " km");
        System.out.println("Valor: R$ " + valor);
    }
}

// Classe principal
public class ProgramaUber {
    public static void main(String[] args) {
        // Criando motorista e passageiro
        Motorista motorista = new Motorista("João");
        Passageiro passageiro = new Passageiro("Maria");

        // Simulando uma corrida
        Corrida corrida = new Corrida(motorista, passageiro, 10);

        // Exibindo recibo da corrida
        corrida.exibirRecibo();

        // Passageiro pontua o motorista
        passageiro.pontuarMotorista(motorista, 4.5);
        System.out.println("Pontuação do motorista " + motorista.getNome() + ": " + motorista.getPontuacao());
    }
}