package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxe implements Runnable {
    private final crd a;
    private final boolean b;
    private final int c;
    private final bet d;

    public cxe(crd crdVar, bet betVar, boolean z, int i) {
        this.a = crdVar;
        this.d = betVar;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        csl a;
        if (this.b) {
            crd crdVar = this.a;
            bet betVar = this.d;
            int i = this.c;
            String str = ((cvk) betVar.a).a;
            synchronized (crdVar.i) {
                a = crdVar.a(str);
            }
            crd.f(a, i);
        } else {
            crd crdVar2 = this.a;
            bet betVar2 = this.d;
            int i2 = this.c;
            String str2 = ((cvk) betVar2.a).a;
            synchronized (crdVar2.i) {
                if (crdVar2.d.get(str2) != null) {
                    cqc.b();
                } else {
                    Set set = (Set) crdVar2.f.get(str2);
                    if (set != null && set.contains(betVar2)) {
                        crd.f(crdVar2.a(str2), i2);
                    }
                }
            }
        }
        cqc.b();
        cqc.a("StopWorkRunnable");
    }
}
