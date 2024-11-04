package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqu {
    public final dhm a;
    public final List b;
    final dhd c;
    public boolean d;
    public dqs e;
    public boolean f;
    public dqs g;
    public Bitmap h;
    public dqs i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final dln n;
    private boolean o;
    private dhb p;

    public dqu(dgo dgoVar, dhm dhmVar, int i, int i2, diz dizVar, Bitmap bitmap) {
        dln dlnVar = dgoVar.a;
        dhd c = dgo.c(dgoVar.a());
        dhb f = dgo.c(dgoVar.a()).b().f(((dsn) ((dsn) dsn.b(dkp.b).z()).C()).q(i, i2));
        this.b = new ArrayList();
        this.c = c;
        Handler handler = new Handler(Looper.getMainLooper(), new dqt(this, 0));
        this.n = dlnVar;
        this.m = handler;
        this.p = f;
        this.a = dhmVar;
        e(dizVar, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return ((dhq) this.a).f.c;
    }

    public final void b() {
        int i;
        if (this.d && !this.o) {
            dqs dqsVar = this.i;
            if (dqsVar != null) {
                this.i = null;
                c(dqsVar);
                return;
            }
            this.o = true;
            dhq dhqVar = (dhq) this.a;
            dho dhoVar = dhqVar.f;
            int i2 = dhoVar.c;
            int i3 = 0;
            if (i2 > 0 && (i = dhqVar.e) >= 0) {
                i3 = i < i2 ? ((dhn) dhoVar.e.get(i)).i : -1;
            }
            long uptimeMillis = SystemClock.uptimeMillis() + i3;
            this.a.b();
            this.g = new dqs(this.m, ((dhq) this.a).e, uptimeMillis);
            this.p.f((dsn) new dsn().t(new dtb(Double.valueOf(Math.random())))).e(this.a).i(this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(dqs dqsVar) {
        int i;
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, dqsVar).sendToTarget();
            return;
        }
        if (this.d) {
            if (dqsVar.b != null) {
                d();
                dqs dqsVar2 = this.e;
                this.e = dqsVar;
                for (int size = this.b.size() - 1; size >= 0; size--) {
                    dqo dqoVar = (dqo) this.b.get(size);
                    Object callback = dqoVar.getCallback();
                    while (callback instanceof Drawable) {
                        callback = ((Drawable) callback).getCallback();
                    }
                    if (callback == null) {
                        dqoVar.stop();
                        dqoVar.invalidateSelf();
                    } else {
                        dqoVar.invalidateSelf();
                        dqs dqsVar3 = dqoVar.a.a.e;
                        if (dqsVar3 != null) {
                            i = dqsVar3.a;
                        } else {
                            i = -1;
                        }
                        if (i == r4.a() - 1) {
                            dqoVar.c++;
                        }
                        if (dqoVar.d != -1 && dqoVar.c >= 0) {
                            dqoVar.stop();
                        }
                    }
                }
                if (dqsVar2 != null) {
                    this.m.obtainMessage(2, dqsVar2).sendToTarget();
                }
            }
            b();
            return;
        }
        this.i = dqsVar;
    }

    public final void d() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(diz dizVar, Bitmap bitmap) {
        bsc.q(dizVar);
        bsc.q(bitmap);
        this.h = bitmap;
        this.p = this.p.f(new dsn().u(dizVar));
        this.j = dtq.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    public final void f() {
        this.d = false;
    }
}
