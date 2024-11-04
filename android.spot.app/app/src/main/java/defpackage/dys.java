package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dys implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final /* synthetic */ int d;

    public dys(mko mkoVar, mko mkoVar2, mko mkoVar3, int i) {
        this.d = i;
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        switch (this.d) {
            case 0:
                return new dyr((ewc) this.a.a(), (ewf) this.b.a(), lsg.c(this.c));
            case 1:
                return new apc((dft) this.c.a(), ((dum) this.a).a(), (elo) this.b.a());
            case 2:
                return new dyt(lsg.c(this.a), (exl) this.b.a(), (Executor) this.c.a());
            case 3:
                return new ebf(((lrw) this.a).a(), (ddg) this.b.a(), ((euo) this.c).b());
            case 4:
                return new ebg((FirebaseMessaging) this.a.a(), (ewc) this.b.a(), (Executor) this.c.a());
            case 5:
                return new ecz(((lse) this.a).a, (ewg) this.b.a(), (cfz) ((lsi) this.c).b);
            case 6:
                return new eee((ilv) this.a.a(), (ewf) this.b.a(), (elh) this.c.a());
            case 7:
                return new efj((dvn) this.a.a(), (ees) this.b.a(), (ejt) this.c.a());
            case 8:
                return new efq((efy) this.a.a(), (ewf) this.b.a(), (Executor) this.c.a());
            case 9:
                return new efs((bym) this.a.a(), ((efr) this.b).a(), (cfz) ((lsi) this.c).b);
            case 10:
                return new efy((ewc) this.a.a(), (ewf) this.b.a(), (ele) this.c.a(), new bym((short[]) null));
            case 11:
                return new ega((efy) this.a.a(), (dvt) this.b.a(), (dhx) this.c.a());
            case 12:
                return new egl((efy) this.a.a(), (dvt) this.b.a(), (dhx) this.c.a());
            case 13:
                return new egp((efy) this.a.a(), (dvt) this.b.a(), (dhx) this.c.a());
            case 14:
                return new apc((ewg) this.b.a(), (ees) this.a.a(), (dxf) this.c.a());
            case 15:
                return new eim(((fnx) this.c).a(), (fgp) this.b.a(), (Executor) this.a.a());
            case 16:
                return new ekf((ewg) this.a.a(), (ele) this.c.a(), (eou) this.b.a());
            case 17:
                return new elh((ele) this.a.a(), (ilv) this.b.a(), (Executor) this.c.a());
            case 18:
                mko mkoVar = this.c;
                return new end((Executor) ((lsi) this.a).b, ((iim) this.b).a(), (eze) mkoVar.a());
            case 19:
                mko mkoVar2 = this.a;
                hnu a = ((iae) this.b).a();
                return new enr(a, ((iam) this.c).a());
            default:
                mko mkoVar3 = this.a;
                return new esa(((iix) this.b).a(), ((elv) this.c).a(), (Executor) mkoVar3.a());
        }
    }

    public dys(mko mkoVar, mko mkoVar2, mko mkoVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = mkoVar;
        this.a = mkoVar2;
        this.b = mkoVar3;
    }

    public dys(mko mkoVar, mko mkoVar2, mko mkoVar3, int i, char[] cArr, byte[] bArr) {
        this.d = i;
        this.b = mkoVar;
        this.c = mkoVar2;
        this.a = mkoVar3;
    }

    public dys(mko mkoVar, mko mkoVar2, mko mkoVar3, int i, char[][][] cArr) {
        this.d = i;
        this.b = mkoVar;
        this.a = mkoVar2;
        this.c = mkoVar3;
    }

    public dys(mko mkoVar, mko mkoVar2, mko mkoVar3, int i, int[][][] iArr) {
        this.d = i;
        this.a = mkoVar;
        this.c = mkoVar2;
        this.b = mkoVar3;
    }

    public dys(mko mkoVar, mko mkoVar2, mko mkoVar3, int i, short[][][] sArr) {
        this.d = i;
        this.c = mkoVar;
        this.b = mkoVar2;
        this.a = mkoVar3;
    }
}
