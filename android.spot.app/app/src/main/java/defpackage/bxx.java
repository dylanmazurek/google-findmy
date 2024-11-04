package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxx extends bxw {
    static final bya c;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        c = bya.m(windowInsets);
    }

    public bxx(bya byaVar, WindowInsets windowInsets) {
        super(byaVar, windowInsets);
    }

    @Override // defpackage.bxt, defpackage.bxy
    public brq a(int i) {
        Insets insets;
        insets = this.a.getInsets(bxz.a(i));
        return brq.e(insets);
    }

    @Override // defpackage.bxt, defpackage.bxy
    public final void e(View view) {
    }
}
