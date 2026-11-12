package modulo2.capitulo_01.exercicio08;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Revisar cadastro", "Lucas", false);

        System.out.println(tarefa.descricao + " | " + tarefa.responsavel + " | " + tarefa.concluida);

        tarefa.responsavel = "Marina";
        System.out.println(tarefa.descricao + " | " + tarefa.responsavel + " | " + tarefa.concluida);

        tarefa.concluida = true;
        System.out.println(tarefa.descricao + " | " + tarefa.responsavel + " | " + tarefa.concluida);
    }
}