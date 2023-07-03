package com.merkle.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class NetflixStepDef {

    @Given("I like {string}")
    public void i_like(String movieGenre) {
        System.out.println("Step I like "+movieGenre);
    }
    @When("I go to homepage")
    public void i_go_to_homepage() {
        System.out.println("Step I go to homepage");
    }
    @Then("I should get right recommendation")
    public void i_should_get_right_recommendation() {
        System.out.println("Step I should get right recommendation");
    }
    @Given("I like")
    public void i_like(List<String> movieTypes) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(movieTypes);
    }

    @Given("I like below favorite movie with certain type")
    public void i_like_below_favorite_movie_with_certain_type
            (Map<String,String> favoriteMovie) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(favoriteMovie);
    }

    @Given("I like below movies with ratings")
    public void i_like_below_movies_with_ratings
            (List<List<String>> movies) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        System.out.println(movies);
        System.out.println("movies.get(0) = " + movies.get(0));
        System.out.println("movies.get(1) = " + movies.get(1));
        System.out.println("movies.get(2) = " + movies.get(2));
        System.out.println("movies.get(3) = " + movies.get(3));
    }



}
