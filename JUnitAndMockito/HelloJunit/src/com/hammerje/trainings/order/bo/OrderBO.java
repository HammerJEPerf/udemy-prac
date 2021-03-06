package com.hammerje.trainings.order.bo;

import com.hammerje.trainings.order.bo.exception.BOException;
import com.hammerje.trainings.order.dto.Order;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException;

	boolean cancelOrder(int id) throws BOException;

	boolean deleteOrder(int id) throws BOException;

}
