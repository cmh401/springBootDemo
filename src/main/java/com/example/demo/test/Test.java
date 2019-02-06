package com.example.demo.test;

/**
 * Test
 */

public class Test {
    private String name;

    /**
     * @return the name
     */
    public String getName() {
        name.split(",");

        return name;
    }

    /**
     * @param
     * 
     * name        the name to set
     */  
    public void setName(String name) {
        this.name = name;

    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.getName();
    }
}