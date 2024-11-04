package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcc {
    public final gbd a;
    public boolean c = false;
    public boolean d = false;
    public final njz i = new njz(this, null);
    public int e = 0;
    public Runnable f = null;
    public int g = 0;
    public Runnable h = null;
    public final gcf b = new gcf();

    public gcc(gbd gbdVar) {
        this.a = gbdVar;
    }

    public final void a() {
        this.f = null;
        if (!this.b.c()) {
            return;
        }
        jax c = jbu.c("GIL:AutoProcessBatch");
        try {
            this.a.b(new gca(this, 1));
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        if (this.f != null) {
            return;
        }
        gcb gcbVar = new gcb(this, 1);
        this.f = gcbVar;
        int i = this.e;
        if (i > 0) {
            ijs.d(gcbVar, i);
        } else {
            ijs.e(gcbVar);
        }
    }
}
