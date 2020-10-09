package lk.ijse.dep.dao.custom.impl;

import lk.ijse.dep.dao.CrudDAOImpl;
import lk.ijse.dep.dao.custom.OrderDAO;
import lk.ijse.dep.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOImpl extends CrudDAOImpl<Order,String> implements OrderDAO {
    public String getLastOrderId() throws Exception {
        return (String) getSession().createQuery("SELECT o.id FROM lk.ijse.dep.entity.Order o ORDER BY o.id DESC")
                .setMaxResults(1).list().get(0);
    }

}
