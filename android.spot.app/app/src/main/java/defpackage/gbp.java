package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbp {
    public final Object a;
    public final nqe b;

    public gbp(nqe nqeVar, Object obj) {
        this.b = nqeVar;
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gbp) {
            gbp gbpVar = (gbp) obj;
            if (this.b.equals(gbpVar.b) && this.a.equals(gbpVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
