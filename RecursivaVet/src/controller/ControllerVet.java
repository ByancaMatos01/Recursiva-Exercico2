package controller;

public class ControllerVet {
	public int menorvalor(int []vt, int tam, int Ultmenor) {
		//tamanho igual � 1 , volta vetor de posi��o 0
		if (tam ==1) {
			return vt[0];
		}else if (vt[tam -1]< vt[tam-2]) {//verifica se e menor a ultima posi��o
			Ultmenor= vt[tam-1];
		}// aqui � a recursiva chamo o antecessor 
		int menor =menorvalor(vt,tam-1,Ultmenor);
		if (Ultmenor<menor) {// verifico se o ultimo menor  e antecessor menor
			return Ultmenor;
			}else {
				return menor;
			}
	}
}
