package test;

import javax.persistence.*;
import mx.com.gm.sga.domain.Alumno;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class ClienteEntidadPersona {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Inicia la transaccion
        tx.begin();
        //No se debe especificar el ID de la base de datos
        //Persona persona1 = new Persona("Wilmer","membreño","wmembreno@mail.com","88991199");
        Alumno alumno = new Alumno("Andy", "Javier","60509544");
        log.debug("Objeto a persistir:" + alumno);
        //Persistimos el objeto
        em.persist(alumno);
        //terminamos la transaccion
        tx.commit();
        log.debug("Objeto persistido" + alumno);
        em.close();
    }
}
