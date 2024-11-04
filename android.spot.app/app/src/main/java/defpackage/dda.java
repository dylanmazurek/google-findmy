package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dda extends dcu {
    private final RectF j;
    private final Paint k;
    private final float[] l;
    private final Path m;
    private final dcx n;
    private czw o;

    public dda(cym cymVar, dcx dcxVar) {
        super(cymVar, dcxVar);
        this.j = new RectF();
        cyx cyxVar = new cyx();
        this.k = cyxVar;
        this.l = new float[8];
        this.m = new Path();
        this.n = dcxVar;
        cyxVar.setAlpha(0);
        cyxVar.setStyle(Paint.Style.FILL);
        cyxVar.setColor(dcxVar.k);
    }

    @Override // defpackage.dcu, defpackage.dbn
    public final void a(Object obj, dfe dfeVar) {
        super.a(obj, dfeVar);
        if (obj == cyq.K) {
            if (dfeVar == null) {
                this.o = null;
            } else {
                this.o = new dan(dfeVar);
            }
        }
    }

    @Override // defpackage.dcu, defpackage.czb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        dcx dcxVar = this.n;
        this.j.set(0.0f, 0.0f, dcxVar.i, dcxVar.j);
        this.a.mapRect(this.j);
        rectF.set(this.j);
    }

    @Override // defpackage.dcu
    public final void j(Canvas canvas, Matrix matrix, int i) {
        int intValue;
        int alpha = Color.alpha(this.n.k);
        if (alpha != 0) {
            czw czwVar = this.g.e;
            if (czwVar == null) {
                intValue = 100;
            } else {
                intValue = ((Integer) czwVar.e()).intValue();
            }
            int i2 = (int) ((i / 255.0f) * (((alpha / 255.0f) * intValue) / 100.0f) * 255.0f);
            this.k.setAlpha(i2);
            czw czwVar2 = this.o;
            if (czwVar2 != null) {
                this.k.setColorFilter((ColorFilter) czwVar2.e());
            }
            if (i2 > 0) {
                float[] fArr = this.l;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                dcx dcxVar = this.n;
                float f = dcxVar.i;
                fArr[2] = f;
                fArr[3] = 0.0f;
                fArr[4] = f;
                float f2 = dcxVar.j;
                fArr[5] = f2;
                fArr[6] = 0.0f;
                fArr[7] = f2;
                matrix.mapPoints(fArr);
                this.m.reset();
                Path path = this.m;
                float[] fArr2 = this.l;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.m;
                float[] fArr3 = this.l;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.m;
                float[] fArr4 = this.l;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.m;
                float[] fArr5 = this.l;
                path4.lineTo(fArr5[6], fArr5[7]);
                Path path5 = this.m;
                float[] fArr6 = this.l;
                path5.lineTo(fArr6[0], fArr6[1]);
                this.m.close();
                canvas.drawPath(this.m, this.k);
            }
        }
    }
}
