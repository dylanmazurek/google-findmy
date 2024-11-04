package defpackage;

import com.google.android.apps.adm.R;
import j$.util.Collection;
import j$.util.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elk {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/SpotRenameDeviceHandler");
    public final ele b;
    public final Executor c;
    public final Executor d;
    public final Map e = new HashMap();
    public final ftf f;
    public final hnu g;
    public final kuv h;
    private final ewc i;
    private final dxf j;
    private final dhx k;

    public elk(ewc ewcVar, ele eleVar, hnu hnuVar, kuv kuvVar, ftf ftfVar, dhx dhxVar, dxf dxfVar, Executor executor, Executor executor2) {
        this.i = ewcVar;
        this.b = eleVar;
        this.g = hnuVar;
        this.h = kuvVar;
        this.f = ftfVar;
        this.k = dhxVar;
        this.j = dxfVar;
        this.c = executor2;
        this.d = executor;
    }

    public final cfk a(lqd lqdVar) {
        cfn cfnVar;
        synchronized (this.e) {
            Map.EL.putIfAbsent(this.e, lqdVar, new cfn(false));
            cfnVar = (cfn) this.e.get(lqdVar);
            cfnVar.getClass();
        }
        return cfnVar;
    }

    public final void b(lqc lqcVar, jer jerVar) {
        lnb lnbVar;
        lpz lpzVar;
        if (jerVar.g()) {
            kyl kylVar = ((kyf) jerVar.c()).c;
            if (kylVar == null) {
                kylVar = kyl.j;
            }
            String str = kylVar.d;
            ljh ljhVar = (ljh) lqcVar.z(5);
            ljhVar.w(lqcVar);
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            lqc lqcVar2 = (lqc) ljhVar.b;
            str.getClass();
            lqcVar2.a |= 2;
            lqcVar2.g = str;
            if (lqcVar.b == 4) {
                lpzVar = (lpz) lqcVar.c;
            } else {
                lpzVar = lpz.e;
            }
            ljh ljhVar2 = (ljh) lpzVar.z(5);
            ljhVar2.w(lpzVar);
            kyf kyfVar = (kyf) jerVar.c();
            ljh ljhVar3 = (ljh) kyfVar.z(5);
            ljhVar3.w(kyfVar);
            kyl kylVar2 = ((kyf) jerVar.c()).c;
            if (kylVar2 == null) {
                kylVar2 = kyl.j;
            }
            ljh ljhVar4 = (ljh) kylVar2.z(5);
            ljhVar4.w(kylVar2);
            if (!ljhVar4.b.y()) {
                ljhVar4.t();
            }
            kyl kylVar3 = (kyl) ljhVar4.b;
            str.getClass();
            kylVar3.d = str;
            if (!ljhVar3.b.y()) {
                ljhVar3.t();
            }
            kyf kyfVar2 = (kyf) ljhVar3.b;
            kyl kylVar4 = (kyl) ljhVar4.q();
            kylVar4.getClass();
            kyfVar2.c = kylVar4;
            kyfVar2.a |= 2;
            if (!ljhVar2.b.y()) {
                ljhVar2.t();
            }
            lpz lpzVar2 = (lpz) ljhVar2.b;
            kyf kyfVar3 = (kyf) ljhVar3.q();
            lpz lpzVar3 = lpz.e;
            kyfVar3.getClass();
            lpzVar2.b = kyfVar3;
            lpzVar2.a |= 1;
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            lqc lqcVar3 = (lqc) ljhVar.b;
            lpz lpzVar4 = (lpz) ljhVar2.q();
            lpzVar4.getClass();
            lqcVar3.c = lpzVar4;
            lqcVar3.b = 4;
            this.i.w(lqcVar, (lqc) ljhVar.q());
        } else {
            this.k.m(R.string.rename_result_fail);
        }
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        dxf dxfVar = this.j;
        if (jerVar.g()) {
            lnbVar = lnb.DEVICE_RENAME_SUCCESSFUL;
        } else {
            lnbVar = lnb.DEVICE_RENAME_FAILURE;
        }
        dxfVar.c(lnbVar, jdl.a, lqdVar);
        synchronized (this.e) {
            Collection.EL.removeIf(this.e.entrySet(), new eju(10));
        }
        synchronized (this.e) {
            if (this.e.containsKey(lqdVar)) {
                cfn cfnVar = (cfn) this.e.get(lqdVar);
                cfnVar.getClass();
                cfnVar.i(false);
            }
        }
    }
}
