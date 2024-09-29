public class SquareRootApproximation {
    public int mySqrt(int x) {
        if (x < 2) { return x;}

        Double y = x/2.0;
        Double yn = 0.5*(y+x/y);

        while(Math.abs(yn-y) > 0.01){
            y = yn;
            yn = 0.5*(y+x/y);
            System.out.println(y + " " + yn);
        }
        return yn.intValue();
    }
}
