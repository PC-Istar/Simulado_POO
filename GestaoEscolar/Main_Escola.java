package GestaoEscolar;

public class Main_Escola {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Maria", "123.456.789-00", "001");
        System.out.println("--- Gestao Escolar ---");
        System.out.println("Aluno: " + a1.getNome());
        System.out.println("CPF: " + a1.getCpf());
        System.out.println("Matrícula: " + a1.getMatricula());

        Professor p1 = new Professor("João", "987.654.321-00", "Matemática");
        System.out.println("--- Gestao Escolar ---");
        System.out.println("Professor: " + p1.getNome());
        System.out.println("CPF: " + p1.getCpf());
        System.out.println("Matéria: " + p1.getMateria());
    }
 
}

