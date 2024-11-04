package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* renamed from: j$.nio.file.attribute.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0016n implements InterfaceC0018p {
    public final /* synthetic */ FileAttribute a;

    private /* synthetic */ C0016n(FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    public static /* synthetic */ InterfaceC0018p a(FileAttribute fileAttribute) {
        if (fileAttribute == null) {
            return null;
        }
        return fileAttribute instanceof C0017o ? ((C0017o) fileAttribute).a : new C0016n(fileAttribute);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttribute fileAttribute = this.a;
        if (obj instanceof C0016n) {
            obj = ((C0016n) obj).a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0018p
    public final /* synthetic */ String name() {
        String name;
        name = this.a.name();
        return name;
    }

    @Override // j$.nio.file.attribute.InterfaceC0018p
    public final /* synthetic */ Object value() {
        Object value;
        value = this.a.value();
        return value;
    }
}
