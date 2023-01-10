# Asylum_API_Rest

![ascii](https://user-images.githubusercontent.com/96485637/211655836-6c7298b5-82f0-4ffb-a0bd-3157cec072d5.png)

O Asylum é uma API Rest feita em Spring Boot onde existe uma conexão direta com o banco de dados
onde o mesmo simula o controle de um hospital psiquiátrico onde será divido entre alguns funcionários
sendo eles Psiquiatra, Psicologo, Enfermeiro e os Pacientes, sendo criado um CRUD para cada um desses.

# Funcionamento 

Nessa API poderá existir um gerenciamento em cima do cadastro dos funcionário, tendo o CRM para o Psiquiatra, O 
CRP para o Psicologo e o COREN para os enfermeiros já incluíndo suas funções ali dentro. Em relação
ao Paciente além de sua ficha de cadastro, poderá ser informado o nível de atenção que precisa ser determinado
indo de 1 a 5, a condição psiquiátrica dos mesmos. Além de exigir um local de onde esse paciente esta sendo encaminhado
podendo ser CAPS, Hospital e Particular. Abaixo teremos as opções de informar os tratamentos disponíveis ou testes que 
poderão ser aplicados para o que tange a condição psicológica e medicamentos varíando de acordo com cada transtorno.

Os enumeradores terão a opção de Não se aplica(N/A) caso não seja necssário uma medicação ou algum tratamento. Todos no sistema podem
ter o endereço cadastrado, os dados são tratados por meio dos padrões DTO em cima dos projetos, sendo utilizando para leitura dos 
dados e também para sua atualização.

# Criar


![1](https://user-images.githubusercontent.com/96485637/211658306-3c46284b-82ec-4b21-8410-8db4e2a3096e.png)


![2](https://user-images.githubusercontent.com/96485637/211658487-8183cab9-55c6-4b65-bcbb-ce1c47d3bf1a.png)

# Ler

![3](https://user-images.githubusercontent.com/96485637/211658690-8d0055be-c175-4530-86b0-4fe78009409a.png)


![4](https://user-images.githubusercontent.com/96485637/211658785-e50d8195-ab68-4769-b4c5-57e5839a7c5a.png)

# Atualizar

![5](https://user-images.githubusercontent.com/96485637/211659164-5e6e26d1-1762-48e2-88de-da3f049a9104.png)

![6](https://user-images.githubusercontent.com/96485637/211659234-25d241b4-7cea-4297-8d17-15fa96fffe66.png)

# Excluir

![7](https://user-images.githubusercontent.com/96485637/211659645-7a630988-fa10-408f-8823-9e37e4030d72.png)


![8](https://user-images.githubusercontent.com/96485637/211659674-a19aec04-6cf4-42da-9ae5-08fc5218714f.png)

Podemos observar que além da informação apagada a API retorna a paginação.




