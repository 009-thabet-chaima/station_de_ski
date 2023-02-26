package Repositories;

import entities.Abonnement;

import java.util.List;

public interface IAbonnementRepository {
  //  boolean findAll = ;

    static Abonnement save(Abonnement a) {return a;}

    static Abonnement findById(long id) {
        Abonnement a =new Abonnement();


        return a;}

    static void deletById(long id) {}

    List<Abonnement> findAll();
}
