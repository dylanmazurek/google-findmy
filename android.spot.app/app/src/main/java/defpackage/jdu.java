package defpackage;

import java.util.BitSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdu extends jdr {
    private final char a;
    private final char b;

    public jdu(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.jeb
    public final void b(BitSet bitSet) {
        bitSet.set(this.a);
        bitSet.set(this.b);
    }

    @Override // defpackage.jeb
    public final boolean c(char c) {
        if (c != this.a && c != this.b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + jeb.l(this.a) + jeb.l(this.b) + "\")";
    }
}
