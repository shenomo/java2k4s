/**
 * Created by zamkovoyilya on 24/02/16.
 */
public class Matrix2x2 {

    private double[][] a = new double[2][2];

    public double[][] get() {
        return a;
    }

    public void out() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

    public Matrix2x2() {
        this(0);
    }

    public Matrix2x2(double g) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = g;
            }
        }
    }

    public Matrix2x2(double g[][]) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = g[i][j];
            }
        }
    }

    public Matrix2x2 add(Matrix2x2 g) {
        double[][] h = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                h[i][j] = a[i][j] + g.get()[i][j];
            }
        }
        return new Matrix2x2(h);
    }

    public void add2(Matrix2x2 g) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] += g.get()[i][j];
            }
        }
    }

    public Matrix2x2 sub(Matrix2x2 g) {
        double[][] h = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                h[i][j] = a[i][j] + (-1) * g.get()[i][j];
            }
        }
        return new Matrix2x2(h);
    }

    public void sub2(Matrix2x2 g) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] += (-1) * g.get()[i][j];
            }
        }
    }


    public Matrix2x2 multNumber(double g) {
        double[][] h = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                h[i][j] = g * a[i][j];
            }
        }
        return new Matrix2x2(h);
    }

    public void multNumber2(double g) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] *= g;
            }
        }
    }


    public Matrix2x2 mult(Matrix2x2 g) {
        double[][] h = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    h[i][j] += a[i][k] * g.get()[k][j];
                }
            }
        }
        return new Matrix2x2(h);
    }

    public void mult2(Matrix2x2 g) {
        double[][] h = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    h[i][j] += a[i][k] * g.get()[k][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = h[i][j];
            }
        }
    }

    public double det() {
        double g = a[1][1] * a[2][2] - a[1][2] * a[2][1];
        return g;
    }

    public void transpon() {
        double g = a[1][2];
        a[1][2] = a[2][1];
        a[2][1] = g;
    }

    public Matrix2x2 inversMatrix() {
        double g = a[1][1] * a[2][2] - a[1][2] * a[2][1];
        double[][] h = new double[2][2];
        if (g != 0) {
            a[1][2] *= (-1);
            a[2][1] *= (-1);
            double q = a[1][1];
            a[1][1] = a[2][2];
            a[2][2] = q;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    h[i][j] = 1 / g * a[i][j];
                }
            }
        }
        return new Matrix2x2(h);
    }

    public Matrix2x2 equivalentDiagonal() {
        double[][] h = new double[2][2];
        double g = a[0][0];
        a[0][0] *= a[1][0];
        a[0][1] *= a[1][0];
        a[1][0] *= g;
        a[1][1] *= g;
        a[1][0] -= a[0][0];
        a[1][1] -= a[0][1];
        double k = a[0][1];
        a[0][0] *= a[1][1];
        a[0][1] *= a[1][1];
        a[1][0] *= k;
        a[1][1] *= k;
        a[0][1] -= a[1][1];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                h[i][j] = a[i][j];
            }
        }

        return new Matrix2x2(h);
    }

    public String multVector(double g, double h) {
        g *= a[0][0] * a[0][1];
        h *= a[1][0] * a[1][1];
        String q = "(" + g + ";" + h + ")";
        return q;
    }
}
