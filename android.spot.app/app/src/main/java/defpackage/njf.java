package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njf implements nll {
    public final long a;
    public boolean b;
    public final nkp c = new nkp();
    public final nkp d = new nkp();
    public boolean e;
    final /* synthetic */ njh f;

    public njf(njh njhVar, long j, boolean z) {
        this.f = njhVar;
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.nll
    public final long a(nkp nkpVar, long j) {
        Throwable th;
        Throwable th2;
        boolean z;
        long j2;
        do {
            njh njhVar = this.f;
            synchronized (njhVar) {
                njhVar.i.e();
                try {
                    th = null;
                    if (njhVar.j() != 0 && !this.b) {
                        th2 = njhVar.k;
                        if (th2 == null) {
                            int j3 = njhVar.j();
                            if (j3 != 0) {
                                th2 = new njn(j3);
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        th2 = null;
                    }
                    if (!this.e) {
                        nkp nkpVar2 = this.d;
                        long j4 = nkpVar2.b;
                        z = false;
                        if (j4 > 0) {
                            j2 = nkpVar2.a(nkpVar, Math.min(8192L, j4));
                            long j5 = njhVar.c + j2;
                            njhVar.c = j5;
                            long j6 = j5 - njhVar.d;
                            if (th2 == null) {
                                nja njaVar = njhVar.b;
                                if (j6 >= njaVar.q.c() / 2) {
                                    njaVar.h(njhVar.a, j6);
                                    njhVar.d = njhVar.c;
                                }
                            } else {
                                th = th2;
                            }
                        } else {
                            if (!this.b && th2 == null) {
                                njhVar.g();
                                z = true;
                            } else {
                                th = th2;
                            }
                            j2 = -1;
                        }
                    } else {
                        throw new IOException("stream closed");
                    }
                } finally {
                    njhVar.i.b();
                }
            }
        } while (z);
        if (j2 != -1) {
            return j2;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    public final void c(long j) {
        byte[] bArr = ngt.a;
        this.f.b.e(j);
    }

    @Override // defpackage.nll, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        njh njhVar = this.f;
        synchronized (njhVar) {
            this.e = true;
            nkp nkpVar = this.d;
            j = nkpVar.b;
            nkpVar.s();
            njhVar.notifyAll();
        }
        if (j > 0) {
            c(j);
        }
        this.f.d();
    }

    @Override // defpackage.nll
    public final nln dv() {
        return this.f.i;
    }
}
