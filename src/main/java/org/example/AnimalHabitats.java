package org.example;

public class AnimalHabitats implements Interface1, Interface2, Interface3{

    @Override
    public void penguins() {
        System.out.println("Penguins usualy live in icy Antarctic.");
    }

    @Override
    public void polarBears() {
        System.out.println("Polar bears live in the Arctic regions.");

    }

    @Override
    public void kiwi() {
        System.out.println("Kiwi live in New Zealand.");

    }
}
