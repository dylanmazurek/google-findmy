package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isf {
    public int a;
    public int b;
    public int c;
    public int d;

    public isf(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final void a(View view) {
        view.setPaddingRelative(this.a, this.b, this.c, this.d);
    }

    public isf(isf isfVar) {
        this.a = isfVar.a;
        this.b = isfVar.b;
        this.c = isfVar.c;
        this.d = isfVar.d;
    }
}
