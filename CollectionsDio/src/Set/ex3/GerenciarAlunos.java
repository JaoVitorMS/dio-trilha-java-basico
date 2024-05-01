package Set.ex3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciarAlunos {
    private Set<Alunos> listaAlunos;

    public GerenciarAlunos ( ) {
        this.listaAlunos = new HashSet<Alunos>();
    }
    public void adicionarAluno(String nome, long matricula, double media){
        Alunos aluno = new Alunos(nome, matricula, media);
        listaAlunos.add(aluno);
    }
    public void removerAluno(long matricula){
        for (Alunos aluno : listaAlunos) {
            if (aluno.getMatricula() == matricula) {
                listaAlunos.remove(aluno);
                break;
            }
        }
    }
    public Set<Alunos> exibirAlunoNome (){
        Set<Alunos> alunosNome = new TreeSet<>(listaAlunos);
        return alunosNome;
    }
    public Set<Alunos>exibirAlunosNota(){
        Set<Alunos> alunosNota = new TreeSet<>(listaAlunos);
        return alunosNota;
    }

    public static void main ( String[] args ) {
        GerenciarAlunos chamada = new GerenciarAlunos();
        chamada.adicionarAluno("João", 123456, 10.0);
        chamada.adicionarAluno("Maria", 123457, 7.0);
        chamada.adicionarAluno("José", 123458, 6.0);
        chamada.adicionarAluno("Ana", 123459, 9.0);

        System.out.println("-----------------");
        System.out.println("Alunos ordenados por nome:");
        for(Alunos a : chamada.exibirAlunoNome()){
            System.out.println(a.getNome());
        }

        System.out.println("-----------------");
        System.out.println("Alunos ordenados por nota:");
        for(Alunos a : chamada.exibirAlunosNota()){
            System.out.println(a.getMedia());
        }

        chamada.removerAluno(123457);
        System.out.println("-----------------");
        System.out.println("Alunos ordenados por nome:");
        for(Alunos a : chamada.exibirAlunoNome()){
            System.out.println(a.getNome());
        }

        System.out.println("-----------------");
        System.out.println("Alunos ordenados por nota:");
        for(Alunos a : chamada.exibirAlunosNota()){
            System.out.println(a.getMedia());
        }
    }
}
