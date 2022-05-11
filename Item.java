package one2many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {
	
	    @Id
		@Column(name="ITEMID")
		private int itemId;
	    
	     @ManyToOne
		 @JoinColumn(name="ORDID")	 
	     private int orderId;
	
	
	@Column(name="PRODID")
	private int productId;
	
	@Column(name="ACTUALPRICE")
	private int actualPrice;
	
	@Column(name="QTY")
	private int quantity;
	
	@Column(name="ITEMTOT")
	private int itemTotal;
	private Order ord;
	
	
	@OneToMany(mappedBy="Product", fetch = FetchType.EAGER, cascade = CascadeType.ALL )
	private List<Product> productList;


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public int getActualPrice() {
		return actualPrice;
	}


	public void setActualPrice(int actualPrice) {
		this.actualPrice = actualPrice;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getItemTotal() {
		return itemTotal;
	}


	public void setItemTotal(int itemTotal) {
		this.itemTotal = itemTotal;
	}


	public Order getOrd() {
		return ord;
	}


	public void setOrd(Order ord) {
		this.ord = ord;
	}


	public List<Product> getProductList() {
		return productList;
	}


	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}

