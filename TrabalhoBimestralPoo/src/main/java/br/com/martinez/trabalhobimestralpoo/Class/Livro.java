package br.com.martinez.trabalhobimestralpoo.Class;

public class Livro {

    public Livro() {
    }

    public Livro(String titulo, String editora, String autor, int anoLancamento, String genero, String descricao, int numPaginas, int qtdEstoque, double vlrPrecoVenda, int qtdVendida) {
        this.editora = editora;
        this.autor = autor;
        this.genero = genero;
        this.descricao = descricao;
        this.numPaginas = numPaginas;
        this.qtdEstoque = qtdEstoque;
        this.vlrPrecoVenda = vlrPrecoVenda;
        this.qtdVendida = qtdVendida;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

        private String editora;
        private String autor;
        private int anoLancamento;
        private String genero;
        private String descricao;
        private int numPaginas;
        private int qtdEstoque;
        private double vlrPrecoVenda;
        private int qtdVendida;
        private String titulo;
    
        public void retirarEstoque(Livro livros, int qtdVendida) {
        livros.qtdEstoque = livros.qtdEstoque - qtdVendida;
    }

        public String getTitulo() {
            return titulo;
    }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
    }

        public String getEditora() {
            return editora;
    }

        public void setEditora(String editora) {
            this.editora = editora;
    }

        public String getAutor() {
            return autor;
    }

        public void setAutor(String autor) {
            this.autor = autor;
    }

        public int getAnoLancamento() {
            return anoLancamento;
    }

        public void setAnoLancamento(int anoLancamento) {
            this.anoLancamento = anoLancamento;
    }

        public String getGenero() {
            return genero;
    }

        public void setGenero(String genero) {
            this.genero = genero;
    }

        public int getNumPaginas() {
            return numPaginas;
    }

        public void setNumPaginas(int numPaginas) {
            this.numPaginas = numPaginas;
    }

        public int getQtdEstoque() {
            return qtdEstoque;
    }

        public void setQtdEstoque(int qtdEstoque) {
            this.qtdEstoque = qtdEstoque;
    }

        public String getDescricao() {
            return descricao;
    }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
    }

        public double getVlrPrecoVenda() {
            return vlrPrecoVenda;
    }

        public void setVlrPrecoVenda(double vlrPrecoVenda) {
            this.vlrPrecoVenda = vlrPrecoVenda;
    }

        public int getQtdVendida() {
            return qtdVendida;
    }

        public void setQtdVendida(int qtdVendida) {
            this.qtdVendida = qtdVendida;
    }

    @Override
        public String toString() {
            return "Livro{" + "titulo=" + titulo + ", editora=" + editora + ", autor=" + autor + ", anoLancamento=" + anoLancamento + ", genero=" + genero + ", descricao=" + descricao + ", numPaginas=" + numPaginas + ", qtdEstoque=" + qtdEstoque + ", vlrPrecoVenda=" + vlrPrecoVenda + ", qtdVendida=" + qtdVendida + '}';
        }

}