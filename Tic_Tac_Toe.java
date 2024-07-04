import java.util.Random;
import java.util.Scanner;
public class Tic_Tac_Toe {
    // size is 3
    private static final int SIZE=3;
    private static  final char player1='x';
    private static final char player2='o';


    private char[][] board;
    private char player_turn;

    public Tic_Tac_Toe(){
        initializeBoard();
        player_turn=player1;
    }



    //initialize board with empty spaces
    private void initializeBoard(){
        board= new char[SIZE][SIZE];
        // Random ran = new Random();
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                board[i][j]='_';
            }
        }
    }

    private void printBoard(){
        for(int row=0;row<SIZE;row++){
            for(int col=0;col<SIZE;col++){
                    System.out.print(board[row][col]+" ");
            }
            System.out.println();
        }
    }

    private void makeMove(){
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        while(true){
            int row;
            int col;
            while(true){
                System.out.println("please enter your row");
                row =scan.nextInt();
                if(row>SIZE){
                    System.out.println("your row index is out of board, please re-enter ");
                }else{
                    break;
                }
            }

            while(true){
                System.out.println("please enter your col");
                col=scan.nextInt();
                if(col>SIZE){
                    System.out.println("your col index is out of board, please re-enter ");
                }else{
                    break;
                }
            }

            if(board[row][col]=='_'){
                board[row][col]=player_turn;
                if(player_turn==player1){
                    player_turn=player2;
                }else{
                    player_turn=player1;
                }
                break;
            }  

        } 
    }

    public static void main(String[] args) {
        Tic_Tac_Toe ttt = new Tic_Tac_Toe();
        ttt.makeMove();

    }

}
