package com.company;

public class Main {


    public static void main(String[] args) {
        QuadPolynomial quadPolynomial = new QuadPolynomial();
        quadPolynomial.a = 3;quadPolynomial.b = 2;quadPolynomial.c = 5;
        assert (quadPolynomial.result(3) == 38);

        MyArray myArray = new MyArray();
        myArray.size = 10;
        myArray.add(3);
        myArray = insertElement(myArray, 1, newIndex);
    }
}



