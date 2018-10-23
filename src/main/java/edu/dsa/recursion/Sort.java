package edu.dsa.recursion;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Sort {
	
	public static void main(String[] args) {
	 int arr[]={1,2,3,4,5,6,7,8,9,12,3,4,4,5,6,6,6,6};
	 int sorted[]=sortAsPerFreq(arr);
	 for (int i : sorted) {
		System.out.print(i+", ");
	}
	}
	
	
	public static int[] sortAsPerFreq(int arr[]){
			 
		Map<Integer,Integer> freeHolderMap= new TreeMap<Integer, Integer>();
		for (int i : arr) {
			if(freeHolderMap.containsKey(i)){
				freeHolderMap.put(i, freeHolderMap.get(i)+1);
			}else{
				freeHolderMap.put(i, 1);
			}
		}
		MyFreqHolder myFreqHolder=new MyFreqHolder(freeHolderMap);
		TreeMap<Integer,Integer> sortedMap= new TreeMap<Integer, Integer>(myFreqHolder);
		sortedMap.putAll(freeHolderMap);
		
		System.out.println(sortedMap);
		int k=0;
		for (Integer i : sortedMap.keySet()) {
			int freq=sortedMap.get(i);
			for (int j = 0; j < freq; j++) {
				arr[k]=i;k++;
			}
		}
		
		return arr;
	}
}
	
	 class MyFreqHolder implements Comparator<Integer>{
		Map <Integer,Integer>  integerRefmap	;

		public MyFreqHolder(Map<Integer, Integer> integerRefmap) {
			super();
			this.integerRefmap = integerRefmap;
		}

		public int compare(Integer o1, Integer o2) {
			//int comp=integerRefmap.get(o1).compareTo(integerRefmap.get(o2));
			int comp=integerRefmap.get(o2)-(integerRefmap.get(o1));
			return comp==0?o1.compareTo(o2):comp;
		}		
			 
		
		
	}


