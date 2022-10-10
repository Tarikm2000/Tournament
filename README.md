           



## INTRODUCTION AU PROJET 

 Il s'agit d'une compétetion entre des équipes(Competitor) ,Une equipe peut donc jouer soit un tournoi soit une ligue ,une ligue (League) est une compétetion ou chqaue équipe joue contre un meme adversaire deux matchs (aller et retour),le gagnant sera celui qui a ramassé le plus de points.Quant au tournoi (Tournament)chaque équipe joue contre une autre équipe et le gagnant passe au tour suivant jusqu'à ce qui l'en reste qu'une seule équipe qui sera le gagant .




## HOW TO 

Il faut se placer dans la racine du projet (aprés avoir récuperé "cloné" le depot avec) et taper les commandes suivantes (également présentes dans le makefile )

### Récuperer le depot 

```git clone git@gitlab-etu.fil.univ-lille.fr:massinissa.lekhal.etu/l3_coo_lekhal_moulouel.git```

### Génerer la documentation

```javadoc -sourcepath src -d docs -subpackages competition game gamers util exception```

Et insuite faut aller dans docs/index.html pour consulter la documentation 

### Compiler toutes les sources 

```javac -sourcepath src -d classes src/*.java```

### Lancer le jeu (Executer le main )

```	java -classpath classes Main ```

### Compiler les tests 

```javac -cp classes:junit-platform-console-standalone-1.9.1.jar -d classes  test/*/*.java```

### Executer les tests 

```java -jar junit-platform-console-standalone-1.9.1.jar -cp classes --scan-class-path```

### Generer l'archive 

```jar cvfe jeu.jar Main -C classes .```

### Executer l'archive 

```java -jar jeu.jar```


### On a ajouté un Makefile pour utiliser les commandes précedentes 





## UML 

![DiagrammeUML_Livrable 1.png](../Diagrammes_UML/DiagrammeUML_Livrable 1.png)



