package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lh extends md {
    final /* synthetic */ li a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(li liVar, Context context) {
        super(context);
        this.a = liVar;
    }

    @Override // defpackage.md
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.md
    public final int b(int i) {
        return Math.min(100, super.b(i));
    }

    @Override // defpackage.md
    protected final void c(View view, mb mbVar) {
        li liVar = this.a;
        int[] d = liVar.d(liVar.a.m, view);
        int i = d[0];
        int i2 = d[1];
        int g = g(Math.max(Math.abs(i), Math.abs(i2)));
        if (g > 0) {
            mbVar.b(i, i2, g, this.j);
        }
    }
}
