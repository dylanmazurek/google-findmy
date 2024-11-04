package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nir extends ngv {
    final /* synthetic */ nis d;
    final /* synthetic */ njm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nir(String str, nis nisVar, njm njmVar) {
        super(str);
        this.d = nisVar;
        this.e = njmVar;
    }

    @Override // defpackage.ngv
    public final long a() {
        long c;
        int i;
        njh[] njhVarArr;
        mpn mpnVar = new mpn();
        njm njmVar = this.e;
        nja njaVar = this.d.a;
        synchronized (njaVar.u) {
            synchronized (njaVar) {
                njm njmVar2 = njaVar.r;
                njm njmVar3 = new njm();
                njmVar3.e(njmVar2);
                njmVar3.e(njmVar);
                mpnVar.a = njmVar3;
                c = ((njm) mpnVar.a).c() - njmVar2.c();
                njhVarArr = null;
                if (c != 0) {
                    if (!njaVar.c.isEmpty()) {
                        njhVarArr = (njh[]) njaVar.c.values().toArray(new njh[0]);
                    }
                } else {
                    c = 0;
                }
                njm njmVar4 = (njm) mpnVar.a;
                njmVar4.getClass();
                njaVar.r = njmVar4;
                njaVar.k.e(new nio(njaVar.d + " onSettings", njaVar, mpnVar));
            }
            try {
                njaVar.u.a((njm) mpnVar.a);
            } catch (IOException e) {
                njaVar.c(e);
            }
        }
        if (njhVarArr != null) {
            for (njh njhVar : njhVarArr) {
                synchronized (njhVar) {
                    njhVar.c(c);
                }
            }
            return -1L;
        }
        return -1L;
    }
}
