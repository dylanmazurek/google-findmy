package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jl {
    long a = 0;
    jl b;

    private final void h() {
        if (this.b == null) {
            this.b = new jl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        jl jlVar = this.b;
        if (jlVar == null) {
            if (i >= 64) {
                return Long.bitCount(this.a);
            }
            return Long.bitCount(this.a & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.a & ((1 << i) - 1));
        }
        return jlVar.a(i - 64) + Long.bitCount(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        if (i >= 64) {
            jl jlVar = this.b;
            if (jlVar != null) {
                jlVar.b(i - 64);
                return;
            }
            return;
        }
        this.a &= ~(1 << i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            h();
            this.b.c(i - 64, z);
            return;
        }
        long j = this.a;
        if ((Long.MIN_VALUE & j) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = (1 << i) - 1;
        long j3 = j & j2;
        long j4 = j & (~j2);
        this.a = (j4 + j4) | j3;
        if (z) {
            e(i);
        } else {
            b(i);
        }
        if (!z2 && this.b == null) {
            return;
        }
        h();
        this.b.c(0, z2);
    }

    public final void d() {
        this.a = 0L;
        jl jlVar = this.b;
        if (jlVar != null) {
            jlVar.d();
        }
    }

    public final void e(int i) {
        if (i >= 64) {
            h();
            this.b.e(i - 64);
        } else {
            this.a |= 1 << i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(int i) {
        if (i >= 64) {
            h();
            return this.b.f(i - 64);
        }
        if ((this.a & (1 << i)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(int i) {
        boolean z;
        if (i >= 64) {
            h();
            return this.b.g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.a;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j2 & (~j);
        this.a = j3;
        long j4 = j - 1;
        this.a = (j4 & j3) | Long.rotateRight((~j4) & j3, 1);
        jl jlVar = this.b;
        if (jlVar != null) {
            if (jlVar.f(0)) {
                e(63);
            }
            this.b.g(0);
        }
        return z;
    }

    public final String toString() {
        if (this.b == null) {
            return Long.toBinaryString(this.a);
        }
        return this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}
