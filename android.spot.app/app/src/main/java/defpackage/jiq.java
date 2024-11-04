package defpackage;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jiq implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public jiq(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return jis.p(this.a);
    }
}
