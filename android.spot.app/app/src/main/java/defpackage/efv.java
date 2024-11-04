package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.BidiFormatter;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efv implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final mko d;
    private final mko e;
    private final mko f;
    private final mko g;
    private final /* synthetic */ int h;

    public efv(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, int i) {
        this.h = i;
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
        this.e = mkoVar5;
        this.f = mkoVar6;
        this.g = mkoVar7;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        switch (this.h) {
            case 0:
                mko mkoVar = this.b;
                Context b = ((lry) this.a).b();
                efy efyVar = (efy) mkoVar.a();
                ewg ewgVar = (ewg) this.c.a();
                mko mkoVar2 = this.d;
                BidiFormatter b2 = dwb.b();
                ees eesVar = (ees) mkoVar2.a();
                return new efu(b, efyVar, ewgVar, b2, eesVar, (lra) ((lsi) this.f).b, (cfz) ((lsi) this.g).b);
            case 1:
                return new edv((edc) this.d.a(), (ewf) this.a.a(), (ewg) this.c.a(), (ilv) this.b.a(), (eel) this.g.a(), (ejg) this.f.a(), (cfz) ((lsi) this.e).b);
            case 2:
                Account account = (Account) ((lsi) this.d).b;
                evy evyVar = (evy) ((lsi) this.b).b;
                dxf dxfVar = (dxf) this.a.a();
                Object obj = ((lsi) this.g).b;
                return new enk(account, evyVar, dxfVar, (ewg) ((lsi) this.c).b, ((ihs) this.e).a(), (Executor) obj, (Executor) ((lsi) this.f).b);
            case 3:
                ilv ilvVar = (ilv) this.g.a();
                ele eleVar = (ele) this.c.a();
                ddg ddgVar = (ddg) this.d.a();
                return new esf(ilvVar, eleVar, ddgVar, (dxf) this.b.a(), (dhx) this.a.a(), lsg.c(this.f));
            case 4:
                dxf dxfVar2 = (dxf) this.d.a();
                ewg ewgVar2 = (ewg) this.b.a();
                dhx dhxVar = (dhx) this.a.a();
                mko mkoVar3 = this.e;
                return new etz(dxfVar2, ewgVar2, dhxVar, ((ihl) this.c).a(), ((iag) this.g).a(), (elo) mkoVar3.a(), (Executor) this.f.a());
            case 5:
                return new eui((dxf) this.d.a(), (ewg) this.b.a(), (dhx) this.a.a(), (etb) this.c.a(), ((iag) this.g).a(), (ele) this.e.a(), (Executor) this.f.a());
            case 6:
                glu gluVar = (glu) this.c.a();
                mko mkoVar4 = this.b;
                mko mkoVar5 = this.g;
                lqz c = lsg.c(this.a);
                lqz c2 = lsg.c(mkoVar5);
                ghf ghfVar = (ghf) mkoVar4.a();
                gok gokVar = (gok) this.f.a();
                return new gin(gluVar, c, c2, ghfVar, gokVar, (Lock) this.e.a());
            case 7:
                glu gluVar2 = (glu) this.e.a();
                ddg ddgVar2 = (ddg) this.a.a();
                mko mkoVar6 = this.b;
                goj b3 = ((goq) this.g).b();
                git gitVar = (git) mkoVar6.a();
                ghf ghfVar2 = (ghf) this.c.a();
                ((gmv) this.f).a();
                return new gyx(gluVar2, ddgVar2, b3, gitVar, ghfVar2, ((dvu) this.d).b());
            case 8:
                mko mkoVar7 = this.c;
                mko mkoVar8 = this.d;
                hpe a = ((hpf) this.g).a();
                Context b4 = ((lry) mkoVar8).b();
                jzd jzdVar = (jzd) mkoVar7.a();
                mko mkoVar9 = this.b;
                lqz c3 = lsg.c(this.a);
                return new hpm(a, b4, jzdVar, c3, this.e, this.f);
            default:
                mko mkoVar10 = this.c;
                mko mkoVar11 = this.b;
                return new hsy(((hpf) this.g).a(), ((lry) mkoVar11).b(), (hnq) mkoVar10.a(), (Executor) this.a.a(), lsg.c(this.d), ((htn) this.e).a(), this.f);
        }
    }

    public efv(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, int i, byte[] bArr) {
        this.h = i;
        this.d = mkoVar;
        this.a = mkoVar2;
        this.c = mkoVar3;
        this.b = mkoVar4;
        this.g = mkoVar5;
        this.f = mkoVar6;
        this.e = mkoVar7;
    }

    public efv(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, int i, char[] cArr) {
        this.h = i;
        this.d = mkoVar;
        this.b = mkoVar2;
        this.a = mkoVar3;
        this.c = mkoVar4;
        this.e = mkoVar5;
        this.g = mkoVar6;
        this.f = mkoVar7;
    }

    public efv(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, int i, float[] fArr) {
        this.h = i;
        this.c = mkoVar;
        this.a = mkoVar2;
        this.g = mkoVar3;
        this.b = mkoVar4;
        this.f = mkoVar5;
        this.d = mkoVar6;
        this.e = mkoVar7;
    }

    public efv(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, int i, int[] iArr) {
        this.h = i;
        this.d = mkoVar;
        this.b = mkoVar2;
        this.a = mkoVar3;
        this.c = mkoVar4;
        this.g = mkoVar5;
        this.e = mkoVar6;
        this.f = mkoVar7;
    }

    public efv(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, int i, short[] sArr) {
        this.h = i;
        this.g = mkoVar;
        this.c = mkoVar2;
        this.d = mkoVar3;
        this.e = mkoVar4;
        this.b = mkoVar5;
        this.a = mkoVar6;
        this.f = mkoVar7;
    }

    public efv(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, int i, byte[][] bArr) {
        this.h = i;
        this.e = mkoVar;
        this.a = mkoVar2;
        this.g = mkoVar3;
        this.b = mkoVar4;
        this.c = mkoVar5;
        this.f = mkoVar6;
        this.d = mkoVar7;
    }

    public efv(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, int i, char[][] cArr) {
        this.h = i;
        this.g = mkoVar;
        this.d = mkoVar2;
        this.c = mkoVar3;
        this.a = mkoVar4;
        this.e = mkoVar5;
        this.b = mkoVar6;
        this.f = mkoVar7;
    }

    public efv(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, int i, short[][] sArr) {
        this.h = i;
        this.g = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.a = mkoVar4;
        this.d = mkoVar5;
        this.e = mkoVar6;
        this.f = mkoVar7;
    }
}
