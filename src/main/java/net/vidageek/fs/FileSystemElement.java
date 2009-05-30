package net.vidageek.fs;

import java.io.File;

public interface FileSystemElement {

    File toJavaFile();

    long lastModified();

    void setLastModified(long milliseconds);

    String getName();

    String getAbsolutePath();

    String getPath();

    boolean isAbsolute();

    boolean canRead();

    boolean canWrite();

    boolean exists();

    boolean isHidden();

    void setReadOnly();

    void delete();

    void rename(String newName);
}
