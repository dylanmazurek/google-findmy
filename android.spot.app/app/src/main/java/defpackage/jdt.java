package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdt extends jdr {
    private final char a;

    public jdt(char c) {
        this.a = c;
    }

    @Override // defpackage.jeb
    public final void b(BitSet bitSet) {
        bitSet.set(this.a);
    }

    @Override // defpackage.jeb
    public final boolean c(char c) {
        if (c == this.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jeb
    public final jeb e(jeb jebVar) {
        if (jebVar.c(this.a)) {
            return jebVar;
        }
        return new jdz(this, jebVar);
    }

    public final String toString() {
        return "CharMatcher.is('" + jeb.l(this.a) + "')";
    }
}
