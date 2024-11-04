package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emb implements lsh {
    private final mko a;
    private final /* synthetic */ int b;

    public emb(mko mkoVar, int i) {
        this.b = i;
        this.a = mkoVar;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [mko, java.lang.Object] */
    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        ehw ehwVar;
        int i = 3;
        switch (this.b) {
            case 0:
                return new ema((Account) ((lsi) this.a).b, 0);
            case 1:
                return new ema((evy) this.a.a(), 1);
            case 2:
                return new enf(((eng) this.a).a());
            case 3:
                return new enj((Account) ((lsi) this.a).b, 0);
            case 4:
                return new ddg(((iam) this.a).a(), (byte[]) null);
            case 5:
                ddg a = ((ekq) this.a).a();
                if (lua.j() && Build.VERSION.SDK_INT >= 23) {
                    ehwVar = (ehw) a.a.a();
                } else {
                    ehwVar = ehw.c;
                }
                ehwVar.getClass();
                return ehwVar;
            case 6:
                return new enj((evy) this.a.a(), 2);
            case 7:
                return new eqt((ag) ((lsi) this.a).b);
            case 8:
                return new bsn();
            case 9:
                return new evb(((lrw) this.a).a());
            case 10:
                Context b = ((lry) this.a).b();
                hrk c = hrl.c();
                if (true != fma.bU(b, "findmydevice:enable_memory_metric")) {
                    i = 2;
                }
                c.e = i;
                return c.a();
            case 11:
                Context b2 = ((lry) this.a).b();
                hsv c2 = hof.c();
                c2.c(fma.bU(b2, "findmydevice:enable_battery_metric"));
                return c2.b();
            case 12:
                Context b3 = ((lry) this.a).b();
                hsz c3 = hpp.c();
                c3.d(fma.bU(b3, "findmydevice:enable_crash_metric"));
                return c3.c();
            case 13:
                Context b4 = ((lry) this.a).b();
                hrz c4 = hsa.c();
                c4.b(fma.bU(b4, "findmydevice:enable_network_metric"));
                return c4.a();
            case 14:
                Context b5 = ((lry) this.a).b();
                hsv c5 = hsw.c();
                if (true != fma.bU(b5, "findmydevice:enable_package_metric")) {
                    i = 2;
                }
                c5.b = i;
                return c5.a();
            case 15:
                Context b6 = ((lry) this.a).b();
                hsz c6 = hta.c();
                c6.b(fma.bU(b6, "findmydevice:enable_timer_metric"));
                return c6.a();
            case 16:
                return new ewf(lsg.c(this.a));
            case 17:
                return new dhx((evw) this.a.a());
            case 18:
                return new maf((ag) ((lsi) this.a).b);
            case 19:
                return new bym((elo) this.a.a());
            default:
                Looper mainLooper = Looper.getMainLooper();
                mainLooper.getClass();
                return new eyp(mainLooper);
        }
    }
}
