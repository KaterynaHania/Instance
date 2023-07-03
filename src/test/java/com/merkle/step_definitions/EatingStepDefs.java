package com.merkle.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingStepDefs {
    @Given("{word} is hungry")
    public void somebody_is_hungry(String name) {
        System.out.println(name+" is hungry");
    }
    @When("He eats {int} cucumbers")
    public void he_eats_cucumbers(Integer quantity) {
        System.out.println("He eats "+quantity+" cucumbers");
    }
    @Then("{word} will be full")
    public void he_will_be_full(String name) {
        System.out.println(name+" will be full");
    }

    @Then("{word} will be too full")
    public void he_will_be_too_full(String name) {
        System.out.println(name+ " is very full");
    }
}
