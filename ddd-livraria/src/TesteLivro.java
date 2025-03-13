public class TesteLivro {
    public static void main(String[] args) {
        //Criar um objeto -> Instanciar um objeto
    //  Tipo  nomeObjeto = new Tipo();
        Livro meuLivro = new Livro();
        meuLivro.titulo = "UML 2";
        meuLivro.autor = "Gilleanes Guedes";
        meuLivro.editora = "novatec";
        meuLivro.preco = 50;
        meuLivro.paginas = 484;
        meuLivro.tipoCapa = "Capa dura";
        meuLivro.resumo = "UML abordagem prática....";

        Livro livroDaGiovanna = new Livro();
        livroDaGiovanna.titulo = "Harry Potter e a pedra filosofal";
        livroDaGiovanna.autor = "J K ";

    }
}
