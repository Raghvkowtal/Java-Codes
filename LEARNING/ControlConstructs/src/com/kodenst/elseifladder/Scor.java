package com.kodenst.elseifladder;

public class Scor {
	void score(int scor) {
		if(scor>=590 )
		{
			System.out.println("Grade A+");
		}
		else if(scor>=570 && scor<590)
		{
			System.out.println("Grade A");
		}
		else if(scor>=550 && scor<570)
		{
			System.out.println("Grade B");
		}
		else if(scor>=530 && scor<550)
		{
			System.out.println("Grade C");
		}
		else if(scor>=510 && scor<530)
		{
			System.out.println("Grade D");
		}
		else 
		{
			System.out.println("Fail aadi hattar hogo ning");
		}
	}
}