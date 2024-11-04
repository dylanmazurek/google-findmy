package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mla implements Serializable, mkt {
    private mnw a;
    private volatile Object b = mle.a;
    private final Object c = this;

    private final Object writeReplace() {
        return new mkr(a());
    }

    @Override // defpackage.mkt
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != mle.a) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == mle.a) {
                mnw mnwVar = this.a;
                mnwVar.getClass();
                obj = mnwVar.a();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    @Override // defpackage.mkt
    public final boolean b() {
        if (this.b != mle.a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (b()) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
