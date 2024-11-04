package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nje implements nlj {
    public final boolean a;
    public boolean b;
    final /* synthetic */ njh c;
    private final nkp d = new nkp();

    public nje(njh njhVar, boolean z) {
        this.c = njhVar;
        this.a = z;
    }

    private final void c(boolean z) {
        long min;
        boolean z2;
        njh njhVar = this.c;
        synchronized (njhVar) {
            njhVar.j.e();
            while (njhVar.e >= njhVar.f && !this.a && !this.b && njhVar.j() == 0) {
                try {
                    njhVar.g();
                } finally {
                    njhVar.j.b();
                }
            }
            njhVar.j.b();
            njhVar.e();
            min = Math.min(njhVar.f - njhVar.e, this.d.b);
            njhVar.e += min;
            if (z && min == this.d.b) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.c.j.e();
        try {
            njh njhVar2 = this.c;
            njhVar2.b.f(njhVar2.a, z2, this.d, min);
        } finally {
            njhVar = this.c;
        }
    }

    @Override // defpackage.nlj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = ngt.a;
        njh njhVar = this.c;
        synchronized (njhVar) {
            if (this.b) {
                return;
            }
            int j = njhVar.j();
            njh njhVar2 = this.c;
            if (!njhVar2.h.a) {
                if (this.d.b > 0) {
                    while (this.d.b > 0) {
                        c(true);
                    }
                } else if (j == 0) {
                    njhVar2.b.f(njhVar2.a, true, null, 0L);
                }
            }
            synchronized (this.c) {
                this.b = true;
            }
            this.c.b.d();
            this.c.d();
        }
    }

    @Override // defpackage.nlj
    public final nln dv() {
        return this.c.j;
    }

    @Override // defpackage.nlj
    public final void dw(nkp nkpVar, long j) {
        byte[] bArr = ngt.a;
        this.d.dw(nkpVar, j);
        while (this.d.b >= 16384) {
            c(false);
        }
    }

    @Override // defpackage.nlj, java.io.Flushable
    public final void flush() {
        byte[] bArr = ngt.a;
        njh njhVar = this.c;
        synchronized (njhVar) {
            njhVar.e();
        }
        while (this.d.b > 0) {
            c(false);
            this.c.b.d();
        }
    }
}
