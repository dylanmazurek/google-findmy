package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsl implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;

    public jsl(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private Object readResolve() {
        return new jsm(this.a, this.b);
    }
}
