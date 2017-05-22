

public class No_of_paths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [][]fd;
		Robot_movement rm=new Robot_movement();
		fd=rm.field();
		rm.moveRobot(0,0,fd);
		System.out.println(" No of ways= "+rm.numPaths);
	}

}
