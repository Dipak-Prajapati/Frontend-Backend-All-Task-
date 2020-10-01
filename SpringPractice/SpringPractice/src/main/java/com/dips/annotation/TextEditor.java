package com.dips.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.*;

public class TextEditor {

	// @Autowired on Setter Methods

	private SpellChecker spellChecker;

	public TextEditor() {
		System.out.println("Inside TextEditor constructor.");
	}

	//@Autowired
	@Resource
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	// @Autowired on Properties

	/*
	 * @Autowired private SpellChecker spellChecker;
	 * 
	 * public TextEditor() { System.out.println("Inside TextEditor constructor." );
	 * } public SpellChecker getSpellChecker( ){ return spellChecker; } public void
	 * spellCheck(){ spellChecker.checkSpelling(); }
	 */

	// @Autowired on Constructors

	/*
	 * private SpellChecker spellChecker;
	 * 
	 * @Autowired public TextEditor(SpellChecker spellChecker) {
	 * System.out.println("Inside TextEditor constructor."); this.spellChecker =
	 * spellChecker; }
	 * 
	 * public void spellCheck() { spellChecker.checkSpelling(); }
	 */

	// @Autowired with (required = false) option
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init method");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy Method");
	}
}