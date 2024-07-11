package ValidSudoku;

import java.util.HashSet;

public class ValidSudoku {

    public static void main(String[] args){

        char[][] board1 = {
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','8','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        char[][] board2 = {
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','1','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board1)); // => true
        System.out.println(isValidSudoku(board2)); // => false
    }

    public static boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                Character currentChar = board[i][j];
                if(currentChar != '.'){
                    if(!seen.add(currentChar + " found in row " + i) ||
                    !seen.add(currentChar + " found in column " + j) ||
                    !seen.add(currentChar + " found in box " + i/3 + "-" + j/3)){
                        return false;
                    }
                    seen.add(currentChar + " found in row " + i);
                    seen.add(currentChar + " found in column " + j);
                    seen.add(currentChar + " found in box " + i/3 + "-" + j/3);
                }
            }
        }

        return true;
    }
}
