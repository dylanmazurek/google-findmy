package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqx implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final mko d;
    private final mko e;
    private final mko f;
    private final mko g;
    private final mko h;
    private final mko i;
    private final mko j;
    private final mko k;
    private final mko l;
    private final mko m;
    private final /* synthetic */ int n;

    public hqx(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, mko mkoVar9, mko mkoVar10, mko mkoVar11, mko mkoVar12, mko mkoVar13, int i) {
        this.n = i;
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
        this.e = mkoVar5;
        this.f = mkoVar6;
        this.g = mkoVar7;
        this.h = mkoVar8;
        this.i = mkoVar9;
        this.j = mkoVar10;
        this.k = mkoVar11;
        this.l = mkoVar12;
        this.m = mkoVar13;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        if (this.n != 0) {
            git gitVar = (git) this.c.a();
            gll gllVar = (gll) this.k.a();
            ghf ghfVar = (ghf) this.b.a();
            mko mkoVar = this.e;
            mko mkoVar2 = this.f;
            gok a = ((gwv) this.m).a();
            goj b = ((goq) mkoVar2).b();
            ghe gheVar = (ghe) mkoVar.a();
            glu gluVar = (glu) this.j.a();
            mko mkoVar3 = this.d;
            return new ggp(gitVar, gllVar, ghfVar, a, b, gheVar, gluVar, lsg.c(this.g), (gok) mkoVar3.a(), (Lock) this.a.a(), (jer) ((lsi) this.i).b, ((gie) this.l).a(), (ScheduledExecutorService) this.h.a());
        }
        mko mkoVar4 = this.c;
        mko mkoVar5 = this.b;
        hpe a2 = ((hpf) this.a).a();
        Context b2 = ((lry) mkoVar5).b();
        hnu hnuVar = (hnu) mkoVar4.a();
        mko mkoVar6 = this.h;
        mko mkoVar7 = this.e;
        lqz c = lsg.c(this.d);
        Object a3 = mkoVar7.a();
        Executor executor = (Executor) mkoVar6.a();
        mko mkoVar8 = this.m;
        mko mkoVar9 = this.j;
        lqz c2 = lsg.c(this.i);
        hri a4 = ((hrj) mkoVar9).a();
        hrc a5 = ((hrd) mkoVar8).a();
        hqr hqrVar = (hqr) a3;
        mko mkoVar10 = this.l;
        mko mkoVar11 = this.k;
        return new hqw(a2, b2, hnuVar, c, hqrVar, this.f, this.g, executor, c2, a4, mkoVar11, mkoVar10, a5);
    }

    public hqx(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, mko mkoVar9, mko mkoVar10, mko mkoVar11, mko mkoVar12, mko mkoVar13, int i, byte[] bArr) {
        this.n = i;
        this.c = mkoVar;
        this.k = mkoVar2;
        this.b = mkoVar3;
        this.m = mkoVar4;
        this.f = mkoVar5;
        this.e = mkoVar6;
        this.j = mkoVar7;
        this.g = mkoVar8;
        this.d = mkoVar9;
        this.a = mkoVar10;
        this.i = mkoVar11;
        this.l = mkoVar12;
        this.h = mkoVar13;
    }
}
