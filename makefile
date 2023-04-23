#My first makefile

all: GeraJogos TxtField Formulario EventoLimpar Eventos Main 
	jar cvfe loteria.jar Main GeraJogos.class JTextFieldLimit.class Formulario.class Eventos.class EventoLimpar.class Main.class

Main:
	javac Main.java

EventoLimpar:
	javac EventoLimpar.java

Eventos:
	javac Eventos.java

Formulario:
	javac Formulario.java

TxtField:
	javac JTextFieldLimit.java

GeraJogos:
	javac GeraJogos.java

clean:
	rm -rf *.class *.jar
