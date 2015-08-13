package meuconsultorio;

/**
 *
 * @author 631120345
 */
public class Paciente {

    private String nome, dataNascimento, rg;
    
    public String getNome() {
        return nome;
    }

//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    public String getDataNascimento() {
        return dataNascimento;
    }

//    public void setDataNascimento(String dataNascimento) {
//        this.dataNascimento = dataNascimento;
//    }

    public String getRg() {
        return rg;
    }

//    public void setRg(String rg) {
//        this.rg = rg;
//    }

    public Paciente(String nome, String DataNascimento, String rg) {
        this.nome = nome;
        this.dataNascimento = DataNascimento;
        this.rg = rg;
    }

    public Paciente() {

    }
}
