package defpackage;

import android.content.Context;
import com.google.android.apps.adm.integrations.spot.TrackingTerminationWorker;
import com.google.android.gms.findmydevice.spot.StartFinderAdvertisingRequest;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emk implements emg {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothHandlerImpl");
    public final Object b = new Object();
    public jer c = jdl.a;
    public boolean d = false;
    public final emt e;
    public final ilv f;
    private final Context g;
    private final ele h;
    private final lqz i;
    private final jzd j;
    private final emx k;
    private final fos l;
    private final kuv m;

    public emk(ilv ilvVar, Context context, emx emxVar, ele eleVar, kuv kuvVar, emt emtVar, fos fosVar, lqz lqzVar, jzd jzdVar) {
        this.f = ilvVar;
        this.g = context;
        this.k = emxVar;
        this.h = eleVar;
        this.m = kuvVar;
        this.e = emtVar;
        this.l = fosVar;
        this.i = lqzVar;
        this.j = jzdVar;
        ilvVar.h(new ah(this, 11));
        g(new cui(this, emxVar, 13, (byte[]) null));
    }

    private final void h() {
        synchronized (this.b) {
            if (!this.c.g()) {
                return;
            }
            ((emi) this.c.c()).b.close();
            this.c = jdl.a;
            this.d = false;
        }
    }

    @Override // defpackage.emg
    public final void a(lqd lqdVar) {
        lqu lquVar;
        jni jniVar = (jni) ((jni) TrackingTerminationWorker.e.e()).j("com/google/android/apps/adm/integrations/spot/TrackingTerminationWorker", "cancelScheduledTrackingTermination", 69, "TrackingTerminationWorker.java");
        if (lqdVar.a == 3) {
            lquVar = (lqu) lqdVar.b;
        } else {
            lquVar = lqu.c;
        }
        kxv kxvVar = lquVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        Context context = this.g;
        jniVar.u("Canceling scheduled tracking termination from %s", kxvVar.a);
        iuu.o(((cqi) bpe.f(context).a(TrackingTerminationWorker.c(lqdVar))).c, new eil(16), jxv.a).c(new cui(this, lqdVar, 14, (byte[]) null), this.j);
    }

    @Override // defpackage.emg
    public final void b(lqd lqdVar) {
        lqu lquVar;
        long i = lua.a.a().i();
        jni jniVar = (jni) ((jni) TrackingTerminationWorker.e.e()).j("com/google/android/apps/adm/integrations/spot/TrackingTerminationWorker", "enqueueTrackingTermination", 45, "TrackingTerminationWorker.java");
        if (lqdVar.a == 3) {
            lquVar = (lqu) lqdVar.b;
        } else {
            lquVar = lqu.c;
        }
        kxv kxvVar = lquVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        Context context = this.g;
        jniVar.u("Enqueuing tracking termination of %s", kxvVar.a);
        cqd cqdVar = new cqd(TrackingTerminationWorker.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        box.l("device_identifier", lqdVar.g(), linkedHashMap);
        cqdVar.d(box.i(linkedHashMap));
        cqdVar.c(i, TimeUnit.MILLISECONDS);
        bpe.f(context).e(TrackingTerminationWorker.c(lqdVar), cqdVar.e());
    }

    @Override // defpackage.emg
    public final void c(lqd lqdVar) {
        if (this.f.o(lqdVar)) {
            h();
            this.d = true;
        }
    }

    public final jer d(jer jerVar, lqd lqdVar) {
        jer jerVar2;
        synchronized (this.b) {
            jerVar2 = jdl.a;
            if (this.c.g() && ((emi) this.c.c()).a.equals(lqdVar)) {
                jerVar2 = ((emi) this.c.c()).c;
                Object c = this.c.c();
                this.c = jer.i(new emi(((emi) c).a, ((emi) c).b, jerVar));
            }
        }
        return jerVar2;
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [mko, java.lang.Object] */
    public final void e() {
        ibh l;
        jer e = this.f.e();
        if (e.g()) {
            kyf kyfVar = this.h.a((lqc) e.c()).b;
            if (kyfVar == null) {
                kyfVar = kyf.r;
            }
            kyf kyfVar2 = kyfVar;
            if (hqk.b(kyfVar2)) {
                kyq kyqVar = kyfVar2.f;
                if (kyqVar == null) {
                    kyqVar = kyq.g;
                }
                int e2 = kzv.e(kyqVar.b);
                if (e2 != 0) {
                    if (e2 == 4 && this.k.g()) {
                        int i = 1;
                        if (hqk.d(kyfVar2)) {
                            fos fosVar = this.l;
                            StartFinderAdvertisingRequest startFinderAdvertisingRequest = new StartFinderAdvertisingRequest();
                            kxv kxvVar = kyfVar2.b;
                            if (kxvVar == null) {
                                kxvVar = kxv.b;
                            }
                            startFinderAdvertisingRequest.a = kxvVar.a;
                            ivc.N(fzo.b(fma.r(fosVar.a(startFinderAdvertisingRequest), TimeUnit.SECONDS)), new ems(1), this.j);
                        }
                        lqd lqdVar = ((lqc) e.c()).d;
                        if (lqdVar == null) {
                            lqdVar = lqd.d;
                        }
                        synchronized (this.b) {
                            if (this.c.g() && ((emi) this.c.c()).a.equals(lqdVar)) {
                                return;
                            }
                            h();
                            this.e.a(lqdVar);
                            this.e.c(lua.d());
                            kuv kuvVar = this.m;
                            kgf kgfVar = new kgf(this, kyfVar2, lqdVar);
                            kyg kygVar = kyfVar2.g;
                            if (kygVar == null) {
                                kygVar = kyg.d;
                            }
                            int I = a.I(kygVar.c);
                            if (I == 0) {
                                I = 1;
                            }
                            if (hqt.l(I)) {
                                Object obj = kuvVar.b;
                                ici iciVar = (ici) ((ilv) obj).e.a();
                                iciVar.getClass();
                                igo a2 = ((igp) ((ilv) obj).g).a();
                                Object a3 = ((ilv) obj).f.a();
                                kuv a4 = ((iiz) ((ilv) obj).c).a();
                                Object a5 = ((ilv) obj).b.a();
                                ((fma) ((ilv) obj).d.a()).getClass();
                                jzd jzdVar = (jzd) ((ilv) obj).a.a();
                                jzdVar.getClass();
                                kyfVar2.getClass();
                                l = new iey(iciVar, a2, (kuv) a3, a4, (kpb) a5, jzdVar, kyfVar2, kgfVar);
                            } else {
                                Object obj2 = kuvVar.a;
                                hot hotVar = (hot) obj2;
                                l = hotVar.l(kyfVar2, kyh.DEVICE_COMPONENT_UNSPECIFIED, new ibn(kgfVar));
                            }
                            l.a();
                            this.c = jer.i(new emi(lqdVar, new ifw(this, l, lqdVar, i), jdl.a));
                            return;
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        h();
    }

    public final void f(lqd lqdVar) {
        g(new ci(this, d(jdl.a, lqdVar), lqdVar, 10, (short[]) null));
    }

    public final void g(Runnable runnable) {
        ((Executor) this.i.a()).execute(runnable);
    }
}
