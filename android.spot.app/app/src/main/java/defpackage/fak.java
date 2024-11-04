package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fak {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public final List n = new ArrayList();

    public final int a() {
        return this.h - this.i;
    }

    public final void b(View view, int i, int i2, int i3, int i4) {
        faj fajVar = (faj) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - fajVar.g()) - i);
        this.b = Math.min(this.b, (view.getTop() - fajVar.i()) - i2);
        this.c = Math.max(this.c, view.getRight() + fajVar.h() + i3);
        this.d = Math.max(this.d, view.getBottom() + fajVar.f() + i4);
    }
}
