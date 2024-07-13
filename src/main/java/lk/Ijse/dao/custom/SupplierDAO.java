package lk.Ijse.dao.custom;

import lk.Ijse.dao.CrudDAO;
import lk.Ijse.entity.Supplier;
import lk.Ijse.model.ItemDTO;
import lk.Ijse.model.SupplierDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface SupplierDAO extends CrudDAO<Supplier> {
    @Override
    ArrayList<Supplier> getAll() throws SQLException, ClassNotFoundException;

    @Override
    boolean update(Supplier dto) throws SQLException, ClassNotFoundException;

    boolean add(SupplierDTO dto) throws SQLException, ClassNotFoundException;

    boolean update(SupplierDTO dto) throws SQLException, ClassNotFoundException;

    @Override
    boolean exist(String id) throws SQLException, ClassNotFoundException;

    @Override
    String generateNewID() throws SQLException, ClassNotFoundException;

    @Override
    boolean delete(String id) throws SQLException, ClassNotFoundException;

    @Override
    ItemDTO search(String id) throws SQLException, ClassNotFoundException;

    List<String> getIDS() throws SQLException, ClassNotFoundException;
}
