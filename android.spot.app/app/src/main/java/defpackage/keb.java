package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class keb extends kll {
    public final kdz a;
    public final kdy b;
    public final kdw c;
    public final kea d;

    public keb(kdz kdzVar, kdy kdyVar, kdw kdwVar, kea keaVar) {
        this.a = kdzVar;
        this.b = kdyVar;
        this.c = kdwVar;
        this.d = keaVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof keb)) {
            return false;
        }
        keb kebVar = (keb) obj;
        if (this.a != kebVar.a || this.b != kebVar.b || this.c != kebVar.c || this.d != kebVar.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(keb.class, this.a, this.b, this.c, this.d);
    }
}
