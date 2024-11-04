package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jdq extends jdv {
    private final BitSet a;

    public jdq(BitSet bitSet, String str) {
        super(str);
        this.a = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
    }

    @Override // defpackage.jeb
    public final void b(BitSet bitSet) {
        bitSet.or(this.a);
    }

    @Override // defpackage.jeb
    public final boolean c(char c) {
        return this.a.get(c);
    }
}
