public class Informatica extends Loja{
    private double seguroEletronicos;


    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantMaxima, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxima);
        this.seguroEletronicos = seguroEletronicos;
    }


    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }
    
    
    public String toString(){
        return "Nome da loja: " + getNome() + "\n" + "Quantidade de funcionários: " + getQuantidadeFuncionarios() + "\n" + "Salário base dos funcionários: " + getSalarioBaseFuncionario() + "\n" + "Endereço: " + getEndereco() + "\n" + "Data da fundação: " + getDataFundacao() + "\n" + "Valor do seguro: " + getSeguroEletronicos();
    }
}
