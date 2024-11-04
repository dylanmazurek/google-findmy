package defpackage;

import android.accounts.Account;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxi implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final mko d;
    private final /* synthetic */ int e;

    public dxi(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i) {
        this.e = i;
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        switch (this.e) {
            case 0:
                return new eld((jer) this.a.a(), (ele) this.b.a(), (eim) this.c.a(), lsg.c(this.d));
            case 1:
                return new dux(((lry) this.c).b(), (dft) this.b.a(), (elo) this.d.a(), (Executor) this.a.a());
            case 2:
                return new edd((ewf) this.d.a(), (dhx) this.b.a(), (dvn) this.c.a(), ((lsk) this.a).a());
            case 3:
                ewg ewgVar = (ewg) this.c.a();
                mko mkoVar = this.d;
                return new edp(ewgVar, ((iiz) this.b).a(), ((gre) this.a).b(), ((dvu) mkoVar).b());
            case 4:
                return new eei((ewc) this.a.a(), (dhx) this.c.a(), ((iag) this.d).a(), (Executor) this.b.a());
            case 5:
                return new egm((efy) this.a.a(), (dvt) this.d.a(), (dhx) this.b.a(), (ewg) this.c.a());
            case 6:
                return new egq((cfz) ((lsi) this.d).b, (lra) ((lsi) this.b).b, (ewf) this.a.a(), (ewg) this.c.a());
            case 7:
                return new ehr(((lrw) this.a).a(), (ebf) this.b.a(), (ewf) this.c.a(), ((lsk) this.d).a());
            case 8:
                ilv ilvVar = (ilv) this.d.a();
                return new apc(ilvVar, ((ifb) this.c).a(), (emt) this.a.a());
            case 9:
                return new ejt((ilv) this.b.a(), (dvn) this.c.a(), ((lsk) this.a).a(), (dhx) this.d.a());
            case 10:
                ((eyd) this.a).a();
                ejo ejoVar = (ejo) this.c.a();
                ele eleVar = (ele) this.d.a();
                return new elo(ejoVar, eleVar);
            case 11:
                return new ilv((evy) this.a.a(), (ewc) this.c.a(), (ewf) this.d.a(), (ele) this.b.a());
            case 12:
                return new ens((Account) ((lsi) this.a).b, (evy) ((lsi) this.c).b, (ewg) ((lsi) this.d).b, (Executor) ((lsi) this.b).b);
            case 13:
                return new ewc((evy) this.a.a(), (ewf) this.c.a(), lsg.c(this.d), ((ear) this.b).a());
            case 14:
                return new gml((ewf) this.a.a(), (ewg) this.c.a(), (ebf) this.d.a(), (ele) this.b.a());
            case 15:
                return new exl((evy) this.a.a(), (apc) this.d.a(), (dhx) this.b.a(), ((gre) this.c).b());
            case 16:
                gea geaVar = (gea) this.a.a();
                gbj gbjVar = (gbj) this.c.a();
                jer jerVar = (jer) ((lsi) this.d).b;
                gde gdeVar = new gde(geaVar, gbjVar, ((gdo) this.b).a());
                if (jerVar.g()) {
                    gdeVar.c = ((Boolean) jerVar.c()).booleanValue();
                }
                return gdeVar;
            case 17:
                ((lry) this.d).b();
                ((lsp) this.b).a();
                return new ggw();
            case 18:
                return new ggx((git) this.a.a(), (ddg) this.c.a(), (Set) ((lsi) this.b).b, ((glw) this.d).a());
            case 19:
                return new gik((gyq) this.d.a(), lsg.c(this.b), (gyp) this.c.a(), (gry) this.a.a());
            default:
                gil gilVar = (gil) this.b.a();
                ghf ghfVar = (ghf) this.c.a();
                hri hriVar = (hri) this.a.a();
                return new giw(gilVar, ghfVar, hriVar);
        }
    }

    public dxi(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, byte[] bArr) {
        this.e = i;
        this.c = mkoVar;
        this.b = mkoVar2;
        this.d = mkoVar3;
        this.a = mkoVar4;
    }

    public dxi(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, char[] cArr) {
        this.e = i;
        this.d = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.a = mkoVar4;
    }

    public dxi(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, float[] fArr) {
        this.e = i;
        this.d = mkoVar;
        this.b = mkoVar2;
        this.a = mkoVar3;
        this.c = mkoVar4;
    }

    public dxi(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, int[] iArr) {
        this.e = i;
        this.a = mkoVar;
        this.c = mkoVar2;
        this.d = mkoVar3;
        this.b = mkoVar4;
    }

    public dxi(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, short[] sArr) {
        this.e = i;
        this.c = mkoVar;
        this.b = mkoVar2;
        this.a = mkoVar3;
        this.d = mkoVar4;
    }

    public dxi(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, boolean[] zArr) {
        this.e = i;
        this.a = mkoVar;
        this.d = mkoVar2;
        this.b = mkoVar3;
        this.c = mkoVar4;
    }

    public dxi(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, short[][] sArr) {
        this.e = i;
        this.b = mkoVar;
        this.c = mkoVar2;
        this.a = mkoVar3;
        this.d = mkoVar4;
    }

    public dxi(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, int i, float[][][] fArr) {
        this.e = i;
        this.a = mkoVar;
        this.c = mkoVar2;
        this.b = mkoVar3;
        this.d = mkoVar4;
    }
}
