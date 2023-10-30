package Pilha;

public class No {
	
	private int dados;
	 private No refNo = null;
	 
	 
	 
	public No(int dados) {
		super();
		this.dados = dados;
	}



	public int getDados() {
		return dados;
	}



	public void setDados(int dados) {
		this.dados = dados;
	}



	public No getRefNo() {
		return refNo;
	}



	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}



	@Override
	public String toString() {
		return "No [dados=" + dados + "]";
	}
	 
	
	 
	 
	 
		
	}

