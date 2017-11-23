package newpackage;
// Biginteger over load;
// tow char tau ='\u03C4';
// sigma '\u03c3'
// linear congroante; a(x) b n [less than n congroantes]


/*
 * Copyright (C) 2017 Waleed Mortaja, Mahmoud Khalil
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation for some methods used in Elementary Number Theory.
 *
 * @author Waleed Mortaja, contact Email :
 * <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a>
 * @author Mahmoud Khalil, contact Email :
 * <a href="mailto:kkhalil2535@gmail.com">kkhalil2535@gmail.com</a>
 */
public final class NumberTheoryUtil {

    /**
     * Don't let anyone instantiate this class.
     */
    private NumberTheoryUtil() {
    }

    private <T> void checkArrayLength(int length, List<T> array) {
        if (length != array.toArray().length) {
            throw new IllegalArgumentException("Wrong Array length");
        }
    }

    public static ArrayList<Long> divisors(long number) throws IllegalArgumentException {
        if (number == 0) {
            throw new IllegalArgumentException("Can't define the divisors for zero");
        }
        ArrayList<Long> result = new ArrayList<>();
        /* if the number is 1 then add 1 once only
        or if it is -1,then add 1 and -1 once only */
        if (number == 1 || number == -1) {
            result.add(number);
            if (number < 0) { //number ==-1
                //add the positive +1 at the first of the result
                result.add(0, -number);
            }
            return result;
        }
        for (long i = 1; i <= Math.sqrt(Math.abs(number)); i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        for (int i = result.size() - 1; i >= 0; i--) {
            /* check if the result.get(i) is the square root of the number, then 
            dont add sqrt(number) again,
            else [if(number / result.get(i) != result.get(i))]
            add the number because it is NOT the square root */
            if (number / result.get(i) != result.get(i)) {
                result.add(Math.abs(number / result.get(i)));
            }
        }
        //if the number is negative then append the negative divisors to the result
        if (number < 0) {
            int resultLengthBeforLoop = result.size();
            for (int i = 0; i < resultLengthBeforLoop; i++) {
                result.add(-result.get(i));
            }
        }
        return result;
    }

    public static ArrayList<Long> primeDivisors(long number) {
        // if the number is zero, then divisors method will throw the exception
        ArrayList<Long> divisors = divisors(Math.abs(number));
        ArrayList<Long> result = new ArrayList<>();
        if (Math.abs(number) < 2) {
            return result;
        }
        for (int i = 0; i < divisors.size(); i++) {
            if (isPrime(divisors.get(i))) {
                result.add(divisors.get(i));
            }
        }
        return result;
    }

    public static ArrayList<String> primeFacorization(long number) {
        ArrayList<String> result = new ArrayList<>();
        /* no need for Math.abs(number) because primeDivisors method do it,
        and returns the primes which are always positive */
        ArrayList<Long> primeDivisors = primeDivisors(number);
        for (int i = 0; i < primeDivisors.size(); i++) {
            long tempNumber = number; //so we can change "tempNumber" instead of "number"
            int power = 0;
            while (tempNumber % primeDivisors.get(i) == 0) {
                power++;
                tempNumber /= primeDivisors.get(i);
            }
            if (power == 1) {
                result.add(primeDivisors.get(i).toString());
            } else {
                result.add(primeDivisors.get(i) + "^" + power);
            }
        }
        return result;
    }

    /**
     * Check whether a number is prime or not. done by checking if the entered
     * number divisble by any number less than or equal to the square root of
     * the entered number
     *
     * @param number The number to be checked
     * @return true if number is prime
     */
    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        } else {
            long sqrt = (long) Math.sqrt(number);
            for (int i = 2; i <= sqrt; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isRelativePrime(long a, long b) {
        return gcd(a, b) == 1;
    }

    /**
     * Calculate the gcd (Greates Common Divisor) of two numbers. Find gcd using
     * Euclidean Algorithm
     *
     * @param a The first number.
     * @param b The second number.
     * @return the gcd of the two numbers
     * @throws IllegalArgumentException when both a & b equals zero
     */
    public static long gcd(long a, long b) throws IllegalArgumentException {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Undefined value for gcd(0,0)");
        } else if (a == 0) {
            return Math.abs(b);
        } else if (b == 0) {
            return Math.abs(a);
        } else if (a == b) {
            return Math.abs(a); //any number of them. They are equal any way
        }

        a = Math.abs(a);
        b = Math.abs(b);

        long min;
        long max;
        if (a > b) {
            max = a;
            min = b;
        } else if (a < b) {
            max = b;
            min = a;
        } else {
            return a;
        }

        if (max % min == 0) {
            return min;
        }
        return gcd(min, max % min);
    }

    public static long gcd(ArrayList<Long> array) throws IllegalArgumentException {
        if (array == null || array.size() < 2) {
            throw new IllegalArgumentException("gcd Expected two numbers at least");
        }
        long result = gcd(array.get(0), array.get(1));
        for (int i = 2; i < array.size(); i++) {
            result = gcd(result, array.get(i));
        }
        return result;
    }

    /**
     * Calculate the LCM (Least Common Multiple) of two numbers
     *
     * @param a The first number.
     * @param b The second number.
     * @return the LCM of the two numbers
     */
    public static long lcm(long a, long b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    /**
     * Get the unique represntation for two numbers as
     *
     * multiple = quotient * factor + reminder where remainder is the positive
     * reminder less than |b|.
     *
     * @param a the first number
     * @param b the second number
     * @return array of four long numbers in the order [m,q,a,r]
     * @throws IllegalArgumentException when a or b is zero
     */
    public static long[] UniqueRepresntation(long a, long b) throws IllegalArgumentException {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("There is no unique represtaion for zero(s)");
        }
        if (a == b) {
            return new long[]{a, 1, b, 0};
        }
        double ratio = (double) a / b;
        long quotient;

        if (b > 0) {
            quotient = (long) Math.floor(ratio);
        } else {
            quotient = (long) Math.ceil(ratio);
        }

        long reminder = Math.round((ratio - quotient) * b);
        return new long[]{a, quotient, b, reminder};
    }

    public static long[] remainder(long[] line) throws IllegalArgumentException {
        //swap the elements of the line as remainder  = multiple - quotient*factor
        // m = q * f + r
        // r = m - q * f
        if (line == null) {
            throw new IllegalArgumentException("Cant get the remainder for null");
        } else if (line.length != 4) {
            throw new IllegalArgumentException("Array length must be 4, found array with length: " + line.length);
        }
        long[] result = new long[4];
        result[0] = line[3];
        result[1] = line[0];
        result[2] = -line[1];
        result[3] = line[2];
        return result;
    }

    public static long[] gcdAsLinearCombination(long a, long b) throws IllegalArgumentException {
        ArrayList<long[]> lines = gcdLines(a, b);
        if (lines.size() == 1) {
            long[] line = lines.get(0);
            if (line[3] == 0) {
                return new long[]{line[2], 1, line[2], 0L, line[0]};
            } else {
                line = remainder(line);
                return new long[]{line[0], 1, line[1], line[2], line[3]};
            }
        }
        long bracketMultiple; // the quetionet of the factor
        long outOfBracketMultiple = 1;

        long[] currentLine = remainder(lines.get(lines.size() - 1)); // the line being proccessed resulting the required final line (result)
        for (int i = lines.size() - 1; i > 0; i--) { //loop from the before the last equation to the second equation (first equation is calculated in the second equation processing)
            long[] theComingLine = remainder(lines.get(i - 1));

            bracketMultiple = currentLine[2];
            currentLine[2] = outOfBracketMultiple + (bracketMultiple * theComingLine[2]);
            outOfBracketMultiple = bracketMultiple;
            currentLine[1] = theComingLine[1];
            currentLine[3] = theComingLine[3];
        }
        long[] result = new long[5];
        result[0] = currentLine[0];
        result[1] = outOfBracketMultiple;
        for (int i = 2; i < result.length; i++) {
            result[i] = currentLine[i - 1];
        }
        return result;

    }

    public static ArrayList<long[]> gcdLines(long a, long b) throws IllegalArgumentException {
        ArrayList<long[]> lines = new ArrayList<>();
        long[] arrayListline;
        do {
            arrayListline = UniqueRepresntation(a, b);
            if (arrayListline[arrayListline.length - 1] == 0 && !lines.isEmpty()) {
                break;
            }
            lines.add(arrayListline);
            /* put one of the varibales (a,b) to the minmum of a,b (we selected a)
            arrayListline is written as m = q * f + r,
            then arrayListline[2] is minimum of a,b
            and the other variable (we selected b) to the remainder,
            then get the UniqueRepresntation of the new a,b in the next loop */
            a = arrayListline[2];
            b = arrayListline[3];
            // breaks when remainder ==0 before getting the new UniqueRepresntation
        } while (b != 0);
        return lines;
    }

    public static long[] diophantineSolve(long xCoefficient, long yCoefficient, long expression) throws IllegalArgumentException {
        long[] result = new long[4];
        long[] gcdLinearCombination = gcdAsLinearCombination(xCoefficient, yCoefficient);
        if (expression % gcdLinearCombination[0] != 0) {
            throw new IllegalArgumentException("No, solution, the gcd does not divide the expression");
        }
        long multiplyFactor = expression / gcdLinearCombination[0];

        //multiply x0,y0 by multiplyFactor
        gcdLinearCombination[1] *= multiplyFactor;
        gcdLinearCombination[3] *= multiplyFactor;

        result[0] = gcdLinearCombination[1]; //x0
        result[1] = yCoefficient / gcdLinearCombination[0]; // b/d
        result[2] = gcdLinearCombination[3]; //y0
        result[3] = -xCoefficient / gcdLinearCombination[0]; // a/d
        return result;
    }

// check n (mod n)
    private static void check_n_mod(long n) {
        if (n < 1) {
            throw new IllegalArgumentException("modulo must be >=1");
        }

    }

// mod (a,n)
    public static long mod(long a, long n) {
        check_n_mod(n);
        if (a >= n) {
            a = a % n;
        }
        if (a < 0) {
            a = (a % n) + n;
            if (a == n) {
                a -= n;
            }
        }
        return a;
    }

    public static boolean isCongurent(long a, long b, long n) {
        check_n_mod(n);
        return (a - b) % n == 0;
    }
// aX = c

    public static ArrayList<Long> linearCongurentSolve(long a, long c, long n) {
        return linearCongurentSolve(a, 0L, c, n);
    }

    //aX +b = C
    public static ArrayList<Long> linearCongurentSolve(long a, long b, long c, long n) {
        check_n_mod(n);
        ArrayList<Long> result = new ArrayList<>();
        for (long i = 0; i < n; i++) {
            if ((((a * i + b) - c) % n == 0)) {
                result.add(i);
            }
        }
        return result;
    }

    private static void chineseRemainderEquationCheck(ArrayList<Long[]> equations) throws IllegalArgumentException {
        if (equations == null) {
            throw new IllegalArgumentException("null object for chinese equation");
        }
        final long equationsSize = equations.size();
        if (equationsSize == 0) {
            throw new IllegalArgumentException("Empty Array used as chinese equations.");
        }
        for (int i = 0; i < equationsSize; i++) {
            if (equations.get(i) == null || equations.get(i).length != 2) {
                throw new IllegalArgumentException("Chinese equation needs only two integers as input.");
            }
            check_n_mod(equations.get(i)[1]);
        }

        for (int i = 0; i < equationsSize; i++) {
            for (int j = i + 1; j < equationsSize; j++) {
                if (!isRelativePrime(equations.get(i)[1], equations.get(j)[1])) {
                    throw new IllegalArgumentException("Chinese equation has non-Relative prime modulos");
                }
            }
        }
    }

    //the input is  two integers (a) and (n) in the form x=a (mod n) for each equation
    public static long chineseRemainderSolve(ArrayList<Long[]> equations) throws IllegalArgumentException {
        chineseRemainderEquationCheck(equations);
        long n = 1;
        ArrayList<Long> N = new ArrayList<>();
        ArrayList<Long> x = new ArrayList<>();
        long result = 0;

        final long equationsSize = equations.size();
        for (int i = 0; i < equationsSize; i++) {
            n *= equations.get(i)[1]; // n = n1 * n2 * ..... * nr
        }

        for (int i = 0; i < equationsSize; i++) {
            N.add(n / equations.get(i)[1]); //Nk = n /nk
        }

        for (int i = 0; i < equationsSize; i++) {
            /*
            Nk * X = 1 mod (nk)
            we solve this linear congurent,
            then we get the first and only solution using get(0)
             */
            x.add((linearCongurentSolve(N.get(i), 1, equations.get(i)[1])).get(0));
        }

        for (int i = 0; i < equationsSize; i++) {
            result += equations.get(i)[0] * N.get(i) * x.get(i);
        }
        result = mod(result, n);
        return result;
    }

    public static long numberOfDivisors(long n) {
        return divisors(n).size();
    }

    public static long sumOfDivisors(long n) {
        ArrayList<Long> divisors = divisors(n);
        long result = 0;

        final long divisorsSize = divisors.size();
        for (int i = 0; i < divisorsSize; i++) {
            result += divisors.get(i);
        }
        return result;
    }

}
