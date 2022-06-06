
package br.com.martinez.trabalhobimestralpoo;


import br.com.martinez.trabalhobimestralpoo.Class.CadastroCliente;
import br.com.martinez.trabalhobimestralpoo.Class.EnderecoCliente;
import br.com.martinez.trabalhobimestralpoo.Class.FormaPagamento;
import br.com.martinez.trabalhobimestralpoo.Class.GerenciarVenda;
import br.com.martinez.trabalhobimestralpoo.Class.Livro;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        EnderecoCliente enderecoMartinez = new EnderecoCliente();
        enderecoMartinez.setRua("Rua Verilio Nazari");
        enderecoMartinez.setNumero(208);
        enderecoMartinez.setBairro("Jardim Gisela");
        enderecoMartinez.setCidade("Toledo");
        enderecoMartinez.setEstado("Paraná");
        enderecoMartinez.setPais("Brasil");
        
        CadastroCliente Martinez = new CadastroCliente();
        Martinez.setNome("Pablo Martinez");
        Martinez.setDtNasc("30/01/2003");
        Martinez.setCpf("123456789-12");        
        Martinez.setCodigo(1);
        Martinez.setEndereco(enderecoMartinez);
        
        Livro escolhaMartinez1 = new Livro();
        escolhaMartinez1.setTitulo("Pai Rico, Pai Pobre");
        escolhaMartinez1.setEditora("Alta Books");
        escolhaMartinez1.setAutor("Robert T. Kiyosaki ");
        escolhaMartinez1.setAnoLancamento(1997);
        escolhaMartinez1.setGenero("Finanças e Investimentos");
        escolhaMartinez1.setDescricao("A inteligência resolve problemas e gera dinheiro. Dinheiro sem inteligência financeira desaparece depressa");
        escolhaMartinez1.setNumPaginas(336);
        escolhaMartinez1.setQtdEstoque(150);
        escolhaMartinez1.setVlrPrecoVenda(65.61);
        escolhaMartinez1.setQtdVendida(2);
        escolhaMartinez1.retirarEstoque(escolhaMartinez1, 2);
        
        Livro escolhaMartinez2 = new Livro();
        escolhaMartinez2.setTitulo("Amazon Unbound: Jeff Bezos and the Invention of a Global Empire");
        escolhaMartinez2.setEditora("Simon & Schuster");
        escolhaMartinez2.setAutor("Brad Stone");
        escolhaMartinez2.setAnoLancamento(2021);
        escolhaMartinez2.setGenero("Tecnologia");
        escolhaMartinez2.setDescricao("apresentando a evolução de Jeff Bezos, de um geek inteiramente dedicado a colocar em pé seu sonho até o momento atual, o de um multibilionário com grandes pretensões globais.");
        escolhaMartinez2.setNumPaginas(496);
        escolhaMartinez2.setQtdEstoque(20);
        escolhaMartinez2.setVlrPrecoVenda(47.90);
        escolhaMartinez2.setQtdVendida(2);
        escolhaMartinez2.retirarEstoque(escolhaMartinez2, 2);
        
        Livro escolhaMartinez3 = new Livro();
        escolhaMartinez3.setTitulo("O poder do hábito");
        escolhaMartinez3.setEditora("Objetiva");
        escolhaMartinez3.setAutor("Robert C. Martin");
        escolhaMartinez3.setAnoLancamento(2012);
        escolhaMartinez3.setGenero("Negocios");
        escolhaMartinez3.setDescricao("Sobre porque fazemos o que fazemos na vida e nos negócios, em uma frase, ele destrincha os hábitos.");
        escolhaMartinez3.setNumPaginas(411);
        escolhaMartinez3.setQtdEstoque(100);
        escolhaMartinez3.setVlrPrecoVenda(47.90);
        escolhaMartinez3.setQtdVendida(1);

        FormaPagamento formaPagamentoMartinez1 = new FormaPagamento();
        formaPagamentoMartinez1.setCodigo(1);
        formaPagamentoMartinez1.setDescricao("Dinheiro");
        
        FormaPagamento formaPagamentoMartinez2 = new FormaPagamento();
        formaPagamentoMartinez2.setCodigo(2);
        formaPagamentoMartinez2.setDescricao("Cartão de Crédito");
        
        GerenciarVenda vendaMartinez = new GerenciarVenda();
        vendaMartinez.setCliente(Martinez);
        vendaMartinez.getListaLivro().add(escolhaMartinez1);
        vendaMartinez.getListaLivro().add(escolhaMartinez2);
        vendaMartinez.getListaLivro().add(escolhaMartinez3);
        vendaMartinez.setVlrDesconto(0.30);
        vendaMartinez.getVlrTotalVenda(vendaMartinez);
        vendaMartinez.getFormaPagamento().add(formaPagamentoMartinez1);
        vendaMartinez.getFormaPagamento().add(formaPagamentoMartinez2);
        System.out.println(vendaMartinez);
        vendaMartinez = null;
        System.gc();
        
    }

}
