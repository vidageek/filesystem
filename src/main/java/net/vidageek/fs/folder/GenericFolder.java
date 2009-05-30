package net.vidageek.fs.folder;

import java.util.List;

import net.vidageek.fs.File;
import net.vidageek.fs.Folder;
import net.vidageek.fs.file.GenericFile;

final public class GenericFolder implements Folder {

    public Folder getParent() {

        return null;
    }

    public List<? extends File> listFiles() {

        return null;
    }

    public List<? extends Folder> listFolders() {

        return null;
    }

    public GenericFile openFile(final String fileName) {

        return null;
    }

    public <T extends File> T openFile(final T t) {

        return null;
    }

    public GenericFolder openFolder(final String folderName) {

        return null;
    }

    public <T extends Folder> T openFolder(final T t) {

        return null;
    }

    public boolean canRead() {

        return false;
    }

    public boolean canWrite() {

        return false;
    }

    public void delete() {

    }

    public boolean exists() {

        return false;
    }

    public String getAbsolutePath() {

        return null;
    }

    public String getName() {

        return null;
    }

    public String getPath() {

        return null;
    }

    public boolean isAbsolute() {

        return false;
    }

    public boolean isHidden() {

        return false;
    }

    public long lastModified() {

        return 0;
    }

    public void rename(final String newName) {

    }

    public void setLastModified() {

    }

    public void setReadOnly() {

    }

    public java.io.File toJavaFile() {

        return null;
    }
}
