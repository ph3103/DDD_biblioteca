public class Receita {
    //Atributo tipo nomeAtributo;
    String Receita;
    String nomeReceita;
    String autorReceitas;
    String dificuldade;
    int tempoPreparo;
    int porcoes;
    String descrição;
    String ingredientes;
    String modopreparo;

    public void exibirReceita(){
        System.out.println("Receita de " + nomeReceita);
        System.out.println("==========================");
        System.out.println("Publicado por: "+ autorReceitas);
        System.out.println(dificuldade + "\t" + tempoPreparo + "\t" + porcoes);
        System.out.println(descrição);
        System.out.println("ingredientes\n" + ingredientes);
        System.out.println(",modopreparo\n" + modopreparo);

        //Método com retorno
        public String exibirReceita2(){
            String mensagem = "Receita de " + nomeReceita +
                     "\n==========================" +
                     "\nPublicado por:\" + autorReceita"
                     "dificuldade + \"\"




    }






}
