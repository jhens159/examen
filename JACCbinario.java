/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jacc.examen;

import java.util.Arrays;

public class JACCbinario {
    public static void main(String[] args) {
        int[] array = { 2, 7, 25, 57, 8, 5, 72, 17, 60, 48, 97 };
		Arrays.sort(array);
 
		System.out.println(Arrays.toString(array));
		System.out.println(busca(array, 8));
		System.out.println(busca(array, 17));
		System.out.println(busca(array, 97));
	}

	private static int busca(int[] array, int chave) {
		return buscaBinarioRecursiva(array, 0, array.length - 1, chave);
	}

	private static int buscaBinarioRecursiva(int[] array, int menor, int mayor,
			int chave) {
		int media = (mayor + menor) / 2;
		int valorMedio = array[media];

		if (menor > mayor)
			return -1;
		else if(valorMedio == chave) 
			return media;
		else if (valorMedio < chave)
			return buscaBinarioRecursiva(array, media+1, mayor, chave);
		else
			return buscaBinarioRecursiva(array, menor, media-1, chave);
	}
    
}
