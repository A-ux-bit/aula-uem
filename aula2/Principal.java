public class Principal {

    public static void main(String[] args){
        Pincel pincel01 = new Pincel();
        Tela tela = new Tela();
        
        tela.desenhaTela();

        pincel01.setCor(tela.getCor());
        pincel01.setMarca(tela.getMarca());
        pincel01.setCarga(tela.getCarga());
        pincel01.setTamanho(tela.getTamanho());
        pincel01.setEspressura(tela.getEspressura());

        System.out.println(pincel01.toString());


       
     
    }
    
}
