public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;


    public Shopping(String nome, Endereco endereco, int quantMaxima){
        this.nome = nome;
        this.endereco =endereco;
        lojas = new Loja[quantMaxima];
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Loja[] getLojas(){
        return lojas;
    }

    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }


    public String toString(){
        return "Nome: " + getNome() + "\n" + "Endereço: " + getEndereco() + "\n" + "Lojas: " + getLojas();
    }


    public boolean insereLoja(Loja loja){
        for(int i=0; i<lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nome){
        for(int i=0; i<lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nome)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public int quantidadeLojasPorTipo(String nome){
        int quantTotal = 0;

        if(nome == "Cosmético"){
            for(int i=0; i<lojas.length; i++){
                if(lojas[i] instanceof Cosmetico){
                    quantTotal += 1;
                }
            }
            return quantTotal;
        }else if(nome == "Vestuário"){
            for(int i=0; i<lojas.length; i++){
                if(lojas[i] instanceof Vestuario){
                    quantTotal += 1;
                }
            }
            return quantTotal;
        }else if(nome == "Bijuteria"){
            for(int i=0; i<lojas.length; i++){
                if(lojas[i] instanceof Bijuteria){
                    quantTotal += 1;
                }
            }
            return quantTotal;
        }else if(nome == "Alimentação"){
            for(int i=0; i<lojas.length; i++){
                if(lojas[i] instanceof Alimentacao){
                    quantTotal += 1;
                }
            }
            return quantTotal;
        }else if(nome == "Informática"){
            for(int i=0; i<lojas.length; i++){
                if(lojas[i] instanceof Informatica){
                    quantTotal += 1;
                }
            }
            return quantTotal;
        }else
            return -1;
    }

    public Informatica lojaSeguroMaisCaro(){
        Loja lojaSeguroCaro = null;
        double valor = 0;

        for(int i=0; i<lojas.length; i++){
            if(lojas[i] != null && lojas[i] instanceof Informatica){
                if(((Informatica)lojas[i]).getSeguroEletronicos() > valor){
                    valor = ((Informatica)lojas[i]).getSeguroEletronicos();
                    lojaSeguroCaro = lojas[i];
                }
            }
        }

        Informatica loja = (Informatica)lojaSeguroCaro;

        return loja;
    }
}
