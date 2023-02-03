# javaFacadePattern

* Facilita a comunicação e oculta a complexidade de interagir com diferentes módulos Por definição, podemos dizer que o padrão facade nos ajuda a reduzir a complexidade de interagir com um conjunto de subsistemas, atuando como intermediário entre o cliente e os subsistemas, permitindo-nos ter uma entrada única, facilitando a comunicação entre eles.

* PROPOSITO:
  * Facade (Fachada) é um padrao de design estrutural que fornece uma interface simplificada para uma biblioteca, framework ou qualquer outro grupo complexo de classes.

* SOLUÇÃO:
  * Dispoe de uma interface que define como o cliente se comunicara com o sistema. Esta classe implementara esta interface para receber requisicoes e se encarregara de enviar a requisicao do cliente para a classe correspondente (subsistemas).

* VANTAGENS:
  * O software se torna mais flexivel e facil de expandir
  * Reduzimos o uso de objetos que lidam diretamente com o cliente, tornando o sistema mais facil de usar
  * Reduzimos o acoplamento entre o cliente e os subsisteas, o que nos permite modificar os subsistemas sem afetar o cliente.

* DESVANTAGEM: 
  * Alto grau de dependencia na interface da fachada(facade)
