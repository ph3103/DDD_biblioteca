package br.com.fiap.models;


import br.com.fiap.enums.TipoCapaEnum;

public class Livro<editora extends br.com.fiap.models.Editora> {
    //Atributo tipo nomeAtributo;
    public String titulo;
    public String autor;
    private double preco;
    private br.com.fiap.models.Editora editora;
    private int paginas;
    public String resumo;
    public TipoCapaEnum tipoCapa; //COMUM, DURA, PERSONALIZADA

    //Construtor
    //Sobrecarga de métodos -> Métodos com mesmo nome porém assinatura diferente
    public Livro(){
        tipoCapa = TipoCapaEnum.COMUM;
    }

    public Livro(br.com.fiap.models.Editora editora){
        this.editora = editora;
        tipoCapa = TipoCapaEnum.COMUM;
    }

    public Livro(String titulo, String autor, double preco,
                 editora editora, int paginas, String resumo,
                 TipoCapaEnum tipoCapa) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.editora = editora;
        this.paginas = paginas;
        this.resumo = resumo;
        this.tipoCapa = tipoCapa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Livro(String titulo, editora editora, TipoCapaEnum tipoCapa) {
        this.titulo = titulo;
        this.editora = editora;
        this.tipoCapa = tipoCapa;
    }

    //Método para exibir o livro
    public void exibirLivro(){
        System.out.println("br.com.fiap.models.Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("br.com.fiap.models.Editora: " + editora.nome);
        System.out.println("Preço: " + preco);
        System.out.println("Tipo de capa: " + tipoCapa);
        System.out.println("-------------------------------------\n");
    }

    public String exibirTipoCapa(){
        return "";

    }

    public void setTitulo() {
    }

    public void setautor() {
    }

    public void setpaginas() {
    }

    public void setpreco() {
    }

    public void setEditora() {
    }
}





