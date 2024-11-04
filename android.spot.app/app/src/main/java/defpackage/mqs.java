package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqs implements mqz {
    private final AtomicReference a;

    public mqs(mqz mqzVar) {
        this.a = new AtomicReference(mqzVar);
    }

    @Override // defpackage.mqz
    public final Iterator a() {
        mqz mqzVar = (mqz) this.a.getAndSet(null);
        if (mqzVar != null) {
            return mqzVar.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
