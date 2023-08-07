import java.util.Scanner;


public class Tela{
    private   String cor;
    private  String marca;
    private  int carga;
    private  int tamanho;
    private float espressura;

    public String getCor(){
    return this.cor;
    }

    public String getMarca(){
        return this.marca;
    }

    public int getCarga(){
        return this.carga;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public float getEspressura(){
        return this.espressura;
    }

    public void desenhaTela(){
        Scanner input = new Scanner(System.in);
        System.out.print("informe a Cor:");
        this.cor = input.nextLine();
        System.out.print("informe a Marca:");
        this.marca = input.nextLine();
        System.out.print("informe a Carga:");
        this.carga = input.nextInt();
        input.nextLine();
        System.out.print("informe a Espressura:");
        this.espressura = Float.parseFloat(input.nextLine());
        input.nextLine();
        System.out.print("informe o Tamanho:");
        this.tamanho = input.nextInt();
        input.nextLine(); 
    }

}