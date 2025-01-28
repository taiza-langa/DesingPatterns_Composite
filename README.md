<h1>Desing Patterns - Estrutural (Composite)</h1>

O código implementa o padrão de projeto Composite, usado para trabalhar com estruturas hierárquicas, como árvores, de forma uniforme. Ele define a interface FileSystemComponent com o método display(String indent), comum a todos os componentes.

A classe File representa objetos simples (arquivos) e exibe seu nome. Já a classe Directory representa objetos compostos (diretórios), que podem conter outros arquivos ou subdiretórios, armazenados em uma lista. O método display exibe o nome do diretório e, recursivamente, seus conteúdos.

Na classe App, é criada uma estrutura hierárquica de diretórios e arquivos, e o método display do diretório raiz é chamado para exibir toda a estrutura.
