package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

/*
 * 상품 정보 클래스(Entity Class) 필수 요소들
 * 
 * "변수"
 * productCode
 * productName
 * category
 * productionDate
 * 
 * 기본 생성자
 * 
 * 전체 생성자
 * 
 * getter, setter
 * 
 * hashCode()
 * 
 * equals()
 * 
 * toString()
 * 
 */

public class Product {
	private static int productCodeAutoIncrement = 20220000; // 여기 아니면 메인함수에 선언; 없어도o
	private int productCode;
	private String productName;
	private String category;
	private LocalDate productDate;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productCode, String productName, String category, LocalDate productDate) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.category = category;
		this.productDate = productDate;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getProductDate() {
		return productDate;
	}

	public void setProductDate(LocalDate productDate) {
		this.productDate = productDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, productCode, productDate, productName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && productCode == other.productCode
				&& Objects.equals(productDate, other.productDate) && Objects.equals(productName, other.productName);
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", category=" + category
				+ ", productDate=" + productDate + "]";
	}
	
}
