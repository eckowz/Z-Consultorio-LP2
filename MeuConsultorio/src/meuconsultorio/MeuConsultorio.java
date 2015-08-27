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
    RepositorioHorario repositorioHorario = new RepositorioHorario();

    public MeuConsultorio() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MeuConsultorio vaiPlaneta = new MeuConsultorio();
        vaiPlaneta.menuPrincipal();

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
            //System.out.println("5 - Histórico");
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
                        menuAgendaConsultas();
                        break;
                    case 4:
                        cadastraConsultas();
                        ;
                        break;
                    case 5:
                        //historicoDeConsultas();
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

    private void menuAgendaConsultas() {

        int op = -1;
        do {
            System.out.println("--------------------------------");
            System.out.println("1 - Agendar paciente.");
            System.out.println("2 - Consultar agenda.");
            System.out.println("3 - Desmarcar paciente.");
            //System.out.println("4 - Alterar horário de paciente.");
            System.out.println("5 - Sair");
            System.out.println("--------------------------------");
            try {
                op = ConsoleUtil.scanInt("Informe o menu desejado: ");

                switch (op) {
                    case 1:
                        cadAgenda();
                        break;
                    case 2:
                        consultaAgenda();
                        break;
                    case 3:
                        desmarcaAgenda();
                        break;
                    case 4:
                        //alteraAgenda();
                        break;
                    case 5:
                        System.out.println("Retornando ao menu anterior.");
                        break;
                    default:
                        System.out.println("Opção incorreta.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção errada, não pode informar letras ou caracteres especiais.");
            }
        } while (op != 5);
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
            if (repositorioPacientes.existePaciente(rg)) {
                System.out.println("RG já cadastrado.");
            } else {
                String nome = ConsoleUtil.scanString("Nome: ");
                String dataString = ConsoleUtil.scanString("Data de Nascimento(dia/mes/ano): ");
                Date dataNasc = DateUtil.stringToDate(dataString);
                Paciente paciente = new Paciente(rg, nome, dataNasc);
                repositorioPacientes.adicionar(paciente);
            }
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
            if (repositorioMedicamentos.existeMedicamento(codigo)) {
                System.out.println("Código já cadastrado.");
            } else {
                String nome = ConsoleUtil.scanString("Nome: ");
                String descricao = ConsoleUtil.scanString("Descrição: ");
                Medicamento medicamento = new Medicamento(codigo, nome, descricao);
                repositorioMedicamentos.adicionar(medicamento);
            }
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

    private void cadAgenda() {
        try {
            System.out.println("\nAgendamentos");
            String rgPaciente = ConsoleUtil.scanString("RG do Paciente: ");
            if (!repositorioPacientes.existePaciente(rgPaciente)) {
                System.out.println("RG inválido.");
            } else {
                String dataString = ConsoleUtil.scanString("Informe a data da Consulta(dia/mes/ano HH:mm): ");
                Date dataAgenda = DateUtil.stringToDateHour(dataString);
                Horario horario = new Horario(rgPaciente, dataAgenda);
                repositorioHorario.adicionar(horario);
            }
        } catch (ParseException err) {
            System.out.println("Caracter inválido, tente novamente.");
        }
    }

    private void consultaAgenda() {
        System.out.println("\nLista de agendamentos");
        if (!repositorioHorario.temHorarios()) {
            System.out.println("<<Lista Vazia, nenhum agendamento cadastrado>>");
        } else {
            System.out.print(String.format("%-10s", "RG"));
            System.out.println(String.format("%-10s", "DATA DA CONSULTA"));
            for (Horario h : repositorioHorario.getListaHorarios()) {
                System.out.print(String.format("%-10s", h.getRg()));
                System.out.println(String.format("%-10s", DateUtil.dateHourToString(h.getDataHora())));
            }
        }
    }

    private void desmarcaAgenda() {
        try {
            int cod = 1;
            System.out.println("\nLista de agendamentos");
            if (!repositorioHorario.temHorarios()) {
                System.out.println("<<Lista Vazia, nenhum agendamento cadastrado>>");
            } else {
                System.out.print(String.format("%-10s", "CÓDIGO"));
                System.out.print(String.format("%-10s", "RG"));
                System.out.println(String.format("%-10s", "DATA DA CONSULTA"));
                for (Horario h : repositorioHorario.getListaHorarios()) {
                    System.out.print(String.format("%-10s", cod));
                    cod = cod + 1;
                    System.out.print(String.format("%-10s", h.getRg()));
                    System.out.println(String.format("%-10s", DateUtil.dateHourToString(h.getDataHora())));
                }
            }
            int x = ConsoleUtil.scanInt("\nInforme o código da consulta a ser removida:");
            repositorioHorario.remover(x - 1);
        } catch (IndexOutOfBoundsException err) {
            System.out.println("Código da consulta inexistente ou inválido.");
        }
    }

    private void alteraAgenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
