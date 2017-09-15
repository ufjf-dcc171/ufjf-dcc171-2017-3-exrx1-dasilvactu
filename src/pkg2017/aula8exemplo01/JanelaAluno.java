/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017.aula8exemplo01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ice
 */
public class JanelaAluno extends JFrame {
    private final JLabel lblMatricula = new JLabel("Matricula");
    private final JLabel lblNome = new JLabel("Nome");
    private final JTextField txtMatricula = new JTextField();
    private final JTextField txtNome = new JTextField();
    private final JButton adiciona = new JButton("Adiciona");
    private final JButton cancela = new JButton("Cancela");
    private JanelaTurmas janelaTurmas;
    public JanelaAluno() throws HeadlessException {
        super("Dados Aluno");
        setResizable(false);
        setSize(200,90);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        JPanel principal = new JPanel(new GridLayout(3,2));
        principal.add(lblMatricula);
        principal.add(txtMatricula);
        principal.add(lblNome);
        principal.add(txtNome);
        principal.add(adiciona);
        principal.add(cancela);
        add(principal,BorderLayout.CENTER);
        adiciona.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtMatricula.getText().isEmpty() && !txtNome.getText().isEmpty()){
                    Aluno a= new Aluno();
                    a.setMatricula(txtMatricula.getText());
                    a.setNome(txtNome.getText());
                    janelaTurmas.adicionaAluno(a);
                }
            }
        });
    }

    public void setJanelaTurmas(JanelaTurmas janelaTurmas) {
        this.janelaTurmas = janelaTurmas;
    }

    void solicitaNovoAluno() {
        setVisible(true);
        setLocationRelativeTo(null);
        txtNome.setText("");
        txtMatricula.setText("");
        txtMatricula.requestFocus();
    }
    
    
    
}
