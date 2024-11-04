package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eaq implements eap {
    private static final jnk a = jnk.l("com/google/android/apps/adm/devices/DeviceUpdateMergerImpl");
    private final Map b;

    public eaq(Map map) {
        this.b = map;
    }

    @Override // defpackage.eap
    public final lqc a(lqc lqcVar, lqc lqcVar2) {
        Map map = this.b;
        lqf i = eyf.i(lqcVar2);
        eap eapVar = (eap) map.get(i);
        if (eapVar == null) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/devices/DeviceUpdateMergerImpl", "mergeDeviceUpdate", 26, "DeviceUpdateMergerImpl.java")).s("Missing DeviceUpdateMerger for device of type %d; using update directly", i.a());
            return lqcVar2;
        }
        return eapVar.a(lqcVar, lqcVar2);
    }
}
