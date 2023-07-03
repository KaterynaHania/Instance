Feature: Movie suggestion feature

  As a user
  I should be able to get movies according to my preference

  Scenario: Movie search
    Given I like "actions"
    And I like "drama"
    And I like "cartoon"
    When I go to homepage
    Then I should get right recommendation
@smoke
  Scenario: Movie search datatable
    Given I like
      | actions   |
      | drama     |
      | cartoon   |
      | adventure |
    When I go to homepage
    Then I should get right recommendation

  Scenario: Movie search datatable
    Given I like below favorite movie with certain type
      | actions   | John Wick   |
      | drama     | Titanic     |
      | cartoon   | Tom & Jerry |
      | adventure | Tomb Raider |
    When I go to homepage
    Then I should get right recommendation

  Scenario: Movie search datatable List of List
    Given I like below movies with ratings
      | actions   | John Wick   |5.3|
      | drama     | Titanic     |9.9|
      | cartoon   | Tom & Jerry |10 |
      | adventure | Tomb Raider |8.9|
    When I go to homepage
    Then I should get right recommendation