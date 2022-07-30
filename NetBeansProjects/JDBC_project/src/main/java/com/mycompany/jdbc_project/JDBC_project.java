/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jdbc_project;

/**
 *
 * @author aospinam
 */
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
public class JDBC_project {

    public static void main(String[] args) {
        
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        
        SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        crearRegistros(factory);
        
    }
    
    public static void crearRegistros(SessionFactory factory){
    try(Session sesion =factory.openSession()){
       Transaction transaction = sesion.beginTransaction();
       Customer c1 = new Customer( 497,"Julian",  "Ramirez", "Camila", "3145789043",  "calle 45 c 23-23",  null,  "cali",  "Valle",   "040056" ,  "colombia",  1088, new BigDecimal("30000.2"));
       sesion.save(c1);
       transaction.commit();
        System.out.println("Registro Creado");
    }catch (Exception e){
    System.out.println(e.getMessage());
    }
    }
    
    public static void listarregistros(SessionFactory factory){
        try(Session sesion =factory.openSession()){
       Transaction transaction = sesion.beginTransaction();
       Query consulta = sesion.createQuery("select * from classicmodels.customers order by customerNumber desc limit 10;");
       List<Customer> clientes = consulta.list();
       for(Customer c : clientes){
           System.out.println(c);
       }
        
        transaction.commit();
        }
       catch(Exception e){
           System.out.println(e.getMessage());}
       
    }
   
        
    }
    

