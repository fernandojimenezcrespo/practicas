/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import beans.CentrosBean;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author 06553669A
 */
public class CentroDao {
    
    public HashSet<CentrosBean> getLista (){
        HashSet<CentrosBean> listaCentros = new HashSet<>();
        
        LocalDate fecha = LocalDate.of(2000, 12, 8);
       
        CentrosBean centro = new CentrosBean (1, "1");
        listaCentros.add(centro);
        centro = new CentrosBean (1, "1");
        listaCentros.add(centro);
        
         centro = new CentrosBean (1, "1");
        listaCentros.add(centro);
        
         centro = new CentrosBean (1, "1");
        listaCentros.add(centro);
        
        /*
        List<CentrosBean> lista= new ArrayList<CentrosBean>(listaCentros);
        Collections.sort(lista);
        listaCentros=new HashSet<CentrosBean>(lista);
        */
        
        return listaCentros;
    
}
}
