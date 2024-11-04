package j$.nio.file.attribute;

import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;

/* loaded from: classes2.dex */
public final /* synthetic */ class G implements InterfaceC0011i {
    public final /* synthetic */ PosixFileAttributes a;

    private /* synthetic */ G(PosixFileAttributes posixFileAttributes) {
        this.a = posixFileAttributes;
    }

    public static /* synthetic */ G a(PosixFileAttributes posixFileAttributes) {
        if (posixFileAttributes == null) {
            return null;
        }
        if (!(posixFileAttributes instanceof H)) {
            return new G(posixFileAttributes);
        }
        throw null;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final /* synthetic */ B creationTime() {
        FileTime creationTime;
        creationTime = this.a.creationTime();
        return s.b(creationTime);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.a;
        if (obj instanceof G) {
            obj = ((G) obj).a;
        }
        return posixFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final /* synthetic */ Object fileKey() {
        Object fileKey;
        fileKey = this.a.fileKey();
        return fileKey;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final /* synthetic */ boolean isDirectory() {
        boolean isDirectory;
        isDirectory = this.a.isDirectory();
        return isDirectory;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final /* synthetic */ boolean isOther() {
        boolean isOther;
        isOther = this.a.isOther();
        return isOther;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final /* synthetic */ boolean isRegularFile() {
        boolean isRegularFile;
        isRegularFile = this.a.isRegularFile();
        return isRegularFile;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final /* synthetic */ boolean isSymbolicLink() {
        boolean isSymbolicLink;
        isSymbolicLink = this.a.isSymbolicLink();
        return isSymbolicLink;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final /* synthetic */ B lastAccessTime() {
        FileTime lastAccessTime;
        lastAccessTime = this.a.lastAccessTime();
        return s.b(lastAccessTime);
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final /* synthetic */ B lastModifiedTime() {
        FileTime lastModifiedTime;
        lastModifiedTime = this.a.lastModifiedTime();
        return s.b(lastModifiedTime);
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final /* synthetic */ long size() {
        long size;
        size = this.a.size();
        return size;
    }
}
