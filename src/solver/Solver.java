package solver;

public class Solver {
	public boolean sudokuSolver(int board[][]){
	      int row=-1;
	      int col=-1;
	      int i=0;
	      int j=0;
	      int flag=0;
	      for(i=0;i<9;i++){
	        for(j=0;j<9;j++){
	          if(board[i][j]==0){
	            flag=1;
	            break;
	          }
	        }
	        if(flag==1)
	            break;
	      }
	      
	      if(flag==0)
	        return true;
	      IsSafe safe=new IsSafe();
	      for(int k=1;k<=9;k++){
	        if(safe.safe(board, k, i, j)){
	            board[i][j]=k;
	            if(sudokuSolver(board)){
	              return true;
	            }
	          else{
	            board[i][j]=0;
	          }
	          }
	      }
	      return false;
	    }	

}
