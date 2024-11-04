package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0010h implements BasicFileAttributes {
    public final /* synthetic */ InterfaceC0011i a;

    private /* synthetic */ C0010h(InterfaceC0011i interfaceC0011i) {
        this.a = interfaceC0011i;
    }

    public static /* synthetic */ BasicFileAttributes a(InterfaceC0011i interfaceC0011i) {
        if (interfaceC0011i == null) {
            return null;
        }
        if (interfaceC0011i instanceof C0009g) {
            return ((C0009g) interfaceC0011i).a;
        }
        if (interfaceC0011i instanceof C0014l) {
            return ((C0014l) interfaceC0011i).a;
        }
        if (interfaceC0011i instanceof G) {
            return ((G) interfaceC0011i).a;
        }
        return new C0010h(interfaceC0011i);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return s.d(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0011i interfaceC0011i = this.a;
        if (obj instanceof C0010h) {
            obj = ((C0010h) obj).a;
        }
        return interfaceC0011i.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return s.d(this.a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return s.d(this.a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
