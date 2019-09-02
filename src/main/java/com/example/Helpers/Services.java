package com.example.Helpers;

import java.util.ArrayList;
import java.util.Arrays;

public class Services {
	
	public String[] task1(String[] array1, String[] array2) {
		return  Arrays.asList(array1)
		.stream()
		.filter(x -> Arrays.asList(array2).contains(x))
		.toArray(String[]::new);
	}
	
	public Double task2() { 
		Double resp = 0D;
	
		for(int k=1; k <= Math.pow(10, 6); k++) {
			resp += formulaBase(k);
		}
		
		return resp*4;
	}
	
	private double formulaBase(int k) {
		return (Math.pow((-1),(k+1))) / ((2*k)-1);
	}
	
	public Object[] task4(Object[] array1, Object[] array2) {
		ArrayList<Object> resp = new ArrayList<>();
		
		for(int i = 0; i < (array1.length >= array2.length ? array1.length : array2.length); i++) {
			if(array1[i] != null) resp.add(array1[i]);
			if(array2[i] != null) resp.add(array2[i]);
		}
		
		return resp.toArray();
	}

	public Integer[][] task5(Integer[][] matrix) {		
		ArrayList<Integer> columns = new ArrayList<>();
		
		for(Integer[] row : matrix) {
			if(Arrays.asList(row).contains(0)) {
				for(int i = 0; i < row.length; i++) {
					if(row[i] == 0) columns.add(i);  
					row[i] = 0;
				}
			}	
		}
		
		System.out.println("columns :" + columns.toString());
		
		int cont = 0;
		for(Integer[] row : matrix){
			for(Integer j = 0; j < columns.size(); j++){
				if(row.length >= columns.get(j)) {
					matrix[cont][columns.get(j)] = 0;
				}
			}
			cont += 1;
		}

	    return matrix;
	
	}
	
	public int task6(int num1, int num2) 
    { 
        while (num2 != 0)  
        { 
            int bits = num1 & num2; 
            num1 = num1 ^ num2; 
            num2 = bits << 1; 
        } 
        
        return num1; 
    } 

}
