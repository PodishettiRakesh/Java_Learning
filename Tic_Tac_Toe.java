import java.util.Random;
public class Tic_Tac_Toe {
    // size is 3
    private static final int SIZE=3;
    private static  final char player1='x';
    private static final char player2='o';

    private char[][] board;

    public Tic_Tac_Toe(){
        initializeBoard();
    }

    private void initializeBoard(){
        board= new char[SIZE][SIZE];
        // Random ran = new Random();
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                board[i][j]='_';
            }
        }
        
    }

    public static void main(String[] args) {
        Tic_Tac_Toe ttt = new Tic_Tac_Toe();
        System.out.println(ttt.board);
    }
}
