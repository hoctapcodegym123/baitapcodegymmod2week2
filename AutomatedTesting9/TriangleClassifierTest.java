package AutomatedTesting9;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    @DisplayName("Testing tam giac deu")
    public void testTriangledeu() {
        int a = 2;
        int b = 2;
        int c = 2;
        int expected = 0;

        int result = TriangleClassifier.Triangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing tam giac can")
    public void testTrianglecan() {
        int a = 2;
        int b = 2;
        int c = 3;
        int expected = 0;

        int result = TriangleClassifier.Trianglecan(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing tam giac thuong")
    public void testTrianglethuong() {
        int a = 3;
        int b = 4;
        int c = 5;
        int expected = 0;

        int result = TriangleClassifier.Trianglethuong(a,b,c);
        assertEquals(expected,result);
    }
}
