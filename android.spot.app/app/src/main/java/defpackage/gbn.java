package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbn {
    public final Object a;
    public final nqe b;

    public gbn(nqe nqeVar, Object obj) {
        boolean z = false;
        if (nqeVar.f() >= 100000000 && nqeVar.f() < 200000000) {
            z = true;
        }
        hwx.J(z);
        this.b = nqeVar;
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gbn) {
            gbn gbnVar = (gbn) obj;
            if (this.b.equals(gbnVar.b) && this.a.equals(gbnVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
