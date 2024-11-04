package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0014l implements InterfaceC0011i {
    public final /* synthetic */ DosFileAttributes a;

    private /* synthetic */ C0014l(DosFileAttributes dosFileAttributes) {
        this.a = dosFileAttributes;
    }

    public static /* synthetic */ C0014l a(DosFileAttributes dosFileAttributes) {
        if (dosFileAttributes == null) {
            return null;
        }
        if (!(dosFileAttributes instanceof AbstractC0015m)) {
            return new C0014l(dosFileAttributes);
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
        DosFileAttributes dosFileAttributes = this.a;
        if (obj instanceof C0014l) {
            obj = ((C0014l) obj).a;
        }
        return dosFileAttributes.equals(obj);
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
