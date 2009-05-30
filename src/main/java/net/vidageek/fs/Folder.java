package net.vidageek.fs;

import java.util.List;

import net.vidageek.fs.file.GenericFile;
import net.vidageek.fs.folder.GenericFolder;

public interface Folder extends FileSystemElement {

    GenericFile openFile(String fileName);

    <T extends File> T openFile(T t);

    GenericFolder openFolder(String folderName);

    <T extends Folder> T openFolder(T t);

    Folder getParent();

    List<? extends File> listFiles();

    List<? extends Folder> listFolders();

}
