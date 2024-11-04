package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdz extends jeb {
    final jeb a;
    final jeb b;

    public jdz(jeb jebVar, jeb jebVar2) {
        this.a = jebVar;
        this.b = jebVar2;
    }

    @Override // defpackage.jeb
    public final void b(BitSet bitSet) {
        this.a.b(bitSet);
        this.b.b(bitSet);
    }

    @Override // defpackage.jeb
    public final boolean c(char c) {
        if (!this.a.c(c) && !this.b.c(c)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        jeb jebVar = this.b;
        return "CharMatcher.or(" + this.a.toString() + ", " + jebVar.toString() + ")";
    }
}
