package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amz {
    public anf g;
    public int h;
    public boolean i;
    public int j;

    public amz(int i, anf anfVar) {
        int i2;
        int i3;
        int numberOfTrailingZeros;
        this.g = anfVar;
        this.h = i;
        if (i != 0) {
            anf x = x();
            moh mohVar = anm.a;
            int[] iArr = x.e;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = x.c;
                if (j != 0) {
                    i3 = x.d;
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
                } else {
                    long j2 = x.b;
                    if (j2 != 0) {
                        i3 = x.d + 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
                    }
                }
                i = i3 + numberOfTrailingZeros;
            }
            synchronized (anm.c) {
                and andVar = anm.f;
                int i4 = andVar.a + 1;
                int[] iArr2 = andVar.b;
                int length = iArr2.length;
                if (i4 > length) {
                    int i5 = length + length;
                    int[] iArr3 = new int[i5];
                    int[] iArr4 = new int[i5];
                    mkm.s(iArr2, iArr3, 0, 0, 14);
                    mkm.s(andVar.c, iArr4, 0, 0, 14);
                    andVar.b = iArr3;
                    andVar.c = iArr4;
                }
                int i6 = andVar.a;
                andVar.a = i6 + 1;
                int length2 = andVar.d.length;
                if (andVar.e >= length2) {
                    int i7 = length2 + length2;
                    int[] iArr5 = new int[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        int i9 = i8 + 1;
                        iArr5[i8] = i9;
                        i8 = i9;
                    }
                    mkm.s(andVar.d, iArr5, 0, 0, 14);
                    andVar.d = iArr5;
                }
                i2 = andVar.e;
                int[] iArr6 = andVar.d;
                andVar.e = iArr6[i2];
                andVar.b[i6] = i;
                andVar.c[i6] = i2;
                iArr6[i2] = i6;
                andVar.b(i6);
            }
        } else {
            i2 = -1;
        }
        this.j = i2;
    }

    public static final void E(amz amzVar) {
        anm.b.b(amzVar);
    }

    public void A(int i) {
        this.h = i;
    }

    public void B(anf anfVar) {
        this.g = anfVar;
    }

    public final void C() {
        if (!this.i) {
            return;
        }
        ael.a("Cannot use a disposed snapshot");
    }

    public final void D() {
        this.i = true;
    }

    public abstract amz b(moh mohVar);

    public void d() {
        this.i = true;
        synchronized (anm.c) {
            z();
        }
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public int h() {
        return 0;
    }

    public abstract moh j();

    public abstract moh l();

    public void n() {
        anm.d = anm.d.b(v());
    }

    public abstract void o(aoc aocVar);

    public void q() {
        z();
    }

    public void r(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract boolean s();

    public int v() {
        return this.h;
    }

    public final amz w() {
        amz amzVar = (amz) anm.b.a();
        anm.b.b(this);
        return amzVar;
    }

    public anf x() {
        return this.g;
    }

    public final void y() {
        synchronized (anm.c) {
            n();
            q();
        }
    }

    public final void z() {
        int i = this.j;
        if (i >= 0) {
            anm.v(i);
            this.j = -1;
        }
    }
}
