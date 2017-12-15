package datos_persoais;

public class DatosAlumno {

    String nome;
    public String telefono;

    public DatosAlumno() {
    }

    public DatosAlumno(String nome, String telefono) {
        this.nome = nome;
        this.telefono = telefono;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", telefono = " + telefono ;
    }

}
