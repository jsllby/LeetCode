package LeetCode_001_099;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_036_Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        int size = board.length;
        Set[] row = new Set[size], column = new Set[size], block = new Set[size];
        for(int i=0;i<size;i++){
            row[i] = new HashSet();
            column[i] = new HashSet();
            block[i] = new HashSet();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != '.') {
                    if(row[i].add(board[i][j])==false)  return false;
                    if(column[j].add(board[i][j])==false)   return false;
                    if(block[i/3*3+j/3].add(board[i][j])==false)    return false;
                }
            }
        }
        return true;


//        int size = board.length;
//        for (int i = 0; i < size; i++) {
//            boolean[] map = new boolean[size];
//            for (int j = 0; j < size; j++) {
//                if (board[i][j] != '.') {
//                    int index = board[i][j] - '1';
//                    if (map[index] == true) return false;
//                    else map[index] = false;
//                }
//            }
//        }
//
//        for (int j = 0; j < size; j++) {
//            boolean[] map = new boolean[size];
//            for (int i = 0; i < size; i++) {
//                if(board[i][j]!='.'){
//                    int index = board[i][j] - '1';
//                    if (map[index] == true) return false;
//                    else map[index] = false;
//                }
//            }
//        }
//
//        for (int i = 0; i <size; i += 3) {
//            for (int j = 0; j < size; j += 3) {
//                boolean[] map = new boolean[size];
//                for (int x = 0; x < 3; x++) {
//                    for (int y = 0; y < 3; y++) {
//                        int index = board[i+x][j+y] - '1';
//                        if (map[index] == true) return false;
//                        else map[index] = false;
//                    }
//                }
//            }
//        }
//        return true;
    }
}
