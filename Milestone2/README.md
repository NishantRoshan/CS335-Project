## Java Grammar Parser \& AST Generator  
The parser is implemented using **ANTLR**. The corresponding lexer \& parser files namely JavaLexer.g4 \& JavaParser.g4 are present in the src directory.  
The src directory also contains the driver main code main.py which generates the AST.  

### Dependencies
1. ANTLR
2. argparse

The dependencies can be installed using 

```
$ pip install -r requirements.txt
```

### Running the parser

To execute and get the CSV dump of symbol tables and the text file containing the 3AC code (tac.txt), run:

```
$ python3 ./bin/main.py –input <input>.java –output <output>.txt
```

dAlso can pass the -v or --verbose flag to set verbose to true. In case verbose flag is passed, the output is presented on the terminal along with the dump files.
The --output <output>.txt part is optional. If this is not provided, we get the 3AC output in tac.txt file.
