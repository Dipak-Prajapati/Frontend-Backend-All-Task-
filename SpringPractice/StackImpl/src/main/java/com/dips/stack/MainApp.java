package com.dips.stack;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationApp.class);

		Operation operation = context.getBean(Operation.class);

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			try { // try block
				System.out.println("\nEnter to do following. ");
				System.out.println("Enter 1 to insert data. ");
				System.out.println("Enter 2 to delete data. ");
				System.out.println("Enter 3 to insert data at position.");
				System.out.println("Enter 4 to delete data at position. ");
				System.out.println("Enter 5 to print data. ");
				System.out.println("Enter 6 to exit. ");
				System.out.print("Please Enter Choice :");

				int choice = sc.nextInt();
				
				if(choice == 6)
				{
					flag=false;
					sc.close();
					System.out.println("Exited Successfully");
					break;
				}
				operation.performOperation(choice);
			} catch (InputMismatchException e) {
				System.out.println("-----Please Insert Only Number Not Allowed Character-----");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		((AnnotationConfigApplicationContext) context).close();

	}

}
