package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqo implements aqv {
    public Canvas a = aqp.a;
    private Rect b;
    private Rect c;

    public static final Region.Op l() {
        if (a.m(1, 0)) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }

    @Override // defpackage.aqv
    public final void a(float[] fArr) {
        float f;
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (i == i2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                if (fArr[(i * 4) + i2] != f) {
                    Matrix matrix = new Matrix();
                    float f2 = fArr[0];
                    float f3 = fArr[1];
                    float f4 = fArr[2];
                    float f5 = fArr[3];
                    float f6 = fArr[4];
                    float f7 = fArr[5];
                    float f8 = fArr[6];
                    float f9 = fArr[7];
                    float f10 = fArr[8];
                    float f11 = fArr[12];
                    float f12 = fArr[13];
                    float f13 = fArr[15];
                    fArr[1] = f6;
                    fArr[2] = f11;
                    fArr[3] = f3;
                    fArr[4] = f7;
                    fArr[5] = f12;
                    fArr[6] = f5;
                    fArr[7] = f9;
                    fArr[8] = f13;
                    matrix.setValues(fArr);
                    fArr[0] = f2;
                    fArr[1] = f3;
                    fArr[2] = f4;
                    fArr[3] = f5;
                    fArr[4] = f6;
                    fArr[5] = f7;
                    fArr[6] = f8;
                    fArr[7] = f9;
                    fArr[8] = f10;
                    this.a.concat(matrix);
                    return;
                }
            }
        }
    }

    @Override // defpackage.aqv
    public final void b() {
        ji.d(this.a, false);
    }

    @Override // defpackage.aqv
    public final void c() {
        ji.d(this.a, true);
    }

    @Override // defpackage.aqv
    public final void d() {
        this.a.restore();
    }

    @Override // defpackage.aqv
    public final void e() {
        this.a.save();
    }

    @Override // defpackage.aqv
    public final void f(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.aqv
    public final /* synthetic */ void g(aql aqlVar, aqs aqsVar) {
        jf.c(this, aqlVar, aqsVar);
    }

    @Override // defpackage.aqv
    public final void h(float f, float f2, float f3, float f4, aqs aqsVar) {
        this.a.drawRect(f, f2, f3, f4, aqsVar.a);
    }

    @Override // defpackage.aqv
    public final void i(arg argVar) {
        this.a.clipPath(((aqt) argVar).a, l());
    }

    @Override // defpackage.aqv
    public final void j(float f, float f2, float f3, float f4) {
        this.a.clipRect(f, f2, f3, f4, l());
    }

    @Override // defpackage.aqv
    public final /* synthetic */ void k(aql aqlVar) {
        jf.g(this, aqlVar);
    }

    @Override // defpackage.aqv
    public final void m(bet betVar, long j, long j2, aqs aqsVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Object obj = betVar.a;
        Rect rect = this.b;
        rect.getClass();
        rect.left = blk.a(0L);
        rect.top = blk.b(0L);
        rect.right = blk.a(0L) + blm.b(j);
        rect.bottom = blk.b(0L) + blm.a(j);
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = blk.a(0L);
        rect2.top = blk.b(0L);
        rect2.right = blk.a(0L) + blm.b(j2);
        rect2.bottom = blk.b(0L) + blm.a(j2);
        canvas.drawBitmap((Bitmap) obj, rect, rect2, aqsVar.a);
    }
}
