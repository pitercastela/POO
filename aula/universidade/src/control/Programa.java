package control;

import model.Disciplina;
import model.Professor;
import model.Turma;

public class Programa {
    public static void main(String[] args) {

        Disciplina poo = new Disciplina("IBM0513", "Programação OO", 80);
        Disciplina EngDados = new Disciplina("IBM1234", "Engenharia de Dados", 60);
        Professor profThiago = new Professor("123", "Thiago Souza", "Doutor");
        Professor profAnderson = new Professor("987", "Anderson Silva", "Doutor");
        Professor profTalita = new Professor("001", "Talita Vieria", "Doutora");

        Turma pooSemProf = new Turma("CDIA001", "quinta-feira", "M1 a M4", "207", poo);
        Turma pooThiago = new Turma("CDIA002", "quarta-feira", "T1 a T4", "302",profThiago, poo);
        Turma engDadosAnderson = new Turma("CDIA003", "terça-feira", "T1 a T4", "209", profAnderson, EngDados);

        profThiago.addTurma(pooThiago);
        profAnderson.addTurma(engDadosAnderson);
        profTalita.addTurma(pooSemProf);

        pooSemProf.setProfessor(profTalita);

        poo.addTurma(pooThiago);
        poo.addTurma(pooSemProf);
        EngDados.addTurma(engDadosAnderson);


        // Quais as disciplinas de um determinado professor
        System.out.println(pooThiago.getProfessor().getNome());
        for (Turma i : profThiago.getTurmas()){
            System.out.println(i.getDisciplina().getNome());
        }

        for (Turma i : profTalita.getTurmas()){
            System.out.println(i.getDisciplina().getNome());
        }

        //Quais professores ministram a disciplina de POO
        for (Turma turma : poo.getTurmas())
            System.out.println(turma.getProfessor().getNome());
    }
}
