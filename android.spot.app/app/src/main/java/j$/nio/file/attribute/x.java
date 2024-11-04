package j$.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* loaded from: classes2.dex */
public final /* synthetic */ class x implements z {
    public final /* synthetic */ FileOwnerAttributeView a;

    private /* synthetic */ x(FileOwnerAttributeView fileOwnerAttributeView) {
        this.a = fileOwnerAttributeView;
    }

    public static /* synthetic */ z c(FileOwnerAttributeView fileOwnerAttributeView) {
        if (fileOwnerAttributeView == null) {
            return null;
        }
        return fileOwnerAttributeView instanceof y ? ((y) fileOwnerAttributeView).a : w.s(fileOwnerAttributeView) ? C0003a.c(w.j(fileOwnerAttributeView)) : j$.nio.file.s.v(fileOwnerAttributeView) ? E.c(AbstractC0005c.p(fileOwnerAttributeView)) : new x(fileOwnerAttributeView);
    }

    @Override // j$.nio.file.attribute.z
    public final /* synthetic */ void b(N n) {
        this.a.setOwner(M.a(n));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof x) {
            obj = ((x) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
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
}
