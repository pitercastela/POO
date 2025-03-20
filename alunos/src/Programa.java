public class Programa {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.matricula = "123";
        aluno1.nome = "Vanessa";
        aluno1.curso = "ADS";

        Aluno aluno2 = new Aluno();
        aluno2.matricula = "321";
        aluno2.nome = "Pedro";
        aluno2.curso = "Eng. Software";

        System.out.printf("Nomes: " + aluno1.nome + "; " + aluno2.nome + "\n");
    }
}
