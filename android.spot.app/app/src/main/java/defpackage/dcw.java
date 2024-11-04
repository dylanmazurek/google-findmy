package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcw extends dcu {
    private final Paint j;
    private final Rect k;
    private final Rect l;
    private final cyn m;
    private czw n;
    private czw o;

    public dcw(cym cymVar, dcx dcxVar) {
        super(cymVar, dcxVar);
        cyn cynVar;
        this.j = new cyx(3);
        this.k = new Rect();
        this.l = new Rect();
        String str = dcxVar.f;
        cyb cybVar = cymVar.a;
        if (cybVar == null) {
            cynVar = null;
        } else {
            cynVar = (cyn) cybVar.b.get(str);
        }
        this.m = cynVar;
    }

    @Override // defpackage.dcu, defpackage.dbn
    public final void a(Object obj, dfe dfeVar) {
        super.a(obj, dfeVar);
        if (obj == cyq.K) {
            if (dfeVar == null) {
                this.n = null;
                return;
            } else {
                this.n = new dan(dfeVar);
                return;
            }
        }
        if (obj == cyq.N) {
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
        cyn cynVar = this.m;
        if (cynVar != null) {
            float f = cynVar.a;
            float a = dfb.a();
            rectF.set(0.0f, 0.0f, f * a, cynVar.b * a);
            this.a.mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    @Override // defpackage.dcu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r11, android.graphics.Matrix r12, int r13) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcw.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
