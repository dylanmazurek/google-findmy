package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggp implements ggm {
    private static final joo a = joo.m("GnpSdk");
    private static final ggn l = new ggn();
    private static final ggo m = new ggo();
    private final git b;
    private final gll c;
    private final ghf d;
    private final goj e;
    private final ghe f;
    private final glu g;
    private final lqz h;
    private final Lock i;
    private final jer j;
    private final ScheduledExecutorService k;
    private final gok n;
    private final gok o;
    private final gok p;

    public ggp(git gitVar, gll gllVar, ghf ghfVar, gok gokVar, goj gojVar, ghe gheVar, glu gluVar, lqz lqzVar, gok gokVar2, Lock lock, jer jerVar, gok gokVar3, ScheduledExecutorService scheduledExecutorService) {
        this.b = gitVar;
        this.c = gllVar;
        this.d = ghfVar;
        this.o = gokVar;
        this.e = gojVar;
        this.f = gheVar;
        this.g = gluVar;
        this.h = lqzVar;
        this.n = gokVar2;
        this.i = lock;
        this.j = jerVar;
        this.p = gokVar3;
        this.k = scheduledExecutorService;
    }

    private static boolean e(lgz lgzVar) {
        int w = a.w(lgzVar.c);
        if (w == 0 || w != 3) {
            int w2 = a.w(lgzVar.e);
            if (w2 == 0 || w2 != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [msw, java.lang.Object] */
    @Override // defpackage.ggm
    public final jyz a(goa goaVar, lgn lgnVar, gnd gndVar) {
        if (goaVar == null) {
            ((jol) ((jol) a.g()).j("com/google/android/libraries/notifications/entrypoints/push/impl/SystemTrayPushHandlerImpl", "handleNotificationsCountInfo", 255, "SystemTrayPushHandlerImpl.java")).r("Notification counts are only supported for accounts, received null account.");
            return jyv.a;
        }
        jiu jiuVar = new jiu();
        for (lgw lgwVar : lgnVar.c) {
            jiuVar.d(lgwVar.a, Long.valueOf(lgwVar.b));
        }
        gok gokVar = this.p;
        jyz g = jwu.g(jys.q(mpd.r(gokVar.b, new ghw(gokVar, goaVar, lgnVar.b, lgnVar.a, jiuVar.a(), null))), new gfa(7), this.k);
        return ((jys) g).r(gndVar.a(), TimeUnit.MILLISECONDS, this.k);
    }

    @Override // defpackage.ggm
    public final void b(Set set) {
        for (goa goaVar : this.e.b()) {
            if (set.contains(Integer.valueOf(goaVar.f)) && goaVar.h.contains(gwo.a)) {
                this.c.a(goaVar, null, lgd.REMOTE_DELETED_MESSAGES);
            }
        }
    }

    @Override // defpackage.ggm
    public final void c(goa goaVar, gpf gpfVar, lfs lfsVar, gpq gpqVar, gnd gndVar, long j, long j2) {
        ghh ghhVar = new ghh(Long.valueOf(j), Long.valueOf(j2), lcn.DELIVERED_FCM_PUSH);
        ghg b = this.d.b(lde.DELIVERED);
        b.e(goaVar);
        lgf lgfVar = lfsVar.d;
        if (lgfVar == null) {
            lgfVar = lgf.s;
        }
        b.f(lgfVar);
        ghn ghnVar = (ghn) b;
        ghnVar.t = gpfVar.b();
        ghnVar.z = ghhVar;
        b.a();
        if (this.j.g()) {
            lgf lgfVar2 = lfsVar.d;
            if (lgfVar2 == null) {
                lgfVar2 = lgf.s;
            }
            ggk.a(lgfVar2);
            gxj gxjVar = (gxj) this.j.c();
            gxv gxvVar = (gxv) l.e(gpqVar);
            gpe gpeVar = gpfVar.a;
            ggo ggoVar = m;
            new gxu(gxvVar, (gxm) ggoVar.e(gpeVar), (gxm) ggoVar.e(gpfVar.b), gpfVar.c);
            gxjVar.b();
        }
        git gitVar = this.b;
        lgf[] lgfVarArr = new lgf[1];
        lgf lgfVar3 = lfsVar.d;
        if (lgfVar3 == null) {
            lgfVar3 = lgf.s;
        }
        lgfVarArr[0] = lgfVar3;
        List asList = Arrays.asList(lgfVarArr);
        lgo lgoVar = lfsVar.c;
        if (lgoVar == null) {
            lgoVar = lgo.c;
        }
        gitVar.a(goaVar, asList, gndVar, ghhVar, false, lgoVar.b);
    }

    @Override // defpackage.ggm
    public final void d(goa goaVar, lgv lgvVar, lcj lcjVar, gnd gndVar) {
        boolean z;
        int G = a.G(lgvVar.a);
        if (G == 0) {
            G = 1;
        }
        switch (G - 1) {
            case 1:
                if (goaVar == null) {
                    ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/entrypoints/push/impl/SystemTrayPushHandlerImpl", "handleSystemTraySyncInstruction", 185, "SystemTrayPushHandlerImpl.java")).r("Payload with SYNC instruction must have an account");
                    return;
                }
                ((jol) a.k().j("com/google/android/libraries/notifications/entrypoints/push/impl/SystemTrayPushHandlerImpl", "handleSystemTraySyncInstruction", 187, "SystemTrayPushHandlerImpl.java")).r("Payload has SYNC instruction.");
                ghg b = this.d.b(lde.DELIVERED_SYNC_INSTRUCTION);
                b.e(goaVar);
                ghn ghnVar = (ghn) b;
                ghnVar.t = lcjVar;
                ghnVar.G = 2;
                b.a();
                this.c.a(goaVar, Long.valueOf(lgvVar.b), lgd.SYNC_INSTRUCTION);
                return;
            case 2:
                if (goaVar == null) {
                    ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/entrypoints/push/impl/SystemTrayPushHandlerImpl", "handleSystemTraySyncInstruction", 200, "SystemTrayPushHandlerImpl.java")).r("Payload with FULL_SYNC instruction must have an account");
                    return;
                }
                ((jol) a.k().j("com/google/android/libraries/notifications/entrypoints/push/impl/SystemTrayPushHandlerImpl", "handleSystemTraySyncInstruction", 202, "SystemTrayPushHandlerImpl.java")).r("Payload has FULL_SYNC instruction.");
                ghg b2 = this.d.b(lde.DELIVERED_FULL_SYNC_INSTRUCTION);
                b2.e(goaVar);
                ((ghn) b2).t = lcjVar;
                b2.a();
                this.c.c(goaVar, lgd.FULL_SYNC_INSTRUCTION);
                return;
            case 3:
                ((jol) a.k().j("com/google/android/libraries/notifications/entrypoints/push/impl/SystemTrayPushHandlerImpl", "handleSystemTraySyncInstruction", 222, "SystemTrayPushHandlerImpl.java")).r("Payload has STORE_ALL_ACCOUNTS instruction.");
                try {
                    this.o.g(lgp.SERVER_SYNC_INSTRUCTION).get();
                    return;
                } catch (Exception e) {
                    ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/entrypoints/push/impl/SystemTrayPushHandlerImpl", "handleSystemTraySyncInstruction", (char) 228, "SystemTrayPushHandlerImpl.java")).r("Failed scheduling registration");
                    return;
                }
            case 4:
                if (goaVar == null) {
                    ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/entrypoints/push/impl/SystemTrayPushHandlerImpl", "handleSystemTraySyncInstruction", 214, "SystemTrayPushHandlerImpl.java")).r("Payload with UPDATE_THREAD instruction must have an account");
                    return;
                }
                ((jol) a.k().j("com/google/android/libraries/notifications/entrypoints/push/impl/SystemTrayPushHandlerImpl", "handleSystemTraySyncInstruction", 216, "SystemTrayPushHandlerImpl.java")).r("Payload has UPDATE_THREAD_STATE instruction.");
                lgu lguVar = lgvVar.c;
                if (lguVar == null) {
                    lguVar = lgu.b;
                }
                if (!gndVar.e()) {
                    try {
                        z = this.i.tryLock(Math.max(gndVar.a() - lvp.a.a().b(), 0L), TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        z = false;
                    }
                } else {
                    this.i.lock();
                    z = true;
                }
                try {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (lgt lgtVar : lguVar.a) {
                        for (lfm lfmVar : lgtVar.b) {
                            gkt gktVar = (gkt) this.n.d(goaVar.b());
                            lgz lgzVar = lgtVar.a;
                            if (lgzVar == null) {
                                lgzVar = lgz.f;
                            }
                            gkp a2 = gks.a();
                            a2.e(lfmVar.b);
                            a2.c(Long.valueOf(lfmVar.c));
                            int e2 = kzy.e(lgzVar.b);
                            if (e2 == 0) {
                                e2 = 1;
                            }
                            a2.h(e2);
                            int w = a.w(lgzVar.c);
                            if (w == 0) {
                                w = 1;
                            }
                            a2.g(w);
                            int w2 = a.w(lgzVar.e);
                            if (w2 == 0) {
                                w2 = 1;
                            }
                            a2.i(w2);
                            int w3 = a.w(lgzVar.d);
                            if (w3 == 0) {
                                w3 = 1;
                            }
                            a2.f(w3);
                            gktVar.c(a2.a());
                        }
                        lgz lgzVar2 = lgtVar.a;
                        if (lgzVar2 == null) {
                            lgzVar2 = lgz.f;
                        }
                        if (e(lgzVar2)) {
                            arrayList.addAll(lgtVar.b);
                        }
                        lgz lgzVar3 = lgtVar.a;
                        if (lgzVar3 == null) {
                            lgzVar3 = lgz.f;
                        }
                        List list = (List) hashMap.get(lgzVar3);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.addAll(lgtVar.b);
                        lgz lgzVar4 = lgtVar.a;
                        if (lgzVar4 == null) {
                            lgzVar4 = lgz.f;
                        }
                        hashMap.put(lgzVar4, list);
                    }
                    Pair pair = new Pair(arrayList, hashMap);
                    List list2 = (List) pair.first;
                    Map map = (Map) pair.second;
                    if (!list2.isEmpty()) {
                        ghg b3 = this.d.b(lde.DELIVERED_UPDATE_THREAD_INSTRUCTION);
                        b3.e(goaVar);
                        b3.i(list2);
                        ((ghn) b3).t = lcjVar;
                        b3.a();
                        glu gluVar = this.g;
                        gji gjiVar = new gji();
                        gjiVar.d(lct.DISMISSED_REMOTE);
                        List b4 = gluVar.b(goaVar, list2, gjiVar.c());
                        if (!b4.isEmpty()) {
                            ghg b5 = this.d.b(lde.DISMISSED_REMOTE);
                            b5.e(goaVar);
                            b5.d(b4);
                            ((ghn) b5).t = lcjVar;
                            b5.a();
                        }
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        if (e((lgz) entry.getKey())) {
                            List list3 = (List) entry.getValue();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((lfm) it.next()).b);
                            }
                            Iterator it2 = ((Set) this.h.a()).iterator();
                            while (it2.hasNext()) {
                                ((gxb) it2.next()).g();
                            }
                        }
                    }
                    if (z) {
                        this.i.unlock();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (z) {
                        this.i.unlock();
                    }
                    throw th;
                }
            case 5:
                return;
            case 6:
                ghg b6 = this.d.b(lde.DELIVERED_REMOVE_STORAGE_INSTRUCTION);
                b6.e(goaVar);
                ((ghn) b6).t = lcjVar;
                b6.a();
                ((jol) a.k().j("com/google/android/libraries/notifications/entrypoints/push/impl/SystemTrayPushHandlerImpl", "handleSystemTraySyncInstruction", 237, "SystemTrayPushHandlerImpl.java")).r("Clear all data associated with the account.");
                this.f.c(goaVar, true);
                return;
            default:
                ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/entrypoints/push/impl/SystemTrayPushHandlerImpl", "handleSystemTraySyncInstruction", 245, "SystemTrayPushHandlerImpl.java")).r("Unknown sync instruction.");
                return;
        }
    }
}
