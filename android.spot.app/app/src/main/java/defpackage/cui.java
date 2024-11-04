package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.ViewTreeObserver;
import com.google.android.apps.adm.firebase.FmdFirebaseMessagingService;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cui implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public cui(cut cutVar, String str, int i) {
        this.c = i;
        this.b = cutVar;
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, android.view.ViewTreeObserver$OnDrawListener] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, ctl] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        cvu cvuVar = null;
        int i2 = 3;
        int i3 = 2;
        switch (this.c) {
            case 0:
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((eey) it.next()).b(((cuj) this.b).d);
                }
                return;
            case 1:
                ((csp) this.a).a.F((bet) this.b, 3);
                return;
            case 2:
                crd crdVar = ((cut) this.b).b.e;
                Object obj = crdVar.i;
                Object obj2 = this.a;
                synchronized (obj) {
                    csl b = crdVar.b((String) obj2);
                    if (b != null) {
                        cvuVar = b.a;
                    }
                }
                if (cvuVar != null && cvuVar.b()) {
                    synchronized (((cut) this.b).c) {
                        ((cut) this.b).f.put(cuv.b(cvuVar), cvuVar);
                        ?? r1 = this.b;
                        ((cut) this.b).g.put(cuv.b(cvuVar), ctr.a(((cut) r1).j, cvuVar, (mst) ((cut) r1).i.d, r1));
                    }
                    return;
                }
                return;
            case 3:
                String uuid = ((UUID) this.a).toString();
                uuid.getClass();
                bpn.k((csb) this.b, uuid);
                return;
            case 4:
                if (((dml) this.b).a) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.a.run();
                    return;
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 5:
                dpo a = dpo.a();
                dtq.g();
                a.c.set(true);
                ((drg) this.a).b.b = true;
                ((drg) this.a).a.getViewTreeObserver().removeOnDrawListener(this.b);
                ((drg) this.a).b.a.clear();
                return;
            case 6:
                try {
                    fej.e((Context) ((eld) this.b).d, (String) this.a);
                    return;
                } catch (fed | IOException unused) {
                    return;
                }
            case 7:
                ewc ewcVar = ((FmdFirebaseMessagingService) this.b).b;
                jis jisVar = ewcVar.c;
                if (jisVar != null && !jisVar.isEmpty()) {
                    jin jinVar = new jin();
                    jer jerVar = jdl.a;
                    jis jisVar2 = ewcVar.c;
                    jisVar2.getClass();
                    int size = jisVar2.size();
                    while (true) {
                        Object obj3 = this.a;
                        if (i < size) {
                            lqc lqcVar = (lqc) jisVar2.get(i);
                            lqy lqyVar = (lqy) obj3;
                            lqc lqcVar2 = lqyVar.b;
                            if (lqcVar2 == null) {
                                lqcVar2 = lqc.j;
                            }
                            if (!jerVar.g() && eyf.p(lqcVar, lqcVar2)) {
                                eap eapVar = ewcVar.k;
                                lqc lqcVar3 = lqyVar.b;
                                if (lqcVar3 == null) {
                                    lqcVar3 = lqc.j;
                                }
                                lqc a2 = eapVar.a(lqcVar, lqcVar3);
                                lqx lqxVar = lqyVar.c;
                                if (lqxVar == null) {
                                    lqxVar = lqx.c;
                                }
                                if (lqxVar.a.size() != 0 || lqxVar.b.size() != 0) {
                                    HashSet hashSet = new HashSet(a2.e);
                                    hashSet.addAll(lqxVar.a);
                                    hashSet.removeAll(lqxVar.b);
                                    ljh ljhVar = (ljh) a2.z(5);
                                    ljhVar.w(a2);
                                    if (!ljhVar.b.y()) {
                                        ljhVar.t();
                                    }
                                    ((lqc) ljhVar.b).e = lla.a;
                                    ljhVar.K(hashSet);
                                    a2 = (lqc) ljhVar.q();
                                }
                                jerVar = jer.i(a2);
                                jinVar.h(((jeu) jerVar).a);
                            } else {
                                jinVar.h(lqcVar);
                            }
                            i++;
                        } else {
                            if (!jerVar.g()) {
                                ((jni) ((jni) ewc.a.f()).j("com/google/android/apps/adm/state/ApplicationState", "updateDeviceState", 430, "ApplicationState.java")).r("Received device update notification for an unknown device. Ignoring.");
                                return;
                            }
                            ewcVar.c = jinVar.g();
                            lqc a3 = ewcVar.n.a();
                            if (a3 != null && eyf.p((lqc) jerVar.c(), a3)) {
                                ewcVar.n.d((lqc) jerVar.c());
                            }
                            ewcVar.o.i();
                            Map map = ((eao) ewcVar.j.a()).c;
                            lqy lqyVar2 = (lqy) obj3;
                            lqc lqcVar4 = lqyVar2.b;
                            if (lqcVar4 == null) {
                                lqcVar4 = lqc.j;
                            }
                            ehw ehwVar = (ehw) map.get(eyf.i(lqcVar4));
                            ehwVar.getClass();
                            ehwVar.d(lqyVar2);
                            return;
                        }
                    }
                } else {
                    ((jni) ((jni) ewc.a.f()).j("com/google/android/apps/adm/state/ApplicationState", "updateDeviceState", 412, "ApplicationState.java")).r("Received device update notification while the device list is empty. Ignoring.");
                    return;
                }
                break;
            case 8:
                efy efyVar = (efy) this.b;
                efyVar.c = jdl.a;
                efyVar.f((lqd) this.a);
                return;
            case 9:
                Object obj4 = this.a;
                Object obj5 = this.b;
                ((ejg) obj5).h(new cui(obj5, obj4, 10, (byte[]) null));
                return;
            case 10:
                ((ejg) this.b).a((lqd) this.a);
                return;
            case 11:
                Object c = ((jer) this.a).c();
                eth ethVar = new eth();
                Bundle bundle = new Bundle();
                bundle.putByteArray("invitation_token", ((ihd) c).a.A());
                ethVar.ak(bundle);
                ((ebf) this.b).j(ethVar);
                return;
            case 12:
                Object obj6 = this.b;
                Object obj7 = this.a;
                synchronized (((eme) obj7).b) {
                    ((eme) obj7).d.remove(obj6);
                }
                return;
            case 13:
                ((emx) this.a).c.h(new egv(this.b, 12));
                return;
            case 14:
                emk emkVar = (emk) this.b;
                if (emkVar.d) {
                    if (emkVar.f.o((lqd) this.a)) {
                        emkVar.e();
                        emkVar.d = false;
                        return;
                    }
                    return;
                }
                return;
            case 15:
                emh emhVar = new emh(this.a, i2);
                kgf kgfVar = (kgf) this.b;
                ((emk) kgfVar.a).f.q((lqd) kgfVar.c, emhVar, 2);
                return;
            case 16:
                kgf kgfVar2 = (kgf) this.b;
                Object obj8 = kgfVar2.c;
                ((emk) kgfVar2.a).e.b((kyf) kgfVar2.b, (lqd) obj8, (ick) this.a);
                return;
            case 17:
                emh emhVar2 = new emh(this.a, i3);
                kgf kgfVar3 = (kgf) this.b;
                ((emk) kgfVar3.a).f.q((lqd) kgfVar3.c, emhVar2, 2);
                return;
            case 18:
                ((emx) this.b).c.h(((eqv) this.a).d);
                return;
            case 19:
                ?? r0 = this.a;
                Object obj9 = this.b;
                if (!r0.isCancelled()) {
                    synchronized (((etb) obj9).e) {
                        ((etb) obj9).i.i();
                    }
                    return;
                }
                return;
            default:
                ((euu) this.b).c.l(this.a);
                return;
        }
    }

    public cui(drg drgVar, ViewTreeObserver.OnDrawListener onDrawListener, int i) {
        this.c = i;
        this.b = onDrawListener;
        this.a = drgVar;
    }

    public /* synthetic */ cui(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ cui(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public cui(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }
}
