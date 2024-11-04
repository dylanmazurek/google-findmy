package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lt {
    public RecyclerView a;
    public final ft b = new mq(this);

    public abstract View c(lr lrVar);

    public abstract int[] d(lr lrVar, View view);

    public final void f() {
        lr lrVar;
        View c;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (lrVar = recyclerView.m) != null && (c = c(lrVar)) != null) {
            int[] d = d(lrVar, c);
            int i = 0;
            int i2 = d[0];
            if (i2 == 0) {
                if (d[1] == 0) {
                    return;
                }
            } else {
                i = i2;
            }
            this.a.am(i, d[1]);
        }
    }
}
