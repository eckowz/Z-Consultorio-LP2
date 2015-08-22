package meuconsultorio;

import java.util.Date;

/**
 *
 * @author 631120345
 */
public class Paciente {

    private String rg;
    private String nome;
    private Date dataNascimento;

    public Paciente(String rg, String nome, Date dataNascimento) {
        this.rg = rg;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

}
