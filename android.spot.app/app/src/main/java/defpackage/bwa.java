package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwa implements View.OnApplyWindowInsetsListener {
    bya a = null;
    final /* synthetic */ View b;
    final /* synthetic */ bvj c;

    public bwa(View view, bvj bvjVar) {
        this.b = view;
        this.c = bvjVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        bya n = bya.n(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            bwb.i(windowInsets, this.b);
            if (n.equals(this.a)) {
                return this.c.a(view, n).e();
            }
        }
        this.a = n;
        bya a = this.c.a(view, n);
        if (Build.VERSION.SDK_INT >= 30) {
            return a.e();
        }
        bvz.c(view);
        return a.e();
    }
}
