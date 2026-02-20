package com.capgemini.hibernate.hibernate_onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        // Step 1: Create EntityManagerFactory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        // Step 2: Create EntityManager
        EntityManager em = emf.createEntityManager();
        // Step 3: Begin Transaction
        em.getTransaction().begin();
        // Step 4: Create objects
        Account account = new Account("ACC12345", "Savings");
        Customer customer = new Customer("John Doe", account);
        // set bidirectional relationship
        account.setCustomer(customer);
        // Step 5: Persist customer (account will also persist if cascade is used)
        em.persist(customer);
        // Step 6: Commit transaction
        em.getTransaction().commit();
        System.out.println("Customer and Account saved successfully!");

        // Step 7: Fetch data
        Customer fetchedCustomer = em.find(Customer.class, customer.getId());

        System.out.println("Fetched Customer: " + fetchedCustomer);

        // Step 8: Close resources
        em.close();
        emf.close();
    }
}
