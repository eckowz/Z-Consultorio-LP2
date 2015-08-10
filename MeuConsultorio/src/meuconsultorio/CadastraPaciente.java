package meuconsultorio;

/**
 *
 * @author 631120345
 */
public class CadastraPaciente {

    private String nome, DataNascimento, rg;
    
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public CadastraPaciente(String nome, String DataNascimento, String rg) {
        this.nome = nome;
        this.DataNascimento = DataNascimento;
        this.rg = rg;
    }

    public CadastraPaciente() {

    }
}
