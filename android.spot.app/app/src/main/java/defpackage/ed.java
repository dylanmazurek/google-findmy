package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ed extends en {
    sl a;
    public tb b;

    public ed(ed edVar, ei eiVar, Resources resources) {
        super(edVar, eiVar, resources);
        if (edVar != null) {
            this.a = edVar.a;
            this.b = edVar.b;
        } else {
            this.a = new sl();
            this.b = new tb();
        }
    }

    public static long c(int i, int i2) {
        return i2 | (i << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final int a(int i) {
        ?? r5;
        if (i < 0) {
            return 0;
        }
        tb tbVar = this.b;
        int i2 = 0;
        int a = td.a(tbVar.b, tbVar.d, i);
        if (a >= 0 && (r5 = tbVar.c[a]) != tc.a) {
            i2 = r5;
        }
        return i2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int[] iArr) {
        int m = super.m(iArr);
        if (m >= 0) {
            return m;
        }
        return super.m(StateSet.WILD_CARD);
    }

    @Override // defpackage.en, defpackage.ek
    public final void d() {
        this.a = this.a.clone();
        this.b = this.b.clone();
    }

    public final void e(int i, int i2, Drawable drawable, boolean z) {
        long j;
        long f = super.f(drawable);
        sl slVar = this.a;
        if (true != z) {
            j = 0;
        } else {
            j = 8589934592L;
        }
        slVar.h(c(i, i2), Long.valueOf(f | j));
        if (z) {
            this.a.h(c(i2, i), Long.valueOf(f | 4294967296L | j));
        }
    }

    @Override // defpackage.en, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new ei(this, null);
    }

    @Override // defpackage.en, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new ei(this, resources);
    }
}
