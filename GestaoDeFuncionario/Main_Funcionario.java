package GestaoDeFuncionario;

public class Main_Funcionario {
    public static void main(String[] args) {
       
        Gerente g1 = new Gerente("Ana", 8000, 2000);
        System.out.println("---Gestao de Funcionarios ---");
        System.out.println("Gerente: " + g1.getNome());
        System.out.println("Salário: " + g1.getSalario());
        System.out.println("Bônus anual: " + g1.getBonusAnual());

        Desenvolvedor d1 = new Desenvolvedor("João", 5000, "Java");
        System.out.println("---Gestao de Funcionarios ---");
        System.out.println("Desenvolvedor: " + d1.getNome());
        System.out.println("Salário: " + d1.getSalario());
        System.out.println("Linguagem: " + d1.getLinguagem());

    }
}

