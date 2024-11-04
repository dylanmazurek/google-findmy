package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjf implements Serializable {
    private static final long serialVersionUID = 0;
    final jiy a;

    public jjf(jiy jiyVar) {
        this.a = jiyVar;
    }

    Object readResolve() {
        return this.a.values();
    }
}
