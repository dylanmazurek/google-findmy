package defpackage;

import android.os.Process;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class miy implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public miy(Object obj, mja mjaVar, int i) {
        this.c = i;
        this.b = mjaVar;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, msd] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, nmy] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, nmy] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, nmy] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, nmy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // java.lang.Runnable
    public final void run() {
        mjb mjbVar;
        int i = 0;
        miv mivVar = 0;
        mivVar = 0;
        switch (this.c) {
            case 0:
                ((miz) this.b).b.v.c((mbc) this.a);
                return;
            case 1:
                synchronized (((mjc) ((fiq) this.a).b).l) {
                    Object obj = this.a;
                    if (((miv) ((fiq) obj).a).b) {
                        i = 1;
                    } else {
                        Object obj2 = ((fiq) obj).b;
                        ((mjc) obj2).q = ((mjc) obj2).q.a((mja) this.b);
                        Object obj3 = ((fiq) this.a).b;
                        if (((mjc) obj3).w(((mjc) obj3).q) && ((mjbVar = ((mjc) ((fiq) this.a).b).o) == null || mjbVar.a())) {
                            Object obj4 = ((fiq) this.a).b;
                            miv mivVar2 = new miv(((mjc) obj4).l);
                            ((mjc) obj4).x = mivVar2;
                            mivVar = mivVar2;
                        } else {
                            Object obj5 = ((fiq) this.a).b;
                            ((mjc) obj5).q = ((mjc) obj5).q.b();
                            ((mjc) ((fiq) this.a).b).x = null;
                        }
                    }
                }
                if (i != 0) {
                    mja mjaVar = (mja) this.b;
                    mjaVar.a.n(new miz((mjc) ((fiq) this.a).b, mjaVar));
                    ((mja) this.b).a.h(mca.c.d("Unneeded hedging"));
                    return;
                }
                if (mivVar != 0) {
                    Object obj6 = ((fiq) this.a).b;
                    fiq fiqVar = new fiq(obj6, mivVar, 2);
                    mjc mjcVar = (mjc) obj6;
                    mivVar.b(mjcVar.h.schedule(fiqVar, mjcVar.j.b, TimeUnit.NANOSECONDS));
                }
                ((mjc) ((fiq) this.a).b).f((mja) this.b);
                return;
            case 2:
                ((miz) this.a).b.f((mja) this.b);
                return;
            case 3:
                ((miz) this.b).b.v.e((lrs) this.a);
                return;
            case 4:
                this.a.f((mst) this.b, mlh.a);
                return;
            case 5:
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority(((nmj) this.b).a);
                this.a.run();
                return;
            case 6:
                nmx nmxVar = (nmx) this.b;
                String str = nmxVar.p;
                nmu nmuVar = nmxVar.b;
                nmuVar.a(new nmt(nmuVar, (UrlResponseInfo) this.a, str, i));
                return;
            case 7:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th) {
                    ((nmx) this.a).b(new nma("System error", th));
                    return;
                }
            case 8:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th2) {
                    ((nmx) this.a).c(th2);
                    return;
                }
            case 9:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th3) {
                    Object obj7 = this.a;
                    mgs mgsVar = new mgs(obj7, 19, mivVar);
                    nmx nmxVar2 = (nmx) obj7;
                    nmxVar2.c.execute(mgsVar);
                    nmxVar2.b(new nlw("Exception received from UrlRequest.Callback", th3));
                    return;
                }
            case 10:
                ?? r0 = this.b;
                nmx nmxVar3 = (nmx) this.a;
                nmxVar3.c.execute(new miy(nmxVar3, (nmy) r0, 7));
                return;
            case 11:
                Object obj8 = this.a;
                Object obj9 = this.b;
                try {
                    ((nni) ((nmu) obj9).a).onSucceeded((UrlRequest) ((nmu) obj9).d, (UrlResponseInfo) obj8);
                } catch (Exception e) {
                    ((nmx) ((nmu) obj9).d).h("onSucceded", e);
                }
                nmu nmuVar2 = (nmu) obj9;
                nmuVar2.b();
                ((nmx) nmuVar2.d).r.b();
                return;
            default:
                Object obj10 = this.a;
                Object obj11 = this.b;
                try {
                    ((UrlRequest.Callback) ((nmu) obj11).a).onCanceled((UrlRequest) ((nmu) obj11).d, (UrlResponseInfo) obj10);
                } catch (Exception e2) {
                    ((nmx) ((nmu) obj11).d).h("onCanceled", e2);
                }
                nmu nmuVar3 = (nmu) obj11;
                nmuVar3.b();
                ((nmx) nmuVar3.d).r.b();
                return;
        }
    }

    public /* synthetic */ miy(Object obj, UrlResponseInfo urlResponseInfo, int i) {
        this.c = i;
        this.b = obj;
        this.a = urlResponseInfo;
    }

    public miy(miz mizVar, Object obj, int i) {
        this.c = i;
        this.a = obj;
        this.b = mizVar;
    }

    public miy(msd msdVar, mvm mvmVar, int i) {
        this.c = i;
        this.a = msdVar;
        this.b = mvmVar;
    }

    public miy(nmj nmjVar, Runnable runnable, int i) {
        this.c = i;
        this.b = nmjVar;
        this.a = runnable;
    }

    public /* synthetic */ miy(nmx nmxVar, nmy nmyVar, int i) {
        this.c = i;
        this.a = nmxVar;
        this.b = nmyVar;
    }
}
