Esse projeto é a atividade pratica realizada no terceiro semestre, onde foi desenvolvido em JAVA, sem interface ao usuário, um sistema de universidade para cadastro de alunos, matérias e etc... 

 

Como funciona a linguagem de programação Java? 

 

Java é um tipo de linguagem de programação definida como uma linguagem orientada a objetos. Sua intenção é permitir que os desenvolvedores escrevam o programa apenas uma vez e o executem por meio de qualquer dispositivo. 

 

Java é uma linguagem de programação orientada a objetos estática e fortemente tipada. 

 

O projeto da Universidade foi desenvolvido em 11 classes sendo elas: Aluno, Arquivo, Curso, Mais, Menu, Nota, Notas, Rendimento, Sistema, Teste e Universidade. 

A primeira classe “Aluno” tem o objeto de criar o objeto aluno, onde os atributos são “nome” e “ra”, todos encapsulados e com o método de polimorfismo para sobrescrever os objetos. 

 

A classe “Arquivo” possui 6 métodos apenas, o primeiro para escrever o rendimento de um aluno, o segundo para ler os rendimentos, o terceiro para “ler” aluno, o quarto para escrever aluno, o quinto para ler o curso e o sexto para escrever o curso. 

 

A classe “Curso” tem o objetivo de criar o objeto “curso”, onde seus atributos são: nome, nível e ano, todos encapsulados e um método de subscrever toString. 

 

A classe “Main” apenas inicia o menu e o programa. 

 

A classe “Menu” tem o método que apresenta as 8 opções para o usuário com um swtich que leva a outro método ao depender da opção escolhida com tratamento de erros.  

A classe “Nota tem como objetivo criar um novo objeto “nota” que tem apenas o atributo valor onde há um pequeno “tratamento” caso a nota for maior ou menor que 0. 

 

 

 

A classe “Notas” tem como objetivo criar um objeto “notas” onde seus atributos são: np1, np2, sub, exam todos encapsulados e com um método para sobrescrever o objeto. 

 

A classe “Rendimento” tem como objetivo criar o objeto “rendimento” onde seus atributos são: aluno, curso, notas, media e aprovado, todos encapsulados e um método para calcular sua média. 

 

A classe “Sistema” é apenas uma interface (não de usuário) que mantem os métodos dos programas encapsulados.  

 

A classe “Teste” é apenas para testes doo programa. 

 

E por fim temos a classe “Universidade” que tem como métodos rendimentos, cursos e alunos e os métodos: Cadastrar Aluno onde é feito o cadastro do aluno, partindo do seu “RA”, e “Nome”, a classe listar alunos, onde com um laço de repetição for listamos os alunos, em seguida o método Cadastrar curso que tem como input o nome, nível e ano, e uma estrutura condicional para atribuir o curso a uma opção em seguida o método Listar Curso, onde é feito a listagem através de um laço de repetição, um método de cadastrar rendimento que recebe o curso, alunos cadastrados e depois seleciona um aluno e curso, é também recebido com as notas dos alunos em seguida um método de mostrar rendimento de um aluno, que apresenta com um laço for o nome dos alunos cadastrador e ra, a opção de escolher um aluno com um input,  a apresentação de cursos e notas do aluno. 

Por fim um método que mostra alunos de um curso especifico onde o mesmo apresenta com o laço de repetição for os alunos, nomes, anos e níveis, a opção de escolher um curso com um input e com um laço de repetição apresenta todos os alunos matriculados. 
