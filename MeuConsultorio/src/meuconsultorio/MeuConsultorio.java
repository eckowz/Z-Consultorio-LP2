package meuconsultorio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import util.Console;

/**
 *
 * @author 631120345
 */
public class MeuConsultorio {

    @SuppressWarnings({"FieldMayBeFinal"})
    private List<Paciente> listaPacientes;

    @SuppressWarnings("Convert2Diamond")
    public MeuConsultorio() {
        this.listaPacientes = new ArrayList<Paciente>();
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
                op = Console.scanInt("Informe o menu desejado: ");
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
                System.out.println("Opção errada, não pode informar letras");
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
                op = Console.scanInt("Informe o menu desejado: ");

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
                System.out.println("Opção errada, não pode informar letras");
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
        System.out.println("\nCadatro de paciente");
        String rg = Console.scanString("RG: ");
        String nome = Console.scanString("Nome: ");
        String dataNascimento = Console.scanString("Data de Nascimento: ");
        Paciente paciente = new Paciente(rg, nome, dataNascimento);
        listaPacientes.add(paciente);
    }

    private void consultaPacientes() {
        System.out.println("\nLista de pacientes");
        if (listaPacientes.isEmpty()) {
            System.out.println("<<Lista Vazia>>");
        } else {
            System.out.print(String.format("%-10s", "RG"));
            System.out.print(String.format("%-20s", "NOME"));
            System.out.println(String.format("%-10s", "NASCIMENTO"));
            for (Paciente p : listaPacientes) {
                System.out.print(String.format("%-10s", p.getRg()));
                System.out.print(String.format("%-20s", p.getNome()));
                System.out.println(String.format("%-10s", p.getDataNascimento()));
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
