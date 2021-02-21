package com.jlbc.monomials;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        //TestMonomialStringRepresentation();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("This program allows to perform basic arithmetic with two");
        System.out.println("monomials, assuming that conditions are complied.");
        System.out.println("");

        System.out.println("*** MONOMIAL 1 ***");
        System.out.println("Write the coefficient 1: ");
        double c1 = Double.parseDouble(reader.readLine());
        System.out.println("Write the exponent 1: ");
        int e1 = Integer.parseInt(reader.readLine());
        System.out.println("");
        Monomial M1 = new Monomial(c1, e1);

        System.out.println("*** MONOMIAL 2 ***");
        System.out.println("Write the coefficient 2: ");
        double c2 = Double.parseDouble(reader.readLine());
        System.out.println("Write the exponent 2: ");
        int e2 = Integer.parseInt(reader.readLine());
        System.out.println("");
        Monomial M2 = new Monomial(c2, e2);

        Monomial sum = null;
        Monomial difference = null;
        Monomial product = null;
        Monomial quotient = null;

        // Monomial addition: M1 + M2
        try
        {
            sum = M1.Add(M2);
            System.out.println("SUM: " + sum.toString());
        }
        catch (Exception e)
        {
            System.out.println("SUM: Invalid operation.");
        }
        // Monomial subtraction: M1 - M2
        try
        {
            difference = M1.Subtract(M2);
            System.out.println("DIFFERENCE: " + difference.toString());
        }
        catch (Exception e)
        {
            System.out.println("DIFFERENCE: Invalid operation.");
        }
        // Monomial multiplication: M1 * M2
        product = M1.Multiply(M2);
        System.out.println("PRODUCT: " + product.toString());
        // Monomial division: M1 / M2;
        try
        {
            quotient = M1.Divide(M2);
            System.out.println("QUOTIENT: " + quotient.toString());
        }
        catch (Exception e)
        {
            System.out.println("QUOTIENT: Invalid operation.");
        }
        System.out.println();

        System.out.println("Write the value to evaluate: ");
        double value = Double.parseDouble(reader.readLine());
        System.out.println();

        System.out.println("Value of M1 is " + M1.Evaluate(value));
        System.out.println("Value of M2 is " + M2.Evaluate(value));
        if (sum != null)
        {
            System.out.println("Value of M1 + M2 is " + sum.Evaluate(value));
        }
        else
        {
            System.out.println("Value of M1 + M2 cannot be computed because is an invalid operation.");
        }
        if (difference != null)
        {
            System.out.println("Value of M1 - M2 is " + difference.Evaluate(value));
        }
        else
        {
            System.out.println("Value of M1 - M2 cannot be computed because is an invalid operation.");
        }
        System.out.println("Value of M1 * M2 is " + product.Evaluate(value));
        if (quotient != null)
        {
            System.out.println("Value of M1 / M2 is " + quotient.Evaluate(value));
        }
        else
        {
            System.out.println("Value of M1 / M2 cannot be computed because is an invalid operation.");
        }

        System.out.println("");
        System.out.println("THANK YOU FOR USING THIS PROGRAM!");
    }
    
    static void TestMonomialStringRepresentation() {
        System.out.println(new Monomial(0, 0));
        System.out.println(new Monomial(0, 1));
        System.out.println(new Monomial(0, 5));
        System.out.println(new Monomial(1, 0));
        System.out.println(new Monomial(1, 1));
        System.out.println(new Monomial(1, 5));
        System.out.println(new Monomial(7.5, 0));
        System.out.println(new Monomial(7.5, 1));
        System.out.println(new Monomial(7.5, 5));
        System.out.println(new Monomial(-0, 0));
        System.out.println(new Monomial(-0, 1));
        System.out.println(new Monomial(-0, 5));
        System.out.println(new Monomial(-1, 0));
        System.out.println(new Monomial(-1, 1));
        System.out.println(new Monomial(-1, 5));
        System.out.println(new Monomial(-7.5, 0));
        System.out.println(new Monomial(-7.5, 1));
        System.out.println(new Monomial(-7.5, 5));
    }
}
