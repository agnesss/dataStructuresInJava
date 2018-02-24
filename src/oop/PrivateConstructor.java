package oop;

/**
 * Created by UserPC on 1/9/2018.
 */
public class PrivateConstructor {

    private static class Animal {

        private Animal(){}
    }

    private static class Dog extends Animal{
        public Dog(){}
    }

    public static void main(String[] args) {
        Dog d = new Dog();

    }
}
