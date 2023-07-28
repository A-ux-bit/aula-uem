public class Principal {

    public static void main(String[] args){
        System.out.println("DADOS DO PINCEL \n\n\n");
        Pincel pincel01 = new Pincel();
        Tela tela = new Tela();

        tela.desenhaTela();


        pincel01.cor = tela.cor;
        pincel01.marca = tela.marca;
        pincel01.carga = tela.carga;
        pincel01.espressura = tela.espressura;
        pincel01.tamanho = tela.tamanho;
        
        System.out.println("Cor:" + pincel01.cor);
        System.out.println("Marca:" + pincel01.marca);
        System.out.println("Carga:" + pincel01.carga);
        System.out.println("Espressura" + pincel01.espressura);
        System.out.println("Tamanho:" + pincel01.tamanho); 
     
    }
    
}
