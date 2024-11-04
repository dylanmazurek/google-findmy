package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awa extends ayp {
    final /* synthetic */ awd a;
    final /* synthetic */ mol b;

    public awa(awd awdVar, mol molVar) {
        this.a = awdVar;
        this.b = molVar;
    }

    @Override // defpackage.awh
    public final awi a(awj awjVar, List list, long j) {
        this.a.g.a = awjVar.m();
        this.a.g.b = awjVar.a();
        this.a.g.c = awjVar.b();
        if (!awjVar.n()) {
            awd awdVar = this.a;
            if (awdVar.a.e != null) {
                awdVar.d = 0;
                awi awiVar = (awi) this.b.a(awdVar.h, new bld(j));
                awd awdVar2 = this.a;
                return new avz(awiVar, awdVar2, awdVar2.d, awiVar, 1);
            }
        }
        awd awdVar3 = this.a;
        awdVar3.c = 0;
        awi awiVar2 = (awi) this.b.a(awdVar3.g, new bld(j));
        awd awdVar4 = this.a;
        return new avz(awiVar2, awdVar4, awdVar4.c, awiVar2, 0);
    }
}
