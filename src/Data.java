public class Data {
    private int dia;
    private int mes;
    private int ano;
    

    public Data(int dia, int mes, int ano){

        if(dia == 29 && mes == 2){
            if(ano % 4 == 0)
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
        }else if(dia == 29 && mes == 2){
            if(ano % 4 != 0){
                System.out.println("Erro! alterando data para 1/1/2000");
                this.dia = 1;
                this.mes = 1;
                this.ano = 2000;
            }
        }else{
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public String toString(){
        return getDia() + "/" + getMes() + "/" + getAno();
    }


    public boolean verificaAnoBissexto(){
        if(ano % 4 == 0)
            return true;
        else
            return false;
    }
    
}