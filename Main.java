public class Main {
	public static void main(String args[])
	{
		double[][] inputs = {{1.0,1.38, 0.201, 1.098}};
		Dense l1 = new Dense(4, 5);
		Dense l2 = new Dense(5, 2);
		
		l1.forward(l1.weights, inputs);
		//l2.forward(l2.weights, l1.output);
		//Test
		for(int i = 0; i < 1; i++)
		{
			for(int j = 0; j < l1.output[0].length; j++)
			{
				System.out.printf("%.2f\t", l1.output[i][j]);
			}
		}
		
		System.out.print("\n");
		for(int i = 0; i < l1.weights.length; i++)
		{
			for(int j = 0; j < l1.weights[0].length; j++)
			{
				System.out.printf("%.2f\t", l1.weights[i][j]);
			}
		}
	}
}
