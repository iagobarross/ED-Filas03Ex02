/*2. Criar um projeto Java que implementa com a biblioteca Fila Genérica para simular um iden�ficador de
chamadas telefônicas enquanto o aparelho está fora da rede ou desligado. A aplicação deve ter uma
classe no package controller, TelefoneController que tem os seguintes métodos:

- insereLigacao(Fila f, String numeroTelefone): void, que insere números de telefone em
uma fila iniciada
- consultaLigacoes(Fila f):void, que desenfilera cada ligação realizada e exibe no console.
Exibir uma exceção caso não haja ligação

Deve ter também uma classe Principal no package view com operações usando JOp�onPane que permita
ao usuário inserir números e consultar as chamadas perdidas. A aplicação deve rodar até uma opção de
saída ser selecionada pelo usuário
*/
package controller;

import br.edu.fateczl.Fila.*;

public class TelefoneController {

	public TelefoneController() {
		super();
	}
	
	public void insereLigacao(Fila<String> f, String numTelefone) {
		f.insert(numTelefone);
	}
	
	public void consultaLigacoes(Fila<String> f) throws Exception {
		
		System.out.println("Histórico de ligações:");

		if(f.isEmpty()) {
			throw new Exception ("Não há ligações no histórico");
		}
		
		while(!f.isEmpty()) {
			try{
				System.out.println(f.remove());
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
			
		}
	}

}
