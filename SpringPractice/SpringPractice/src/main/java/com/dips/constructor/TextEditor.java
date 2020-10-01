package com.dips.constructor;

public class TextEditor {

	private SpellChecker sc;

	// Constructor based Injection
	/*
	 * public TextEditor(SpellChecker sc) {
	 * System.out.println("In TextEditor Constructor"); this.sc = sc; }
	 */

	
	
	public void spellCheck() {
		sc.checkSpelling();
	}

	public SpellChecker getSc() {
		return sc;
	}

	public void setSc(SpellChecker sc) {
		System.out.println("In TextEditor Setter");
		this.sc = sc;
	}

}
