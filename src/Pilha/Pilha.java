package Pilha;

public class Pilha {
	private No refNo;

	public Pilha() {
		this.refNo = null;
	}

	public void push(No novoNo) {
		No reAuxiliar = refNo;
		refNo = novoNo;
		refNo.setRefNo(reAuxiliar);
	}

	public No pop() {
		if (!this.isEmpty()) {
			No noPoped = refNo;
			refNo = refNo.getRefNo();
			return noPoped;
		}
		return null;
	}

	public No top() {

		return refNo;
	}

	public boolean isEmpty() {
//		 if (reNo == null) {
//			 return true;
//		 }
//		 
//		 return false;

		return refNo == null ? true : false;
	}

	@Override
	public String toString() {
		String stringRetorno = "----------------\n";
		stringRetorno += "    Pilha\n";
		stringRetorno += "----------------\n";

		No noAuxiliar = refNo;

		while (true) {
			if (noAuxiliar != null) {
				stringRetorno += "[No{dado=" + noAuxiliar.getDados() + "}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			} else {
				break;
			}
		}
		stringRetorno += "===============\n";
		return stringRetorno;
	}

}
