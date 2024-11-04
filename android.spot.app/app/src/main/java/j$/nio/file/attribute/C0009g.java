package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0009g implements InterfaceC0011i {
    public final /* synthetic */ BasicFileAttributes a;

    private /* synthetic */ C0009g(BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ InterfaceC0011i a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        return basicFileAttributes instanceof C0010h ? ((C0010h) basicFileAttributes).a : AbstractC0005c.t(basicFileAttributes) ? C0014l.a(AbstractC0005c.l(basicFileAttributes)) : AbstractC0005c.w(basicFileAttributes) ? G.a(AbstractC0005c.q(basicFileAttributes)) : new C0009g(basicFileAttributes);
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final /* synthetic */ B creationTime() {
        FileTime creationTime;
        creationTime = this.a.creationTime();
        return s.b(creationTime);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof C0009g) {
            obj = ((C0009g) obj).a;
        }
        return basicFileAttributes.equals(obj);
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
