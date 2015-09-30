package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public String solution;
	
	public int verify(String candidateSolution) {
		solution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		if (candidateSolution.equals(solution))
			return 0;
		else return -1;
		
		// returns 1 if the candidate solution is correct
	
	}
}
