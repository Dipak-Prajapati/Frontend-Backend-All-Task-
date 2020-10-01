package com.dips.stack;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class AddRemove {

	ArrayList<Integer> ls = new ArrayList<Integer>();
	int data, position;
	Scanner sc = new Scanner(System.in);

	public AddRemove() {
		System.out.println("This is Default Constructor Of AddRemove");
	}

	public void insertData() {
		System.out.print("\n-----Enter data into Stack: ");
		data = sc.nextInt();
		ls.add(data);
	}

	/* Delete Data */
	public void deleteData() {
		if (ls.size() < 1) {
			System.out.println("\n-----There is no data into Stack-----\n");
		} else {
			/*
			 * System.out.print("\n-----Which data would you like to delete : "); data =
			 * sc.nextInt(); boolean found=false; for(int i=0;i<ls.size();i++){ if(ls.get(i)
			 * == data){ ls.remove(i); found=true;
			 * System.out.println("\n-----Data succesfully removed-----\n"); } }
			 * if(found==false){
			 * System.out.println("\n-----Data is not found(Not deleted!)-----\n"); }
			 */
			int index = ls.size() - 1;
			ls.remove(index);
			System.out.println("Last Data Deleted Successfully from Stack");
		}
	}

	/* Which position in insert to data */
	public void insertPosition() {
		System.out.print("\n-----Enter at which position would you like to enter data : ");
		position = sc.nextInt();
		if (position < 1 || position > ls.size() + 1) {
			System.out.println("\n-----Invalid position-----\n");
		} else {
			System.out.print("\n-----Enter data : ");
			data = sc.nextInt();
			ls.add((position - 1), data);
			System.out.println("\n-----Data is entered at inserted position-----\n");
		}
	}

	/* Which position from delete to data */
	public void deletePosition() {
		if (ls.size() < 1) {
			System.out.println("\n-----There is no data into into Stack -----\n");
		} else {
			System.out.print("\n-----Enter at which position would you like to delete : ");
			position = sc.nextInt();
			if (position < 1 || position > ls.size()) {
				System.out.println("\n-----Invalid position-----\n");
			} else {
				ls.remove(position - 1);
				System.out.println("\n-----Data is deleted at inserted position-----\n");
			}
		}
	}

	/* Display Data */
	public void displayData() {

		if (ls.size() < 1) {
			System.out.println("\n-----There is no data into stack-----\n");
		} else {
			System.out.println("\nData is : " + ls);
		}
	}

}
