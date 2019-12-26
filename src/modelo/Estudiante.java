package modelo;

public class Estudiante {

    private int codigo;
    private String nombre;
    private String apellido;
    private Curso curso1;
    private Curso curso2;
    private Curso curso3;
    private Curso curso4;
    private Curso curso5;


    public Estudiante(String nombre, String apellido, int codigo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    public boolean asignarCurso(){
        return false;
    }

    public double calcularPromedio(){
        return 0;
    }

    public boolean pensumIncluyeCurso(){
        return false;
    }

    public boolean estudianteEstaPrueba(){
        return false;
    }

    public boolean tienenCursosCompletos(String codigoCurso){
        return false;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Curso getCurso1() {
        return curso1;
    }

    public Curso getCurso2() {
        return curso2;
    }

    public Curso getCurso3() {
        return curso3;
    }

    public Curso getCurso4() {
        return curso4;
    }

    public Curso getCurso5() {
        return curso5;
    }

    


}
