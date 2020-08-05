package br.dell.modelos;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Hospede h = new Hospede(null,0, 0, 0, null);
		JOptionPane.showMessageDialog(null," CADASTRO DE HOSPEDE.");
		h.setNome(JOptionPane.showInputDialog("NOME : "));
		h.setCpf(Long.parseLong(JOptionPane.showInputDialog("CPF : ")));
		h.setRg(Long.parseLong(JOptionPane.showInputDialog("RG : ")));
		h.setIdade(Integer.parseInt(JOptionPane.showInputDialog("IDADE : ")));
		h.setEndereco(JOptionPane.showInputDialog("ENDERECO : "));
		JOptionPane.showMessageDialog(null,"HOSPEDE CADASTRADO COM SUCESSO.");
		
		Quarto q = new Quarto(0, h);
		 q.setNumero(Integer.parseInt(JOptionPane.showInputDialog("QUARTO N° : ")));
		
		JOptionPane.showMessageDialog(null,"------------- HOSPEDE -------------" + "\n\n" + "NOME : " + h.getNome()+"\n" +"CPF : " + h.getCpf() +"\n" + 
		"RG : " + h.getRg() + "\n" + "IDADE : " + h.getIdade() + "\n" +
				"ENDERECO : " + h.getEndereco() + "\n" + "QUARTO N° : " + q.getNumero());
	}

}
 