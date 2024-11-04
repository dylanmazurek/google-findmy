package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jrz extends jsa implements Serializable {
    private static final long serialVersionUID = 0;
    final long a;

    public jrz(long j) {
        this.a = j;
    }

    @Override // defpackage.jsa
    public final int a() {
        return (int) this.a;
    }

    @Override // defpackage.jsa
    public final int b() {
        return 64;
    }

    @Override // defpackage.jsa
    public final long c() {
        return this.a;
    }

    @Override // defpackage.jsa
    public final boolean d(jsa jsaVar) {
        if (this.a == jsaVar.c()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jsa
    public final byte[] e() {
        return new byte[]{(byte) this.a, (byte) (r0 >> 8), (byte) (r0 >> 16), (byte) (r0 >> 24), (byte) (r0 >> 32), (byte) (r0 >> 40), (byte) (r0 >> 48), (byte) (r0 >> 56)};
    }
}
