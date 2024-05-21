@search
Feature:Rechercher et filtrer une dictée

  Background:
    Given Je suis sur la page de CONNEXION
    And Je me connecte avec mes accès "kom7@yopmail.com" et "1234AZER"

  Scenario: Rechercher  une dictée existante
    Given Je suis connecté et sur la page d'accueil
    When Je recherche la dictée "e-sport"
    Then Je peux accéder aux détails de cette dictée
