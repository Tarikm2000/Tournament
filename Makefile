all : play

classes:
	javac -sourcepath src -d classes src/*.java

play: classes
	java -classpath classes Main 

master: classes
	java -classpath classes MasterMain

jarLeagueOrTournament :  classes
	jar cvfe jeu.jar Main -C classes .

jarMaster :  classes
	jar cvfe Master.jar Main -C classes .

compileTests: classes
	javac -cp classes:junit-platform-console-standalone-1.9.1.jar -d classes  test/*/*.java

runTests: compileTests classes
	java -jar junit-platform-console-standalone-1.9.1.jar -cp classes --scan-class-path

doc:
	javadoc -sourcepath src -d docs -subpackages competition game gamers util exceptions selectiontype

clean :
	rm -rf classes
	rm -rf docs

