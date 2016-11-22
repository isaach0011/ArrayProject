package array.controller;

import array.model.Hipster;
import array.view.HipsterFrame;

public class ArrayController
{
	private HipsterFrame appFrame;
	private int [] numbers;
	private String [] words = {"This ","is the ","second hipster","level: ","initialization ","lists"};
	private Hipster [] hipsters;
	
	
	public ArrayController()
	{
		thirdLevelHipster();
		
		
		hipsters = new Hipster [6];
		appFrame = new HipsterFrame(this);
	}
	
	private void thirdLevelHipster()
	{
		numbers = new int [] {0,1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0};
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
	
	public void impactHipsters()
	{
		for(Hipster currentHipster : hipsters)
		{
			currentHipster.calculateHipsterRank();
		}
	}
	
	public String[] getWords()
	{
		return words;
	}
	
	public int[] getNumbers()
	{
		return numbers;                                      
	}
	
	public Hipster[] getHipsters()
	{
		return hipsters;
	}
	
	
	
	
}
