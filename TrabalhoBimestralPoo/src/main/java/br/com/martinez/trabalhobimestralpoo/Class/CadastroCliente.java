
package br.com.martinez.trabalhobimestralpoo.Class;

public class CadastroCliente {

    public CadastroCliente() {
    }
    
    public CadastroCliente(String nome, String dtNasc, String cpf, int codigo, EnderecoCliente endereco) {
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.cpf = cpf;
        this.codigo = codigo;
        this.endereco = endereco;
    }
    
    private String nome;
    private String dtNasc;
    private String cpf;
    private int codigo;
    private EnderecoCliente endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public EnderecoCliente getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoCliente endereco) {
        this.endereco = endereco;
    }

        /**
         *
         * @return
         */
        @Override
    public String toString() {
        return "CadastroCliente{" + "nome=" + nome + ", dtNasc=" + dtNasc + ", cpf=" + cpf + ", codigo=" + codigo + ", endereco=" + endereco + '}';
      }
    }
    