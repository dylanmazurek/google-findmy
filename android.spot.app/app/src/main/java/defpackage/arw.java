package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arw extends arx {
    private final asf a;
    private final asf b;
    private final float[] c;

    public arw(asf asfVar, asf asfVar2) {
        super(asfVar2, asfVar, asfVar2, null);
        float[] k;
        this.a = asfVar;
        this.b = asfVar2;
        if (kk.h(asfVar.d, asfVar2.d)) {
            k = kk.k(asfVar2.j, asfVar.i);
        } else {
            float[] fArr = asfVar.i;
            float[] fArr2 = asfVar2.j;
            float[] a = asfVar.d.a();
            float[] a2 = asfVar2.d.a();
            ash ashVar = asfVar.d;
            ash ashVar2 = asa.a;
            if (!kk.h(ashVar, asa.b)) {
                float[] fArr3 = arr.a.b;
                float[] copyOf = Arrays.copyOf(asa.e, 3);
                copyOf.getClass();
                fArr = kk.k(kk.i(fArr3, a, copyOf), asfVar.i);
            }
            if (!kk.h(asfVar2.d, asa.b)) {
                float[] fArr4 = arr.a.b;
                float[] copyOf2 = Arrays.copyOf(asa.e, 3);
                copyOf2.getClass();
                fArr2 = kk.j(kk.k(kk.i(fArr4, a2, copyOf2), asfVar2.i));
            }
            k = kk.k(fArr2, a.m(0, 3) ? kk.l(new float[]{a[0] / a2[0], a[1] / a2[1], a[2] / a2[2]}, fArr) : fArr);
        }
        this.c = k;
    }

    @Override // defpackage.arx
    public final long a(long j) {
        double d = aqx.d(j);
        float c = aqx.c(j);
        float b = aqx.b(j);
        float a = (float) this.a.n.a(d);
        float a2 = (float) this.a.n.a(c);
        float a3 = (float) this.a.n.a(b);
        float[] fArr = this.c;
        float f = fArr[0] * a;
        float f2 = fArr[3] * a2;
        float f3 = fArr[6] * a3;
        float f4 = fArr[1] * a;
        float f5 = fArr[4] * a2;
        float f6 = fArr[7] * a3;
        float f7 = fArr[2] * a;
        float f8 = fArr[5] * a2;
        return jw.g((float) this.b.l.a(f + f2 + f3), (float) this.b.l.a(f4 + f5 + f6), (float) this.b.l.a(f7 + f8 + (fArr[8] * a3)), aqx.a(j), this.b);
    }
}
