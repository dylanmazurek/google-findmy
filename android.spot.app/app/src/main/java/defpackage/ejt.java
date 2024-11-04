package defpackage;

import com.google.android.apps.adm.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejt {
    private static final jnk b = jnk.l("com/google/android/apps/adm/integrations/spot/SpotActionDispatcher");
    public final dvn a;
    private final jiy c;
    private final ilv d;
    private final dhx e;

    public ejt(ilv ilvVar, dvn dvnVar, Map map, dhx dhxVar) {
        this.d = ilvVar;
        this.a = dvnVar;
        this.c = jiy.i(map);
        this.e = dhxVar;
    }

    public final void a(lqd lqdVar, lpk lpkVar) {
        eho ehoVar = (eho) this.c.get(lpkVar);
        if (ehoVar != null) {
            ehoVar.a(lqdVar);
            return;
        }
        throw new IllegalArgumentException("No ActionHandler bound for action ".concat(String.valueOf(String.valueOf(lpkVar))));
    }

    public final void b(String str, dfy dfyVar) {
        int i;
        jer b2 = this.a.a(str).b(new eil(11));
        if (!b2.g()) {
            ((jni) ((jni) b.f()).j("com/google/android/apps/adm/integrations/spot/SpotActionDispatcher", "handleDeviceExecuteActionError", 101, "SpotActionDispatcher.java")).u("Received an execute action error not in the actions-in-progress map [requestTrackingId: %s].", str);
            return;
        }
        lpo lpoVar = ((lqj) b2.c()).c;
        if (lpoVar == null) {
            lpoVar = lpo.c;
        }
        eho ehoVar = (eho) this.c.get(lpk.a(lpoVar.a));
        lqd lqdVar = ((lqj) b2.c()).b;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        if (ehoVar != null && ehoVar.d(lqdVar, false) && this.d.o(lqdVar)) {
            boolean z = dfyVar instanceof dfn;
            dhx dhxVar = this.e;
            if (true != z) {
                i = R.string.action_server_error;
            } else {
                i = R.string.network_error;
            }
            dhxVar.m(i);
        }
    }

    public final void c(String str) {
        jer b2 = this.a.a(str).b(new eil(11));
        if (!b2.g()) {
            ((jni) ((jni) b.f()).j("com/google/android/apps/adm/integrations/spot/SpotActionDispatcher", "handleDeviceExecuteActionTimeout", 128, "SpotActionDispatcher.java")).u("Received an execute action timeout not in the actions-in-progress map [requestTrackingId: %s].", str);
            return;
        }
        lpo lpoVar = ((lqj) b2.c()).c;
        if (lpoVar == null) {
            lpoVar = lpo.c;
        }
        eho ehoVar = (eho) this.c.get(lpk.a(lpoVar.a));
        lqd lqdVar = ((lqj) b2.c()).b;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        if (ehoVar != null && ehoVar.d(lqdVar, true) && this.d.o(lqdVar)) {
            this.e.m(R.string.action_server_error);
        }
    }

    public final void d(lqy lqyVar) {
        lqt lqtVar = lqyVar.a;
        if (lqtVar == null) {
            lqtVar = lqt.h;
        }
        dvn dvnVar = this.a;
        String str = lqtVar.e;
        jer b2 = dvnVar.a(str).b(new eil(11));
        if (!b2.g()) {
            ((jni) ((jni) b.f()).j("com/google/android/apps/adm/integrations/spot/SpotActionDispatcher", "handleDeviceUpdated", 72, "SpotActionDispatcher.java")).u("Received a device update not in the actions-in-progress map [requestTrackingId: %s].", str);
            return;
        }
        lpo lpoVar = ((lqj) b2.c()).c;
        if (lpoVar == null) {
            lpoVar = lpo.c;
        }
        lpk a = lpk.a(lpoVar.a);
        eho ehoVar = (eho) this.c.get(a);
        if (ehoVar == null) {
            ((jni) ((jni) b.f()).j("com/google/android/apps/adm/integrations/spot/SpotActionDispatcher", "handleDeviceUpdated", 80, "SpotActionDispatcher.java")).y("Received update for unknown SPOT action %s [requestTrackingId: %s]", a, str);
            return;
        }
        ((jni) ((jni) b.e()).j("com/google/android/apps/adm/integrations/spot/SpotActionDispatcher", "handleDeviceUpdated", 85, "SpotActionDispatcher.java")).y("Received update for action %s [requestTrackingId: %s]", a, str);
        if (ehoVar.e(lqyVar)) {
            this.a.d(str);
        }
    }
}
