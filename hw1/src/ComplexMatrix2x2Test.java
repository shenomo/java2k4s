import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zamkovoyilya on 25/02/16.
 */
public class ComplexMatrix2x2Test {

    private final double EPS = 1e-9;
    ComplexNumber cn1 = new ComplexNumber(2, 2);
    ComplexNumber cn2 = new ComplexNumber(2, 3);
    ComplexNumber cn3 = new ComplexNumber(3, 2);
    ComplexNumber cn4 = new ComplexNumber(3, 3);
    ComplexNumber[][] cn = new ComplexNumber[][]{
            {cn1, cn2}, {cn3, cn4}
    };


    @Test
    public void testAdd() throws Exception {
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        ComplexMatrix2x2 cmNew = cm.add(cn);
        ComplexNumber c1 = new ComplexNumber(4, 4);
        ComplexNumber c2 = new ComplexNumber(4, 6);
        ComplexNumber c3 = new ComplexNumber(6, 4);
        ComplexNumber c4 = new ComplexNumber(6, 6);
        ComplexNumber[][] c = new ComplexNumber[][]{
                {c1, c2}, {c3, c4}
        };
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(c);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ComplexNumber n1 = cm2.getNumber(i, j);
                ComplexNumber n2 = cmNew.getNumber(i, j);
                double a = n1.getA();
                double a1 = n2.getA();
                assertEquals(a, a1, EPS);
                double b = n1.getB();
                double b1 = n2.getB();
                assertEquals(b, b1, EPS);
            }

        }


    }

    @Test
    public void testMult() throws Exception {
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        ComplexMatrix2x2 cmNew = cm.mult(cn);
        ComplexNumber c1 = new ComplexNumber(4, 4);
        ComplexNumber c2 = new ComplexNumber(4, 9);
        ComplexNumber c3 = new ComplexNumber(9, 4);
        ComplexNumber c4 = new ComplexNumber(9, 9);
        ComplexNumber[][] c = new ComplexNumber[][]{
                {c1, c2}, {c3, c4}
        };
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(c);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ComplexNumber n1 = cm2.getNumber(i, j);
                ComplexNumber n2 = cmNew.getNumber(i, j);
                double a = n1.getA();
                double a1 = n2.getA();
                assertEquals(a, a1, EPS);
                double b = n1.getB();
                double b1 = n2.getB();
                assertEquals(b, b1, EPS);
            }

        }
    }

    @Test
    public void testMultVector() throws Exception {
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        ComplexNumber cv1 = new ComplexNumber(4, 4);
        ComplexNumber cv2 = new ComplexNumber(4, 9);
        ComplexMatrix2x2 cmNew = cm.multVector(cv1, cv2);

        ComplexNumber c1 = new ComplexNumber(8, 8);
        ComplexNumber c2 = new ComplexNumber(8, 27);
        ComplexNumber c3 = new ComplexNumber(12, 8);
        ComplexNumber c4 = new ComplexNumber(12, 27);
        ComplexNumber[][] c = new ComplexNumber[][]{
                {c1, c2}, {c3, c4}
        };
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(c);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ComplexNumber n1 = cm2.getNumber(i, j);
                ComplexNumber n2 = cmNew.getNumber(i, j);
                double a = n1.getA();
                double a1 = n2.getA();
                assertEquals(a, a1, EPS);
                double b = n1.getB();
                double b1 = n2.getB();
                assertEquals(b, b1, EPS);
            }

        }
    }

}