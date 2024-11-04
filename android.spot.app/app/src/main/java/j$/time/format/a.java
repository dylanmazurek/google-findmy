package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements j$.time.temporal.q {
    @Override // j$.time.temporal.q
    public final Object a(j$.time.temporal.l lVar) {
        ZoneId zoneId = (ZoneId) lVar.B(j$.time.temporal.k.k());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
