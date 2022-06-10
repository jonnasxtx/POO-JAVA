public class Aluno {
    private int Matricula;
    private String Nome;
    private String Email;
    private String Curso;
    private String Telefone;
    private String endereço;

    public Aluno() {

    }
    public Aluno(int Matricula, String Nome, String Email, String Curso, String Telefone, String endereço) {
        this.Matricula = Matricula;
        this.Nome = Nome;
        this.Email = Email;
        this.Curso = Curso;
        this.Telefone = Telefone;
        this.endereço = endereço;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
