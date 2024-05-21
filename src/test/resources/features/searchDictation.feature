Feature:Login

  Background:
    Given Je suis sur la page de CONNEXION

  @login
  Scenario: Se connecter à la plateforme  avec succès
    When Je me connecte avec mes accès "kom7@yopmail.com" et "1234AZER"
    Then Je suis connecté et sur la page d'accueil

  Scenario: Se connecter à la plateforme  une première fois
    When Je me connecte avec mes accès "kom7@yopmail.com" et "1234AZER"
    And Je remplie les informations "kom66t4", "Kom", "Pro", "Homme", "Français", "Primaire", "Cameroon"
    Then Je suis connecté et sur la page d'accueil
