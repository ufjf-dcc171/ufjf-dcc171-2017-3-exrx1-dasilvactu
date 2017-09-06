/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017.aula8exemplo01;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author ice
 */
public class JanelaTurmas extends JFrame {
    private final List<Turma> turmas;
    private final JList<Turma> lstTurmas = new JList<Turma>(new DefaultListModel<Turma>());
    private final JList<Aluno> lstAlunos = new JList<Aluno>(new DefaultListModel<Aluno>());
    public JanelaTurmas(List<Turma> sampleData) {
        super("Janela turmas");
        this.turmas = sampleData;
        lstTurmas.setModel(new TurmasListModel(turmas));
        lstTurmas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(lstTurmas),BorderLayout.WEST);
        add(new JScrollPane(lstAlunos),BorderLayout.CENTER);
        lstTurmas.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Turma selecionada = lstTurmas.getSelectedValue();
                if(selecionada!= null){
                    System.out.println(selecionada);
                    lstAlunos.setModel(new AlunosListModel(selecionada.getAlunos()));
                }else{
                    lstAlunos.setModel(new DefaultListModel<>());
                }
            }
        });
    }
    
}
