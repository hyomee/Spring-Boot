package co.kr.abacus.spring.di.entrdev.service;

import org.springframework.stereotype.Component;

@Component("usimDevice")
public class UsimDeviceImpl implements Device {
	// 일반 판매 
	public void sale() {
		System.out.println("유심 일반  판매");
	}
	
	// 할브 판매 
	public void installment() {
		System.out.println("유심 할부  판매");
	}
}
