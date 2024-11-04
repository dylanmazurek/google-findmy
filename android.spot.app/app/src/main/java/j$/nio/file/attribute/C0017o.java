package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* renamed from: j$.nio.file.attribute.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0017o implements FileAttribute {
    public final /* synthetic */ InterfaceC0018p a;

    private /* synthetic */ C0017o(InterfaceC0018p interfaceC0018p) {
        this.a = interfaceC0018p;
    }

    public static /* synthetic */ FileAttribute a(InterfaceC0018p interfaceC0018p) {
        if (interfaceC0018p == null) {
            return null;
        }
        return interfaceC0018p instanceof C0016n ? ((C0016n) interfaceC0018p).a : new C0017o(interfaceC0018p);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0018p interfaceC0018p = this.a;
        if (obj instanceof C0017o) {
            obj = ((C0017o) obj).a;
        }
        return interfaceC0018p.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
