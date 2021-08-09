/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Killer Queen
 */
public class hardware 
{
    public ArrayList<String> hards = new ArrayList(); 
    
    public ArrayList<String> backup = new ArrayList(); 
    
    public void adicionar(String hard) 
    {
        hards.add(hard.toUpperCase()); 
        
        JOptionPane.showMessageDialog(null, "O registro " + hard + " foi adicionado com sucesso");
    }
    
    public String listarHards() 
    {
        String rel = "Items\n\n=================================\n\n";
        
        if(!hards.isEmpty()) 
        {
            for(int i = 0; i < hards.size(); i++) 
            {
                rel += (i + 1) + " - " + hards.get(i) + "\n";
            }
        }
        else
        {
            rel = "Base vazia"; 
        }
        return rel; 
    }  
    
    public void eliminar() 
    {
        if(!hards.isEmpty()) 
        {
            if(JOptionPane.showConfirmDialog(null, "Apagar?", "Eliminar base", JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION)
            {
                hards.clear(); 
                JOptionPane.showMessageDialog(null, "Base eliminada com sucesso"); 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "A base nao foi apagada"); 
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Base vazia"); 
        }
    }
    
    public boolean returnVazio()
    {
        return hards.isEmpty();
    }
    
    public int pesquisar(String nome) 
    {
            boolean flag = false; 
            int i = 0;
            int ind = -1;
            
            while(i < hards.size() && !(flag)) 
            {
                if(hards.get(i).equals(nome.toUpperCase())) 
                {
                    flag = true; 
                    ind = i;
                }
                
                i++;
            }
            
            return ind;
    }
    
    public void excluir(int i) 
    {
        hards.remove(i);    
    }
    
    public void editar(int i, String novoNome) 
    {
        hards.set(i, novoNome);
    }
    
    public void backup()
    {
        if(!hards.isEmpty()) 
        {
            if(JOptionPane.showConfirmDialog(null, "Fazer backup?", "Backup", JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION)
            {
                backup = (ArrayList<String>) hards.clone();
                JOptionPane.showMessageDialog(null, "Backup feito com sucesso");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Operacao cancelada");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Base vazia"); 
        }
    }
    
    public void restaurar()
    {
        if(JOptionPane.showConfirmDialog(null, "Restaurar base?", "Restaurar", JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION)
        {
            hards = (ArrayList<String>) backup.clone();
            JOptionPane.showMessageDialog(null, "Restauração feita com êxito"); 
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Operacao cancelada"); 
        }
    }

    
    public void ordenar()
    {
        Collections.sort(hards); 
        JOptionPane.showMessageDialog(null, "Ordenado de forma crescente"); 
    }
    
    public void desordenar()
    {
        Collections.sort(hards, Collections.reverseOrder()); 
        JOptionPane.showMessageDialog(null, "Ordenado de forma decrescente");
    }
    
    public void abrirNotas()
    {
        Runtime abrir = Runtime.getRuntime();
 
        try
        {
            abrir.exec("notepad.exe");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
