package _01_Custom_ArrayList;

import java.awt.List;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] array;
	
	public ArrayList() {
		array = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return array[loc];
	}
	
	public void add(T val) {
		T[] newArray = (T[]) new Object[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		newArray[array.length] = val;
		array = newArray;
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newArray = (T[]) new Object[array.length + 1];
		for (int i = 0; i < loc; i++) {
			newArray[i] = array[i];
		}
		newArray[loc] = val;
		for (int i = loc; i < array.length; i++) {
			newArray[i + 1] = array[i];
		}
		array = newArray;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] newArray = (T[]) new Object[array.length - 1];
		for (int i = 0; i < loc; i++) {
			newArray[i] = array[i];
		}
		for (int i = loc; i < newArray.length; i++) {
			newArray[i] = array[i + 1];
		}
		array = newArray;
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == val) {
				return true;
			}
		}
		return false;
	}
	
	public int size() throws IndexOutOfBoundsException {
		return array.length;
	}
}