package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eul {
    public final euk a;
    private final jjr b;

    public eul() {
        throw null;
    }

    public static eul a(euk eukVar) {
        return b(eukVar, jmo.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0013, code lost:            if (r0 != 5) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.eul b(defpackage.euk r3, defpackage.jjr r4) {
        /*
            int r0 = r3.ordinal()
            if (r0 == 0) goto L21
            r1 = 1
            if (r0 == r1) goto L21
            r2 = 2
            if (r0 == r2) goto L16
            r1 = 3
            if (r0 == r1) goto L21
            r1 = 4
            if (r0 == r1) goto L21
            r1 = 5
            if (r0 == r1) goto L21
            goto L2a
        L16:
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ r1
            java.lang.String r1 = "Locations should not be empty for GEO_LOCATION"
            defpackage.hwx.K(r0, r1)
            goto L2a
        L21:
            boolean r0 = r4.isEmpty()
            java.lang.String r1 = "Locations should be empty for %s"
            defpackage.hwx.O(r0, r1, r3)
        L2a:
            eul r0 = new eul
            r0.<init>(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eul.b(euk, jjr):eul");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eul) {
            eul eulVar = (eul) obj;
            if (this.a.equals(eulVar.a) && this.b.equals(eulVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        jjr jjrVar = this.b;
        return "LocationState{locationType=" + this.a.toString() + ", locations=" + jjrVar.toString() + "}";
    }

    public eul(euk eukVar, jjr jjrVar) {
        if (eukVar == null) {
            throw new NullPointerException("Null locationType");
        }
        this.a = eukVar;
        if (jjrVar != null) {
            this.b = jjrVar;
            return;
        }
        throw new NullPointerException("Null locations");
    }
}
