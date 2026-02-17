package com.dsa.ch02;

public class OrdArray {
	
	private long[] a;
	private int nElems;
	
	public OrdArray(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public int size() {
		return nElems;
	}
	
	public int find(long searchKey) {
		
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn = 0;
		
		while(true) {
			curIn = (lowerBound + upperBound) / 2;
			
			if (a[curIn] == searchKey)
				return curIn; // Элемент найден
			else if (lowerBound > upperBound)
				return nElems; // Элемент не найден
			else {
				if (a[curIn] > searchKey)
					lowerBound = curIn + 1; // В верхней половине
				else
					upperBound = curIn - 1; // В нижней половине
			}
		}
	}
	
	public void insert(long value) {
		
		int j;
		
		for (j = 0; j < nElems; j++) // Определение позиции вставки
			if (a[j] < value)        // (Линейный поиск)
				break;
		
		for (int k = nElems; k > j; k--) { // Перемещение последующих элементов
			a[k] = a[k-1];
		}
		
		a[j] = value;                       // Вставка
		nElems++;                           // Увеличение размера
	}
	
	public boolean delete(long value) {
		
		int j = find(value);
		
		if(j == nElems) // Найти не удалось
			return false;
		else { // Элемент найден
			for(int k = j; k < nElems; k++) { // Перемещение последующих элементов
				a[k] = a[k+1];
			}
			
			nElems--; // Уменьшение размера
			return true;
		}
	}
	
	public void display() { // Вывод содержимого массива
		
		for (int j = 0; j < nElems; j++) { // Перебор всеъ элементов
			System.out.print(a[j] + " "); // Вывод текущего элемента
		}
		System.out.println();
	}
}
