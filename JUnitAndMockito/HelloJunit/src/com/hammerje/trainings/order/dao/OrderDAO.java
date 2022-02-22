package com.hammerje.trainings.order.dao;

import java.sql.SQLException;

import com.hammerje.trainings.order.dto.Order;

public interface OrderDAO {

	int create(Order order) throws SQLException;

	Order read(int id) throws SQLException;

	int update(Order order) throws SQLException;

	int delete(int id) throws SQLException;

}
