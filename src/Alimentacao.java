public class Alimentacao extends Loja{
    private Data dataAlvara;


    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantMaxima){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxima);
        this.dataAlvara = dataAlvara;
    }


    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    
    public String toString(){
        return "Nome da loja: " + getNome() + "\n" + "Quantidade de funcionários: " + getQuantidadeFuncionarios() + "\n" + "Salário base dos funcionários: " + getSalarioBaseFuncionario() + "\n" + "Endereço: " + getEndereco() + "\n" + "Data da fundação: " + getDataFundacao() + "\n" + "Data do alvará: " + getDataAlvara();
    }
}
