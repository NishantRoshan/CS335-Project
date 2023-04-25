all: 
	mkdir -p bin 
	cp src/* ./
	antlr4 -Dlanguage=Python3 -visitor JavaParser.g4 JavaLexer.g4 -visitor
	mv J* ./bin/
	mv main.py ./bin/

req:
	pip install -r requirements.txt
	
clean:
	rm -r bin/
