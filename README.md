






## INTRODUCTION AU PROJET 

 Il s'agit d'une compétetion entre des équipes(Competitor) ,Une equipe peut donc jouer soit un tournoi soit une ligue ,une ligue (League) est une compétetion ou chqaue équipe joue contre un meme adversaire deux matchs (aller et retour),le gagnant sera celui qui a ramassé le plus de points.Quant au tournoi (Tournament)chaque équipe joue contre une autre équipe et le gagnant passe au tour suivant jusqu'à ce qui l'en reste qu'une seule équipe qui sera le gagant .




## HOW TO 

### Génerer la documentation

```javadoc -sourcepath src -d docs -subpackages competition game gamers util exceptions selectiontype```

Et insuite faut aller dans docs/index.html pour consulter la documentation 

### Compiler toutes les sources 

```javac -sourcepath src -d classes src/*.java```

### Lancer la ligue et le tournoi

```	java -classpath classes Main ```

### Lancer le Master 
   
   ```	java -classpath classes MasterMain ```
   

### Compiler les tests 

```javac -cp classes:junit-platform-console-standalone-1.9.1.jar -d classes  test/*/*.java```

### Executer les tests 

```java -jar junit-platform-console-standalone-1.9.1.jar -cp classes --scan-class-path```

### Generer l'archive Ligue et Tournoi

```jar cvfe jeu.jar Main -C classes .```

### Generer l'archive pour le Master 

 ```jar cvfe Master.jar MasterMain -C classes .```

### Executer l'archive  de la ligue et Tournoi

```java -jar jeu.jar```

### Executer l'archive pour le Master 

```java -jar Master.jar```





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
 
  
    


