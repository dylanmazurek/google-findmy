package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mli implements Serializable, mkt {
    private mnw a;
    private Object b = mle.a;

    public mli(mnw mnwVar) {
        this.a = mnwVar;
    }

    private final Object writeReplace() {
        return new mkr(a());
    }

    @Override // defpackage.mkt
    public final Object a() {
        if (this.b == mle.a) {
            mnw mnwVar = this.a;
            mnwVar.getClass();
            this.b = mnwVar.a();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.mkt
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        if (this.b != mle.a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
