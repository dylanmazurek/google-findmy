package defpackage;

import android.os.SystemClock;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmm implements lsh {
    private final mko a;
    private final /* synthetic */ int b;

    public hmm(mko mkoVar, int i) {
        this.b = i;
        this.a = mkoVar;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        boolean z = false;
        switch (this.b) {
            case 0:
                hpl hplVar = (hpl) hog.x((jer) ((lsi) this.a).b, new hmk(1));
                hplVar.getClass();
                return hplVar;
            case 1:
                hqg hqgVar = (hqg) hog.x((jer) ((lsi) this.a).b, new hmk(0));
                hqgVar.getClass();
                return hqgVar;
            case 2:
                hpp hppVar = (hpp) hog.x(((dvv) this.a).b(), new hmk(8));
                hppVar.getClass();
                return hppVar;
            case 3:
                hra hraVar = (hra) hog.x((jer) ((lsi) this.a).b, new hmk(2));
                hraVar.getClass();
                return hraVar;
            case 4:
                hsw hswVar = (hsw) hog.x(((dvv) this.a).b(), new hmk(3));
                hswVar.getClass();
                return hswVar;
            case 5:
                jer jerVar = (jer) ((lsi) this.a).b;
                hna hnaVar = new hna(null);
                if (hnaVar.b > 0) {
                    z = true;
                }
                hwx.W(z, "Thread pool size must be less than or equal to %s", 2);
                return (hna) jerVar.e(hnaVar);
            case 6:
                htf htfVar = (htf) hog.x((jer) ((lsi) this.a).b, new hmk(9));
                htfVar.getClass();
                return htfVar;
            case 7:
                hta htaVar = (hta) hog.x(((dvv) this.a).b(), new hmk(5));
                htaVar.getClass();
                return htaVar;
            case 8:
                hth hthVar = (hth) hog.x((jer) ((lsi) this.a).b, new hmk(7));
                hthVar.getClass();
                return hthVar;
            case 9:
                return new hpa(((lry) this.a).b());
            case 10:
                return new Random(SystemClock.elapsedRealtime());
            case 11:
                hms hmsVar = (hms) this.a.a();
                hms.b(hmsVar);
                hmsVar.getClass();
                return hmsVar;
            case 12:
                return (fma) ((dvv) this.a).b().e(new fma());
            case 13:
                return new hmw();
            case 14:
                hrl hrlVar = (hrl) ((mko) ((dvv) this.a).b().e(new hmk(10))).a();
                hrlVar.getClass();
                return hrlVar;
            case 15:
                return Boolean.valueOf(lwt.a.a().b(((lry) this.a).b()));
            case 16:
                nde a = lwt.a.a().a(((lry) this.a).b());
                a.getClass();
                return a;
            case 17:
                nfd a2 = lww.a.a().a(((lry) this.a).b());
                a2.getClass();
                return a2;
            case 18:
                return Boolean.valueOf(lxf.a.a().c(((lry) this.a).b()));
            case 19:
                nfd a3 = lwz.a.a().a(((lry) this.a).b());
                a3.getClass();
                return a3;
            default:
                hpr a4 = lxc.a.a().a(((lry) this.a).b());
                a4.getClass();
                return a4;
        }
    }
}
