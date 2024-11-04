package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gke implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final mko d;
    private final /* synthetic */ int e;

    public gke(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i) {
        this.e = i;
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        Executor executor;
        switch (this.e) {
            case 0:
                gkd gkdVar = new gkd((gjk) this.a.a(), (gkr) this.b.a());
                gkdVar.a = ((goq) this.c).b();
                gkdVar.b = ((lsk) this.d).a();
                return gkdVar;
            case 1:
                gpx gpxVar = (gpx) this.a.a();
                mko mkoVar = this.c;
                mko mkoVar2 = this.b;
                Object a = this.d.a();
                return new giy(gpxVar, (giw) a, (gja) mkoVar2.a(), ((gje) mkoVar).a());
            case 2:
                gkh gkhVar = new gkh((gjk) this.a.a(), (gkr) this.b.a());
                gkhVar.a = ((goq) this.c).b();
                gkhVar.b = ((lsk) this.d).a();
                return gkhVar;
            case 3:
                gki gkiVar = new gki((gjk) this.a.a(), (gkr) this.b.a());
                gkiVar.a = ((goq) this.c).b();
                gkiVar.b = ((lsk) this.d).a();
                return gkiVar;
            case 4:
                gkk gkkVar = new gkk((gjk) this.a.a(), (ddg) this.b.a());
                gkkVar.a = ((goq) this.c).b();
                gkkVar.b = ((lsk) this.d).a();
                return gkkVar;
            case 5:
                gkn gknVar = new gkn((gjk) this.a.a(), (gkr) this.b.a());
                gknVar.a = ((goq) this.c).b();
                gknVar.b = ((lsk) this.d).a();
                return gknVar;
            case 6:
                git gitVar = (git) this.d.a();
                mko mkoVar3 = this.a;
                goj b = ((goq) this.c).b();
                ghf ghfVar = (ghf) mkoVar3.a();
                return new glp(gitVar, b, ghfVar);
            case 7:
                return new gsf(((lry) this.a).b(), ((dvu) this.b).b(), (Class) this.c.a(), (gvg) this.d.a());
            case 8:
                jer jerVar = (jer) ((lsi) this.c).b;
                return new gvc(jerVar, ((dvv) this.a).b(), ((gtu) this.b).b());
            case 9:
                mko mkoVar4 = this.a;
                Context b2 = ((lry) this.d).b();
                return new gvd(b2, (gsk) this.b.a(), (guq) this.c.a());
            case 10:
                ((goq) this.b).b();
                return new frx();
            case 11:
                hna hnaVar = (hna) this.c.a();
                jer jerVar2 = (jer) ((lsi) this.a).b;
                if (hnaVar.c && !jerVar2.g()) {
                    executor = (Executor) this.d.a();
                } else {
                    executor = (Executor) this.b.a();
                }
                executor.getClass();
                return executor;
            case 12:
                mko mkoVar5 = this.c;
                return new hph(((lry) this.d).b(), ((euo) this.a).b(), (String) mkoVar5.a(), this.b);
            case 13:
                ibg ibgVar = (ibg) this.d.a();
                return new ici(ibgVar, (jzd) this.c.a(), bym.A(), ((ifb) this.b).a());
            default:
                mko mkoVar6 = this.b;
                mko mkoVar7 = this.d;
                return new ktn(((icw) this.c).a(), ((ibk) this.a).a(), ((ifb) mkoVar7).a(), (jzd) mkoVar6.a());
        }
    }

    public gke(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = mkoVar;
        this.d = mkoVar2;
        this.b = mkoVar3;
        this.c = mkoVar4;
    }

    public gke(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, float[] fArr) {
        this.e = i;
        this.d = mkoVar;
        this.c = mkoVar2;
        this.a = mkoVar3;
        this.b = mkoVar4;
    }

    public gke(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, char[][] cArr) {
        this.e = i;
        this.c = mkoVar;
        this.d = mkoVar2;
        this.a = mkoVar3;
        this.b = mkoVar4;
    }

    public gke(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, float[][] fArr) {
        this.e = i;
        this.d = mkoVar;
        this.a = mkoVar2;
        this.c = mkoVar3;
        this.b = mkoVar4;
    }

    public gke(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, int[][] iArr) {
        this.e = i;
        this.a = mkoVar;
        this.b = mkoVar2;
        this.d = mkoVar3;
        this.c = mkoVar4;
    }

    public gke(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, short[][] sArr) {
        this.e = i;
        this.d = mkoVar;
        this.a = mkoVar2;
        this.b = mkoVar3;
        this.c = mkoVar4;
    }

    public gke(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.d = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.a = mkoVar4;
    }

    public gke(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, char[][][] cArr) {
        this.e = i;
        this.c = mkoVar;
        this.a = mkoVar2;
        this.d = mkoVar3;
        this.b = mkoVar4;
    }
}
