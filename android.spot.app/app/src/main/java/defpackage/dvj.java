package defpackage;

import java.security.SecureRandom;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvj implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final mko d;
    private final mko e;
    private final /* synthetic */ int f;

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i) {
        this.f = i;
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
        this.e = mkoVar5;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        switch (this.f) {
            case 0:
                return new dvi((elo) this.a.a(), (elo) this.b.a(), (ksr) this.c.a(), (bym) this.d.a(), (ScheduledExecutorService) this.e.a());
            case 1:
                ((lry) this.a).b();
                return new dul((elo) this.b.a(), (hjy) this.c.a(), lsg.c(this.d), (Executor) this.e.a());
            case 2:
                Executor executor = (Executor) this.b.a();
                mko mkoVar = this.a;
                mko mkoVar2 = this.e;
                return new dzi(executor, dwb.b(), ((ezm) this.d).a(), ((lrw) mkoVar2).a(), (bym) mkoVar.a(), (ewf) this.c.a());
            case 3:
                return new ilv((ewc) this.e.a(), (ewg) this.b.a(), (ewf) this.a.a(), (elo) this.c.a(), (ilv) this.d.a());
            case 4:
                return new eel((ilv) this.e.a(), (dvt) this.c.a(), (dvn) this.a.a(), (fma) this.d.a(), new SecureRandom(), (dxf) this.b.a());
            case 5:
                return new ees((efy) this.b.a(), (dvn) this.a.a(), ((lsk) this.e).a(), (dxf) this.c.a(), (dhx) this.d.a());
            case 6:
                return new efw((dhx) this.c.a(), (cfz) ((lsi) this.d).b, (ewg) this.b.a(), (bym) this.e.a(), ((efr) this.a).a());
            case 7:
                return new ego((efy) this.a.a(), (dvt) this.c.a(), (dxf) this.b.a(), (dhx) this.d.a(), (dvn) this.e.a());
            case 8:
                return new ehk((apc) this.b.a(), (eqk) this.e.a(), (ele) this.c.a(), (Executor) this.d.a(), (dhx) this.a.a());
            case 9:
                mko mkoVar3 = this.d;
                mko mkoVar4 = this.c;
                return new eld(this.b, this.a, mkoVar4, mkoVar3);
            case 10:
                return new eqo((eqk) this.a.a(), (ele) this.c.a(), (ewg) this.e.a(), (dhx) this.b.a(), (Executor) this.d.a());
            case 11:
                return new etu((dxf) this.e.a(), (ewg) this.a.a(), (dhx) this.b.a(), ((ihl) this.c).a(), (Executor) this.d.a());
            case 12:
                return new euf((dxf) this.e.a(), (ewg) this.a.a(), (dhx) this.c.a(), ((ihl) this.d).a(), dwb.d(), (Executor) this.b.a());
            case 13:
                mko mkoVar5 = this.c;
                gbb a = ((gbg) this.e).a();
                jzc jzcVar = (jzc) mkoVar5.a();
                mko mkoVar6 = this.a;
                Set a2 = ((lsp) this.d).a();
                return new gbd(jzcVar, this.b, a2, a);
            case 14:
                mko mkoVar7 = this.c;
                return new ggv(((lry) this.b).b(), ((lsp) this.d).a(), (gpx) mkoVar7.a(), (ghf) this.e.a(), (gvg) this.a.a());
            case 15:
                return new gij(((goq) this.b).b(), (ddg) this.a.a(), (gok) this.e.a(), (ghf) this.c.a(), (Set) ((lsi) this.d).b);
            case 16:
                gkr gkrVar = (gkr) this.e.a();
                gyq gyqVar = (gyq) this.a.a();
                mko mkoVar8 = this.c;
                return new gja(gkrVar, gyqVar, lsg.c(this.b), ((gjc) this.d).a(), ((giz) mkoVar8).b());
            case 17:
                mko mkoVar9 = this.a;
                return new gow(((goq) this.b).b(), ((gng) this.e).a(), (gvi) mkoVar9.a(), (gqz) this.c.a(), (ktn) this.d.a());
            case 18:
                return new ktn((fma) this.e.a(), (gnv) this.a.a(), ((grh) this.b).a(), (gur) this.d.a(), (gvl) this.c.a());
            case 19:
                String str = (String) this.d.a();
                mko mkoVar10 = this.b;
                hri a3 = ((hov) this.c).a();
                fma fmaVar = (fma) mkoVar10.a();
                ((lry) this.e).b();
                return new hoe(str, a3, fmaVar, this.a);
            default:
                return new hso(((hpf) this.c).a(), (jzd) this.b.a(), (Executor) this.a.a(), lsg.c(this.e), this.d);
        }
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f = i;
        this.d = mkoVar;
        this.c = mkoVar2;
        this.b = mkoVar3;
        this.a = mkoVar4;
        this.e = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, char[] cArr) {
        this.f = i;
        this.b = mkoVar;
        this.d = mkoVar2;
        this.e = mkoVar3;
        this.a = mkoVar4;
        this.c = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, char[] cArr, byte[] bArr) {
        this.f = i;
        this.c = mkoVar;
        this.b = mkoVar2;
        this.a = mkoVar3;
        this.e = mkoVar4;
        this.d = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, float[] fArr) {
        this.f = i;
        this.c = mkoVar;
        this.d = mkoVar2;
        this.b = mkoVar3;
        this.e = mkoVar4;
        this.a = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, int[] iArr) {
        this.f = i;
        this.e = mkoVar;
        this.c = mkoVar2;
        this.a = mkoVar3;
        this.d = mkoVar4;
        this.b = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, short[] sArr) {
        this.f = i;
        this.e = mkoVar;
        this.b = mkoVar2;
        this.a = mkoVar3;
        this.c = mkoVar4;
        this.d = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, boolean[] zArr) {
        this.f = i;
        this.b = mkoVar;
        this.a = mkoVar2;
        this.e = mkoVar3;
        this.c = mkoVar4;
        this.d = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, byte[][] bArr) {
        this.f = i;
        this.a = mkoVar;
        this.c = mkoVar2;
        this.b = mkoVar3;
        this.d = mkoVar4;
        this.e = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, char[][] cArr) {
        this.f = i;
        this.b = mkoVar;
        this.e = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
        this.a = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, float[][] fArr) {
        this.f = i;
        this.e = mkoVar;
        this.a = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
        this.b = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, int[][] iArr) {
        this.f = i;
        this.a = mkoVar;
        this.c = mkoVar2;
        this.e = mkoVar3;
        this.b = mkoVar4;
        this.d = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.e = mkoVar;
        this.a = mkoVar2;
        this.b = mkoVar3;
        this.c = mkoVar4;
        this.d = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, byte[][][] bArr) {
        this.f = i;
        this.e = mkoVar;
        this.c = mkoVar2;
        this.b = mkoVar3;
        this.d = mkoVar4;
        this.a = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, char[][][] cArr) {
        this.f = i;
        this.b = mkoVar;
        this.d = mkoVar2;
        this.c = mkoVar3;
        this.e = mkoVar4;
        this.a = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, float[][][] fArr) {
        this.f = i;
        this.e = mkoVar;
        this.a = mkoVar2;
        this.b = mkoVar3;
        this.d = mkoVar4;
        this.c = mkoVar5;
    }

    public dvj(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, boolean[][][] zArr) {
        this.f = i;
        this.b = mkoVar;
        this.e = mkoVar2;
        this.a = mkoVar3;
        this.c = mkoVar4;
        this.d = mkoVar5;
    }
}
