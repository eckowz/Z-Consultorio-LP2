/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuconsultorio;

/**
 *
 * @author 631120345
 */
public class Medicamento {

    private int codigo;
    private String nome, descricao;
    
        public Medicamento() {
    }

    public Medicamento(int codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

//    public void setCodigo(int codigo) {
//        this.codigo = codigo;
//    }

    public String getNome() {
        return nome;
    }

//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    public String getDescricao() {
        return descricao;
    }

//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }
        
}
