package net.vidageek.fs.file;

import net.vidageek.fs.File;
import net.vidageek.fs.Folder;

public class GenericFile implements File {

    private final java.io.File file;

    public GenericFile(final java.io.File file) {
        if (file == null) {
            throw new IllegalArgumentException("null is not a valid file");
        }
        this.file = new java.io.File(file.getAbsolutePath());
    }

    public Folder getWrappingFolder() {
        return null;
    }

    public long length() {
        return file.length();
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
        return file.lastModified();
    }

    public void rename(final String newName) {

    }

    public void setLastModified(final long milliseconds) {
        file.setLastModified(milliseconds);
    }

    public void setReadOnly() {

    }

    public java.io.File toJavaFile() {
        return null;
    }

    public void apply() {
        // TODO Auto-generated method stub

    }

}
