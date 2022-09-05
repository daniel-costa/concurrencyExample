## Projeto para visualizar duas threads utilizando um dado compartilhado, race.

A variável indice é static, ou seja, compartilhada entre os dois threads, o valor dela é único para os dois.
Dessa forma, é fácil visualizar que esses threads se alternam e bagunçam de forma aleatória a execução do código.
