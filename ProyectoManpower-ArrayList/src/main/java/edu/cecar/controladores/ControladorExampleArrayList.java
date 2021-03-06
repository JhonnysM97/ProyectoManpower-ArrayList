/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.controladores;

import static edu.cecar.componentes.singletons.SingletonConexionBD.getInstance;
import edu.cecar.modelos.Example;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/** 
 *
 * @author A3C
 */
public class ControladorExampleArrayList {
   
    public ArrayList<Example> consultarEmpleado() throws SQLException {
        ArrayList<Example> resultado = new ArrayList<>();
        //Se recuperan los registros de la tabla
        // examples
           PreparedStatement ps = 
                   getInstance().
                           prepareStatement("Select * "
                           + "from examples limit 500");
           
            ResultSet resultSet = 
                    ps.executeQuery();
                while (resultSet.next()){
               
                Example example = new
                    Example(resultSet.getString(1), 
                            resultSet.getString(2), 
                            resultSet.getString(3), 
                            resultSet.getString(4));
                
                resultado.add(example);
            }   
                  
        
        return resultado;
    }
    public ArrayList<Example> consultarEmpleadoGenero() throws SQLException {
        ArrayList<Example> resultado = new ArrayList<>();
        //Se recuperan los registros de la tabla
        // examples
           PreparedStatement ps = 
                   getInstance().
                           prepareStatement("Select  Gender from examples limit 30");
         
           
            ResultSet resultSet = 
                    ps.executeQuery();
                while (resultSet.next()){
                	Example example = new Example();
              example.setGender(resultSet.getString(1));
                       
                resultado.add(example);
            }   
                  
        
        return resultado;
    }
     
}
