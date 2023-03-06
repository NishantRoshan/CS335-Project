# MILESTONE 1
  * At first, we created the complete java grammar by basically copying all the production rules from the [Oracle Website](https://docs.oracle.com/javase/specs/jls/se17/html/jls-19.html) .
  * This led to a 1600 lines of code grammar and then we made the corresponding lexer.
  * On compiling and running this code, we get a grammar with ~800 shift-reduce and ~400 reduce-reduce conflicts :(
  * Then we started working on the java grammar using [antlr](https://github.com/antlr/grammars-v4) to develop the lexer and parser.
  * Using this grammar, we get a near to perfect working code.
  * The first attempt with flex bison is in the floder flex-bison_attempt, while the final attempt with antlr is in final_antlr_attempt
