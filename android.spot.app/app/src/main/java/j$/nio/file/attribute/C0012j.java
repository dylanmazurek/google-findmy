package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;

/* renamed from: j$.nio.file.attribute.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0012j implements InterfaceC0008f {
    public final /* synthetic */ DosFileAttributeView a;

    private /* synthetic */ C0012j(DosFileAttributeView dosFileAttributeView) {
        this.a = dosFileAttributeView;
    }

    public static /* synthetic */ C0012j c(DosFileAttributeView dosFileAttributeView) {
        if (dosFileAttributeView == null) {
            return null;
        }
        if (!(dosFileAttributeView instanceof AbstractC0013k)) {
            return new C0012j(dosFileAttributeView);
        }
        throw null;
    }

    @Override // j$.nio.file.attribute.InterfaceC0008f
    public final /* synthetic */ void a(B b, B b2, B b3) {
        this.a.setTimes(s.d(b), s.d(b2), s.d(b3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof C0012j) {
            obj = ((C0012j) obj).a;
        }
        return dosFileAttributeView.equals(obj);
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
