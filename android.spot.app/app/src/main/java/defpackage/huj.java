package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huj {
    public final AtomicReference a = new AtomicReference();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private volatile fhq c;

    public final jyz a(Context context, boolean z, boolean z2) {
        if (!z) {
            return ivc.E(true);
        }
        Boolean bool = (Boolean) this.a.get();
        if (bool == null) {
            fhq fhqVar = this.c;
            if (fhqVar == null) {
                synchronized (this) {
                    fhqVar = this.c;
                    if (fhqVar == null) {
                        fhq a = fyf.a(context);
                        this.c = a;
                        fhqVar = a;
                    }
                }
            }
            if (z2 && !this.b.getAndSet(true)) {
                fhqVar.n(new hui(this, 0));
            }
            return jwb.g(jwu.g(jys.q(fzo.b(fhqVar.m())), jbn.a(new ewy(this, 19)), jxv.a), Throwable.class, new hkn(11), jxv.a);
        }
        return ivc.E(bool);
    }
}
