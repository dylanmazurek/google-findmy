package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0007e implements BasicFileAttributeView {
    public final /* synthetic */ InterfaceC0008f a;

    private /* synthetic */ C0007e(InterfaceC0008f interfaceC0008f) {
        this.a = interfaceC0008f;
    }

    public static /* synthetic */ BasicFileAttributeView a(InterfaceC0008f interfaceC0008f) {
        if (interfaceC0008f == null) {
            return null;
        }
        if (interfaceC0008f instanceof C0006d) {
            return ((C0006d) interfaceC0008f).a;
        }
        if (interfaceC0008f instanceof C0012j) {
            return ((C0012j) interfaceC0008f).a;
        }
        if (interfaceC0008f instanceof E) {
            return ((E) interfaceC0008f).a;
        }
        return new C0007e(interfaceC0008f);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0008f interfaceC0008f = this.a;
        if (obj instanceof C0007e) {
            obj = ((C0007e) obj).a;
        }
        return interfaceC0008f.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0010h.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.a.a(s.b(fileTime), s.b(fileTime2), s.b(fileTime3));
    }
}
