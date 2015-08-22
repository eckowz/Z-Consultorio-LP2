package meuconsultorio;

import java.text.ParseException;
import java.util.Date;
import java.util.InputMismatchException;
import util.ConsoleUtil;
import util.DateUtil;

/**
 *
 * @author 631120345
 */
public class MeuConsultorio {

    RepositorioPacientes repositorioPacientes = new RepositorioPacientes();
    RepositorioMedicamentos repositorioMedicamentos = new RepositorioMedicamentos();

    public MeuConsultorio() {

        menuPrincipal();
    }

    private void menuPrincipal() {

        @SuppressWarnings("UnusedAssignment")
        int op = -1;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1 - Cadastro de pacientes.");
            System.out.println("2 - Cadastro de medicamentos.");
            System.out.println("3 - Agendamento de consultas.");
            System.out.println("4 - Registro de consultas.");
            System.out.println("5 - Histórico");
            System.out.println("6 - Sair");
            System.out.println("--------------------------------");
            try {
                op = ConsoleUtil.scanInt("Informe o menu desejado: ");
                switch (op) {
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
            } catch (InputMismatchException e) {
                System.out.println("Opção errada, não pode informar letras ou caracteres especiais.");
            }
        } while (op != 6);
    }

    private void menuCadPacientes() {

        int op = -1;
        do {
            System.out.println("--------------------------------");
            System.out.println("1 - Adicionar novo pacientes.");
            System.out.println("2 - Visualizar todos os pacientes.");
            System.out.println("3 - Sair");
            System.out.println("--------------------------------");
            try {
                op = ConsoleUtil.scanInt("Informe o menu desejado: ");

                switch (op) {
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
            } catch (InputMismatchException e) {
                System.out.println("Opção errada, não pode informar letras ou caracteres especiais.");
            }
        } while (op != 3);
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
            opcao = ConsoleUtil.scanInt("Informe o menu desejado: ");
            switch (opcao) {
                case 1:
                    cadMedicamentos();
                    break;
                case 2:
                    consultaMedicamentos();
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
        try {
            System.out.println("\nCadatro de paciente");
            String rg = ConsoleUtil.scanString("RG: ");
            String nome = ConsoleUtil.scanString("Nome: ");
            String dataString = ConsoleUtil.scanString("Data de Nascimento(dia/mes/ano): ");
            Date dataNasc = DateUtil.stringToDate(dataString);
            Paciente paciente = new Paciente(rg, nome, dataNasc);
            repositorioPacientes.adicionar(paciente);
        } catch (ParseException ex) {
            System.out.println("Formato de data errado! Operação cancelada!");
        }
    }

    private void consultaPacientes() {
        System.out.println("\nLista de pacientes");
        if (!repositorioPacientes.temPacientes()) {
            System.out.println("<<Lista Vazia, cadastre um paciente>>");
        } else {
            System.out.print(String.format("%-10s", "RG"));
            System.out.print(String.format("%-20s", "NOME"));
            System.out.println(String.format("%-10s", "NASCIMENTO"));
            for (Paciente p : repositorioPacientes.getListaPacientes()) {
                System.out.print(String.format("%-10s", p.getRg()));
                System.out.print(String.format("%-20s", p.getNome()));
                System.out.println(String.format("%-10s", DateUtil.dateToString(p.getDataNascimento())));
            }
        }
    }

    private void cadMedicamentos() {
        try {
            System.out.println("\nCadatro de medicamento");
            int codigo = ConsoleUtil.scanInt("Codigo: ");
            String nome = ConsoleUtil.scanString("Nome: ");
            String descricao = ConsoleUtil.scanString("Descrição: ");
            Medicamento medicamento = new Medicamento(codigo, nome, descricao);
            repositorioMedicamentos.adicionar(medicamento);
        } catch (InputMismatchException err) {
            System.out.println("Caracter inválido, tente novamente.");
        }
    }

    private void consultaMedicamentos() {
        System.out.println("\nLista de medicamentos");
        if (!repositorioMedicamentos.temMedicamentos()) {
            System.out.println("<<Lista Vazia, cadastre um medicamento>>");
        } else {
            System.out.print(String.format("%-10s", "CÒDIGO"));
            System.out.print(String.format("%-30s", "NOME"));
            System.out.println(String.format("%-10s", "DESCRIÇÃO"));
            for (Medicamento p : repositorioMedicamentos.getListaMedicamentos()) {
                System.out.print(String.format("%-10s", p.getCodigo()));
                System.out.print(String.format("%-30s", p.getNome()));
                System.out.println(String.format("%-10s", p.getDescricao()));
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MeuConsultorio meuConsultorio = new MeuConsultorio();
    }

}
