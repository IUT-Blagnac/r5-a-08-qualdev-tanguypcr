Feature: Est-ce vendredi ?

    Scenario Outline: Vérifier si c'est vendredi
        Given qu'aujourd'hui c'est "<day>"
        When je demande si c'est vendredi
        Then on devrait me dire "<answer>"

    Examples:
        | day            | answer |
        | Vendredi       | Oui    |
        | Dimanche       | Non    |
        | Lundi          | Non    |
        | anything else! | Non    |