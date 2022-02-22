package com.hammerje.trainings;

import com.hammerje.trainings.order.bo.OrderBOImpl;
import com.hammerje.trainings.order.dao.OrderDAO;
import com.hammerje.trainings.order.dto.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

import java.sql.SQLException;

public class OrderBOImplTest {

    @Mock
    OrderDAO dao;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void placeOrder_Should_Create_An_Order() throws SQLException {
        OrderBOImpl bo = new OrderBOImpl();
        bo.setDao(dao);

        Order order = new Order();
        when(dao.create(order)).thenReturn(new Integer(1));
        boolean result = bo.placeOrder(order);
    }
}
