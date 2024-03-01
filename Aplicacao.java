package chaves;

public class Aplicacao {

	public static void main(String[] args) {
		System.out.println(verificaChaves("{{}{}}"));

	}
	public static boolean verificaChaves(String expressao) {
		int i;
		Pilha_IF p = new Pilha();
		char[] expArray = expressao.toCharArray();
		
		for(i=0;i<expArray.length;i++) {
			if(expArray[i]=='}') {
				if(p.isEmpty()) {
					return false;
				}
				p.pop();
			}
			
			else if(expArray[i]=='{') {
				p.push(1);
			}
		}
		if(p.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

}
