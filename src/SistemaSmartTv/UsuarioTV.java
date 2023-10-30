package SistemaSmartTv;

public class UsuarioTV {

	public static void main(String[] args) {
   SmartTv smartTv = new SmartTv ();
   
   
   System.out.println("A tv está ligada? "+smartTv.ligada);
   System.out.println("Canal atual: "+smartTv.canal);
   System.out.println("Volume atual: "+smartTv.volume);
   System.out.println();
   System.out.println("Novo Status: ");
   smartTv.ligar();
   smartTv.aumentarVolume();
   smartTv.aumentarVolume();
   smartTv.aumentarVolume();
   smartTv.diminuirVolume();
   System.out.println("TV ligada? "+ smartTv.ligada);
   System.out.println("Volume atual: "+ smartTv.volume);
   smartTv.aumentarCanal();
   smartTv.aumentarCanal();
   smartTv.aumentarCanal();
   System.out.println("Canal atual: "+smartTv.canal);
   smartTv.mudarCanal(12);
   System.out.println("Canal atual: "+smartTv.canal);
   smartTv.aumentarCanal();
   smartTv.aumentarCanal();
   System.out.println("Canal atual: "+smartTv.canal);
   }

}
