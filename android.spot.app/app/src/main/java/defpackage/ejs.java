package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejs implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final mko d;
    private final mko e;
    private final mko f;
    private final /* synthetic */ int g;

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i) {
        this.g = i;
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
        this.e = mkoVar5;
        this.f = mkoVar6;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        switch (this.g) {
            case 0:
                return new ejr((ele) this.a.a(), (emx) this.b.a(), (apc) this.c.a(), (ilv) this.d.a(), (ejo) this.e.a(), (ewf) this.f.a());
            case 1:
                efy efyVar = (efy) this.f.a();
                dvt dvtVar = (dvt) this.c.a();
                dvn dvnVar = (dvn) this.b.a();
                dxf dxfVar = (dxf) this.e.a();
                dhx dhxVar = (dhx) this.a.a();
                return new egk(efyVar, dvtVar, dvnVar, dxfVar, dhxVar);
            case 2:
                ewf ewfVar = (ewf) this.e.a();
                mko mkoVar = this.b;
                return new ejv(ewfVar, ((ihl) this.c).a(), (ewc) mkoVar.a(), ((iiz) this.d).a(), (Executor) this.a.a(), (Executor) this.f.a());
            case 3:
                return new ekp((evy) this.b.a(), (ewg) this.f.a(), (ejt) this.a.a(), (fgp) this.e.a(), ((fnx) this.d).a(), (esa) this.c.a());
            case 4:
                bym bymVar = (bym) this.b.a();
                mko mkoVar2 = this.c;
                return new emx(bymVar, ((lry) this.f).b(), ((epx) this.e).a(), (dhx) mkoVar2.a(), (ilv) this.a.a(), (Executor) this.d.a());
            case 5:
                return new eop((cfz) ((lsi) this.c).b, (lra) ((lsi) this.d).b, (ewf) this.b.a(), (ewg) this.f.a(), (elk) this.e.a(), (ele) this.a.a());
            case 6:
                return new etb((dxf) this.f.a(), (ewg) this.e.a(), ((ihl) this.c).a(), (ele) this.a.a(), (Executor) this.b.a(), (Executor) this.d.a());
            case 7:
                gss gssVar = (gss) this.c.a();
                mko mkoVar3 = this.f;
                mko mkoVar4 = this.a;
                mnb b = ((dvu) this.b).b();
                ddg b2 = ((gtu) mkoVar4).b();
                Context b3 = ((lry) mkoVar3).b();
                gwc gwcVar = new gwc();
                jer b4 = ((dvv) this.e).b();
                Boolean bool = true;
                bool.getClass();
                return new gwu(gssVar, b, b2, b3, gwcVar, b4, this.d);
            case 8:
                ((goq) this.f).b();
                gyg gygVar = (gyg) this.c.a();
                return new gyf(gygVar, ((gtu) this.e).b());
            case 9:
                mko mkoVar5 = this.c;
                goj b5 = ((goq) this.e).b();
                grt grtVar = (grt) mkoVar5.a();
                return new gyi(b5, grtVar, (jer) ((lsi) this.d).b, (gll) this.b.a(), ((gtu) this.a).b());
            case 10:
                Context b6 = ((lry) this.f).b();
                jer jerVar = (jer) ((lsi) this.e).b;
                jer b7 = ((dvv) this.b).b();
                jer jerVar2 = (jer) ((lsi) this.a).b;
                jer jerVar3 = (jer) ((lsi) this.c).b;
                hjz hjzVar = new hjz();
                hjzVar.b(b6);
                hjzVar.b = (ExecutorService) ((jeu) b7).a;
                hjzVar.c = (ScheduledExecutorService) jerVar2.f();
                hjzVar.d = (Handler) jerVar.f();
                hjzVar.f = (hpd) jerVar3.f();
                return hjzVar.a();
            case 11:
                hnq hnqVar = (hnq) this.c.a();
                jzd jzdVar = (jzd) this.e.a();
                Executor executor = (Executor) this.f.a();
                mko mkoVar6 = this.a;
                lqz c = lsg.c(this.b);
                lsg.c(mkoVar6);
                return new hrq(hnqVar, jzdVar, executor, c);
            case 12:
                mko mkoVar7 = this.a;
                Context b8 = ((lry) this.b).b();
                hri hriVar = (hri) mkoVar7.a();
                apc a = ((hnm) this.e).a();
                mko mkoVar8 = this.c;
                return new hry(this.f, b8, this.d, mkoVar8, hriVar, a);
            case 13:
                hnq hnqVar2 = (hnq) this.e.a();
                mko mkoVar9 = this.c;
                mko mkoVar10 = this.d;
                mko mkoVar11 = this.f;
                return new hsq(hnqVar2, this.a, this.b, mkoVar11, mkoVar10, lsg.c(mkoVar9));
            case 14:
                mko mkoVar12 = this.b;
                hpe a2 = ((hpf) this.e).a();
                mko mkoVar13 = this.f;
                lqz c2 = lsg.c(this.d);
                lsg.c(mkoVar13);
                return new htc(a2, c2, this.a, ((htp) this.c).a());
            case 15:
                mko mkoVar14 = this.b;
                hpe a3 = ((hpf) this.f).a();
                jzd jzdVar2 = (jzd) mkoVar14.a();
                lsg.c(this.a);
                mko mkoVar15 = this.e;
                return new htj(a3, jzdVar2, lsg.c(this.d), this.c, ((htp) mkoVar15).a());
            default:
                mko mkoVar16 = this.c;
                mko mkoVar17 = this.f;
                mko mkoVar18 = this.d;
                mko mkoVar19 = this.a;
                return new kqr(this.b, this.e, mkoVar19, mkoVar18, mkoVar17, mkoVar16);
        }
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, byte[] bArr) {
        this.g = i;
        this.f = mkoVar;
        this.c = mkoVar2;
        this.b = mkoVar3;
        this.e = mkoVar4;
        this.a = mkoVar5;
        this.d = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, char[] cArr) {
        this.g = i;
        this.e = mkoVar;
        this.c = mkoVar2;
        this.b = mkoVar3;
        this.d = mkoVar4;
        this.a = mkoVar5;
        this.f = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, float[] fArr) {
        this.g = i;
        this.f = mkoVar;
        this.e = mkoVar2;
        this.c = mkoVar3;
        this.a = mkoVar4;
        this.b = mkoVar5;
        this.d = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, int[] iArr) {
        this.g = i;
        this.b = mkoVar;
        this.f = mkoVar2;
        this.e = mkoVar3;
        this.c = mkoVar4;
        this.a = mkoVar5;
        this.d = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, short[] sArr) {
        this.g = i;
        this.b = mkoVar;
        this.f = mkoVar2;
        this.a = mkoVar3;
        this.e = mkoVar4;
        this.d = mkoVar5;
        this.c = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, boolean[] zArr) {
        this.g = i;
        this.c = mkoVar;
        this.d = mkoVar2;
        this.b = mkoVar3;
        this.f = mkoVar4;
        this.e = mkoVar5;
        this.a = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, byte[][] bArr) {
        this.g = i;
        this.c = mkoVar;
        this.b = mkoVar2;
        this.a = mkoVar3;
        this.f = mkoVar4;
        this.e = mkoVar5;
        this.d = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, char[][] cArr) {
        this.g = i;
        this.f = mkoVar;
        this.a = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
        this.b = mkoVar5;
        this.e = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, float[][] fArr) {
        this.g = i;
        this.f = mkoVar;
        this.b = mkoVar2;
        this.d = mkoVar3;
        this.c = mkoVar4;
        this.a = mkoVar5;
        this.e = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, int[][] iArr) {
        this.g = i;
        this.f = mkoVar;
        this.e = mkoVar2;
        this.b = mkoVar3;
        this.a = mkoVar4;
        this.d = mkoVar5;
        this.c = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, short[][] sArr) {
        this.g = i;
        this.e = mkoVar;
        this.c = mkoVar2;
        this.f = mkoVar3;
        this.d = mkoVar4;
        this.b = mkoVar5;
        this.a = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, boolean[][] zArr) {
        this.g = i;
        this.c = mkoVar;
        this.e = mkoVar2;
        this.f = mkoVar3;
        this.b = mkoVar4;
        this.a = mkoVar5;
        this.d = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, byte[][][] bArr) {
        this.g = i;
        this.e = mkoVar;
        this.a = mkoVar2;
        this.b = mkoVar3;
        this.f = mkoVar4;
        this.d = mkoVar5;
        this.c = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, char[][][] cArr) {
        this.g = i;
        this.e = mkoVar;
        this.b = mkoVar2;
        this.d = mkoVar3;
        this.f = mkoVar4;
        this.a = mkoVar5;
        this.c = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, int[][][] iArr) {
        this.g = i;
        this.b = mkoVar;
        this.e = mkoVar2;
        this.a = mkoVar3;
        this.d = mkoVar4;
        this.f = mkoVar5;
        this.c = mkoVar6;
    }

    public ejs(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, int i, short[][][] sArr) {
        this.g = i;
        this.f = mkoVar;
        this.b = mkoVar2;
        this.a = mkoVar3;
        this.d = mkoVar4;
        this.c = mkoVar5;
        this.e = mkoVar6;
    }
}
