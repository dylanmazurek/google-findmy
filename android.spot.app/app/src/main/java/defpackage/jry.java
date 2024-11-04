package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jry extends jsa implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;

    public jry(int i) {
        this.a = i;
    }

    @Override // defpackage.jsa
    public final int a() {
        return this.a;
    }

    @Override // defpackage.jsa
    public final int b() {
        return 32;
    }

    @Override // defpackage.jsa
    public final long c() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    @Override // defpackage.jsa
    public final boolean d(jsa jsaVar) {
        if (this.a == jsaVar.a()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jsa
    public final byte[] e() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }
}
