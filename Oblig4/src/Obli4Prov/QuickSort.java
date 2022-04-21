package Obli4Prov;
	
public class QuickSort {

	    public static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {
	    	if (min < max) {
	        int partisjon = finnPartisjon(data, min, max);
	        quickSort(data, min, partisjon - 1);
	        quickSort(data, partisjon + 1, max);
	    	}
	    }

	    public static <T extends Comparable<T>> void quickSort(T[] data) { 
	        quickSort(data, 0, data.length-1); 
	    }
		
	}

