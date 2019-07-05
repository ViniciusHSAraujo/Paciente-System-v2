# SysHospital

Projeto de Sistema WEB da matéria de Java EE. 

## Tecnologias Utilizadas
WildFly, JSF, PostgreSQL, Omnifaces e BootsFaces

## Escopo

Dificuldade 3 - Paciente JSF com JPA Medicado

Desenvolver  um  sistema  para  gerenciar  a internação  de  um  paciente  com  relação  aos medicamentos prescritos.

O  sistema  deverá  ter  funcionalidade  para  cadastramento  de pacientes,cadastramento  de medicamentos e cadastro de prescrições médicas.

Faça  o  mapeamento  da  entidade  para  que  o  banco  de  dados  seja  criado  adequadamente utilizando JPA.

### Cadastro de Pacientes

● O  cadastro  de  paciente  deverá  conter  os  campos  nome,  idade,  CPF,  sexo  e  data  de internação.

● Para manipular as informações do paciente, devem-se ter as seguintes funcionalidades:

● Deve-se confeccionar uma janela para cadastramento do paciente;

● Deve-se confeccionar uma janela para mostrar todos os pacientes cadastrados;

● Não deve ser possível cadastrar mais de um paciente com o mesmo CPF.

● Não deve ser possível aceitar cadastramentos de pacientes com CPF inválido. 

● Todos os campos são obrigatórios.

### Cadastro de Medicamentos

● O cadastro  de  medicamento  deverá  conter  os  campos  nome,  concentração,  laboratório  e  a tarja do remédio.

● A tarja poderá ser os valores:amarela, vermelha, preta e não tarjado.

● Deve-se confeccionar uma janela para cadastramento do medicamento;

● Não deve ser possível cadastrar mais de um medicamento com o mesmo nome;

● Todos os campos são obrigatórios.

### Cadastro de Prescrição

● O cadastro de prescrição de medicamentos deverá conter os campos paciente, medicamento, data de início de ministração, data de fim de ministração e a frequência que será um campo de texto livre.

● Deve-se confeccionar uma janela para cadastramento da prescrição médica;

● Todos os campos são obrigatórios.


## Instalação

Utilizando o Eclipse, vá em "File > Import > JSF Project" e escolha o diretório onde você baixou o projeto.

## Utilização

Para utilizar, é necessário configurar o servidor de aplicações WildFly (ou outro de sua preferência, mas talvez necessite de alguma alteração) e configurar o persistence.xml com a configuração do banco de dados que você utilizar.

```xml
<property name="hibernate.dialect" value="org.hibernate.dialect.PostgreSQL95Dialect" />
<jta-data-source>java:/SysHospital</jta-data-source> 
```

Obs: Não foi utilizado o Maven para realizar a build devido a limitações de acesso à internet no campus.
