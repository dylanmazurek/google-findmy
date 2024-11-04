package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements InterfaceC0008f, z {
    public final /* synthetic */ PosixFileAttributeView a;

    private /* synthetic */ E(PosixFileAttributeView posixFileAttributeView) {
        this.a = posixFileAttributeView;
    }

    public static /* synthetic */ E c(PosixFileAttributeView posixFileAttributeView) {
        if (posixFileAttributeView == null) {
            return null;
        }
        if (!(posixFileAttributeView instanceof F)) {
            return new E(posixFileAttributeView);
        }
        throw null;
    }

    @Override // j$.nio.file.attribute.InterfaceC0008f
    public final /* synthetic */ void a(B b, B b2, B b3) {
        this.a.setTimes(s.d(b), s.d(b2), s.d(b3));
    }

    @Override // j$.nio.file.attribute.z
    public final /* synthetic */ void b(N n) {
        this.a.setOwner(M.a(n));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof E) {
            obj = ((E) obj).a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.z
    public final /* synthetic */ N getOwner() {
        UserPrincipal owner;
        owner = this.a.getOwner();
        return L.a(owner);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.v
    public final /* synthetic */ String name() {
        String name;
        name = this.a.name();
        return name;
    }

    @Override // j$.nio.file.attribute.InterfaceC0008f
    public final /* synthetic */ InterfaceC0011i readAttributes() {
        BasicFileAttributes readAttributes;
        readAttributes = this.a.readAttributes();
        return C0009g.a(readAttributes);
    }
}
