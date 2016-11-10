package array.controller;

import array.model.Hipster;
//import array.view.HipsterFrame;

public class ArrayController
{
	//private HipsterFrame appFrame;
	private int [] numbers;
	private String [] words = {"This ","is the ","second hipster","level: ","initialization ","lists"};
	private Hipster [] hipsters;
	
	
	public ArrayController()
	{
		numbers = new int [20];

		hipsters = new Hipster [6];
	}
	
	public void start()
	{
		
		for(int index = 0; index < hipsters.length; index++)
		{
			hipsters[index] = new Hipster("Hipster # " + index);
		}
		
		
		for(Hipster currentHipster : hipsters)
		{
			System.out.print(currentHipster + ", ");
		}
		System.out.println("Next");
		for(String currentWords : words)
		{
			System.out.print(currentWords + ", ");
		}
		System.out.println("Next");
		for(int tempInt : numbers)
		{
			System.out.print(tempInt + ", ");
		}
	}
}
