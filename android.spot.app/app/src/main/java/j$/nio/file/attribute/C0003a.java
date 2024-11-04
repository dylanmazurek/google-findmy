package j$.nio.file.attribute;

import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* renamed from: j$.nio.file.attribute.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0003a implements z {
    public final /* synthetic */ AclFileAttributeView a;

    private /* synthetic */ C0003a(AclFileAttributeView aclFileAttributeView) {
        this.a = aclFileAttributeView;
    }

    public static /* synthetic */ C0003a c(AclFileAttributeView aclFileAttributeView) {
        if (aclFileAttributeView == null) {
            return null;
        }
        if (!(aclFileAttributeView instanceof AbstractC0004b)) {
            return new C0003a(aclFileAttributeView);
        }
        throw null;
    }

    @Override // j$.nio.file.attribute.z
    public final /* synthetic */ void b(N n) {
        this.a.setOwner(M.a(n));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AclFileAttributeView aclFileAttributeView = this.a;
        if (obj instanceof C0003a) {
            obj = ((C0003a) obj).a;
        }
        return aclFileAttributeView.equals(obj);
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
