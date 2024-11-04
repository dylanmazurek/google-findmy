package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements FileAttributeView {
    public final /* synthetic */ v a;

    private /* synthetic */ u(v vVar) {
        this.a = vVar;
    }

    public static /* synthetic */ FileAttributeView a(v vVar) {
        if (vVar == null) {
            return null;
        }
        if (vVar instanceof t) {
            return ((t) vVar).a;
        }
        if (vVar instanceof InterfaceC0008f) {
            return C0007e.a((InterfaceC0008f) vVar);
        }
        if (vVar instanceof z) {
            return y.a((z) vVar);
        }
        if (vVar instanceof J) {
            return ((J) vVar).a;
        }
        return new u(vVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        v vVar = this.a;
        if (obj instanceof u) {
            obj = ((u) obj).a;
        }
        return vVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
