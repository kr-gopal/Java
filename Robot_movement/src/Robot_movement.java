
public class Robot_movement {
	int numPaths;
	int[][] field;
	int row=4;
	int coloumn=4;
	int[][] field()
	{
		field=new int[row][coloumn];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < coloumn; j++)
				field[i][j] = 0;
		field[0][0] = 1;
		return field;
	}
	void moveRobot(int row, int column, int[][] field)
	{
	    moveRobotUp(row, column, field);
	    moveRobotDown(row, column, field);
	    moveRobotLeft(row, column, field);
	    moveRobotRight(row, column, field);
	}
	void moveRobotUp(int row, int column, int[][] field)
	{
	    if (row == 0) return;
	    else 
	    {
	        if (field[row-1][column] == 1) return;
	        field[row-1][column] = 1;
	        moveRobot(row-1, column, field);
	        field[row-1][column] = 0;
	    }
	}

	void moveRobotDown(int row, int column, int[][] field)
	{
	    if (row == 3 && column == 3) 
	    {
	        numPaths++;
	        return;
	    }
	    else if (row == 3) return;
	    else
	    {
	        if (field[row+1][column] == 1) return;
	        field[row+1][column] = 1;
	        moveRobot(row+1, column, field);
	        field[row+1][column] = 0;
	    }
	}

	void moveRobotLeft(int row, int column, int[][] field)
	{
	    if (column == 0) return;
	    else
	    {
	        if (field[row][column-1] == 1) return;
	        field[row][column-1] = 1;
	        moveRobot(row, column-1, field);
	        field[row][column-1] = 0;
	    }
	}

	void moveRobotRight(int row, int column, int[][] field)
	{
	    if (column == 3 && row == 3) 
	    {
	        numPaths++;
	        return;
	    }
	    else if (column == 3) return;
	    else 
	    {
	        if (field[row][column+1] == 1) return;
	        field[row][column+1] = 1;
	        moveRobot(row, column+1, field);
	        field[row][column+1] = 0;
	    }
	}
	
}
