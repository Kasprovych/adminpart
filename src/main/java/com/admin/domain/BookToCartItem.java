package com.admin.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BookToCartItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="book_id")
	private Book book;
	
	@ManyToOne
	@JoinColumn(name="cart_item_id")
	private CartItem cartItem;

	public Long getId() {
		return id;
	}

	public Book getBook() {
		return book;
	}

	public CartItem getCartItem() {
		return cartItem;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void setCartItem(CartItem cartItem) {
		this.cartItem = cartItem;
	}

}
