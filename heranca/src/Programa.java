public class Programa {
    public static void main(String[] args) {
        /*
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.telefone = "123456789";
        System.out.println("Telefone: " + pessoa1.telefone);
        pessoa1.mudarTelefone("0123456789");
        System.out.println("Telefone: " + pessoa1.telefone);
        */
        Aluno aluno1 = new Aluno();
        aluno1.nome = "John";
        aluno1.matricula = "0123456789";
        aluno1.telefone = "99999999";
        System.out.println("Telefone: " + aluno1.telefone);
        aluno1.mudarTelefone("2734687264382463");
        System.out.println("Telefone: " + aluno1.telefone);


        Professor prof1 = new Professor();
        prof1.nome = "Jeffersoncaminhões-sama";
        prof1.telefone = "2345678 ta na hora de molhar o biscoito";
        prof1.titulacao = "mestre";
        System.out.println(prof1.titulacao);
        prof1.mudarTitulacao("doutor");
        

        System.out.println(prof1.titulacao);
        Monitor moni1 = new Monitor();
        moni1.nome = "Wellinglington";
        moni1.telefone = "83128321623816837261";
        moni1.matricula = "2613512376215327215";
        moni1.percentualDeBolsa = 50.0;
    }
}
