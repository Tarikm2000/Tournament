            



## INTRODUCTION AU PROJET 

 Il s'agit d'une compétetion entre des équipes(Competitor) ,Une equipe peut donc jouer soit un tournoi soit une ligue ,une ligue (League) est une compétetion ou chqaue équipe joue contre un meme adversaire deux matchs (aller et retour),le gagnant sera celui qui a ramassé le plus de points.Quant au tournoi (Tournament)chaque équipe joue contre une autre équipe et le gagnant passe au tour suivant jusqu'à ce qui l'en reste qu'une seule équipe qui sera le gagant .




## HOW TO 

Il faut se placer dans la racine du projet (aprés avoir récuperé "cloné" le depot avec) et taper les commandes suivantes (également présentes dans le makefile )


### Génerer la documentation

```javadoc -sourcepath src -d docs -subpackages competition game gamers util exceptions selectiontype observer```

Et insuite faut aller dans docs/index.html pour consulter la documentation 

### Compiler toutes les sources 

```javac -sourcepath src -d classes src/*.java```

### Lancer la ligue , le tournoi ,ou le master

```	java -classpath classes Main ```
 

### Compiler les tests 

```javac -cp classes:junit-platform-console-standalone-1.9.1.jar -d classes  test/*/*.java```

### Executer les tests 

```java -jar junit-platform-console-standalone-1.9.1.jar -cp classes --scan-class-path```

### Generer l'archive Ligue , Tournoi ou Master

```jar cvfe jeu.jar Main -C classes .```


### Executer l'archive  de la ligue , Tournoi ou Matser

```java -jar jeu.jar```







### On a ajouté un Makefile pour utiliser les commandes précedentes 





## UML LIVRABLE 1

![DiagrammeUML_Livrable 1.png](../Diagrammes_UML/DiagrammeUML_Livrable 1.png)



### PRISE EN COMPTE DES REMARQUES DU LIVRABLE 1 :

  -Correction des warnnings de la javadoc .

  -Correction de la commande pour générer la javadoc. 

  -Indications sur les tests.

  -Les attributs de matchs sont désormais en private.

  -Variation du nombre de compétiteurs .

  -Affichage du classement à la fin du Turnoi. 

  -On a changé la boucle for dans la méthode finalwinner et on l'a remplacé avec un itérateur avec un seul next pour prendre le premier qui sera le vainqeur . 



## UML LIVRABLE 2
  

  ![Livrable2.png](../Diagrammes_UML/Livrable2.png)
 
  

## LIVRABLE 3

## PRISE EN COMPTE DES REMARQUES DU LIVRABLE 2 :

  - On a maintenant un nombre de compétiteurs ilimité que l'utilisateur peut entrer .

  - On a à présent un seul Main contenant tous les types de compétetions .

  - On a evité les fléches qui se croissent dans le diagramme UML .

  - On a également modifié nos selections ,maintenant elles prennent en parametres un liste de League .

  - On a pas pu faire les tests faute de temps car le rendu est prévu la veille de l'examen.


## UML LIVRABLE 3

  ![Livrable3.png](../Diagrammes_UML/Livrable3.png)

  
    


