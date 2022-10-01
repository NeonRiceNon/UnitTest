package com.company;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Dog name = new Dog("Jony", 4);
        assertEquals("Jony", name.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        Dog age = new Dog("Jony", 4);
        assertEquals(4, age.getAge() );
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}