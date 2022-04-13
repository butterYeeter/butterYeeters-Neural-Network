public class Main {
	public static void main(String args[])
	{
		double[][] inputs = {{2, 4, 5, 1}};
		Dense l1 = new Dense(4, 2);
		//Dense l2 = new Dense(5, 2);
		
		l1.forward(inputs, l1.weights);
		Activation a1 = new Activation();
		a1.softmax(l1.output);
		double[][] jb = a1.getSoftMax();
		for(int i = 0; i < jb.length; i++)
		{
			for(int j = 0; j < jb[0].length; j++)
			{
				System.out.printf("%.2f\t", jb[i][j]);
			}
		}
		//l2.forward(l2.weights, l1.output);
		//Test
		for(int i = 0; i < 1; i++)
		{
			for(int j = 0; j < l1.output[0].length; j++)
			{
				System.out.printf("%.1f\t", l1.output[i][j]);
			}
		}
		
		System.out.print("\n");
		for(int i = 0; i < l1.weights.length; i++)
		{
			for(int j = 0; j < l1.weights[0].length; j++)
			{
				System.out.printf("%.1f\t", l1.weights[i][j]);
			}
		}
	}
}
