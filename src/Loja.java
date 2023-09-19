public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;


    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantMaxima){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        estoqueProdutos = new Produto[quantMaxima];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantMaxima){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        estoqueProdutos = new Produto[quantMaxima];
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }


    public String toString(){
        return "Nome da loja: " + getNome() + "\n" + "Quantidade de funcionários: " + getQuantidadeFuncionarios() + "\n" + "Salário base dos funcionários: " + getSalarioBaseFuncionario() + "\n" + "Endereço: " + getEndereco() + "\n" + "Data da fundação: " + getDataFundacao() + "\n" + "Estoque de produtos: " + getEstoqueProdutos();
    }


    public double gastosComSalario(){
        double total = 0;

        if(getSalarioBaseFuncionario() == -1)
            return -1;
        else{
            for(int i=0; i<getQuantidadeFuncionarios(); i++){
                total += getSalarioBaseFuncionario();
            }
            return total;
        }
    }

    public char tamanhoDaLoja(){
        if(getQuantidadeFuncionarios() < 10)
            return 'P';
        else if(getQuantidadeFuncionarios() >= 10 && getQuantidadeFuncionarios() <= 30)
            return 'M';
        else
            return 'G';
    }

    public void imprimeProdutos(){
        for(int i=0; i<estoqueProdutos.length; i++){
            System.out.println(estoqueProdutos[i]);
        }
    }

    public boolean insereProduto(Produto p){
        for(int i=0; i<estoqueProdutos.length; i++){
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = p;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nome){
        for(int i=0; i<estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nome)){
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

}