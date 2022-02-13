public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    static String model ="ax2+bx+c=0";

    public QuadraticEquation(){}
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void setConst(double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double[] getConst(){
        double[] getter = new double[3];
        getter[0]=this.a;
        getter[1]=this.b;
        getter[2]=this.c;
        return getter;
    }
    public double getDiscriminant(){
        double delta = this.b*this.b - 4*this.a*this.c;
        return delta;
    }
    public double getRoot1(){
        double root1 = (-this.b+Math.sqrt(this.getDiscriminant()))/(2*this.a);
        return root1;
    }
    public double getRoot2(){
        double root2 = (-this.b-Math.sqrt(this.getDiscriminant()))/(2*this.a);
        return root2;
    }
}
