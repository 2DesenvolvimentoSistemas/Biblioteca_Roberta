/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.design.Livro;

/**
 *
 * @author Professor
 */
public class ModeloTabelaLivro extends AbstractTableModel {
    
    //lista
    private List<Livro> livro = new ArrayList<>();
    
    //vetor de rotulos de campo
    private String[] colunas = {"Nome do livro","Acabamento","Código do livro","Preço"};

    @Override
    public int getRowCount() {
        return this.livro.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.livro.get(rowIndex).getNomeLivro();
            case 1:
                return this.livro.get(rowIndex).getAcabamento();
            case 2:
                return this.livro.get(rowIndex).getCodLivro();
            case 3:
                return this.livro.get(rowIndex).getPreco();
        }
        
        return null;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas[columnIndex];
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                this.livro.get(rowIndex).setNomeLivro(o.toString());
                break;
            case 1:
                this.livro.get(rowIndex).setAcabamento(o.toString());
            case 2:
                this.livro.get(rowIndex).setCodLivro(Integer.parseInt((String)o));
                break;
            case 3:
                this.livro.get(rowIndex).setPreco(Double.parseDouble((String)o));
                break;
        }
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
    public void addRow (Livro l){
    this.livro.add(l);
    this.fireTableDataChanged();
    }
    
    public void removeRow (int rowIndex){
    this.livro.remove(rowIndex);
    this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    
    
    
    
    
}

