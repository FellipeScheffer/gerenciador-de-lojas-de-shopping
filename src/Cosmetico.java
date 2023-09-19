public class Cosmetico extends Loja{
    private double taxaComercializacao;


    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantMaxima, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxima);
        this.taxaComercializacao = taxaComercializacao;
    }


    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    
    public String toString(){
        return "Nome da loja: " + getNome() + "\n" + "Quantidade de funcionários: " + getQuantidadeFuncionarios() + "\n" + "Salário base dos funcionários: " + getSalarioBaseFuncionario() + "\n" + "Endereço: " + getEndereco() + "\n" + "Data da fundação: " + getDataFundacao() + "\n" + "Taxa de comercialização: " + getTaxaComercializacao();
    }
    
}
