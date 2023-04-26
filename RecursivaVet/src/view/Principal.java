package view;

import controller.ControllerVet;

public class Principal {

	public static void main(String[] args) {
		ControllerVet ControllerVet= new ControllerVet();
		int [] vt = {79,3,9,5,19};
		int tam = vt.length;
		int Ultmenor=vt[tam -1];
		int menor = ControllerVet.menorvalor(vt, tam,Ultmenor );
		System.out.println("Menor valor do vetor é " + menor);
		
	}

}
