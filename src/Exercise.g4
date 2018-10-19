grammar Exercise;
prog: (expr NEWLINE)*;
expr: term (('+'|'-') term)*;
term: factor (('*'|'/') factor)*;
factor: '('expr')' | INT;
NEWLINE : [\r\n]+;
INT : [0-9]+;