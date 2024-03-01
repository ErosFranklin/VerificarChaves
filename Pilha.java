package chaves;

public class Pilha implements Pilha_IF {
	public int[] pilha;
	int posicaoPilha;
	
	public Pilha() {
		posicaoPilha = -1;
		pilha = new int[1];
	}
	@Override
	public void push(int elemento) {
		if(posicaoPilha < pilha.length - 1) {
			posicaoPilha++;
			pilha[posicaoPilha] = elemento;
		}
		
	}

	@Override
	public int pop() {
		if(isEmpty()) {
			return 0;
		}
		return pilha[posicaoPilha--];
	}

	@Override
	public int top() {
		if(isEmpty()) {
			return 0;
		}
		return pilha[posicaoPilha];
	}

	@Override
	public boolean isEmpty() {
		if(posicaoPilha == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(posicaoPilha == pilha.length) {
			return true;
		}
		return false;
	}
}

