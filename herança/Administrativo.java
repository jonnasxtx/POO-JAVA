public class Administrativo extends Assistente {
    public String turno;

    float adicionalNoturno(){
        if ("noite".equals(turno) || "Noite".equals(turno)){
            this.Salario = this.Salario+(float)(600);
            return this.Salario;
        }
        else{
            this.Salario = this.Salario+(float)(1000);
            return this.Salario;
        }
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
