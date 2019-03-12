package solver;

public class IsSafe {
	public boolean safe(int board[][], int k, int row, int col){
	    
	    // check the horizontal row
	    for(int j=0;j<9;j++){
	      if(board[row][j]==k)
	        return false;
	    }
	    
	    // check the verticle
	    for(int i=0;i<9;i++){
	      if(board[i][col]==k)
	        return false;
	    }
	    
	    // check the square
	    int i_limit=row - row % 3;
	    int j_limit=col - col%3;
	    
	    for(int i=i_limit;i<i_limit+3;i++){
	      for(int j=j_limit;j<j_limit+3;j++){
	        if(board[i][j]==k)
	          return false;
	      }
	    }
	    return true;
	  }
}
