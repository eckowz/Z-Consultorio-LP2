package meuconsultorio;

/**
 *
 * @author 631120345
 */
public class Paciente {

    private String nome;
    private String dataNascimento;
    private String rg;

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public Paciente(String nome, String DataNascimento, String rg) {
        this.nome = nome;
        this.dataNascimento = DataNascimento;
        this.rg = rg;
    }

    public Paciente() {

    }

}
