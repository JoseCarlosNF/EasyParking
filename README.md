# 🚙 EasyParking

Basicamente, um sistema de controle para estacionamentos.

## Como a POO foi abordada

### 🛵 Veículo

diversas características que podem ser utilizadas. No caso específico de um estacionamento, algumas delas são:

- placa
- categoria do veículo
    - moto, carro, caminhão, etc.
- nome do motorista
    - nº da CNH
- valor de mercado do veículo
    - API Fipe
- horário de entrada
- horário de saída

### 👷🏾‍♂️ Funcionário

informações sobre os funcionários*.*

- nome
- tem habilitação?
    - categoria de habilitação
    - nº da CNH
    - é *vallet?*
- tempo de experiência na empresa

### 🏢 Estabelecimento

informações sobre o estabelecimento/local do estacionamento.

- endereço
- quantidade de funcionários
- tem valet?
    - quantidade de *valets*
- quantidade de vagas
    - disponíveis/ocupadas
- tempo médio de permanência dos veículos
- veículos estacionados

## 🔥 Diferencial

- Integração com a [API de consultas da tabela FIPE](https://fipeapi.appspot.com/)

---

# 🚧 To-do

## Principais

👨🏾‍✈️ **Motorista**

- [ ]  nome
- [ ]  CNH

**🏢 Estabelecimento**

- [ ]  *Endereço*
- [ ]  quantidade de funcionários
- [ ]  tem vallet?
    - [ ]  quantidade de vallets
- [ ]  quantidade de vagas
    - [ ]  disponíveis/ocupadas
- [ ]  tempo médio de permanência
- [ ]  veículos estacionados <*Lista>*

👷🏾‍♂️ **Funcionário**

- [ ]  nome
- [ ]  tem habilitação?
    - [ ]  *CNH*
    - [ ]  é vallet
- [ ]  tempo de experiência na empresa

🛵 **Veículo**

- [ ]  placa
    - [ ]  validação de placa
- [ ]  categoria
- [ ]  motorista
- [ ]  valor de marcado: consultar na API Fipe
- [ ]  horário de entrada
- [ ]  horário de saída

## Complementares

📍 **Endereço (interface)**

- [ ]  logradouro
- [ ]  cep
- [ ]  número

💳 **CNH (interface)**

- [ ]  nome
- [ ]  categoria
- [ ]  número
    - [ ]  validação: apenas inserções que sejam coerentes com a numeração da *CNH*