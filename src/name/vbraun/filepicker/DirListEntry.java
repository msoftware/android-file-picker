package name.vbraun.filepicker;

import java.io.File;

public class DirListEntry {

	protected DirListEntry(File file) {
		this.file = file;
		title = file.getName();
		if (file.isDirectory())
			icon = R.drawable.grid_folder;
		else
			icon = R.drawable.grid_file;
	}
	
	protected String title;
	protected int icon;
	protected File file;
	
}
