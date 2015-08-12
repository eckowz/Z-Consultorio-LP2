package meuconsultorio;

import util.Console;

/**
 *
 * @author 631120345
 */
public class MeuConsultorio {

    CadastraPaciente cadPaciente = new CadastraPaciente();

    public MeuConsultorio() {
        menuPrincipal();
    }

    public void menuPrincipal() {

        @SuppressWarnings("UnusedAssignment")
        int opcao = 0;

        do {
            System.out.println("--------------------------------");
            System.out.println("1 - Cadastro de pacientes.");
            System.out.println("2 - Cadastro de medicamentos.");
            System.out.println("3 - Agendamento de consultas.");
            System.out.println("4 - Registro de consultas.");
            System.out.println("5 - Histórico");
            System.out.println("6 - Sair");
            System.out.println("--------------------------------");
            opcao = Console.scanInt("Informe o menu desejado: ");
            switch (opcao) {
                case 1:
                    menuCadPacientes();
                    break;
                case 2:
                    menuCadMedicamentos();
                    break;
                case 3:
                    agendaConsultas();
                    break;
                case 4:
                    cadastraConsultas();
                    ;
                    break;
                case 5:
                    historicoDeConsultas();
                    break;
                case 6:
                    System.out.println("Volte sempre!!");
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }
        } while (opcao != 6);
    }

    private void menuCadPacientes() {
        @SuppressWarnings("UnusedAssignment")
        int opcao = 0;
        do {
            System.out.println("--------------------------------");
            System.out.println("1 - Adicionar novo pacientes.");
            System.out.println("2 - Visualizar todos os pacientes.");
            System.out.println("3 - Sair");
            System.out.println("--------------------------------");
            opcao = Console.scanInt("Informe o menu desejado: ");
            switch (opcao) {
                case 1:
                    cadPacientes();
                    break;
                case 2:
                    consultaPacientes();
                    break;
                case 3:
                    System.out.println("Retornando ao menu anterior.");
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }
        } while (opcao != 3);
    }

    private void menuCadMedicamentos() {
        @SuppressWarnings("UnusedAssignment")
        int opcao = 0;
        do {
            System.out.println("--------------------------------");
            System.out.println("1 - Adicionar novo medicamento.");
            System.out.println("2 - Visualizar todos os medicamentos.");
            System.out.println("3 - Sair");
            System.out.println("--------------------------------");
            opcao = Console.scanInt("Informe o menu desejado: ");
            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Retornando ao menu anterior.");
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }
        } while (opcao != 3);
    }

    private void agendaConsultas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cadastraConsultas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void historicoDeConsultas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cadPacientes() {
        @SuppressWarnings("UnusedAssignment")
        String var1 = null;
        var1 = Console.scanString("\nInforme o nome do paciente: ");
        cadPaciente.setNome(var1);
        var1 = Console.scanString("\nInforme a data de nascimento do paciente: ");
        cadPaciente.setDataNascimento(var1);
        var1 = Console.scanString("\nInforme o RG do paciente: ");
        cadPaciente.setRg(var1);
    }

    
    private void consultaPacientes() {
        System.out.println("--------------------------------");
        System.out.println("Nome: " + cadPaciente.getNome() +
                           "\nData de Nascimento: " + cadPaciente.getDataNascimento() +
                           "\nRG: " + cadPaciente.getRg());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MeuConsultorio executa = new MeuConsultorio();
        executa.menuPrincipal();
    }

}
