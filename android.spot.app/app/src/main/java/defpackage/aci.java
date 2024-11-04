package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aci extends aoe implements acl {
    private static final Object h = new Object();
    public int a;
    public int b;
    public sr c;
    public Object d;
    public int e;

    public aci() {
        sr srVar = ss.a;
        srVar.getClass();
        this.c = srVar;
        this.d = h;
    }

    @Override // defpackage.aoe
    public final aoe a() {
        return new aci();
    }

    @Override // defpackage.aoe
    public final void b(aoe aoeVar) {
        aoeVar.getClass();
        aci aciVar = (aci) aoeVar;
        this.c = aciVar.c;
        this.d = aciVar.d;
        this.e = aciVar.e;
    }

    public final int c(amz amzVar) {
        sr srVar;
        int i;
        int i2;
        aoe f;
        synchronized (anm.c) {
            srVar = this.c;
        }
        char c = 7;
        if (srVar.e != 0) {
            aiu a = agl.a();
            int i3 = a.b;
            int i4 = 1;
            if (i3 > 0) {
                Object[] objArr = a.a;
                int i5 = 0;
                do {
                    ((acn) objArr[i5]).b();
                    i5++;
                } while (i5 < i3);
            }
            try {
                Object[] objArr2 = srVar.b;
                int[] iArr = srVar.c;
                long[] jArr = srVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    int i7 = 7;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = i6 - length;
                            int i9 = 0;
                            while (true) {
                                i2 = 8 - ((~i8) >>> 31);
                                if (i9 >= i2) {
                                    break;
                                }
                                if ((j & 255) < 128) {
                                    int i10 = (i6 << 3) + i9;
                                    aoc aocVar = (aoc) objArr2[i10];
                                    if (iArr[i10] == i4) {
                                        if (aocVar instanceof ack) {
                                            ack ackVar = (ack) aocVar;
                                            try {
                                                f = ackVar.b((aci) anm.f(ackVar.b, amzVar), amzVar, false, ackVar.a);
                                            } catch (Throwable th) {
                                                th = th;
                                                int i11 = a.b;
                                                if (i11 > 0) {
                                                    Object[] objArr3 = a.a;
                                                    int i12 = 0;
                                                    do {
                                                        ((acn) objArr3[i12]).a();
                                                        i12++;
                                                    } while (i12 < i11);
                                                }
                                                throw th;
                                            }
                                        } else {
                                            f = anm.f(aocVar.d(), amzVar);
                                        }
                                        i7 = (((i7 * 31) + System.identityHashCode(f)) * 31) + f.f;
                                        j >>= 8;
                                        i9++;
                                        i4 = 1;
                                    }
                                }
                                j >>= 8;
                                i9++;
                                i4 = 1;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        c = 7;
                        i4 = 1;
                    }
                    i = i7;
                } else {
                    i = 7;
                }
                int i13 = a.b;
                if (i13 > 0) {
                    Object[] objArr4 = a.a;
                    int i14 = 0;
                    do {
                        ((acn) objArr4[i14]).a();
                        i14++;
                    } while (i14 < i13);
                    return i;
                }
                return i;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            return 7;
        }
    }

    public final boolean d(amz amzVar) {
        boolean z;
        boolean z2;
        synchronized (anm.c) {
            z = false;
            if (this.a == amzVar.v()) {
                if (this.b == amzVar.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.d != h && (!z2 || this.e == c(amzVar))) {
            z = true;
        }
        if (z && z2) {
            synchronized (anm.c) {
                this.a = amzVar.v();
                this.b = amzVar.h();
            }
        }
        return z;
    }
}
