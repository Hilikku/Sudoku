package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public static String solution;
	
	public static int verify(String candidateSolution) {
		solution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		if (candidateSolution.equals(solution))
			return 0;
		
		else return 1;
		
		// returns 1 if the candidate solution is correct
	
	}
	
	
	public static int positive(String candidateSolution){
		for(int i=0; i < candidateSolution.length(); i++){
			if(candidateSolution.charAt(i)<49 || candidateSolution.charAt(i) >57){
				return -1;
			}
		}
		return 0;
	}
}
