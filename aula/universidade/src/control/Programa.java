package control;

import model.Curso;
import model.Disciplina;
import model.Professor;
import model.Turma;

import java.util.HashSet;

public class Programa {
    public static void main(String[] args) {
        Curso engSoftware = new Curso("001", "Engenharia de Software");
        Curso cdia = new Curso("002", "CDIA");
        Curso ads = new Curso("003", "ADS");

        Disciplina poo = new Disciplina("IBM0513", "Programação OO", 80, engSoftware);
        Disciplina EngDados = new Disciplina("IBM1234", "Engenharia de Dados", 60, cdia);
        Disciplina arqcomp = new Disciplina("IBM2344", "Arquitetura de computadores", 80, ads);
        Professor profThiago = new Professor("123", "Thiago Souza", "Doutor");
        Professor profAnderson = new Professor("987", "Anderson Silva", "Doutor");
        Professor profTalita = new Professor("001", "Talita Vieria", "Doutora");
        Professor profClayton = new Professor("002", "Clayton Jones", "Goat");

        Turma pooSemProf = new Turma("CDIA001", "quinta-feira", "M1 a M4", "207", poo);
        Turma pooThiago = new Turma("CDIA002", "quarta-feira", "T1 a T4", "302",profThiago, poo);
        Turma engDadosAnderson = new Turma("CDIA003", "terça-feira", "T1 a T4", "209", profAnderson, EngDados);
        Turma arqcompClayton = new Turma("CDIA004", "terça-feira", "T1 a T4", "209", profClayton, arqcomp);

        profThiago.addTurma(pooThiago);
        profAnderson.addTurma(engDadosAnderson);
        profTalita.addTurma(pooSemProf);
        profClayton.addTurma(arqcompClayton);

        pooSemProf.setProfessor(profTalita);

        poo.addTurma(pooThiago);
        poo.addTurma(pooSemProf);
        EngDados.addTurma(engDadosAnderson);
        arqcomp.addTurma(arqcompClayton);

        ads.addDisciplina(poo);
        ads.addDisciplina(arqcomp);
        cdia.addDisciplina(EngDados);




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

        System.out.println("");

        for (Disciplina disciplina : ads.getDisciplinas()){
            for (Turma turma : disciplina.getTurmas()){
                System.out.println(turma.getCodigo());
                System.out.println(turma.getProfessor().getNome());
            }

        }
    }
}
