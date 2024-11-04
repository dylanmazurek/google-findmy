package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkd extends gkm {
    private static final joo c = joo.m("GnpSdk");
    private final gjk d;
    private final gkr e;

    public gkd(gjk gjkVar, gkr gkrVar) {
        this.d = gjkVar;
        this.e = gkrVar;
    }

    @Override // defpackage.gyp
    public final String c() {
        return "RPC_BATCH_UPDATE_THREAD_STATE";
    }

    @Override // defpackage.gkm
    public final gjj g(Bundle bundle, lgq lgqVar, goa goaVar) {
        if (goaVar == null) {
            return i();
        }
        List b = this.e.b(goaVar, 100);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            try {
                byte[] bArr = ((gkq) it.next()).b;
                gxi gxiVar = gxi.g;
                int length = bArr.length;
                lja ljaVar = lja.a;
                lkz lkzVar = lkz.a;
                ljn m = ljn.m(gxiVar, bArr, 0, length, lja.a);
                ljn.A(m);
                gxi gxiVar2 = (gxi) m;
                lgz lgzVar = gxiVar2.c;
                if (lgzVar == null) {
                    lgzVar = lgz.f;
                }
                String str = gxiVar2.e;
                int D = a.D(gxiVar2.d);
                if (D == 0) {
                    D = 1;
                }
                int J = a.J(gxiVar2.f);
                if (J != 0) {
                    i = J;
                }
                gkc gkcVar = new gkc(lgzVar, str, D, i);
                if (!linkedHashMap.containsKey(gkcVar)) {
                    linkedHashMap.put(gkcVar, new HashSet());
                }
                ((Set) linkedHashMap.get(gkcVar)).addAll(gxiVar2.b);
            } catch (ljy e) {
                ((jol) ((jol) ((jol) c.f()).i(e)).j("com/google/android/libraries/notifications/internal/scheduled/impl/BatchUpdateThreadStateHandler", "getSdkBatchUpdates", 'i', "BatchUpdateThreadStateHandler.java")).r("Unable to parse SdkBatchedUpdate message");
            }
        }
        ArrayList arrayList = new ArrayList();
        for (gkc gkcVar2 : linkedHashMap.keySet()) {
            ljh k = gxi.g.k();
            lgz lgzVar2 = gkcVar2.a;
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            gxi gxiVar3 = (gxi) ljnVar;
            gxiVar3.c = lgzVar2;
            gxiVar3.a |= 1;
            String str2 = gkcVar2.b;
            if (!ljnVar.y()) {
                k.t();
            }
            gxi gxiVar4 = (gxi) k.b;
            gxiVar4.a |= 4;
            gxiVar4.e = str2;
            Iterable iterable = (Iterable) linkedHashMap.get(gkcVar2);
            if (!k.b.y()) {
                k.t();
            }
            gxi gxiVar5 = (gxi) k.b;
            gxiVar5.b();
            lhv.g(iterable, gxiVar5.b);
            int i2 = gkcVar2.c;
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar2 = k.b;
            gxi gxiVar6 = (gxi) ljnVar2;
            gxiVar6.d = i2 - 1;
            gxiVar6.a |= 2;
            int i3 = gkcVar2.d;
            if (!ljnVar2.y()) {
                k.t();
            }
            gxi gxiVar7 = (gxi) k.b;
            gxiVar7.f = i3 - 1;
            gxiVar7.a |= 8;
            arrayList.add((gxi) k.q());
        }
        gjj a = this.d.a(goaVar, arrayList, lgqVar);
        if (!a.b() || !a.d) {
            this.e.d(goaVar, b);
        }
        return a;
    }

    @Override // defpackage.gkm
    protected final String h() {
        return "BatchUpdateThreadStateCallback";
    }
}
