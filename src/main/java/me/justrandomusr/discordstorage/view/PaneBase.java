package me.justrandomusr.discordstorage.view;

import javafx.scene.layout.Pane;
import me.justrandomusr.discordstorage.controller.Controller;

abstract class PaneBase<T extends Controller> {
	public MainView main;
	
	protected T controller;
	protected Pane pane;
	
	/** Init the pane and store a reference to the parent view's class */
	public PaneBase(MainView main) {
		this.main = main;
	}
	
	/**
	 * Generate the new pane
	 * @return the constructed pane
	 */
	abstract public Pane construct();
	
	public T getController() {
		return controller;
	}
}
