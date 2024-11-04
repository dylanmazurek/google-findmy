package defpackage;

import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcu {
    private final mol a;
    private Matrix b;
    private Matrix c;
    private float[] d;
    private float[] e;
    private boolean f = true;
    private boolean g = true;
    private boolean h = true;

    public bcu(mol molVar) {
        this.a = molVar;
    }

    public final void a() {
        this.f = true;
        this.g = true;
    }

    public final float[] b(Object obj) {
        float[] fArr = this.e;
        if (fArr == null) {
            fArr = arb.e();
            this.e = fArr;
        }
        if (this.g) {
            this.h = rb.e(c(obj), fArr);
            this.g = false;
        }
        if (this.h) {
            return fArr;
        }
        return null;
    }

    public final float[] c(Object obj) {
        float[] fArr = this.d;
        if (fArr == null) {
            fArr = arb.e();
            this.d = fArr;
        }
        if (!this.f) {
            return fArr;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            matrix = new Matrix();
            this.b = matrix;
        }
        this.a.a(obj, matrix);
        Matrix matrix2 = this.c;
        if (matrix2 == null || !amr.i(matrix, matrix2)) {
            ja.f(fArr, matrix);
            this.b = matrix2;
            this.c = matrix;
        }
        this.f = false;
        return fArr;
    }
}
