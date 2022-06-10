public class Registro {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios("thomas", 1, 1000);
        funcionarios.rendaTotal();
        funcionarios.imprimir();

        FunciBasico funciBasico = new FunciBasico("Felipe", 2, 1000, "joão 23");
        funciBasico.rendaTotal();
        funciBasico.imprimir();

        FunciMedio funciMedio = new FunciMedio("André", 3, 1000, "Antonio Lopes", "Colégio São Vicente");
        funciMedio.rendaTotal();
        funciMedio.imprimir();

        FunciGraduado funciGraduado = new FunciGraduado("Gabriel", 4, 1000, "Nossa Senhora das Graças", "Colégio Xavier", "IFPR");
        funciGraduado.rendaTotal();
        funciGraduado.imprimir();
    }
    
}
