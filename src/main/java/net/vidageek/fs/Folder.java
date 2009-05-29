package net.vidageek.fs;

import java.util.List;

import net.vidageek.fs.file.GenericFile;
import net.vidageek.fs.folder.GenericFolder;

public interface Folder extends FileSystemElement {

    GenericFile createFile(String fileName);

    <T extends File> T createFile(String fileName, Class<T> fileType);

    GenericFolder createFolder(String folderName);

    <T extends Folder> T createFolder(String folderName, Class<T> folderType);

    Folder getParent();

    List<? extends File> listFiles();

    List<? extends Folder> listFolders();

}
