
package br.com.martinez.trabalhobimestralpoo.Class;

public class FormaPagamento {

    public FormaPagamento() {
    }
    
    public FormaPagamento(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    private int codigo;
    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" + "codigo=" + codigo + ", descricao=" + descricao + '}';
    }
    
}