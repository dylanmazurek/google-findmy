package defpackage;

import com.google.android.apps.adm.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edd implements edc {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/accessory/AccessoryActionDispatcherImpl");
    private final dvn b;
    private final Map c;
    private final ewf d;
    private final dhx e;

    public edd(ewf ewfVar, dhx dhxVar, dvn dvnVar, Map map) {
        ewfVar.getClass();
        dhxVar.getClass();
        dvnVar.getClass();
        map.getClass();
        this.d = ewfVar;
        this.e = dhxVar;
        this.b = dvnVar;
        this.c = map;
    }

    private final lqj e(String str) {
        lqj lqjVar;
        dvm dvmVar = (dvm) this.b.a(str).f();
        if (dvmVar != null) {
            lqjVar = dvmVar.a;
        } else {
            lqjVar = null;
        }
        if (lqjVar == null) {
            ((jni) a.f().j("com/google/android/apps/adm/integrations/accessory/AccessoryActionDispatcherImpl", "getExecuteActionRequestOrLog", 91, "AccessoryActionDispatcherImpl.kt")).u("Received a device update not in the actions-in-progress map [requestTrackingId: %s]", str);
        }
        return lqjVar;
    }

    private final void f(String str, int i, boolean z) {
        boolean d;
        lqj e = e(str);
        if (e != null) {
            lqd lqdVar = e.b;
            if (lqdVar == null) {
                lqdVar = lqd.d;
            }
            lqdVar.getClass();
            lpo lpoVar = e.c;
            if (lpoVar == null) {
                lpoVar = lpo.c;
            }
            lpk a2 = lpk.a(lpoVar.a);
            a2.getClass();
            eho ehoVar = (eho) this.c.get(a2);
            if (ehoVar == null) {
                ((jni) a.f().j("com/google/android/apps/adm/integrations/accessory/AccessoryActionDispatcherImpl", "callHandlerForErrorOrTimeout", 109, "AccessoryActionDispatcherImpl.kt")).u("Received an error or timeout update with unexpected action type %s", a2);
                d = false;
            } else {
                d = ehoVar.d(lqdVar, z);
            }
            lqc a3 = this.d.a();
            if (a3 != null && d) {
                lqd lqdVar2 = a3.d;
                if (lqdVar2 == null) {
                    lqdVar2 = lqd.d;
                }
                lqd lqdVar3 = e.b;
                if (lqdVar3 == null) {
                    lqdVar3 = lqd.d;
                }
                if (amr.i(lqdVar2, lqdVar3)) {
                    this.e.m(i);
                }
            }
        }
    }

    @Override // defpackage.edc
    public final void a(lqd lqdVar, lpk lpkVar) {
        mlh mlhVar;
        lpkVar.getClass();
        eho ehoVar = (eho) this.c.get(lpkVar);
        if (ehoVar != null) {
            ehoVar.a(lqdVar);
            mlhVar = mlh.a;
        } else {
            mlhVar = null;
        }
        if (mlhVar != null) {
        } else {
            throw new IllegalStateException("No handler existing for the given device identifier.");
        }
    }

    @Override // defpackage.edc
    public final void b(String str, dfy dfyVar) {
        int i;
        if (true != (dfyVar instanceof dfn)) {
            i = R.string.action_server_error;
        } else {
            i = R.string.network_error;
        }
        f(str, i, false);
    }

    @Override // defpackage.edc
    public final void c(String str) {
        f(str, R.string.action_server_error, true);
    }

    @Override // defpackage.edc
    public final void d(lqy lqyVar) {
        lqt lqtVar = lqyVar.a;
        if (lqtVar == null) {
            lqtVar = lqt.h;
        }
        String str = lqtVar.e;
        str.getClass();
        lqj e = e(str);
        if (e != null) {
            lpo lpoVar = e.c;
            if (lpoVar == null) {
                lpoVar = lpo.c;
            }
            lpk a2 = lpk.a(lpoVar.a);
            a2.getClass();
            eho ehoVar = (eho) this.c.get(a2);
            if (ehoVar == null) {
                ((jni) a.f().j("com/google/android/apps/adm/integrations/accessory/AccessoryActionDispatcherImpl", "handleDeviceUpdated", 40, "AccessoryActionDispatcherImpl.kt")).y("Received update for unknown Accessory action %s [requestTrackingId: %s]", a2, str);
                return;
            }
            ((jni) a.e().j("com/google/android/apps/adm/integrations/accessory/AccessoryActionDispatcherImpl", "handleDeviceUpdated", 49, "AccessoryActionDispatcherImpl.kt")).y("Received update for action %s [requestTrackingId: %s]", a2, str);
            if (ehoVar.e(lqyVar)) {
                this.b.d(str);
            }
        }
    }
}
