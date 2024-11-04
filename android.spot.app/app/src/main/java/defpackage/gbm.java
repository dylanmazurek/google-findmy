package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbm {
    public final Object a;
    public final nqe b;

    public gbm(nqe nqeVar, Object obj) {
        boolean z = false;
        if (nqeVar.f() >= 200000000 && nqeVar.f() < 300000000) {
            z = true;
        }
        hwx.J(z);
        this.b = nqeVar;
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gbm) {
            gbm gbmVar = (gbm) obj;
            if (this.b.equals(gbmVar.b) && this.a.equals(gbmVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
