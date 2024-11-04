package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyt implements gry {
    public final Context a;
    public final mnb b;
    public final ghf c;
    public final gwb d;
    public final gvg e;
    public final gyp f;
    public final String g;
    private final mnb h;
    private final int i;

    public gyt(Context context, mnb mnbVar, mnb mnbVar2, ghf ghfVar, gwb gwbVar, gvg gvgVar, gyp gypVar, String str, int i) {
        this.a = context;
        this.h = mnbVar;
        this.b = mnbVar2;
        this.c = ghfVar;
        this.d = gwbVar;
        this.e = gvgVar;
        this.f = gypVar;
        this.g = str;
        this.i = i;
    }

    @Override // defpackage.gry
    public final int a() {
        return this.i;
    }

    @Override // defpackage.gry
    public final long b() {
        return this.f.a();
    }

    @Override // defpackage.gry
    public final Object c(Bundle bundle, mmx mmxVar) {
        return mpp.l(this.h, new gys(this, bundle, (mmx) null, 0), mmxVar);
    }

    @Override // defpackage.gry
    public final String d() {
        return this.g;
    }

    @Override // defpackage.gry
    public final boolean e() {
        return this.f.d();
    }

    @Override // defpackage.gry
    public final void f() {
    }
}
