package meuconsultorio;

import java.util.Date;

/**
 *
 * @author gserafini
 */
public class Horario extends Paciente {

    private Date dataHora;

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Horario(String rg, Date dataHora) {
        super(rg);
        this.dataHora = dataHora;
    }

}
