
public class Dense {
	double[][] weights, biases, output;
	
	Dense(int inputs, int neurons)
	{
		weights = new double[inputs][neurons];
		biases = new double[1][neurons];
		
		for(int i = 0; i  < inputs; i++)
		{
			for(int j = 0; j < neurons; j++)
			{
				weights[i][j] = -(double)(0.1 * Math.random());
			}
		}
		
		for(int i = 0; i  < 1; i++)
		{
			for(int j = 0; j < neurons; j++)
			{
				biases[i][j] = 0;
			}
		}
	}
	
	public void forward(double[][] inputs, double[][] weights)
	{
		double[][] o = new double[inputs.length][weights[0].length];
		for(int i = 0; i < inputs.length; i++)
		{
			for(int j = 0; j < weights[0].length; j++)
			{
				o[i][j] = 0;
				for(int k = 0; k < weights.length; k++)
				{
					o[i][j] += weights[k][j] * inputs[i][k];
				}
			}
		}
		
		for(int i = 0; i < 1; i++)
		{
			for(int j = 0; j < o[0].length; j++)
			{
				o[i][j] = o[i][j] + biases[i][j];
			}
		}
		output = o;
	}
}
