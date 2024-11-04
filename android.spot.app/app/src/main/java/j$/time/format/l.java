package j$.time.format;

import j$.time.ZoneId;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l implements f {
    public final /* synthetic */ int a;
    private final Object b;

    public /* synthetic */ l(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.time.format.f
    public final boolean k(p pVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                sb.append((String) this.b);
                return true;
            default:
                ZoneId zoneId = (ZoneId) pVar.f((a) this.b);
                if (zoneId == null) {
                    return false;
                }
                sb.append(zoneId.l());
                return true;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "'" + ((String) this.b).replace("'", "''") + "'";
            default:
                return "ZoneRegionId()";
        }
    }
}
