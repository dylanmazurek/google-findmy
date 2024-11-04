package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnd implements mmx, mnm {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(mnd.class, Object.class, "result");
    private final mmx b;
    private volatile Object result;

    public mnd(mmx mmxVar, Object obj) {
        this.b = mmxVar;
        this.result = obj;
    }

    @Override // defpackage.mnm
    public final mnm bO() {
        mmx mmxVar = this.b;
        if (mmxVar instanceof mnm) {
            return (mnm) mmxVar;
        }
        return null;
    }

    @Override // defpackage.mmx
    public final mnb o() {
        return this.b.o();
    }

    @Override // defpackage.mmx
    public final void p(Object obj) {
        while (true) {
            Object obj2 = this.result;
            mne mneVar = mne.b;
            if (obj2 == mneVar) {
                if (amr.e(a, this, mneVar, obj)) {
                    return;
                }
            } else {
                mne mneVar2 = mne.a;
                if (obj2 == mneVar2) {
                    if (amr.e(a, this, mneVar2, mne.c)) {
                        this.b.p(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    public final String toString() {
        mmx mmxVar = this.b;
        Objects.toString(mmxVar);
        return "SafeContinuation for ".concat(mmxVar.toString());
    }

    @Override // defpackage.mnm
    public final void bP() {
    }
}
