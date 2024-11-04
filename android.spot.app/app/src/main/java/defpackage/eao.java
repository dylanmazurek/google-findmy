package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eao {
    public static final jnk a = jnk.l("com/google/android/apps/adm/devices/DeviceActionResultHandlerImpl");
    public final dvn b;
    public final Map c;

    public eao(dvn dvnVar, Map map) {
        this.b = dvnVar;
        this.c = map;
    }

    public final void a(String str, dfy dfyVar) {
        jer a2 = this.b.a(str);
        if (a2.g()) {
            lqd lqdVar = ((dvm) a2.c()).a.b;
            if (lqdVar == null) {
                lqdVar = lqd.d;
            }
            Map map = this.c;
            lqf b = lqf.b(lqdVar.c);
            if (b == null) {
                b = lqf.UNRECOGNIZED;
            }
            ehw ehwVar = (ehw) map.get(b);
            ehwVar.getClass();
            ehwVar.b(str, dfyVar);
            return;
        }
        ((jni) ((jni) ((jni) a.f()).i(dfyVar)).j("com/google/android/apps/adm/devices/DeviceActionResultHandlerImpl", "onVolleyError", 56, "DeviceActionResultHandlerImpl.java")).u("Error executing an unknown action with tracking ID %s", str);
    }
}
