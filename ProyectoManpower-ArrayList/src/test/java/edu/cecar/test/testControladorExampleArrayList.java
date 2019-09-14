/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.test;

import edu.cecar.controladores.ControladorExampleArrayList;
import edu.cecar.modelos.Example;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author A3C
 */
public class testControladorExampleArrayList {
    public static void main(String[] args) throws SQLException {
        ControladorExampleArrayList controlador = new ControladorExampleArrayList();
        ArrayList<Example> examples = controlador.consultarEmpleado();
        int i=0;
        for (Example example : examples) {
            System.out.println(i++);
            System.out.println("Date Of Stop: "+example.getDate_of_stop());
               System.out.println("Fatal: "+example.getFatal());
                  System.out.println("Alcohol: "+example.getAlcohol());
                     System.out.println("Gender: "+example.getGender());
                     System.out.println("--------------------------------");
                     
                     //@author //MOSTRAR POR GENDER, DATE, FATAL
                     examples.stream().filter(e -> e.getDate_of_stop().equals("09/06/2013")).
                                       forEach(e -> System.out.println("fecha :" + e.getDate_of_stop() 
                                        + " Fatal " + e.getFatal() + " Alcohol " + e.getAlcohol() 
                                        + " gender " + e.getGender()));
                     examples.stream().filter(e -> e.getGender().equals("M")).
                                       forEach(e -> System.out.println("fecha :" + e.getDate_of_stop() 
                                        + " Fatal " + e.getFatal() + " Alcohol " + e.getAlcohol() 
                                        + " gender " + e.getGender()));
                     examples.stream().filter(e -> e.getGender().equals("M") && e.getDate_of_stop().equals("09/06/2013")).
                                       forEach(e -> System.out.println("fecha :" + e.getDate_of_stop() 
                                        + " Fatal " + e.getFatal() + " Alcohol " + e.getAlcohol() 
                                        + " gender " + e.getGender()));
                     examples.stream().sorted(Comparator.comparing(Example::getDate_of_stop)).
                              forEach(e -> System.out.println("fecha :" + e.getDate_of_stop() 
                               + " Fatal " + e.getFatal() + " Alcohol " + e.getAlcohol() 
                               + " gender " + e.getGender()));
                     examples.stream().sorted(Comparator.comparing(Example::getFatal)).
                              forEach(e -> System.out.println("fecha :" + e.getDate_of_stop() 
                               + " Fatal " + e.getFatal() + " Alcohol " + e.getAlcohol() 
                               + " gender " + e.getGender())); 
                     
                     
        }
       
      /*  ArrayList<Example> resultadoGenero = controlador.consultarEmpleadoGenero();
        for (Example example : resultadoGenero) {
			System.out.println("Genero: "+example.getGender());
			System.out.println("_---------------------------");
		}*/
    }
}
