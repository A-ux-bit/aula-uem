import java.util.Scanner;


public class Tela{
    public  String cor;
    public String marca;
    public int carga;
    public int tamanho;
    public float espressura;

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