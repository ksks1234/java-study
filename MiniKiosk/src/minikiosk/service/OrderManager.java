package minikiosk.service;

import java.util.ArrayList;
import java.util.List;

import minikiosk.exception.InvalidQuantityException;
import minikiosk.exception.ItemNotFoundException;
import minikiosk.model.MenuItem;
import minikiosk.model.OrderItem;

public class OrderManager {
	private List<MenuItem> menuList;
	private List<OrderItem> orderList;
	
	// 메뉴 등록 메서드
	public void addMenuItem(MenuItem item) {
		menuList.add(new MenuItem(item.getName(), item.getPrice()));
	}
	
	// 등록된 메뉴 목록 출력
	public void printMenu() {
		for(MenuItem item : menuList) {
			System.out.println("[" + item.getName() + "]\t "
					+ "가격: " + item.getPrice());
		}
	}
	
	// 주문 추가(예외 처리 포함)
	public void placeOrder(String itemName, int quantity) 
			throws ItemNotFoundException, InvalidQuantityException {
		// menuItem에 있는지 확인
		for(int i = 0; i < menuList.size(); i++) {
			if (menuList.get(i).getName().equals(itemName) && quantity > 0) {
				orderList.add(new OrderItem(menuList.get(i), quantity));
			} else {
				System.out.println("잘못된 주문입니다. 메뉴와 수량을 다시 확인해 주세요");
			}
		}
	}

	
	// 전체 주문 출력
	public void printOrders() {
		for(int i = 0; i < orderList.size(); i++) {
				System.out.println("["+orderList.get(i).getMenuItem().getName()+"]\t "
						+ "+ 가격: " + orderList.get(i).getMenuItem().getPrice());
		}
		
	}
	// 총 결제 금액 출력
	public int calculateTotal() {
		int sum = 0;
		for(int i = 0; i < orderList.size(); i++) {
			sum += orderList.get(i).getMenuItem().getPrice() * orderList.get(i).getQuantity();
		}
		return sum;
	}
}
