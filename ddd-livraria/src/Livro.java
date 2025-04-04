package br.com.fiap.models;


import br.com.fiap.enums.TipoCapaEnum;

public class Livro {
    //Atributo tipo nomeAtributo;
    private String titulo;
    private String autor;
    private double preco;
    private br.com.fiap.models.Editora editora;
    private int paginas;
    private String resumo;
    private TipoCapaEnum tipoCapa; //COMUM, DURA, PERSONALIZADA

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
}





