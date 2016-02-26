import org.junit.Assert;
import org.omg.CORBA.MARSHAL;

import java.util.regex.Matcher;

import static org.junit.Assert.*;

/**
 * Created by zamkovoyilya on 24/02/16.
 */
public class Matrix2x2Test {

    Matrix2x2 a = new Matrix2x2();
    private final double EPS = 1e-9;


    @org.junit.Test
    public void testGet() throws Exception {
        assertEquals(2, a.get().length, EPS);
    }

    @org.junit.Test
    public void testOut() throws Exception {

    }

    @org.junit.Test
    public void testAdd() throws Exception {
        Matrix2x2 first = new Matrix2x2(new double[][]{
                {5, 6},
                {7, 8}
        });
        Matrix2x2 second = new Matrix2x2(new double[][] {
                {1, 2},
                {3, 4}
        });
        Matrix2x2 b = first.add(second);
        double[][] b1 = new double[][]{
                {6,8}, {10,12}
        };
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                assertEquals(b.get()[i][j], b1[i][j], EPS);
            }
        }
    }

    @org.junit.Test
    public void testAdd2() throws Exception {
        Matrix2x2 first = new Matrix2x2(new double[][]{
                {5, 6},
                {7, 8}
        });
        Matrix2x2 second = new Matrix2x2(new double[][] {
                {1, 2},
                {3, 4}
        });
        first.add2(second);
        double[][] b1 = new double[][]{
                {6,8}, {10,12}
        };
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                assertEquals(b1[i][j],first.get()[i][j], EPS);
            }
        }
    }

    @org.junit.Test
    public void testSub() throws Exception {
        Matrix2x2 first = new Matrix2x2(new double[][]{
                {5, 6},
                {7, 8}
        });
        Matrix2x2 second = new Matrix2x2(new double[][] {
                {1, 2},
                {3, 4}
        });
        Matrix2x2 b = first.sub(second);
        double[][] h2 = new double[][]{
                {6,8}, {10,12}
        };
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                assertEquals(b.get()[i][j], h2[i][j], EPS);
            }
        }
    }

    @org.junit.Test
    public void testSub2() throws Exception {
        Matrix2x2 first = new Matrix2x2(new double[][]{
                {5, 6},
                {7, 8}
        });
        Matrix2x2 second = new Matrix2x2(new double[][] {
                {1, 2},
                {3, 4}
        });
        first.sub2(second);
        double[][] h2 = new double[][]{
                {6,8}, {10,12}
        };
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                assertEquals(h2[i][j],first.get()[i][j], EPS);
            }
        }
    }

    @org.junit.Test
    public void testMultNumber() throws Exception {
        Matrix2x2 first = new Matrix2x2(new double[][]{
                {5, 6},
                {7, 8}
        });
        Matrix2x2 b = first.multNumber(2);
        double[][] h2 = new double[][]{
                {10,12}, {14,16}
        };
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                assertEquals(b.get()[i][j], h2[i][j], EPS);
            }
        }
    }

    @org.junit.Test
    public void testMultNumber2() throws Exception {
        Matrix2x2 first = new Matrix2x2(new double[][]{
                {5, 6},
                {7, 8}
        });
        first.multNumber2(2);
        double[][] h2 = new double[][]{
                {10,12}, {14,16}
        };
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                assertEquals(h2[i][j], first.get()[i][j], EPS);
            }
        }
    }

    @org.junit.Test
    public void testMult() throws Exception {
        Matrix2x2 first = new Matrix2x2(new double[][]{
                {5, 6},
                {7, 8}
        });
        Matrix2x2 second = new Matrix2x2(new double[][] {
                {1, 2},
                {3, 4}
        });
        Matrix2x2 b = first.mult(second);
        double[][] h2 = new double[][]{
                {5,12}, {21,32}
        };
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                assertEquals(b.get()[i][j], h2[i][j], EPS);
            }
        }
    }

    @org.junit.Test
    public void testMult2() throws Exception {
        Matrix2x2 first = new Matrix2x2(new double[][]{
                {5, 6},
                {7, 8}
        });
        Matrix2x2 second = new Matrix2x2(new double[][] {
                {1, 2},
                {3, 4}
        });
        first.mult2(second);
        double[][] h2 = new double[][]{
                {5,12}, {21,32}
        };
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                assertEquals(h2[i][j],first.get()[i][j], EPS);
            }
        }
    }

    @org.junit.Test
    public void testDet() throws Exception {
        Matrix2x2 first = new Matrix2x2(new double[][]{
                {5, 6},
                {7, 8}
        });
        double g = first.det();
        double g1 = -14;
        assertEquals(g1, g, EPS);
    }

    @org.junit.Test
    public void testTranspon() throws Exception {
        Matrix2x2 first = new Matrix2x2(new double[][]{
                {5, 6},
                {7, 8}
        });
        first.transpon();
        double[][] h2 = new double[][]{
                {5,7}, {6,8}
        };
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                assertEquals(h2[i][j],first.get()[i][j], EPS);
            }
        }
    }

    @org.junit.Test
    public void testInversMatrix() throws Exception {
        Matrix2x2 first = new Matrix2x2(new double[][]{
                {5, 6},
                {7, 8}
        });
        Matrix2x2 b = first.inversMatrix();
        double[][] h2 = new double[][]{
                {5,7}, {6,8}
        };
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                h2[i][j] = 1/(-14)*h2[i][j];
            }
        }
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                assertEquals(b.get()[i][j], h2[i][j], EPS);
            }
        }
    }

    @org.junit.Test
    public void testEquivalentDiagonal() throws Exception {
        Matrix2x2 first = new Matrix2x2(new double[][]{
                {5, 6},
                {7, 8}
        });
        Matrix2x2 b = first.equivalentDiagonal();
        double[][] h2 = new double[][]{
                {-490, 1512}, {0,-756}
        };
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                assertEquals(b.get()[i][j], h2[i][j], EPS);
            }
        }
    }

    @org.junit.Test
    public void testMultVector() throws Exception {
        Matrix2x2 first = new Matrix2x2(new double[][]{
                {5, 6},
                {7, 8}
        });
        String result = first.multVector(5, 5);
        String q = "(" + 150.0 + ";" + 280.0 + ")";
        assertEquals(q, result);
    }
}