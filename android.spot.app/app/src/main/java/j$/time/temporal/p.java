package j$.time.temporal;

import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
final class p implements q {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.q
    public final Object a(l lVar) {
        switch (this.a) {
            case 0:
                return (ZoneId) lVar.B(k.a);
            case 1:
                return (j$.time.chrono.n) lVar.B(k.b);
            case 2:
                return (TemporalUnit) lVar.B(k.c);
            case 3:
                a aVar = a.OFFSET_SECONDS;
                if (lVar.g(aVar)) {
                    return ZoneOffset.c0(lVar.n(aVar));
                }
                return null;
            case 4:
                ZoneId zoneId = (ZoneId) lVar.B(k.a);
                if (zoneId == null) {
                    return (ZoneId) lVar.B(k.d);
                }
                return zoneId;
            case 5:
                a aVar2 = a.EPOCH_DAY;
                if (lVar.g(aVar2)) {
                    return j$.time.g.h0(lVar.w(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (lVar.g(aVar3)) {
                    return j$.time.j.a0(lVar.w(aVar3));
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "ZoneId";
            case 1:
                return "Chronology";
            case 2:
                return "Precision";
            case 3:
                return "ZoneOffset";
            case 4:
                return "Zone";
            case 5:
                return "LocalDate";
            default:
                return "LocalTime";
        }
    }
}
