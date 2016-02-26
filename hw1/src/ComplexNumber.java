/**
 * Created by zamkovoyilya on 25/02/16.
 */
public class ComplexNumber {

    private double a;
    private double b;

    public ComplexNumber() {
        this(0, 0);
    }

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    public ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(a + c.getA(), b + c.getB());
    }

    public void add2(ComplexNumber c) {
        a += c.getA();
        b += c.getB();
    }

    public ComplexNumber sub(ComplexNumber c) {
        return new ComplexNumber(a - c.getA(), b - c.getB());
    }

    public void sub2(ComplexNumber c) {
        a -= c.getA();
        b -= c.getB();
    }

    public ComplexNumber mult(ComplexNumber c) {
        return new ComplexNumber(a * c.getA(), a * c.getB() + b * c.getA() - b * c.getB());
    }

    public void mult2(ComplexNumber c) {
        b = a * c.getB() + b * c.getA() - b * c.getB();
        a *= c.getA();
    }

    public ComplexNumber div(ComplexNumber c) {
        return new ComplexNumber((a * c.getA() - b * c.getA()) / (c.getA() * c.getA() - c.getB() * c.getB()), (c.getA() * b - a * c.getB()) / (c.getA() * c.getA() - c.getB() * c.getB()));
    }

    public void div2(ComplexNumber c) {
        double h = a;
        a = (a * c.getA() - b * c.getA()) / (c.getA() * c.getA() - c.getB() * c.getB());
        b = (c.getA() * b - h * c.getB()) / (c.getA() * c.getA() - c.getB() * c.getB());
    }

    public double length() {
        return Math.sqrt(a * a + b * b);
    }

    public String toString() {
        String g = "";
        if (a >= 0 && b >= 0) {
            g = a + "+" + b + "*" + "i";
        }
        if (a >= 0 && b < 0) {
            g = a + "-" + b + "*" + "i";
        }
        if (a < 0 && b >= 0) {
            g = b + "*" + "i" + "-" + a;
        }
        if (a < 0 && b < 0) {
            g = "(" + "-" + a + ")" + "-" + b + "*" + "i";
        }
        return g;
    }

    public double arg() {
        double x = a / Math.sqrt(a * a + b * b);
        double y = b / Math.sqrt(a * a + b * b);
        double z = 0;
        x = Math.cos(x);
        y = Math.sin(y);
        if (x > 0 && y > 0) {
            z = Math.atan(b / a);//sin=y,cos=x;
        }
        if (x > 0 && y < 0) {
            z = Math.atan(b / a);
        }
        if (y > 0 && x < 0) {
            z = Math.PI + Math.atan(b / a);
        }
        if (y < 0 && x < 0) {
            z = Math.atan(b / a) - Math.PI;
        }
        return z;
    }

    public boolean equals(ComplexNumber c) {
        boolean f = true;
        if (a == c.getA() && b == c.getB()) {
            f = true;
        } else {
            f = false;
        }
        return f;
    }


}
