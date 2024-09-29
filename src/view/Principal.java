package view;

import controller.TelefoneController;

import javax.swing.JOptionPane;

import br.edu.fateczl.Fila.*;

public class Principal {

	public static void main(String[] args) {
		Fila<String> f = new Fila<>();
		TelefoneController telCont = new TelefoneController();
		int opc = 0;
		
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n1- Inserir Ligação\n2- Consultar Ligações\n9- Fim"));
			
			switch(opc) {
			case 1:
				String num = JOptionPane.showInputDialog("Digite um número de telefone: ");
				telCont.insereLigacao(f, num);
				break;
				
			case 2:
				try {
					telCont.consultaLigacoes(f);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				System.exit(0);
				
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
			
		}
		
	}

}
