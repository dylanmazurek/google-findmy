package defpackage;

import com.google.android.libraries.notifications.platform.entrypoints.job.GnpWorker;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmh implements lsh {
    private final /* synthetic */ int a;

    public gmh(int i) {
        this.a = i;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                ljh k = lgs.f.k();
                if (lvm.c()) {
                    ljh k2 = lgr.c.k();
                    if (!k2.b.y()) {
                        k2.t();
                    }
                    lgr lgrVar = (lgr) k2.b;
                    lgrVar.a |= 2;
                    lgrVar.b = true;
                    if (!k.b.y()) {
                        k.t();
                    }
                    lgs lgsVar = (lgs) k.b;
                    lgr lgrVar2 = (lgr) k2.q();
                    lgrVar2.getClass();
                    lgsVar.b = lgrVar2;
                    lgsVar.a = 1 | lgsVar.a;
                }
                lgs lgsVar2 = (lgs) k.q();
                lgsVar2.getClass();
                return lgsVar2;
            case 1:
                return new ReentrantLock();
            case 2:
                ljh k3 = lgs.f.k();
                k3.getClass();
                if (lwb.c()) {
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    ljn ljnVar = k3.b;
                    lgs lgsVar3 = (lgs) ljnVar;
                    lgsVar3.a |= 64;
                    lgsVar3.c = true;
                    if (!ljnVar.y()) {
                        k3.t();
                    }
                    lgs lgsVar4 = (lgs) k3.b;
                    lgsVar4.a |= 128;
                    lgsVar4.d = true;
                }
                return kzy.d(k3);
            case 3:
                return new frx();
            case 4:
                return GnpWorker.class;
            case 5:
                ljh k4 = lgs.f.k();
                k4.getClass();
                if (lvp.c()) {
                    if (!k4.b.y()) {
                        k4.t();
                    }
                    lgs lgsVar5 = (lgs) k4.b;
                    lgsVar5.a |= 256;
                    lgsVar5.e = true;
                }
                return kzy.d(k4);
            case 6:
                String str = (String) luq.a.a();
                str.getClass();
                return str;
            case 7:
                return new fzo();
            case 8:
                return new fzo();
            case 9:
                return new fzo();
            case 10:
                return true;
            case 11:
                return jmn.a;
            case 12:
                return jmn.a;
            case 13:
                return new fzo();
            case 14:
                return new grc();
            case 15:
                return new fzo();
            case 16:
                return new gwc();
            case 17:
                return new frx();
            case 18:
                return new gdi(6);
            case 19:
                return new gdi(5);
            default:
                return new hnb();
        }
    }
}
