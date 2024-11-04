package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkr implements Serializable, mkt {
    private final Object a;

    public mkr(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.mkt
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.mkt
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
