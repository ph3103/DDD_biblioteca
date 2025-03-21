public class Funcionario {
    String nome;
    String cargo;
    Double salario;

    public double calcularBonus(){
        if(salario>5000){
            return salario * 0.05;

        }
        return 0;
    }
    public double calculargratificacao(){
        if(cargo.equalsIgnoreCase("Vendedor")){
            return salario * 0.05;
        }
        else{
            return 500;
        }
    }
    public double calcularIRPF(){
        double salarioFinal = salario + calcularBonus() + calculargratificacao();
        if (salarioFinal <= 2259){
            return 0;
        }else if (salarioFinal < 5000){
            return salarioFinal * 0.075;
        }else if (salarioFinal < 10000) {
            return salarioFinal * 0.125;
        }else{
    return salarioFinal * 0.275;


    }


    }


}
