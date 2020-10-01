package com.dips.stack;

import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Operation {

	private AddRemove addremove;

	public AddRemove getAddremove() {
		return addremove;
	}

	@Autowired
	public void setAddremove(AddRemove addremove) {
		this.addremove = addremove;
		System.out.println("This is Setter AddRemove Method in Operation Class");
	}

	@PostConstruct
	public void init() {
		System.out.println("This is init() in Operation class");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("This is destroy() in Operation Class");
	}

	public void performOperation(int choice) {
		// TODO Auto-generated method stub

		

		switch (choice) {
		/* Insert Data */
		case 1:
			addremove.insertData();
			break;
		/* Delete Data */
		case 2:
			addremove.deleteData();
			break;
		/* Insert Data At Any Position */
		case 3:
			addremove.insertPosition();
			break;
		/* Delete Data At Any Position */
		case 4:
			addremove.deletePosition();
			break;
		/* Display Data From Array List */
		case 5:
			addremove.displayData();
			break;
		/* Exit */
		/*
		 * case 6: flag = false; sc.close(); break;
		 */
		default:
			System.out.println("\n-----Invalid choice enter choice again-----\n");
		}
	}

}
