import javax.swing.JOptionPane;

public class Main {
    static String tipoFuncionario;

    public static void main(String[] args) {
            Object[] opcoes = {"Técnico","Administrativo","Gerente","Funcionario"};
            Object tipoFuncionario = JOptionPane.showInputDialog(null, "Escolha um tipo de funcionario" , "Selecao de Funcionarios",
            JOptionPane.PLAIN_MESSAGE , null ,opcoes,"");

            if("Técnico".equals(tipoFuncionario)){  Tecnico Funcionario = new Tecnico();
            String Nome;
            String rg;
            float Salario;
            int matricula;
            Nome = JOptionPane.showInputDialog("Digite seu nome: ");
            rg = JOptionPane.showInputDialog("Digite seu rg: ");
            Salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu Salario: "));
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite sua matricula: "));
            Funcionario.setNome(Nome);
            Funcionario.setRg(rg);
            Funcionario.setSalario(Salario);
            Funcionario.setMatricula(matricula);
            Funcionario.bonus();
            Funcionario.exibeDados();
        }
        if("Administrativo".equals(tipoFuncionario)){
            Administrativo Assistente = new Administrativo();
            String Nome;
            String rg;
            float Salario;
            int matricula;
            Nome = JOptionPane.showInputDialog("Digite seu nome: ");
            Object[] opcoes2 = {"Noite","Dia"};
            Object turno = JOptionPane.showInputDialog(null, "Escolha um tipo de funcionario" , "Selecao de Funcionarios",
            JOptionPane.PLAIN_MESSAGE , null ,opcoes2,"");
            rg = JOptionPane.showInputDialog("Digite seu rg: ");
            Salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu Salario: "));
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite Sua matricula: "));
            Assistente.setNome(Nome);
            Assistente.setRg(rg);
            Assistente.setSalario(Salario);
            Assistente.setMatricula(matricula);
            Assistente.setTurno((String) turno);
            Assistente.adicionalNoturno();
            Assistente.exibeDados();
        }
        if("Gerente".equals(tipoFuncionario)){
            Gerente gerente = new Gerente();
            String Nome;
            String rg;
            float Salario;
            int matricula;
            String Setor;
            Nome = JOptionPane.showInputDialog("Digite seu nome: ");
            rg = JOptionPane.showInputDialog("Digite seu rg: ");
            Salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu Salario: "));
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite sua matricula: "));
            Setor = JOptionPane.showInputDialog("Digite seu setor: ");
            gerente.setNome(Nome);
            gerente.setRg(rg);
            gerente.setSalario(Salario);
            gerente.setMatricula(matricula);
            gerente.setSetor(Setor);
            gerente.exibeDados();
        }
        if("Funcionario".equals(tipoFuncionario)){
            Funcionario funcionario = new Funcionario();
            String Nome;
            String rg;
            float Salario;
            int matricula;
            Nome = JOptionPane.showInputDialog("Digite seu nome: ");
            rg = JOptionPane.showInputDialog("Digite seu rg: ");
            Salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu Salario: "));
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite sua matricula: "));
            funcionario.setNome(Nome);
            funcionario.setRg(rg);
            funcionario.setSalario(Salario);
            funcionario.setMatricula(matricula);
            funcionario.exibeDados();

        }
    }
}
