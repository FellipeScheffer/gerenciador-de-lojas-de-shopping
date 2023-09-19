public class Vestuario extends Loja{
    private boolean produtosImportados;


    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantMaxima){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxima);
        this.produtosImportados = produtosImportados;
    }


    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }


    public String toString(){
        return "Nome da loja: " + getNome() + "\n" + "Quantidade de funcionários: " + getQuantidadeFuncionarios() + "\n" + "Salário base dos funcionários: " + getSalarioBaseFuncionario() + "\n" + "Endereço: " + getEndereco() + "\n" + "Data da fundação: " + getDataFundacao() + "\n" + "Produto importado: " + getProdutosImportados();
    }
}
