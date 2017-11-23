package number.theory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import number.theory.NumberTheoryUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberTheoryUtilTest {

    public NumberTheoryUtilTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of divisors method, of class NumberTheoryUtil.
     */
    @Test
    public void testDivisors() {
        System.out.println("divisors");
        long number = -12L;
        ArrayList<Long> expResult = new ArrayList<>();
        expResult.add(1L);
        expResult.add(2L);
        expResult.add(3L);
        expResult.add(4L);
        expResult.add(6L);
        expResult.add(12L);
        expResult.add(-1L);
        expResult.add(-2L);
        expResult.add(-3L);
        expResult.add(-4L);
        expResult.add(-6L);
        expResult.add(-12L);
        ArrayList<Long> result = NumberTheoryUtil.divisors(number);
        assertEquals(expResult, result);

        System.out.println("divisors");
        number = -1L;
        expResult = new ArrayList<>();
        expResult.add(1L);
        expResult.add(-1L);
        result = NumberTheoryUtil.divisors(number);
        assertEquals(expResult, result);

        System.out.println("divisors");
        number = 1L;
        expResult = new ArrayList<>();
        expResult.add(1L);
        result = NumberTheoryUtil.divisors(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPrime method, of class NumberTheoryUtil.
     */
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        long number = 200000000L;
        boolean expResult = false;
        boolean result = NumberTheoryUtil.isPrime(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of gcd method, of class NumberTheoryUtil.
     */
    @Test
    public void testGcd_long_long() {
        System.out.println("gcd");
        long a = 1000L;
        long b = -7L;
        long expResult = 1L;
        long result = NumberTheoryUtil.gcd(a, b);
        assertEquals(expResult, result);

    }

    /**
     * Test of lcm method, of class NumberTheoryUtil.
     */
    @Test
    public void testLcm() {
        System.out.println("lcm");
        long a = 1000L;
        long b = -7L;
        long expResult = 7000L;
        long result = NumberTheoryUtil.lcm(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of UniqueRepresntation method, of class NumberTheoryUtil.
     */
    @Test
    public void testUniqueRepresntation() {
        System.out.println("UniqueRepresntation");
        long a = 1000L;
        long b = -7L;
        long[] expResult = {1000, -142, -7, 6};
        long[] result = NumberTheoryUtil.UniqueRepresntation(a, b);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of remainder method, of class NumberTheoryUtil.
     */
    @Test
    public void testRemainder() {
        System.out.println("remainder");
        long[] line = {1000, -143, -7, 1};
        long[] expResult = {1, 1000, 143, -7};
        long[] result = NumberTheoryUtil.remainder(line);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of diophantineSolve method, of class NumberTheoryUtil.
     */
    @Test
    public void testDiophantineSolve() {
        System.out.println("diophantineSolve");
        long xCoefficient = 172L;
        long yCoefficient = 20L;
        long expression = 1000L;
        long[] expResult = {500, 5, -4250, -43};
        long[] result = NumberTheoryUtil.diophantineSolve(xCoefficient, yCoefficient, expression);
        assertArrayEquals(expResult, result);

        xCoefficient = 54L;
        yCoefficient = 21L;
        expression = 906L;
        expResult = new long[]{604, 7, -1510, -18};
        result = NumberTheoryUtil.diophantineSolve(xCoefficient, yCoefficient, expression);
        assertArrayEquals(expResult, result);

        xCoefficient = 18L;
        yCoefficient = 5L;
        expression = 48L;
        expResult = new long[]{96, 5, -336, -18};
        result = NumberTheoryUtil.diophantineSolve(xCoefficient, yCoefficient, expression);
        assertArrayEquals(expResult, result);

        xCoefficient = 123L;
        yCoefficient = 360L;
        expression = 99L;
        expResult = new long[]{1353, 120, -462, -41};
        result = NumberTheoryUtil.diophantineSolve(xCoefficient, yCoefficient, expression);
        assertArrayEquals(expResult, result);

        xCoefficient = 158L;
        yCoefficient = -57L;
        expression = 7L;
        expResult = new long[]{-154, -57, -427, -158};
        result = NumberTheoryUtil.diophantineSolve(xCoefficient, yCoefficient, expression);
        assertArrayEquals(expResult, result);

        xCoefficient = 95L;
        yCoefficient = 25L;
        expression = 1500L;
        expResult = new long[]{-300, 5, 1200, -19};
        result = NumberTheoryUtil.diophantineSolve(xCoefficient, yCoefficient, expression);
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of primeDivisors method, of class NumberTheoryUtil.
     */
    @Test
    public void testPrimeDivisors() {
        System.out.println("primeDivisors");
        long number = -1L;
        ArrayList<Long> expResult = new ArrayList<>();
        ArrayList<Long> result = NumberTheoryUtil.primeDivisors(number);
        assertEquals(expResult, result);

        System.out.println("primeDivisors");
        number = 31L;
        expResult = new ArrayList<>();
        expResult.add(31L);
        result = NumberTheoryUtil.primeDivisors(number);
        assertEquals(expResult, result);

        System.out.println("primeDivisors");
        number = 124L;
        expResult = new ArrayList<>();
        expResult.add(2L);
        expResult.add(31L);
        result = NumberTheoryUtil.primeDivisors(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of gcdAsLinearCombination method, of class NumberTheoryUtil.
     */
    @Test
    public void testGcdAsLinearCombination() {
        System.out.println("gcdAsLinearCombination");
        long a = 184L;
        long b = 222L;
        long[] expResult = {2, 35, 184, -29, 222};
        long[] result = NumberTheoryUtil.gcdAsLinearCombination(a, b);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of gcdAsLinearCombination method, of class NumberTheoryUtil.
     */
    @Test
    public void test2GcdAsLinearCombination() {
        System.out.println("2 gcdAsLinearCombination");
        long a = 10L;
        long b = 5L;
        long[] expResult = {5, 1, 5, 0, 10};
        long[] result = NumberTheoryUtil.gcdAsLinearCombination(a, b);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of gcdAsLinearCombination method, of class NumberTheoryUtil.
     */
    @Test
    public void test3GcdAsLinearCombination() {
        System.out.println("3 gcdAsLinearCombination");
        long a = -10L;
        long b = 5L;
        long[] expResult = {5, 1, 5, 0, -10};
        long[] result = NumberTheoryUtil.gcdAsLinearCombination(a, b);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of gcdAsLinearCombination method, of class NumberTheoryUtil.
     */
    @Test
    public void test4GcdAsLinearCombination() {
        System.out.println("4 gcdAsLinearCombination");
        long a = -3L;
        long b = 2L;
        long[] expResult = {1, 1, - 3, 2, 2};
        long[] result = NumberTheoryUtil.gcdAsLinearCombination(a, b);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of primeFacorization method, of class NumberTheoryUtil.
     */
    @Test
    public void testPrimeFacorization() {
        System.out.println("primeFacorization");
        long number = -700L;
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("2^2");
        expResult.add("5^2");
        expResult.add("7");
        ArrayList<String> result = NumberTheoryUtil.primeFacorization(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of mod method, of class NumberTheoryUtil.
     */
    @Test
    public void testMod() {
        System.out.println("mod");
        long a = -20L;
        long n = 7L;
        long expResult = 1L;
        long result = NumberTheoryUtil.mod(a, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of gcd method, of class NumberTheoryUtil.
     */
    @Test
    public void testGcd_ArrayList() {
        System.out.println("gcd_ArrayList");
        ArrayList<Long> array = new ArrayList<>();
        array.add(84651L);
        array.add(651L);
        array.add(854L);
        long expResult = 7;
        long result = NumberTheoryUtil.gcd(array);
        assertEquals(expResult, result);
    }

    /**
     * Test of gcd method, of class NumberTheoryUtil.
     */
    @Test
    public void test2Gcd_ArrayList() {
        System.out.println("2 gcd_ArrayList");
        ArrayList<Long> array = new ArrayList<>();
        array.add(84651L);
        array.add(651L);
        long expResult = 21;
        long result = NumberTheoryUtil.gcd(array);
        assertEquals(expResult, result);
    }

    /**
     * Test of gcdLines method, of class NumberTheoryUtil.
     */
    @Test
    public void testGcdLines() {
        System.out.println("gcdLines");
        long a = 172L;
        long b = 42L;
        ArrayList expResult = new ArrayList();
        expResult.add(new long[]{172, 4, 42, 4});
        expResult.add(new long[]{42, 10, 4, 2});
        expResult.add(new long[]{4, 2, 2, 0});
        ArrayList result = NumberTheoryUtil.gcdLines(a, b);
        for (int i = 0; i < result.size(); i++) {
            assertArrayEquals((long[]) expResult.get(i), (long[]) result.get(i));
        }
    }

    /**
     * Test of gcdLines method, of class NumberTheoryUtil.
     */
    @Test
    public void test2GcdLines() {
        System.out.println("2 gcdLines");
        long a = -3L;
        long b = 2L;
        ArrayList expResult = new ArrayList();
        expResult.add(new long[]{-3, -2, 2, 1});
        expResult.add(new long[]{2, 2, 1, 0});
        ArrayList result = NumberTheoryUtil.gcdLines(a, b);
        for (int i = 0; i < result.size(); i++) {
            assertArrayEquals((long[]) expResult.get(i), (long[]) result.get(i));
        }
    }

    /**
     * Test of gcdLines method, of class NumberTheoryUtil.
     */
    @Test
    public void test3GcdLines() {
        System.out.println("3 gcdLines");
        long a = 10L;
        long b = 5L;
        ArrayList expResult = new ArrayList();
        expResult.add(new long[]{10, 2, 5, 0});
        ArrayList result = NumberTheoryUtil.gcdLines(a, b);
        for (int i = 0; i < result.size(); i++) {
            assertArrayEquals((long[]) expResult.get(i), (long[]) result.get(i));
        }

    }

    /**
     * Test of gcdLines method, of class NumberTheoryUtil.
     */
    @Test
    public void test4GcdLines() {
        System.out.println("4 gcdLines");
        long a = 4L;
        long b = 5L;
        ArrayList expResult = new ArrayList();
        expResult.add(new long[]{4, 0, 5, 4});
        expResult.add(new long[]{5, 1, 4, 1});
        expResult.add(new long[]{4, 4, 1, 0});
        ArrayList result = NumberTheoryUtil.gcdLines(a, b);
        for (int i = 0; i < result.size(); i++) {
            assertArrayEquals((long[]) expResult.get(i), (long[]) result.get(i));
        }

    }
}
