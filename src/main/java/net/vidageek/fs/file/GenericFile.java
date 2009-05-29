package net.vidageek.fs.file;

import net.vidageek.fs.File;
import net.vidageek.fs.FileSystemElement;
import net.vidageek.fs.Folder;

public class GenericFile implements File {

    public java.io.File toJavaFile() {
        // TODO Auto-generated method stub
        return null;
    }

    public long lastModified() {
        // TODO Auto-generated method stub
        return 0;
    }

    public Folder getWrappingFolder() {
        // TODO Auto-generated method stub
        return null;
    }

    public long length() {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean canRead() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean canWrite() {
        // TODO Auto-generated method stub
        return false;
    }

    public void delete() {
        // TODO Auto-generated method stub

    }

    public boolean exists() {
        // TODO Auto-generated method stub
        return false;
    }

    public String getAbsolutePath() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getPath() {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean isAbsolute() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isHidden() {
        // TODO Auto-generated method stub
        return false;
    }

    public String relativizeFrom(final FileSystemElement element) {
        // TODO Auto-generated method stub
        return null;
    }

    public void rename(final String newName) {
        // TODO Auto-generated method stub

    }

    public void setLastModified() {
        // TODO Auto-generated method stub

    }

    public void setReadOnly() {
        // TODO Auto-generated method stub

    }

    public int compareTo(final FileSystemElement o) {
        // TODO Auto-generated method stub
        return 0;
    }

}
