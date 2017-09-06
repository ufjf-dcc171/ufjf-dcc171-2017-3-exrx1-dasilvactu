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
public class TurmasListModel implements ListModel<Turma> {

    private final List<Turma> turmas;
    private final List<ListDataListener> dataListeners;
    public TurmasListModel(List<Turma> turmas) {
        this.turmas = turmas;
        this.dataListeners = new ArrayList<>();
    }

    @Override
    public int getSize() {
       return turmas.size();
    }

    @Override
    public Turma getElementAt(int index) {
       return turmas.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
       this.dataListeners.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
       this.dataListeners.add(l);
    }
    
}
