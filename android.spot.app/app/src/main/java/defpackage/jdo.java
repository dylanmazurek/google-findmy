package defpackage;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdo extends jeb {
    private final char[] a;

    public jdo(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.a = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.jeb
    public final void b(BitSet bitSet) {
        for (char c : this.a) {
            bitSet.set(c);
        }
    }

    @Override // defpackage.jeb
    public final boolean c(char c) {
        if (Arrays.binarySearch(this.a, c) >= 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(jeb.l(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
