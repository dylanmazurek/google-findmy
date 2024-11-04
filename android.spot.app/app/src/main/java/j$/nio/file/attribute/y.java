package j$.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* loaded from: classes2.dex */
public final /* synthetic */ class y implements FileOwnerAttributeView {
    public final /* synthetic */ z a;

    private /* synthetic */ y(z zVar) {
        this.a = zVar;
    }

    public static /* synthetic */ FileOwnerAttributeView a(z zVar) {
        if (zVar == null) {
            return null;
        }
        if (zVar instanceof x) {
            return ((x) zVar).a;
        }
        if (zVar instanceof C0003a) {
            return ((C0003a) zVar).a;
        }
        if (zVar instanceof E) {
            return ((E) zVar).a;
        }
        return new y(zVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        z zVar = this.a;
        if (obj instanceof y) {
            obj = ((y) obj).a;
        }
        return zVar.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return M.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.a.b(L.a(userPrincipal));
    }
}
