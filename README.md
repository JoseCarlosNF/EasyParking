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

- [x]  nome
- [x]  *CNH*

👷🏾‍♂️ **Funcionário**

- [x]  nome
- [x]  tem habilitação?
    - [x]  *CNH*

🛵 **Veículo**

- [x]  *Motorista*
- [x]  placa
    - [ ]  validação de placa (Regex)
- [x]  categoria
- [x]  valor de marcado: consultar na API Fipe
- [x]  horário de entrada
- [x]  horário de saída

**🏢 Estabelecimento**

- [x]  *Endereço*
- [x]  *Funcionarios <Lista>*
    - [x]  quantidade
    - [x]  tem vallet?
        - [x]  quantidade de vallets
- [x]  quantidade de vagas
    - [x]  disponíveis/ocupadas
- [ ]  tempo médio de permanência
- [x]  veículos estacionados <*Lista>*
    - [x]  ocupar vaga
    - [x]  desocupar vaga

## Complementares

💳 **CNH**

- [x]  nome
- [x]  categoria
- [x]  número
    - [x]  validação: apenas inserções que sejam coerentes com a numeração da *CNH*

📍 **Endereço**

- [x]  Integração com API de CEPs
    - [x]  cep
    - [x]  logradouro
    - [x]  número
    - [x]  bairro
    - [x]  localidade