/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.ead.academico;

import br.iesb.ead.academico.apresentacao.JFramePrincipal;
/**
 *
 * @author Jefferson Almeida
 */
public class Principal {
    public static void main(String[] args){
        JFramePrincipal janela = new JFramePrincipal();
        janela.setExtendedState(JFramePrincipal.MAXIMIZED_BOTH);
        janela.setVisible(true);
    }
}
