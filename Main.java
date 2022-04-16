public class Main
{
		public static void main(String[] args)
		{
			Dense l1 = new Dense(2, 6);
			Dense l2 = new Dense(6, 2);
			Activation a1 = new Activation();
			Activation a2 = new Activation();

			double[][] inputs = {{1, 0}};

			l1.forward(inputs);
			a1.relu(l1.output);
			l2.forward(a1.getReLU());
			a2.softmax(l2.output);

			for(double[] ii : a2.getSoftMax())
			{
				for(double i : ii)
				{
					System.out.println(i);
				}
			}
		}
}