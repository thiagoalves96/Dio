
//Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
package ArraysExecicio;

public class OrdemInversa {

	public static void main(String[] args) {
		
       int [] vet = {1,2,3,4,5,6,7,8};
       
      int count= 0;
      while (count < (vet.length)) {
    	  System.out.print(vet[count]+ " ");
    	  count++;
      }
    	   
       System.out.println("\nVetor inverso: ");
		for (int i = (vet.length - 1);i >= 0;i--) {
			System.out.print(vet[i]+" ");
		}

	}

}
