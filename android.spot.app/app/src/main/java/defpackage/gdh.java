package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdh implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final /* synthetic */ int d;

    public gdh(mko mkoVar, mko mkoVar2, mko mkoVar3, int i) {
        this.d = i;
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        switch (this.d) {
            case 0:
                return new gda((gea) this.a.a(), (gbj) this.b.a(), ((gdn) this.c).a());
            case 1:
                return new gbj(((lry) this.a).b(), this.c, (jzc) this.b.a());
            case 2:
                return new gef(this.c, this.b, this.a);
            case 3:
                gll gllVar = (gll) this.b.a();
                ((goq) this.c).b();
                ((dvu) this.a).b();
                return new fzo(gllVar);
            case 4:
                return new apc((gnv) this.a.a(), (gur) this.c.a(), (gjn) this.b.a(), (int[]) null);
            case 5:
                return new apc(this.a.a(), this.b.a(), this.c.a(), (char[]) null);
            case 6:
                return new frx();
            case 7:
                return new apc(this.a.a(), this.b.a(), this.c.a(), (char[]) null);
            case 8:
                return new apc((gnv) this.a.a(), (gsk) this.b.a(), (gur) this.c.a());
            case 9:
                gkj gkjVar = new gkj((gjk) this.b.a());
                gkjVar.a = ((goq) this.c).b();
                gkjVar.b = ((lsk) this.a).a();
                return gkjVar;
            case 10:
                gkl gklVar = new gkl((gjk) this.b.a());
                gklVar.a = ((goq) this.c).b();
                gklVar.b = ((lsk) this.a).a();
                return gklVar;
            case 11:
                gko gkoVar = new gko((gjk) this.b.a());
                gkoVar.a = ((goq) this.c).b();
                gkoVar.b = ((lsk) this.a).a();
                return gkoVar;
            case 12:
                mko mkoVar = this.b;
                mko mkoVar2 = this.a;
                Context b = ((lry) this.c).b();
                lqz c = lsg.c(mkoVar2);
                return new gla(b, c);
            case 13:
                return new glv(((lry) this.b).b(), (jer) ((lsi) this.c).b, (ghf) this.a.a());
            case 14:
                return new gmc(((lry) this.a).b(), (gnv) this.b.a(), (jer) ((lsi) this.c).b);
            case 15:
                return new gmd((glu) this.c.a(), (jer) ((lsi) this.b).b, (ghf) this.a.a());
            case 16:
                return new gpb(((lsk) this.a).a(), (frx) this.c.a(), ((dvu) this.b).b());
            case 17:
                return new gqa(((lry) this.a).b(), (ExecutorService) this.b.a(), (ScheduledExecutorService) this.c.a());
            case 18:
                return new grx(((lry) this.c).b(), (fma) this.b.a(), ((gre) this.a).b());
            case 19:
                hri hriVar = (hri) this.a.a();
                jen jenVar = lhq.a;
                return new gsj(hriVar);
            default:
                return new gsn(((lry) this.a).b(), (gnv) this.c.a(), (ddg) this.b.a());
        }
    }

    public gdh(mko mkoVar, mko mkoVar2, mko mkoVar3, int i, byte[] bArr) {
        this.d = i;
        this.a = mkoVar;
        this.c = mkoVar2;
        this.b = mkoVar3;
    }

    public gdh(mko mkoVar, mko mkoVar2, mko mkoVar3, int i, char[] cArr) {
        this.d = i;
        this.c = mkoVar;
        this.b = mkoVar2;
        this.a = mkoVar3;
    }

    public gdh(mko mkoVar, mko mkoVar2, mko mkoVar3, int i, short[] sArr) {
        this.d = i;
        this.b = mkoVar;
        this.c = mkoVar2;
        this.a = mkoVar3;
    }

    public gdh(mko mkoVar, mko mkoVar2, mko mkoVar3, int i, float[][] fArr) {
        this.d = i;
        this.c = mkoVar;
        this.a = mkoVar2;
        this.b = mkoVar3;
    }
}
