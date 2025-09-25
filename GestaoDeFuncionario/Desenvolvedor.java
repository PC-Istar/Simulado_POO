package GestaoDeFuncionario;

public class Desenvolvedor extends Funcionario {
    private String linguagem;

    // Construtor
    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    // Métodos de acesso e modificação
    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}

