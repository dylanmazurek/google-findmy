package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dws implements lsh {
    private final mko a;
    private final mko b;
    private final /* synthetic */ int c;

    public dws(mko mkoVar, mko mkoVar2, int i) {
        this.c = i;
        this.a = mkoVar;
        this.b = mkoVar2;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                return new dwr(((lsp) this.a).a(), ((lry) this.b).b());
            case 1:
                return new dhx((fma) this.a.a(), (dux) this.b.a());
            case 2:
                return new bym(((dvk) this.b).a(), ((lrw) this.a).a());
            case 3:
                return new dyw(dwb.c(), (Executor) this.a.a(), (Executor) this.b.a());
            case 4:
                return new eao((dvn) this.a.a(), ((lsk) this.b).a());
            case 5:
                return new efd((ewg) this.b.a(), (bym) this.a.a());
            case 6:
                return new egi((efy) this.a.a(), (dvt) this.b.a());
            case 7:
                return new egn((efy) this.a.a(), (dvt) this.b.a());
            case 8:
                return new eia(((lsk) this.b).a(), (cfz) ((lsi) this.a).b);
            case 9:
                return new ddg(((lry) this.a).b(), ((lsk) this.b).a());
            case 10:
                bym bymVar = new bym((short[]) null);
                ilv ilvVar = (ilv) this.a.a();
                return new elo(bymVar, ilvVar);
            case 11:
                return new elo((ewg) this.a.a(), (ele) this.b.a());
            case 12:
                return new eoz((eou) this.b.a(), (ewc) this.a.a());
            case 13:
                return new eqb((evy) this.a.a(), (ewg) this.b.a());
            case 14:
                return new esr((ilv) this.b.a(), (ele) this.a.a());
            case 15:
                return new esx((cfk) this.a.a(), (ilv) this.b.a());
            case 16:
                return new ewf(((lsk) this.b).a(), (ewf) this.a.a());
            case 17:
                return new euu(((lrx) this.a).a(), new fma(), (Executor) this.b.a());
            case 18:
                return new gok(((lrw) this.a).a(), ((eva) this.b).a());
            case 19:
                Context b = ((lry) this.a).b();
                msw b2 = ((gre) this.b).b();
                evx evxVar = evx.c;
                evxVar.getClass();
                return new evw(b, b2, evxVar);
            default:
                return new exx((ag) ((lsi) this.a).b, (ebf) this.b.a());
        }
    }

    public dws(mko mkoVar, mko mkoVar2, int i, char[] cArr) {
        this.c = i;
        this.b = mkoVar;
        this.a = mkoVar2;
    }
}
