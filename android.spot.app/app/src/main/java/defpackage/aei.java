package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aei {
    public final List a;
    public final int b;
    public int c;
    public final List d;
    public final mkt e;
    public final se f;

    public aei(List list, int i) {
        this.a = list;
        this.b = i;
        if (i < 0) {
            ael.a("Invalid start index");
        }
        this.d = new ArrayList();
        se seVar = new se((byte[]) null);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            adc adcVar = (adc) this.a.get(i3);
            seVar.d(adcVar.c, new acv(i3, i2, adcVar.d));
            i2 += adcVar.d;
        }
        this.f = seVar;
        this.e = new mla(new aeh(this));
    }

    public final int a(adc adcVar) {
        acv acvVar = (acv) this.f.a(adcVar.c);
        if (acvVar != null) {
            return acvVar.b;
        }
        return -1;
    }

    public final int b(adc adcVar) {
        acv acvVar = (acv) this.f.a(adcVar.c);
        if (acvVar != null) {
            return acvVar.c;
        }
        return adcVar.d;
    }

    public final void c(adc adcVar, int i) {
        this.f.d(adcVar.c, new acv(-1, i, 0));
    }

    public final boolean d(int i, int i2) {
        int i3;
        int i4;
        acv acvVar = (acv) this.f.a(i);
        if (acvVar == null) {
            return false;
        }
        int i5 = acvVar.b;
        int i6 = i2 - acvVar.c;
        acvVar.c = i2;
        if (i6 != 0) {
            se seVar = this.f;
            Object[] objArr = seVar.c;
            long[] jArr = seVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = i7 - length;
                        int i9 = 0;
                        while (true) {
                            i3 = 8 - ((~i8) >>> 31);
                            if (i9 >= i3) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                acv acvVar2 = (acv) objArr[(i7 << 3) + i9];
                                if (acvVar2.b >= i5 && !amr.i(acvVar2, acvVar) && (i4 = acvVar2.b + i6) >= 0) {
                                    acvVar2.b = i4;
                                }
                            }
                            j >>= 8;
                            i9++;
                        }
                        if (i3 != 8) {
                            return true;
                        }
                    }
                    if (i7 != length) {
                        i7++;
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public final void e(adc adcVar) {
        this.d.add(adcVar);
    }
}
