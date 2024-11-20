<center>
![image](https://github.com/user-attachments/assets/e024ca4a-ea11-4dd2-a0b9-c45b787245ee)
</center>
---

# **Conversor de Moedas - Java + API ExchangeRate**

Este projeto foi desenvolvido com o objetivo de aprimorar habilidades em Java, aplicando conceitos de integração com APIs. A aplicação permite a conversão de moedas de forma simples, utilizando valores atualizados em tempo real obtidos através da API ExchangeRate.

## **Funcionalidades**  

- Converter valores entre diferentes moedas.  
- Exibir taxas de câmbio atualizadas.  
- Interface intuitiva para facilitar o uso.  
- Estrutura modular para futuras expansões.  

## **Tecnologias Utilizadas**  

- **Java**: Linguagem de programação principal.  
- **API ExchangeRate**: Fonte dos dados de taxas de câmbio.  
- **Gson**: Biblioteca para manipulação de JSON (versão 2.11.0).  

## **Como Usar**  

1. **Clone o repositório**:  

   ```bash  
   git clone https://github.com/devJunr/Java-Alura-Desafio
   ```

2. **Abra o projeto no IntelliJ IDEA (ou outro editor de sua preferência)**:  

   - Navegue até a pasta `src` e localize o arquivo `App.java`.  

3. **Adicione a dependência Gson**:  

   - Faça o download da biblioteca Gson na versão **2.11.0** (disponível no site do Maven ou no repositório oficial). Ou adicione a mesma que está no diretorio: dependencias , no projeto.  
   - Adicione a biblioteca ao projeto no IntelliJ:  
     - Clique com o botão direito no projeto > `Add Library...` > Escolha o arquivo `.jar` baixado.

4. **Configure a API Key**:  

   - Obtenha uma chave de acesso na [ExchangeRate](https://www.exchangerate-api.com).  

   - Insira a chave no código, no local indicado, dentro do arquivo `apiConsulta.java` e adicione sua key em 

     ```java
         String apiKey = "SUA API KEY";
     ```

5. **Compile e execute o projeto**:  

   - Navegue até a pasta `src` no terminal e rode:  

     ```bash  
     javac App.java  
     java App  
     ```

## **Pré-Requisitos**  

- Java 23 ou superior.  
- IntelliJ IDEA ou outro editor para gerenciar dependências.  
- Biblioteca Gson versão **2.11.0** adicionada ao projeto.  
- Conexão com a internet.  

## **Demonstração**  

```  
--== CONVERSOR DE MOEDAS ==--  
Escolha um valor e digite seu respectivo valor  
1. Dólar para Real (USD -> BRL)  
2. Real para Dólar (BRL -> USD)  
3. Manat Azeri para Real (AZN -> BRL)  
4. Lempira Hondurenha para Real (HNL -> BRL)  
5. Euro para Real (EUR -> BRL)  
6. Libras Esterlinas para Real (GBP -> BRL)  
7. Fechar  
▼  
1  
Dólar Para Real  
Digite o valor em Dólar para converter para Real: USD$2  
-> AGUARDE  
​---------------  
Taxa de conversão de USD para BRL  
USD$ 2.0 => BRL$ 11.5308  
​---------------  
Deseja realizar outra conversão? (S para Sim, N para Não)  
s  
--== CONVERSOR DE MOEDAS ==--  
Escolha um valor e digite seu respectivo valor  
1. Dólar para Real (USD -> BRL)  
2. Real para Dólar (BRL -> USD)  
3. Manat Azeri para Real (AZN -> BRL)  
4. Lempira Hondurenha para Real (HNL -> BRL)  
5. Euro para Real (EUR -> BRL)  
6. Libras Esterlinas para Real (GBP -> BRL)  
7. Fechar  
▼  
2  
Real Para Dólar  
Digite o valor em Real para converter para Dólar: BRL$10  
-> AGUARDE  
​---------------  
Taxa de conversão de BRL para USD  
BRL$ 10.0 => USD$ 1.73  
​---------------  
Deseja realizar outra conversão? (S para Sim, N para Não)  
n  
```

## **Dificuldades Encontradas**  

Durante o desenvolvimento deste projeto, enfrentei alguns desafios:  
1. **Memorização do código**: Trabalhar com Java pela primeira vez ou após um tempo sem prática me fez perceber a importância de revisar conceitos básicos constantemente.  
2. **Integração com a API**: Embora a API ExchangeRate seja bem documentada, ajustar as requisições e entender o fluxo de resposta em JSON exigiu paciência e prática.  
3. **Simples, mas funcional**: Embora o projeto pareça básico, ele é o resultado de um esforço focado em criar uma base sólida e funcional, deixando espaço para melhorias futuras.  

Esses desafios foram valiosos para meu aprendizado e reforçaram minha motivação para continuar explorando mais sobre Java e APIs.  



## **Contato**  

- **Desenvolvedor**: Adriano  
- **GitHub**: [@DevJunr](https://github.com/devjunr)  

---

