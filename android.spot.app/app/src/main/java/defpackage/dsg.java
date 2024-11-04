package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsg implements dsk, dsi {
    public volatile dsi a;
    public volatile dsi b;
    private final Object c;
    private final dsk d;
    private dsj e = dsj.CLEARED;
    private dsj f = dsj.CLEARED;

    public dsg(Object obj, dsk dskVar) {
        this.c = obj;
        this.d = dskVar;
    }

    @Override // defpackage.dsk
    public final dsk a() {
        dsk dskVar;
        synchronized (this.c) {
            dsk dskVar2 = this.d;
            if (dskVar2 != null) {
                dskVar = dskVar2.a();
            } else {
                dskVar = this;
            }
        }
        return dskVar;
    }

    @Override // defpackage.dsi
    public final void b() {
        synchronized (this.c) {
            if (this.e != dsj.RUNNING) {
                this.e = dsj.RUNNING;
                this.a.b();
            }
        }
    }

    @Override // defpackage.dsi
    public final void c() {
        synchronized (this.c) {
            this.e = dsj.CLEARED;
            this.a.c();
            dsj dsjVar = this.f;
            dsj dsjVar2 = dsj.CLEARED;
            if (dsjVar != dsjVar2) {
                this.f = dsjVar2;
                this.b.c();
            }
        }
    }

    @Override // defpackage.dsk
    public final void d(dsi dsiVar) {
        synchronized (this.c) {
            if (!dsiVar.equals(this.b)) {
                this.e = dsj.FAILED;
                dsj dsjVar = this.f;
                dsj dsjVar2 = dsj.RUNNING;
                if (dsjVar != dsjVar2) {
                    this.f = dsjVar2;
                    this.b.b();
                }
                return;
            }
            this.f = dsj.FAILED;
            dsk dskVar = this.d;
            if (dskVar != null) {
                dskVar.d(this);
            }
        }
    }

    @Override // defpackage.dsk
    public final void e(dsi dsiVar) {
        synchronized (this.c) {
            if (dsiVar.equals(this.a)) {
                this.e = dsj.SUCCESS;
            } else if (dsiVar.equals(this.b)) {
                this.f = dsj.SUCCESS;
            }
            dsk dskVar = this.d;
            if (dskVar != null) {
                dskVar.e(this);
            }
        }
    }

    @Override // defpackage.dsi
    public final void f() {
        synchronized (this.c) {
            if (this.e == dsj.RUNNING) {
                this.e = dsj.PAUSED;
                this.a.f();
            }
            if (this.f == dsj.RUNNING) {
                this.f = dsj.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.dsk
    public final boolean g(dsi dsiVar) {
        boolean z;
        synchronized (this.c) {
            dsk dskVar = this.d;
            z = false;
            if ((dskVar == null || dskVar.g(this)) && dsiVar.equals(this.a)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:            if (r6 != false) goto L21;     */
    @Override // defpackage.dsk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(defpackage.dsi r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            dsk r1 = r5.d     // Catch: java.lang.Throwable -> L37
            r2 = 0
            if (r1 == 0) goto Le
            boolean r1 = r1.h(r5)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L35
        Le:
            dsj r1 = r5.e     // Catch: java.lang.Throwable -> L37
            dsj r3 = defpackage.dsj.FAILED     // Catch: java.lang.Throwable -> L37
            r4 = 1
            if (r1 == r3) goto L1c
            dsi r1 = r5.a     // Catch: java.lang.Throwable -> L37
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L37
            goto L32
        L1c:
            dsi r1 = r5.b     // Catch: java.lang.Throwable -> L37
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L31
            dsj r6 = r5.f     // Catch: java.lang.Throwable -> L37
            dsj r1 = defpackage.dsj.SUCCESS     // Catch: java.lang.Throwable -> L37
            if (r6 == r1) goto L2f
            dsj r1 = defpackage.dsj.FAILED     // Catch: java.lang.Throwable -> L37
            if (r6 != r1) goto L31
            goto L34
        L2f:
            r6 = 1
            goto L32
        L31:
            r6 = 0
        L32:
            if (r6 == 0) goto L35
        L34:
            r2 = 1
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r2
        L37:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsg.h(dsi):boolean");
    }

    @Override // defpackage.dsk
    public final boolean i(dsi dsiVar) {
        boolean z;
        synchronized (this.c) {
            dsk dskVar = this.d;
            z = true;
            if (dskVar != null && !dskVar.i(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.dsk, defpackage.dsi
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.dsi
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            z = false;
            if (this.e == dsj.CLEARED && this.f == dsj.CLEARED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dsi
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != dsj.SUCCESS && this.f != dsj.SUCCESS) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.dsi
    public final boolean m(dsi dsiVar) {
        if (dsiVar instanceof dsg) {
            dsg dsgVar = (dsg) dsiVar;
            if (this.a.m(dsgVar.a) && this.b.m(dsgVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dsi
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != dsj.RUNNING && this.f != dsj.RUNNING) {
                z = false;
            }
        }
        return z;
    }
}
