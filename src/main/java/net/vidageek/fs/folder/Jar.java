package net.vidageek.fs.folder;

import java.util.List;

import net.vidageek.fs.File;
import net.vidageek.fs.FileSystemElement;
import net.vidageek.fs.FileSystemElementMatcher;
import net.vidageek.fs.FileVisitor;
import net.vidageek.fs.Folder;
import net.vidageek.fs.FolderVisitor;
import net.vidageek.fs.file.GenericFile;

final public class Jar implements Folder {

    public java.io.File toJavaFile() {
        // TODO Auto-generated method stub
        return null;
    }

    public long lastModified() {
        // TODO Auto-generated method stub
        return 0;
    }

    public GenericFile createFile(final String fileName) {
        // TODO Auto-generated method stub
        return null;
    }

    public <T extends File> T createFile(final String fileName, final Class<T> fileType) {
        // TODO Auto-generated method stub
        return null;
    }

    public GenericFolder createFolder(final String folderName) {
        // TODO Auto-generated method stub
        return null;
    }

    public <T extends Folder> T createFolder(final String folderName, final Class<T> folderType) {
        // TODO Auto-generated method stub
        return null;
    }

    public Folder getParent() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<? extends FileSystemElement> list(final FileSystemElementMatcher matcher) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<? extends File> listFiles() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<? extends Folder> listFolders() {
        // TODO Auto-generated method stub
        return null;
    }

    public void visitFiles(final FileVisitor visitor) {
        // TODO Auto-generated method stub

    }

    public void visitFolders(final FolderVisitor visitor) {
        // TODO Auto-generated method stub

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
