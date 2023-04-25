## Java Grammar Parser \& AST Generator  
The parser is implemented using **ANTLR**. The corresponding lexer \& parser files namely JavaLexer.g4 \& JavaParser.g4 are present in the src directory.  
The src directory also contains the driver main code main.py which generates the AST.  

### Dependencies
1. ANTLR
2. argparse

The dependencies can be installed using 

```
$ make req
```

### Running the parser

To run the parser first we need to generate the lexer and parser files from the grammar files. It can be done using

```
$ make 
```

After running the above command, we have the driver main code and the required files in the **bin** directory.  

To generate assembly code from input java file, use the following

```
$ python3 ./bin/main.py --input <input>.java --output <output>.txt
```

Also can pass the -v or --verbose flag to set verbose to true.

To compile the assembly file

```
$ gcc out.s
```

To run the genrated binary 

```
$ ./a.out
```
