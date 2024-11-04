package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class imo implements iml {
    int b = 0;
    double[] a = new double[5];

    @Override // defpackage.iml
    public final kwo a() {
        ljh k = kwm.b.k();
        for (int i = 0; i < this.b; i++) {
            ljh k2 = kwl.d.k();
            double d = this.a[i];
            if (!k2.b.y()) {
                k2.t();
            }
            ljn ljnVar = k2.b;
            kwl kwlVar = (kwl) ljnVar;
            kwlVar.a |= 1;
            kwlVar.b = d;
            if (!ljnVar.y()) {
                k2.t();
            }
            kwl kwlVar2 = (kwl) k2.b;
            kwlVar2.a |= 2;
            kwlVar2.c = 1L;
            if (!k.b.y()) {
                k.t();
            }
            kwm kwmVar = (kwm) k.b;
            kwl kwlVar3 = (kwl) k2.q();
            kwlVar3.getClass();
            ljv ljvVar = kwmVar.a;
            if (!ljvVar.c()) {
                kwmVar.a = ljn.p(ljvVar);
            }
            kwmVar.a.add(kwlVar3);
        }
        ljh k3 = kwo.c.k();
        if (!k3.b.y()) {
            k3.t();
        }
        kwo kwoVar = (kwo) k3.b;
        kwm kwmVar2 = (kwm) k.q();
        kwmVar2.getClass();
        kwoVar.b = kwmVar2;
        kwoVar.a = 3;
        return (kwo) k3.q();
    }

    @Override // defpackage.iml
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Double d = (Double) obj;
        int i = this.b + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i >= 0) {
                    i2 = 2147483639;
                    if (i > 2147483639) {
                        i2 = Integer.MAX_VALUE;
                    }
                } else {
                    throw new OutOfMemoryError();
                }
            }
            this.a = Arrays.copyOf(dArr, i2);
        }
        this.a[this.b] = d.doubleValue();
        this.b++;
    }

    public final String toString() {
        return ", count = " + this.b + ", value =" + Arrays.toString(this.a);
    }
}
