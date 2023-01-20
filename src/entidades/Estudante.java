package entidades;

public class Estudante {
    public String aluno;
    public double nota1, nota2, nota3, media;

    public double calcularMedia() {
        return media = nota1 + nota2 + nota3;
    }
    public double falta(){
        return 60 - media;
    }

}

