package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbi {
    public final mca a;
    public final Object b;

    public mbi(Object obj) {
        this.b = obj;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mbi mbiVar = (mbi) obj;
            if (amr.g(this.a, mbiVar.a) && amr.g(this.b, mbiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        if (this.b != null) {
            jeq q = ivc.q(this);
            q.b("config", this.b);
            return q.toString();
        }
        jeq q2 = ivc.q(this);
        q2.b("error", this.a);
        return q2.toString();
    }

    public mbi(mca mcaVar) {
        this.b = null;
        this.a = mcaVar;
        hwx.O(!mcaVar.f(), "cannot use OK status: %s", mcaVar);
    }
}
