package entitie;

import java.sql.Date;

import entities.enums.OrderStatus;

public class Order {
	
	private Integer id;
	private java.util.Date moment;
	private OrderStatus status;
	
	public Order() {
	}

	public Order(Integer id, java.util.Date date, OrderStatus status) {
		this.id = id;
		this.moment = date;
		this.status = status;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public java.util.Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
	
}
