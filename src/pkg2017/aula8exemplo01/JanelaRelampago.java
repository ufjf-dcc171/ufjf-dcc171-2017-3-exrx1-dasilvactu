/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017.aula8exemplo01;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author ice
 */
public class JanelaRelampago extends JFrame {
    private final List<Relampago> eventos;
    private final JList<Relampago> lstEvento = new JList<Relampago>(new DefaultListModel<Relampago>());
    private final JButton adicionaEvento = new JButton("Adiciona");
    private final JButton excluiEvento = new JButton("Exclui evento");
    private final JButton editaEvento = new JButton("EditaEvento");
    private final JTextField latitude = new JTextField();
    private final JTextField longitude = new JTextField();
    private final JTextField dataHora = new JTextField();
    private final JTextArea descricao = new JTextArea();
    private final JLabel lblLatitude = new JLabel("Latitude");
    private final JLabel lblLongitude = new JLabel("Longitude");
    private final JLabel lblDataHora = new JLabel("Data e Hora");
    private final JLabel lblDescricao = new JLabel("Decricao");
    public JanelaRelampago() {
        super("Janela turmas");
        setMinimumSize(new Dimension(500, 300));
        eventos = new ArrayList<Relampago>();
        lstEvento.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lstEvento.setModel(new RelampagosListModel(eventos));
        add(new JScrollPane(lstEvento),BorderLayout.WEST);
        JPanel dados = new JPanel(new GridLayout(4,2));
        add(dados,BorderLayout.CENTER);
        JPanel botoes = new JPanel(new GridLayout(1,3));
        add(botoes,BorderLayout.SOUTH);
        dados.add(lblLatitude);
        dados.add(latitude);
        dados.add(lblLongitude);
        dados.add(longitude);
        dados.add(lblDataHora);
        dados.add(dataHora);
        dados.add(lblDescricao);
        dados.add(descricao);
       
        
        botoes.add(adicionaEvento);
        botoes.add(excluiEvento);
        botoes.add(editaEvento);
        
        lstEvento.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
               Relampago selecionado = lstEvento.getSelectedValue();
               if(selecionado!=null){
                   latitude.setText(Float.toString(selecionado.getLat()));
                   longitude.setText(Float.toString(selecionado.getLongi()));
                   SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                   s.setLenient(false);
                   dataHora.setText(s.format(selecionado.getDataHora()));
                   descricao.setText(selecionado.getDescricao());
               }
               
            }
        });
        adicionaEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Relampago selecionado = lstEvento.getSelectedValue();
                if(selecionado == null){
                   selecionado = new Relampago();
                    
                }
                selecionado.setDescricao(descricao.getText());
                selecionado.setLat(Float.parseFloat(latitude.getText()));
                selecionado.setLongi(Float.parseFloat(longitude.getText()));
                Date d1 = new Date();
                SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                s.setLenient(false);

                try {
                    d1= s.parse(dataHora.getText());
                } catch (ParseException ex) {
                    Logger.getLogger(JanelaRelampago.class.getName()).log(Level.SEVERE, null, ex);
                }
                selecionado.setDataHora(d1);
                if(lstEvento.getSelectedValue()==null){
                    eventos.add(selecionado);
                    
                }
                lstEvento.updateUI();
                lstEvento.clearSelection();
                limpaFormulario();
            }
        });
        excluiEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(!lstEvento.isSelectionEmpty()){
                   eventos.remove(lstEvento.getSelectedValue());
                   lstEvento.clearSelection();
                   lstEvento.updateUI();
                   
               }
            }
        });
        editaEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpaFormulario();
            }
        });
        
        
    }
    void limpaFormulario(){
        latitude.setText("");
        longitude.setText("");
        dataHora.setText("");
        descricao.setText("");
        
    }
}