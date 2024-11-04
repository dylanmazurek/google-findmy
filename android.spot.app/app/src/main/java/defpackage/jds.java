package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jds extends jdr {
    private final char a;
    private final char b;

    public jds(char c, char c2) {
        boolean z;
        if (c2 >= c) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.jeb
    public final void b(BitSet bitSet) {
        bitSet.set(this.a, this.b + 1);
    }

    @Override // defpackage.jeb
    public final boolean c(char c) {
        if (this.a <= c && c <= this.b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.inRange('" + jeb.l(this.a) + "', '" + jeb.l(this.b) + "')";
    }
}
