package cjava.daos;

import cjava.entidades.Administrador;
import cjava.servicios.AdministradorDao;
import java.util.List;


public class AdministradorDaoXml implements AdministradorDao{

    @Override
    public void create(Administrador administrador) {
        System.out.println("grabando datos en archivo xml");
    }

    @Override
    public void update(Administrador administrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrador find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Administrador> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
