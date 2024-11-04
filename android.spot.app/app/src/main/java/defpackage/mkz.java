package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkz implements Serializable, mkt {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(mkz.class, Object.class, "c");
    private volatile mnw b;
    private volatile Object c = mle.a;

    public mkz(mnw mnwVar) {
        this.b = mnwVar;
    }

    private final Object writeReplace() {
        return new mkr(a());
    }

    @Override // defpackage.mkt
    public final Object a() {
        Object obj = this.c;
        if (obj != mle.a) {
            return obj;
        }
        mnw mnwVar = this.b;
        if (mnwVar != null) {
            Object a2 = mnwVar.a();
            if (amr.e(a, this, mle.a, a2)) {
                this.b = null;
                return a2;
            }
        }
        return this.c;
    }

    @Override // defpackage.mkt
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        if (this.c != mle.a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
