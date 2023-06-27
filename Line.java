package Test01;

public class Line {
    private int k;
    private int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getK() {
        return k;
    }

    public int getB() {
        return b;
    }

   //System.out.println("result is " + line1.intersection(line2));
    public Point intersection(Line other) {
        int x, x1, y1, y2;
        int k2 = other.k;
        int b2 = other.b;
        int k1 = getK();//line1
        int b1 = getB();//line1
        if (k1 == k2) return null;
        x1 = k1 - k2;
        x = (b2 - b1) / x1;
        y1 = k1 * x + b1;
        y2 = k2 * x + b2;
        if (y1 == y2) {
            Point result = new Point(x, y1);
            return result;
        } else return null;
    }

}
