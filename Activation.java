public class Activation {
private double[][] outReLU, outSoftMax;

    public double[][] getReLU()
    {
        double[][] gOut = outReLU;
        return gOut;
    }

    public double[][] getSoftMax()
    {
        double[][] gOut = outSoftMax;
        return gOut;
    }

    public void relu(double[][] in)
    {
        for(int i = 0; i < in.length; i++)
        {
            for(int j = 0; j < in[0].length; j++)
            {
                if(in[i][j] < 0)
                {
                    in[i][j] = 0;
                }
            }
        }
        this.outReLU = in;
    }

    public void softmax(double[][] in)
    {
        double sum = 0;
        for(int i = 0; i < in.length; i++)
        {
            for(int j = 0; j < in[0].length; j++)
            {
                sum = sum + in[i][j];
            }
        }
        
        for(int i = 0; i < in.length; i++)
        {
            for(int j = 0; j < in[0].length; j++)
            {
                in[i][j] =              1 /
                            1 + Math.pow(Math.E, in[i][j]);
            }
        }
        this.outSoftMax = in;
    }
}
