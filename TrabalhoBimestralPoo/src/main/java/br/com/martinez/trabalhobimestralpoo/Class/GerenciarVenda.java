package br.com.martinez.trabalhobimestralpoo.Class;

import java.util.ArrayList;

public class GerenciarVenda {

    public GerenciarVenda() {
        this.listaLivro = new ArrayList<>();
        this.formaPagamento = new ArrayList<>();
    }

    public GerenciarVenda(CadastroCliente cliente, double vlrDesconto) {
        this.cliente = cliente;
        this.vlrDesconto = vlrDesconto;
    }

    private CadastroCliente cliente;
    private ArrayList<Livro> listaLivro;
    private double vlrDesconto;
    private double vlrTotalVenda;
    private ArrayList<FormaPagamento> formaPagamento;
    
    public void getVlrTotalVenda(GerenciarVenda venda) {
        for(int i=0; i<listaLivro.size(); i++) {
            vlrTotalVenda += listaLivro.get(i).getVlrPrecoVenda();
        }
        vlrTotalVenda = vlrTotalVenda - (vlrTotalVenda * venda.vlrDesconto);
    }

    public CadastroCliente getCliente() {
        return cliente;
    }

    public void setCliente(CadastroCliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Livro> getListaLivro() {
        return listaLivro;
    }

    public void setListaLivro(ArrayList<Livro> listaLivro) {
        this.listaLivro = listaLivro;
    }

    public double getVlrDesconto() {
        return vlrDesconto;
    }

    public void setVlrDesconto(double vlrDesconto) {
        this.vlrDesconto = vlrDesconto;
    }

    public double getVlrTotalVenda() {
        return vlrTotalVenda;
    }

    public void setVlrTotalVenda(double vlrTotalVenda) {
        this.vlrTotalVenda = vlrTotalVenda;
    }

    public ArrayList<FormaPagamento> getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(ArrayList<FormaPagamento> formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Registro realizado com sucesso!");
        super.finalize();
    }

    @Override
    public String toString() {
        return "Venda{" + "cliente=" + cliente + ", listaLivro=" + listaLivro + ", vlrDesconto=" + vlrDesconto + ", vlrTotalVenda=" + vlrTotalVenda + ", formaPagamento=" + formaPagamento + '}';
    }
 
}