package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mnj implements Serializable, mmx, mnm {
    public final mmx q;

    public mnj(mmx mmxVar) {
        this.q = mmxVar;
    }

    protected abstract Object b(Object obj);

    @Override // defpackage.mnm
    public mnm bO() {
        mmx mmxVar = this.q;
        if (mmxVar instanceof mnm) {
            return (mnm) mmxVar;
        }
        return null;
    }

    public mmx c(Object obj, mmx mmxVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.mmx
    public final void p(Object obj) {
        mmx mmxVar = this;
        while (true) {
            mmxVar.getClass();
            mnj mnjVar = (mnj) mmxVar;
            mmx mmxVar2 = mnjVar.q;
            mmxVar2.getClass();
            try {
                obj = mnjVar.b(obj);
                if (obj == mne.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = mjo.n(th);
            }
            mnjVar.f();
            if (mmxVar2 instanceof mnj) {
                mmxVar = mmxVar2;
            } else {
                mmxVar2.p(obj);
                return;
            }
        }
    }

    public String toString() {
        String name = getClass().getName();
        Objects.toString(name);
        return "Continuation at ".concat(String.valueOf(name));
    }

    @Override // defpackage.mnm
    public void bP() {
    }

    protected void f() {
    }
}
