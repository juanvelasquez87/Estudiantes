package modelo;

public class Curso {

    private String codigoCurso;
    private String nombreCurso;
    private double nota;
    private int creditos;


    public Curso(String codigo, String nombre, int credito){
        this.codigoCurso = codigo;
        this.nombreCurso = nombre;
        this.creditos = credito;
    }

    public int getCreditos(){
        return creditos;
    }

    public void setCreditos(int nuevosCreditos){
        this.creditos = nuevosCreditos;
    }

    public double getNota(){
        return nota;

    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public String getNombreCurso(){
        return  nombreCurso;
    }

    public String getDescription() {
        return "";
    }
    public boolean estaCalificacion(){
        return false;
    }

}
