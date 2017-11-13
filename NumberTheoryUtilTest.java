/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
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
    public void testGcd() {
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
}
