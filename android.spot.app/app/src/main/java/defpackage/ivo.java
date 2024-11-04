package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ivo extends ivu {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public ivo(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.ivu
    public final void a(Matrix matrix, iux iuxVar, int i, Canvas canvas) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ivu) it.next()).a(this.b, iuxVar, i, canvas);
        }
    }
}
