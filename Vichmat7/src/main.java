

public class main extends Эйлер{

    static double y(double x, double y){
        return x*x+0.7*y;
    }
    static double K = 2.4;
    static double L = 1.4;
    static double h = 0.5;

    public static void main(String[] args) {
        double[] x = new double [5];
        double[] y = new double [5];
        y[0]=1.4;
        x[0]=0;
        for (int i=0;i<x.length-1;i++)
            x[i+1]=x[i]+h;


    }

}
