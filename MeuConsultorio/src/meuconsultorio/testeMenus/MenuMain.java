package meuconsultorio.testeMenus;

import javax.swing.JOptionPane;

public class MenuMain {

    public static void main(String[] s) {

        MenuUsuario referenciaPolimorfica;

// Armazenando objeto da classe MenuUsuarioCliente na Referência polimórfica
        referenciaPolimorfica = new MenuUsuarioCliente();

        JOptionPane.showMessageDialog(null, referenciaPolimorfica.getMenuUsuario(), "MenuUsuarioCliente selecionado", JOptionPane.INFORMATION_MESSAGE);

// Armazenando objeto da classe MenuUsuarioAdministrador na mesma Referência polimórfica
        referenciaPolimorfica = new MenuUsuarioAdministrador();

        JOptionPane.showMessageDialog(null, referenciaPolimorfica.getMenuUsuario(), "MenuUsuarioAdministrador selecionado", JOptionPane.INFORMATION_MESSAGE);

    }

}
