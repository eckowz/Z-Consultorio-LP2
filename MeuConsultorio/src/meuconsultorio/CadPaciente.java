package meuconsultorio;

/**
 *
 * @author 631120345
 */
public class CadPaciente {

    private String nome, DataNascimento;
    private int rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public CadPaciente(String nome, String DataNascimento, int rg) {
        this.nome = nome;
        this.DataNascimento = DataNascimento;
        this.rg = rg;
    }

    public CadPaciente() {

    }
}
