/**
 * Created by zamkovoyilya on 25/02/16.
 */
public class ComplexMatrix2x2 {

    private ComplexNumber[][] a = new ComplexNumber[2][2];



    public ComplexMatrix2x2() {
        ComplexNumber h = new ComplexNumber();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = h;
            }
        }

    }

    public ComplexNumber getNumber (int i, int j){
        return a[i][j];
    }

    public ComplexMatrix2x2(int x, int y) {
        ComplexNumber h = new ComplexNumber(x, y);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = h;
            }
        }
    }

    public ComplexMatrix2x2(ComplexNumber[][] g) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = g[i][j];
            }
        }
    }

    public ComplexMatrix2x2 add(ComplexNumber[][] g) {
        ComplexNumber[][] h = new ComplexNumber[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                h[i][j] = a[i][j].add(g[i][j]);
            }
        }
        return new ComplexMatrix2x2(h);
    }

    public ComplexMatrix2x2 mult(ComplexNumber[][] g) {
        ComplexNumber[][] h = new ComplexNumber[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                h[i][j] = a[i][j].mult(g[i][j]);
            }
        }
        return new ComplexMatrix2x2(h);
    }

    public ComplexMatrix2x2 multVector(ComplexNumber g, ComplexNumber h) {
        for (int i = 0; i < 2; i++) {
            a[0][i] = a[0][i].mult(g);
            a[1][i] = a[1][i].mult(h);
        }
        ComplexNumber[][] t = new ComplexNumber[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                t[i][j] = a[i][j];
            }
        }
        return new ComplexMatrix2x2(t);
    }
}
