/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui.actionlisteners;

import gui.Field;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import referencechampion.Book;
import referencechampion.ReferenceBase;

/**
 *
 * @author alrial
 */
public class CreateBook implements ActionListener {
    
    private ReferenceBase base;
    private Map<String, Field> fields;
    
    public CreateBook(Map<String, Field> fields, ReferenceBase base){
        this.fields = fields;
        this.base = base;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(this.fields);
        HashMap<String, String> values = new HashMap<String, String>();
        for (String s : this.fields.keySet()) {
            values.put(s, this.fields.get(s).getText());
        }
        base.addBook(new Book(values));
        
    }
}
