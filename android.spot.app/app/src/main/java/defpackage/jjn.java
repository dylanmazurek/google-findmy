package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjn implements Serializable {
    private final jis a;

    public jjn(jis jisVar) {
        this.a = jisVar;
    }

    Object readResolve() {
        if (this.a.isEmpty()) {
            return jjo.a;
        }
        if (hzc.L(this.a, jis.q(jmg.a))) {
            return jjo.b;
        }
        return new jjo(this.a);
    }
}
