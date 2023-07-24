public class Principal{
       public static void main (String [] args)
       {
       //Programa principal da classe Pincel

	       //System.out.println("Hello world! Ola mundo!");
       

       //Criando um objeto Pincel
                 Pincel pincel01 = new Pincel();

		 pincel01.cor = "Azul";
		 pincel01.marca = "Pilot";
		 pincel01.tamanho = 20;
		 pincel01.espressura = 1.5f ;
		 pincel01.carga = 5;

		 Pincel pincel02 = new Pincel();

		 pincel02.cor = "Preto";
		 pincel02.marca = "Lord";
		 pincel02.tamanho = 15;
		 pincel02.espressura = 1.7f;
		 pincel02.carga = 7;
		 
		System.out.println("A cor do pincel é:" +pincel01.cor);
	        System.out.println("A marca do pincel é:" +pincel01.marca);
	        System.out.println("Tamanho do pincel é:" +pincel01.tamanho);
	        System.out.println("espressura do pincel é:" +pincel01.espressura);
	        System.out.println("carga do pincel é:" +pincel01.carga);	
       }
       


}
