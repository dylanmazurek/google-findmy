package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cno implements TypeEvaluator {
    private brr[] a;

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        brr[] brrVarArr = (brr[]) obj;
        brr[] brrVarArr2 = (brr[]) obj2;
        if (bpn.e(brrVarArr, brrVarArr2)) {
            if (!bpn.e(this.a, brrVarArr)) {
                this.a = bpn.g(brrVarArr);
            }
            for (int i = 0; i < brrVarArr.length; i++) {
                brr brrVar = this.a[i];
                brr brrVar2 = brrVarArr[i];
                brr brrVar3 = brrVarArr2[i];
                brrVar.a = brrVar2.a;
                int i2 = 0;
                while (true) {
                    float[] fArr = brrVar2.b;
                    if (i2 < fArr.length) {
                        brrVar.b[i2] = (fArr[i2] * (1.0f - f)) + (brrVar3.b[i2] * f);
                        i2++;
                    }
                }
            }
            return this.a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
