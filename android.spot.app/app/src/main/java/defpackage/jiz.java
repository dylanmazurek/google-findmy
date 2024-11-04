package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jiz implements Serializable {
    private static final long serialVersionUID = 0;
    final jiy a;

    public jiz(jiy jiyVar) {
        this.a = jiyVar;
    }

    Object readResolve() {
        return this.a.entrySet();
    }
}
