package com.bridgelabz.programs;
import java.util.*;

public class NodeCreation<T>{
	T data;
	NodeCreation next;
	//Assigning the data value
	public void setData(T value){
		data = value;
	}
	//getting data value
	public T getData(){
		return data;
	}
	//Assigning next node
	public void setNext(NodeCreation node){
		next = node;
	}
	//getting next node
	public NodeCreation getNext(){
		return next;
	}
}
