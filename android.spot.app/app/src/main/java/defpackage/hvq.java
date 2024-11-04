package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvq {
    public static Context a;
    private static volatile hvq j;
    private static volatile hvq k;
    public final Context c;
    public final hxy d;
    public final jfe e;
    public final AtomicReference f;
    public final Object g = new Object();
    public volatile jyz h = null;
    private final jfe l;
    private final jfe m;
    private final jer n;
    private final jfe o;
    private static final Object i = new Object();
    public static final jfe b = hwx.H(new eft(14));

    public hvq(Context context, jfe jfeVar, jfe jfeVar2, jer jerVar, jfe jfeVar3, jfe jfeVar4) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        jfeVar.getClass();
        jfeVar2.getClass();
        jerVar.getClass();
        jfeVar3.getClass();
        jfeVar4.getClass();
        this.c = applicationContext;
        this.l = hwx.H(jfeVar);
        this.m = hwx.H(jfeVar2);
        this.n = jerVar;
        this.o = hwx.H(jfeVar3);
        this.d = new hxy(applicationContext, jfeVar, jfeVar3, jfeVar2);
        this.e = hwx.H(jfeVar4);
        this.f = new AtomicReference();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hvq a(Context context) {
        boolean z;
        hvq hvqVar = j;
        if (hvqVar != null) {
            return hvqVar;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            ((hvp) iqh.j(applicationContext, hvp.class)).h();
            z = true;
        } catch (IllegalStateException unused) {
            z = false;
        }
        synchronized (i) {
            if (j != null) {
                return j;
            }
            jer jerVar = jdl.a;
            boolean z2 = applicationContext instanceof hvp;
            if (z2) {
                jerVar = ((hvp) applicationContext).h();
            }
            hvq hvqVar2 = (hvq) jerVar.d(new hnn(applicationContext, 11));
            j = hvqVar2;
            if (!z && !z2) {
                hqt.c(Level.CONFIG, hvqVar2.b(), "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
            }
            return hvqVar2;
        }
    }

    public static void c(Context context) {
        synchronized (i) {
            if (a != null) {
                return;
            }
            try {
                a = context.getApplicationContext();
            } catch (NullPointerException unused) {
                e();
                hqt.c(Level.WARNING, (Executor) b.a(), "context.getApplicationContext() yielded NullPointerException", new Object[0]);
            }
        }
    }

    public static void e() {
        hvs.a();
        if (a == null && hvs.a == null) {
            hvs.a = new hvr();
        }
    }

    public final jzd b() {
        return (jzd) this.l.a();
    }

    public final hxh d() {
        return (hxh) ((jeu) this.n).a;
    }

    public final hot f() {
        return (hot) this.m.a();
    }

    public final kpb g() {
        return (kpb) this.o.a();
    }
}
