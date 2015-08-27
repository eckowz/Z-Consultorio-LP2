/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuconsultorio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 631120345
 *
 * RESPONSABILIDADES
 *
 * informar e visualizar horario
 *
 * informar e visualizar data e hora
 *
 * COLABORAÇÕES horario date
 *
 */
public class RepositorioHorarios {
    private ArrayList<Horario> listaHorarios;
    
    public RepositorioHorarios(){
        listaHorarios= new ArrayList<Horario>();        
    }
    
    public void adicionar(Horario horario){
        listaHorarios.add(horario);
    }
    
    public void remover(int numeroAgenda){
        listaHorarios.remove(numeroAgenda);
    }

    public ArrayList<Horario> getListaHorarios() {
        return listaHorarios;
    }
    
    public Horario buscarHorarioPorData(Date dataHora)
    {
        for(Horario p: listaHorarios)
        {
            if(p.getDataHora().equals(dataHora))
            {
                return(p);
            }
        }
        return(null);
    }
    
    public boolean existeHorario(Date dataHora){
        if(this.buscarHorarioPorData(dataHora)!=null)
            return true;
        else
            return false;
            
    }
    
    public Horario buscarHorarioPorNome(String nome)
    {
        for(Horario p: listaHorarios)
        {
            if(p.getNome().equals(nome))
            {
                return(p);
            }
        }
        return(null);
    }
    
    public boolean temHorarios(){
        return !listaHorarios.isEmpty();
    }
    
}
