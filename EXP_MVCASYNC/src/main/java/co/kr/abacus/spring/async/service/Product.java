package co.kr.abacus.spring.async.service;

public class Product {
	
	private String svcCd;
	
	public Product() {}
	
	public Product(String svcCd) {
		this.svcCd = svcCd;
	}
	

	public String getSvcCd() {
		return svcCd;
	}

	public void setSvcCd(String svcCd) {
		this.svcCd = svcCd;
	}

}
