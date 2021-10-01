"docker compose up" pour monter la database mysql.


Exemple de Json à POST sur /infirmieres :

    {
    "numeroProfessionnel":"545155458",
    "nom":"Dupuis",
    "prenom":"Bidule",
    "telPro":"06452178987",
    "telPerso":"078721581228",
    "adresse":{"id":1 }
    }


Exemple de Json à POST sur /patients :

    {
    "nom":"Valjean",
    "prenom":"Jean",
    "dateDeNaissance":"1970-10-02",
    "sexe":"Masculin",
    "numeroSecuriteSociale":"41541315",
    "adresse":{"id":1},
    "infirmiere":{"id":1}
    }