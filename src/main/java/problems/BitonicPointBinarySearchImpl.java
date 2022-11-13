package problems;

public class BitonicPointBinarySearchImpl<T extends Comparable<T>> implements BitonicPointBinarySearch<T>{

    @Override
    public T bitonicPoint(T[] array) {
    	if (array == null || this.containsNull(array, 0, array.length - 1)) return null;
    	if (array.length == 1) return array[0];
    	
    	return search(array, 0, array.length - 1);
    }
    
    /**
     * Implementação da busca do Bitonic Point com busca binária
     * 
     * @param array O array no qual o elemento será buscado
     * @param leftIndex O index que limita o array à esquerda
     * @param rightIndex O index que limita o array à direita 
     * 
     * @return T O ponto binônico
     * */
    private T search(T[] array, int leftIndex, int rightIndex){
    	if (leftIndex <= rightIndex) {
    		int middle = (leftIndex + rightIndex) / 2;
    		
    		// Verificação se o elemento que está no middle é o bitonic point
    		if (
    			(middle == rightIndex && array[middle].compareTo(array[middle - 1]) > 0) // caso de borda: leftIndex
    			|| (middle == leftIndex && array[middle].compareTo(array[middle + 1]) > 0) // caso de borda: rightIndex
    			|| (array[middle].compareTo(array[middle + 1]) > 0 && array[middle].compareTo(array[middle - 1]) > 0)
    			)
    		{
    			return array[middle];
    		}
    		else if(array[middle].compareTo(array[middle + 1]) > 0) return search(array, leftIndex, middle - 1);
    		else if(array[middle].compareTo(array[middle + 1]) < 0) return search(array, middle + 1, rightIndex);    		
    	}
    	
    	return null;
    }
    
    /**
     * Método que verifica se um array contém algum elemento nulo
     * 
     * @param array O array no qual ocorrerá a verificação
     * @param leftIndex O index que limita o array à esquerda
     * @param rightIndex O index que limita o array à direita
     * 
     * @return true/false indicando se o array contém algum elemento nulo
     * */
    private boolean containsNull(T[] array, int leftIndex, int rightIndex) {
    	for(int i = 0; i < array.length; i++) {
    		if (array[i] == null) return true;
    	}
    	
    	return false;
    }
    
}