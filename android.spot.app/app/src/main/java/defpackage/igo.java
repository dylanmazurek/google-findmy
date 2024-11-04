package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igo {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/client/DeviceEidsProviderImpl");
    private final iin b;
    private final jzd c;
    private final hot d;

    public igo(hot hotVar, iin iinVar, jzd jzdVar) {
        this.d = hotVar;
        this.b = iinVar;
        this.c = jzdVar;
    }

    public final jyz a(kyf kyfVar, long j) {
        kyg kygVar = kyfVar.g;
        if (kygVar == null) {
            kygVar = kyg.d;
        }
        int I = a.I(kygVar.c);
        if (I == 0) {
            I = 1;
        }
        return b(kyfVar, hqt.h(I), j);
    }

    public final jyz b(kyf kyfVar, final jjr jjrVar, long j) {
        boolean z;
        boolean z2;
        final int i;
        boolean z3;
        boolean z4;
        if ((kyfVar.a & 8) != 0) {
            kyg kygVar = kyfVar.g;
            if (kygVar == null) {
                kygVar = kyg.d;
            }
            int I = a.I(kygVar.c);
            if (I == 0) {
                I = 1;
            }
            if (a.C(I) <= 1) {
                z = false;
            } else {
                z = true;
            }
            if (z != jjrVar.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            hwx.J(z2);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(fma.i().toEpochMilli());
            long e = ((int) lyk.a.a().e((Context) this.d.a)) / 2;
            long j2 = seconds - e;
            long j3 = seconds + e + j;
            iin iinVar = this.b;
            int g = kzv.g(kyfVar.o);
            if (g == 0) {
                i = 1;
            } else {
                i = g;
            }
            kyq kyqVar = kyfVar.f;
            if (kyqVar == null) {
                kyqVar = kyq.g;
            }
            final int i2 = kyfVar.n;
            final long j4 = kyfVar.m;
            if (j2 <= j3) {
                z3 = true;
            } else {
                z3 = false;
            }
            fyx.a(z3);
            long j5 = j3 - j2;
            if (j5 < iip.a) {
                z4 = true;
            } else {
                z4 = false;
            }
            fyx.a(z4);
            iip iipVar = (iip) iinVar;
            int i3 = 1 << i2;
            final long j6 = j2 - i3;
            final int i4 = ((int) j5) + i3;
            return iuu.j(iuu.o(iipVar.c.s(kyqVar), new jei() { // from class: iio
                @Override // defpackage.jei
                public final Object a(Object obj) {
                    long j7;
                    long j8;
                    boolean z5;
                    int i5 = iip.d;
                    lim limVar = ((iiy) obj).a;
                    hot hotVar = new hot();
                    jjr jjrVar2 = jjrVar;
                    boolean isEmpty = jjrVar2.isEmpty();
                    int i6 = i2;
                    long j9 = j6;
                    int i7 = i4;
                    long j10 = j4;
                    int i8 = i;
                    if (isEmpty) {
                        j7 = j10;
                        j8 = j9;
                        iic.c(hotVar, i8, limVar, ihy.COMPONENTLESS, i6, j9, i7, j7);
                    } else {
                        j7 = j10;
                        j8 = j9;
                        jmw listIterator = jjrVar2.listIterator();
                        while (listIterator.hasNext()) {
                            ihx ihxVar = (ihx) listIterator.next();
                            if (limVar.d() == 32) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            hwx.K(z5, "Invalid identity key");
                            iic.c(hotVar, i8, ijm.i(limVar.r(iji.f(4)).r(lim.t(new byte[]{ihxVar.f}))), ihy.b(ihxVar), i6, j8, i7, j7);
                            i6 = i6;
                            i7 = i7;
                        }
                    }
                    int i9 = i6;
                    int i10 = i7;
                    hot n = hotVar.n();
                    ((jni) ((jni) iic.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/e2ee/E2eeCalculator", "computeE2eeEids", 380, "E2eeCalculator.java")).J(Integer.valueOf(n.i().size()), Integer.valueOf(i9), Long.valueOf(j8), Integer.valueOf(i10), Long.valueOf(j7), Integer.valueOf(jjrVar2.size()));
                    return n;
                }
            }, iipVar.b), iiv.class, new etl(18), this.c);
        }
        return ivc.E(new hot().n());
    }
}
