package defpackage;

import android.content.Context;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghk implements ghf {
    public static final joo a = joo.m("GnpSdk");
    public final Context b;
    public final Random c;
    public final ddg d;
    private final gnv e;
    private final gri f;
    private final gur g;
    private final gjn h;
    private final gls i;
    private final gpx j;

    public ghk(Context context, gnv gnvVar, gri griVar, gur gurVar, gjn gjnVar, ddg ddgVar, gls glsVar, gpx gpxVar, gwb gwbVar, Random random) {
        this.b = context;
        this.e = gnvVar;
        this.f = griVar;
        this.g = gurVar;
        this.h = gjnVar;
        this.d = ddgVar;
        this.i = glsVar;
        this.j = gpxVar;
        this.c = random;
        gwbVar.a(context);
    }

    @Override // defpackage.ghf
    public final ghg a(lcr lcrVar) {
        return new ghn(this, null, lcrVar, 0, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.ghf
    public final ghg b(lde ldeVar) {
        return new ghn(this, ldeVar, null, 0, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.ghf
    public final ghg c() {
        return new ghn(this, null, null, 8, this.e, this.f, this.g, this.h, this.i, this.j);
    }
}
