package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njg extends nko {
    final /* synthetic */ njh a;

    public njg(njh njhVar) {
        this.a = njhVar;
    }

    @Override // defpackage.nko
    public final void a() {
        this.a.l(9);
        nja njaVar = this.a.b;
        synchronized (njaVar) {
            long j = njaVar.n;
            long j2 = njaVar.m;
            if (j >= j2) {
                njaVar.m = j2 + 1;
                njaVar.p = System.nanoTime() + 1000000000;
                njaVar.i.e(new nix(String.valueOf(njaVar.d).concat(" ping"), njaVar));
            }
        }
    }

    public final void b() {
        if (!f()) {
        } else {
            throw new SocketTimeoutException("timeout");
        }
    }
}
