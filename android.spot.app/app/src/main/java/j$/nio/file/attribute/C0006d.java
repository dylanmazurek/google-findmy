package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

/* renamed from: j$.nio.file.attribute.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0006d implements InterfaceC0008f {
    public final /* synthetic */ BasicFileAttributeView a;

    private /* synthetic */ C0006d(BasicFileAttributeView basicFileAttributeView) {
        this.a = basicFileAttributeView;
    }

    public static /* synthetic */ InterfaceC0008f c(BasicFileAttributeView basicFileAttributeView) {
        if (basicFileAttributeView == null) {
            return null;
        }
        return basicFileAttributeView instanceof C0007e ? ((C0007e) basicFileAttributeView).a : j$.nio.file.s.r(basicFileAttributeView) ? C0012j.c(j$.nio.file.s.i(basicFileAttributeView)) : j$.nio.file.s.v(basicFileAttributeView) ? E.c(AbstractC0005c.p(basicFileAttributeView)) : new C0006d(basicFileAttributeView);
    }

    @Override // j$.nio.file.attribute.InterfaceC0008f
    public final /* synthetic */ void a(B b, B b2, B b3) {
        this.a.setTimes(s.d(b), s.d(b2), s.d(b3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof C0006d) {
            obj = ((C0006d) obj).a;
        }
        return basicFileAttributeView.equals(obj);
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
