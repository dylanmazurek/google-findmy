package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class arx {
    private final ars a;
    private final ars b;
    private final ars c;
    private final float[] d;

    public arx(ars arsVar, ars arsVar2, ars arsVar3, float[] fArr) {
        this.a = arsVar;
        this.b = arsVar2;
        this.c = arsVar3;
        this.d = fArr;
    }

    public long a(long j) {
        ars arsVar = this.b;
        float d = aqx.d(j);
        float c = aqx.c(j);
        float b = aqx.b(j);
        long d2 = arsVar.d(d, c, b);
        ars arsVar2 = this.b;
        int i = (int) (d2 & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat(i);
        float c2 = arsVar2.c(d, c, b);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            c2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        float a = aqx.a(j);
        return this.c.e(f, f2, c2, a, this.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public arx(defpackage.ars r9, defpackage.ars r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = defpackage.a.n(r0, r2)
            if (r0 == 0) goto L16
            ash r0 = defpackage.asa.a
            ash r0 = defpackage.asa.b
            ars r0 = defpackage.kk.m(r9, r0)
            goto L17
        L16:
            r0 = r9
        L17:
            long r4 = r10.b
            boolean r1 = defpackage.a.n(r4, r2)
            if (r1 == 0) goto L28
            ash r1 = defpackage.asa.a
            ash r1 = defpackage.asa.b
            ars r1 = defpackage.kk.m(r10, r1)
            goto L29
        L28:
            r1 = r10
        L29:
            r4 = 3
            boolean r11 = defpackage.a.m(r11, r4)
            r5 = 0
            if (r11 != 0) goto L32
            goto L85
        L32:
            long r6 = r9.b
            boolean r11 = defpackage.a.n(r6, r2)
            long r6 = r10.b
            boolean r2 = defpackage.a.n(r6, r2)
            r3 = 0
            if (r11 == 0) goto L45
            if (r2 == 0) goto L44
            goto L85
        L44:
            r2 = 0
        L45:
            r6 = 1
            if (r11 != 0) goto L4b
            if (r2 == 0) goto L85
            r2 = 1
        L4b:
            if (r6 == r11) goto L4e
            r9 = r10
        L4e:
            r9.getClass()
            asf r9 = (defpackage.asf) r9
            if (r11 == 0) goto L5c
            ash r11 = r9.d
            float[] r11 = r11.a()
            goto L60
        L5c:
            ash r11 = defpackage.asa.a
            float[] r11 = defpackage.asa.e
        L60:
            if (r2 == 0) goto L69
            ash r9 = r9.d
            float[] r9 = r9.a()
            goto L6d
        L69:
            ash r9 = defpackage.asa.a
            float[] r9 = defpackage.asa.e
        L6d:
            float[] r5 = new float[r4]
            r2 = r11[r3]
            r4 = r9[r3]
            float r2 = r2 / r4
            r5[r3] = r2
            r2 = r11[r6]
            r3 = r9[r6]
            float r2 = r2 / r3
            r5[r6] = r2
            r2 = 2
            r11 = r11[r2]
            r9 = r9[r2]
            float r11 = r11 / r9
            r5[r2] = r11
        L85:
            r8.<init>(r10, r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arx.<init>(ars, ars, int):void");
    }
}
