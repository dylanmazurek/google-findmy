package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ack extends aod implements acm {
    public final mnw a;
    public aci b = new aci();

    public ack(mnw mnwVar) {
        this.a = mnwVar;
    }

    @Override // defpackage.agt
    public final Object a() {
        moh j = anm.b().j();
        if (j != null) {
            j.a(this);
        }
        amz b = anm.b();
        return b((aci) anm.f(this.b, b), b, true, this.a).d;
    }

    public final aci b(aci aciVar, amz amzVar, boolean z, mnw mnwVar) {
        aiu a;
        aoe h;
        aci aciVar2;
        int i;
        if (aciVar.d(amzVar)) {
            if (z) {
                a = agl.a();
                int i2 = a.b;
                if (i2 > 0) {
                    Object[] objArr = a.a;
                    int i3 = 0;
                    do {
                        ((acn) objArr[i3]).b();
                        i3++;
                    } while (i3 < i2);
                }
                try {
                    sr srVar = aciVar.c;
                    ali aliVar = (ali) agl.a.a();
                    if (aliVar == null) {
                        aliVar = new ali((byte[]) null);
                        agl.a.b(aliVar);
                    }
                    int i4 = aliVar.a;
                    Object[] objArr2 = srVar.b;
                    int[] iArr = srVar.c;
                    long[] jArr = srVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = i5 - length;
                                int i7 = 0;
                                while (true) {
                                    char c = '\b';
                                    i = 8 - ((~i6) >>> 31);
                                    if (i7 >= i) {
                                        break;
                                    }
                                    if ((j & 255) < 128) {
                                        int i8 = (i5 << 3) + i7;
                                        aoc aocVar = (aoc) objArr2[i8];
                                        aliVar.a = iArr[i8] + i4;
                                        moh j2 = amzVar.j();
                                        if (j2 != null) {
                                            j2.a(aocVar);
                                        }
                                        c = '\b';
                                    }
                                    j >>= c;
                                    i7++;
                                }
                                if (i != 8) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    aliVar.a = i4;
                    int i9 = a.b;
                    if (i9 > 0) {
                        Object[] objArr3 = a.a;
                        int i10 = 0;
                        do {
                            ((acn) objArr3[i10]).a();
                            i10++;
                        } while (i10 < i9);
                    }
                } finally {
                }
            }
            return aciVar;
        }
        sr srVar2 = new sr((byte[]) null);
        ali aliVar2 = (ali) agl.a.a();
        if (aliVar2 == null) {
            aliVar2 = new ali((byte[]) null);
            agl.a.b(aliVar2);
        }
        int i11 = aliVar2.a;
        a = agl.a();
        int i12 = a.b;
        if (i12 > 0) {
            Object[] objArr4 = a.a;
            int i13 = 0;
            do {
                ((acn) objArr4[i13]).b();
                i13++;
            } while (i13 < i12);
        }
        try {
            aliVar2.a = i11 + 1;
            Object e = amy.e(new acj(this, aliVar2, srVar2, i11), mnwVar);
            aliVar2.a = i11;
            int i14 = a.b;
            if (i14 > 0) {
                Object[] objArr5 = a.a;
                int i15 = 0;
                do {
                    ((acn) objArr5[i15]).a();
                    i15++;
                } while (i15 < i14);
            }
            synchronized (anm.c) {
                amz b = anm.b();
                aci aciVar3 = this.b;
                synchronized (anm.c) {
                    h = anm.h(aciVar3, this, b);
                }
                aciVar2 = (aci) h;
                aciVar2.c = srVar2;
                aciVar2.e = aciVar2.c(b);
                aciVar2.d = e;
            }
            ali aliVar3 = (ali) agl.a.a();
            if (aliVar3 != null && aliVar3.a == 0) {
                amy.d();
                synchronized (anm.c) {
                    amz b2 = anm.b();
                    aciVar2.a = b2.v();
                    aciVar2.b = b2.h();
                }
            }
            return aciVar2;
        } finally {
        }
    }

    @Override // defpackage.acm
    public final acl c() {
        amz b = anm.b();
        return b((aci) anm.f(this.b, b), b, false, this.a);
    }

    @Override // defpackage.aoc
    public final aoe d() {
        return this.b;
    }

    @Override // defpackage.aoc
    public final void e(aoe aoeVar) {
        aoeVar.getClass();
        this.b = (aci) aoeVar;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        aci aciVar = (aci) anm.e(this.b);
        if (aciVar.d(anm.b())) {
            str = String.valueOf(aciVar.d);
        } else {
            str = "<Not calculated>";
        }
        sb.append(str);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
