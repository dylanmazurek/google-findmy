package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnc implements Serializable, mnb {
    public static final mnc a = new mnc();
    private static final long serialVersionUID = 0;

    private mnc() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.mnb
    public final mmz get(mna mnaVar) {
        mnaVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.mnb
    public final mnb minusKey(mna mnaVar) {
        mnaVar.getClass();
        return this;
    }

    @Override // defpackage.mnb
    public final mnb plus(mnb mnbVar) {
        mnbVar.getClass();
        return mnbVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.mnb
    public final Object fold(Object obj, mol molVar) {
        return obj;
    }
}
