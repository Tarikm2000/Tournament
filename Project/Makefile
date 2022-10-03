all : play

classes:
	javac -sourcepath src -d classes src/*.java	

play: classes
	java -classpath classes Main 

clean :
	rm -rf classes
