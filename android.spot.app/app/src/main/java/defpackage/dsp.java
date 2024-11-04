package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsp implements dsk, dsi {
    public volatile dsi a;
    public volatile dsi b;
    private final dsk c;
    private final Object d;
    private dsj e = dsj.CLEARED;
    private dsj f = dsj.CLEARED;
    private boolean g;

    public dsp(Object obj, dsk dskVar) {
        this.d = obj;
        this.c = dskVar;
    }

    @Override // defpackage.dsk
    public final dsk a() {
        dsk dskVar;
        synchronized (this.d) {
            dsk dskVar2 = this.c;
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
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != dsj.SUCCESS) {
                    dsj dsjVar = this.f;
                    dsj dsjVar2 = dsj.RUNNING;
                    if (dsjVar != dsjVar2) {
                        this.f = dsjVar2;
                        this.b.b();
                    }
                }
                if (this.g) {
                    dsj dsjVar3 = this.e;
                    dsj dsjVar4 = dsj.RUNNING;
                    if (dsjVar3 != dsjVar4) {
                        this.e = dsjVar4;
                        this.a.b();
                    }
                }
            } finally {
                this.g = false;
            }
        }
    }

    @Override // defpackage.dsi
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            this.e = dsj.CLEARED;
            this.f = dsj.CLEARED;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.dsk
    public final void d(dsi dsiVar) {
        synchronized (this.d) {
            if (!dsiVar.equals(this.a)) {
                this.f = dsj.FAILED;
                return;
            }
            this.e = dsj.FAILED;
            dsk dskVar = this.c;
            if (dskVar != null) {
                dskVar.d(this);
            }
        }
    }

    @Override // defpackage.dsk
    public final void e(dsi dsiVar) {
        synchronized (this.d) {
            if (dsiVar.equals(this.b)) {
                this.f = dsj.SUCCESS;
                return;
            }
            this.e = dsj.SUCCESS;
            dsk dskVar = this.c;
            if (dskVar != null) {
                dskVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.dsi
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = dsj.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = dsj.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.dsk
    public final boolean g(dsi dsiVar) {
        boolean z;
        synchronized (this.d) {
            dsk dskVar = this.c;
            z = false;
            if ((dskVar == null || dskVar.g(this)) && dsiVar.equals(this.a) && this.e != dsj.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dsk
    public final boolean h(dsi dsiVar) {
        boolean z;
        synchronized (this.d) {
            dsk dskVar = this.c;
            z = false;
            if ((dskVar == null || dskVar.h(this)) && dsiVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dsk
    public final boolean i(dsi dsiVar) {
        boolean z;
        synchronized (this.d) {
            dsk dskVar = this.c;
            z = false;
            if ((dskVar == null || dskVar.i(this)) && (dsiVar.equals(this.a) || this.e != dsj.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dsk, defpackage.dsi
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.dsi
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            if (this.e == dsj.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.dsi
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            if (this.e == dsj.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.dsi
    public final boolean m(dsi dsiVar) {
        if (dsiVar instanceof dsp) {
            dsp dspVar = (dsp) dsiVar;
            if (this.a != null ? this.a.m(dspVar.a) : dspVar.a == null) {
                if (this.b == null) {
                    if (dspVar.b == null) {
                        return true;
                    }
                } else if (this.b.m(dspVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dsi
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            if (this.e == dsj.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
