Feature: the version can be retrieved
  Scenario: client makes call to GET /sayhello
    When the client calls /sayhello
    Then the client receives status code of 200
    And the client receives "HELLO"