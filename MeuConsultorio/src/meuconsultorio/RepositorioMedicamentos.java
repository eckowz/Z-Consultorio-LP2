package meuconsultorio;


import java.util.ArrayList;

/**
 *
 * @author lhries
 */
public class RepositorioMedicamentos {
    private ArrayList<Medicamento> listaMedicamentos;
    
    public RepositorioMedicamentos(){
        listaMedicamentos = new ArrayList<Medicamento>();        
    }
    
    public void adicionar(Medicamento medicamento){
        listaMedicamentos.add(medicamento);
    }

    public ArrayList<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }
    
    public Medicamento buscarMedicamentoPorCodigo(int codigo)
    {
        for(Medicamento p: listaMedicamentos)
        {
            if(p.getCodigo() == (codigo))
            {
                return(p);
            }
        }
        return(null);
    }
    
    public boolean existeMedicamento(int codigo){
        if(this.buscarMedicamentoPorCodigo(codigo)!=null)
            return true;
        else
            return false;
            
    }
    
    public Medicamento buscarMedicamentoPorNome(String nome)
    {
        for(Medicamento p: listaMedicamentos)
        {
            if(p.getNome().equals(nome))
            {
                return(p);
            }
        }
        return(null);
    }
    
    public boolean temMedicamentos(){
        return !listaMedicamentos.isEmpty();
    }
    
}
