/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017.aula8exemplo01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author ice
 */
public class AlunosListModel implements ListModel<Aluno> {

    private final List<Aluno> alunos;
    private final List<ListDataListener> dataListeners;
    public AlunosListModel(List<Aluno> alunos) {
        this.alunos = alunos;
        this.dataListeners = new ArrayList<>();
    }

    @Override
    public int getSize() {
       return alunos.size();
    }

    @Override
    public Aluno getElementAt(int index) {
       return alunos.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
       this.dataListeners.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
       this.dataListeners.remove(l);
    }
    
}
