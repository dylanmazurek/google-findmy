package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ivq extends ivu {
    private final ivs a;
    private final float b;
    private final float e;

    public ivq(ivs ivsVar, float f, float f2) {
        this.a = ivsVar;
        this.b = f;
        this.e = f2;
    }

    @Override // defpackage.ivu
    public final void a(Matrix matrix, iux iuxVar, int i, Canvas canvas) {
        ivs ivsVar = this.a;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(ivsVar.b - this.e, ivsVar.a - this.b), 0.0f);
        this.d.set(matrix);
        this.d.preTranslate(this.b, this.e);
        this.d.preRotate(b());
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = iux.a;
        iArr[0] = iuxVar.j;
        iArr[1] = iuxVar.i;
        iArr[2] = iuxVar.h;
        iuxVar.g.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iux.a, iux.b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(this.d);
        canvas.drawRect(rectF, iuxVar.g);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float b() {
        ivs ivsVar = this.a;
        return (float) Math.toDegrees(Math.atan((ivsVar.b - this.e) / (ivsVar.a - this.b)));
    }
}
