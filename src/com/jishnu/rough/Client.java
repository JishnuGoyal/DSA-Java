package com.jishnu.rough;

public class Client {
    public static void main(String[] args) {

        // allocate memory to a new object of student in the heap.
        Student s1 = new Student(); // instantiation

        s1.Age = 10; // this is updation of the default value of integer. This is not initialization.


        /*
         * This will output the default value of Integer, that is 0.
         */
        System.out.println(s1.Age);

        // Similarly, for string name, the output default will be null.




    }
}
