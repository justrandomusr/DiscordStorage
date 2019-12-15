package me.justrandomusr.discordstorage.view;

import javafx.scene.layout.Pane;
import me.justrandomusr.discordstorage.controller.DownloadController;

public class PaneDownload extends PaneBase<DownloadController> {

	public PaneDownload(MainView main) {
		super(main);
	}

	@Override
	public Pane construct() {
		controller = new DownloadController(this);
		
		
		
		return pane;
	}

}
