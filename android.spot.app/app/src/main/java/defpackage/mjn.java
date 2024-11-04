package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjn {
    final mat a;
    final Object b;

    public mjn(mat matVar, Object obj) {
        this.a = matVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mjn mjnVar = (mjn) obj;
            if (amr.g(this.a, mjnVar.a) && amr.g(this.b, mjnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("provider", this.a);
        q.b("config", this.b);
        return q.toString();
    }
}
