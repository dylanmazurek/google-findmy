package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class li extends lt {
    private lg c;
    private lg d;

    public static final int e(View view, lg lgVar) {
        return (lgVar.d(view) + (lgVar.b(view) / 2)) - (lgVar.j() + (lgVar.k() / 2));
    }

    private static final View g(lr lrVar, lg lgVar) {
        int i;
        int an = lrVar.an();
        View view = null;
        if (an == 0) {
            return null;
        }
        int j = lgVar.j() + (lgVar.k() / 2);
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        while (i2 < an) {
            View av = lrVar.av(i2);
            int abs = Math.abs((lgVar.d(av) + (lgVar.b(av) / 2)) - j);
            if (abs < i3) {
                i = abs;
            } else {
                i = i3;
            }
            if (abs < i3) {
                view = av;
            }
            i2++;
            i3 = i;
        }
        return view;
    }

    public final lg a(lr lrVar) {
        lg lgVar = this.d;
        if (lgVar == null || lgVar.a != lrVar) {
            this.d = new le(lrVar);
        }
        return this.d;
    }

    public final lg b(lr lrVar) {
        lg lgVar = this.c;
        if (lgVar == null || lgVar.a != lrVar) {
            this.c = new lf(lrVar);
        }
        return this.c;
    }

    @Override // defpackage.lt
    public View c(lr lrVar) {
        if (lrVar.Y()) {
            return g(lrVar, b(lrVar));
        }
        if (lrVar.X()) {
            return g(lrVar, a(lrVar));
        }
        return null;
    }

    @Override // defpackage.lt
    public final int[] d(lr lrVar, View view) {
        int[] iArr = new int[2];
        if (lrVar.X()) {
            iArr[0] = e(view, a(lrVar));
        } else {
            iArr[0] = 0;
        }
        if (lrVar.Y()) {
            iArr[1] = e(view, b(lrVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
