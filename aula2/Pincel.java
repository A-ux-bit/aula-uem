public class Pincel{
    private String cor;
    private String marca;
    private int carga;
    private int tamanho;
    private float espressura;
    public void setCor(String cor){
          this.cor = cor;
    } 

    public String getCor(){
        return this.cor;
    }

    public void setMarca(String marca){
          this.marca = marca;
    } 

    public String getMarca(){
        return this.marca;
    }

    public void setCarga(int carga){
          this.carga = carga;
    } 

    public int getCarga(){
        return this.carga;
    }
    
    public void setTamanho(int tamanho){
          this.tamanho = tamanho;
    } 

    public int getTamanho(){
        return this.tamanho;
    }

    public void setEspressura(float espressura){
          this.espressura = espressura;
    } 

    public float getEspressura(){
        return this.espressura;
    }

    public String toString(){
        String report;

        report = "Relatorio pincel ******* \n" +
                 "Cor: " + getCor() +"\n" + 
                 "Carga: " + getCarga() + "\n" + 
                 "Tamanho: " + getTamanho() + 
                 "Marca: " + getMarca() +
                 "\n" + "Espressura: " + getEspressura() + 
                 "\n" + "********";

        return report;

    }
}