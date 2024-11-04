package defpackage;

import android.bluetooth.le.ScanRecord;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ick {
    public final fze a;
    public final ihy b;
    public final long c;

    public ick() {
        throw null;
    }

    public static ick a(fze fzeVar, hot hotVar) {
        ScanRecord a = fzeVar.a();
        a.getClass();
        byte[] serviceData = a.getServiceData(ifs.a);
        serviceData.getClass();
        int i = iji.a;
        lim a2 = ifv.a(lim.t(serviceData));
        return new ick(fzeVar, hotVar.h(a2), hotVar.g(a2).a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ick) {
            ick ickVar = (ick) obj;
            if (this.a.equals(ickVar.a) && this.b.equals(ickVar.b) && this.c == ickVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        ihy ihyVar = this.b;
        return "EidScanMetadata{scanResult=" + String.valueOf(this.a) + ", componentSetOrComponentless=" + String.valueOf(ihyVar) + ", eidTimestamp=" + this.c + "}";
    }

    public ick(fze fzeVar, ihy ihyVar, long j) {
        this.a = fzeVar;
        this.b = ihyVar;
        this.c = j;
    }
}
