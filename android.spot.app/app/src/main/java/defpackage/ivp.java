package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ivp extends ivu {
    private final ivr a;

    public ivp(ivr ivrVar) {
        this.a = ivrVar;
    }

    @Override // defpackage.ivu
    public final void a(Matrix matrix, iux iuxVar, int i, Canvas canvas) {
        boolean z;
        ivr ivrVar = this.a;
        float f = ivrVar.e;
        float f2 = ivrVar.f;
        RectF rectF = new RectF(ivrVar.a, ivrVar.b, ivrVar.c, ivrVar.d);
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = iuxVar.k;
        if (z) {
            int[] iArr = iux.c;
            iArr[0] = 0;
            iArr[1] = iuxVar.j;
            iArr[2] = iuxVar.i;
            iArr[3] = iuxVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = iux.c;
            iArr2[0] = 0;
            iArr2[1] = iuxVar.h;
            iArr2[2] = iuxVar.i;
            iArr2[3] = iuxVar.j;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = iux.d;
        fArr[1] = f4;
        fArr[2] = f4 + ((1.0f - f4) / 2.0f);
        iuxVar.f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iux.c, iux.d, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, iuxVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, iuxVar.f);
        canvas.restore();
    }
}
