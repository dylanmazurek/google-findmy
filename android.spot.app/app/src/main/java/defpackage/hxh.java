package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.widget.ListView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxh {
    private static boolean d;
    public final int a;
    public final Object b;
    public final Object c;

    public hxh(fij fijVar, int i, fhq fhqVar) {
        this.c = fijVar;
        this.a = i;
        this.b = fhqVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [jfe, java.lang.Object] */
    public final void a() {
        synchronized (hxh.class) {
            if (!d) {
                hsi hsiVar = new hsi(this, 14);
                long j = this.a;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                jzd jzdVar = (jzd) this.b.a();
                hwx.b(jzdVar.schedule(new got(hsiVar, jzdVar, j, timeUnit, 2), j, timeUnit));
                d = true;
            }
        }
    }

    public final ListView b() {
        return ((ky) this.b).e;
    }

    public hxh(jei jeiVar, ihy ihyVar) {
        this.c = jeiVar;
        this.a = 3;
        this.b = ihyVar;
    }

    public hxh(ld ldVar, gh ghVar, int i) {
        this.b = ldVar;
        this.c = ghVar;
        this.a = i;
    }

    public hxh(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.c = colorStateList;
        this.b = configuration;
        this.a = theme == null ? 0 : theme.hashCode();
    }

    public hxh(jfe jfeVar) {
        eft eftVar = new eft(15);
        this.b = jfeVar;
        this.a = Math.max(5, 10);
        this.c = eftVar;
    }
}
