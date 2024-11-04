package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class giv {
    public final giu a;
    public final gnd b;
    public final ghh c;
    public final gxh d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public giv(giu giuVar, gnd gndVar, ghh ghhVar, gxh gxhVar, boolean z, boolean z2, boolean z3) {
        giuVar.getClass();
        gndVar.getClass();
        this.a = giuVar;
        this.b = gndVar;
        this.c = ghhVar;
        this.d = gxhVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final goa a() {
        return this.a.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof giv)) {
            return false;
        }
        giv givVar = (giv) obj;
        if (amr.i(this.a, givVar.a) && amr.i(this.b, givVar.b) && amr.i(this.c, givVar.c) && amr.i(this.d, givVar.d) && this.e == givVar.e && this.f == givVar.f && this.g == givVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        ghh ghhVar = this.c;
        int i = 0;
        if (ghhVar == null) {
            hashCode = 0;
        } else {
            hashCode = ghhVar.hashCode();
        }
        int i2 = ((hashCode2 * 31) + hashCode) * 31;
        gxh gxhVar = this.d;
        if (gxhVar != null) {
            if (gxhVar.y()) {
                i = gxhVar.i();
            } else {
                i = gxhVar.y;
                if (i == 0) {
                    i = gxhVar.i();
                    gxhVar.y = i;
                }
            }
        }
        return ((((((i2 + i) * 31) + a.i(this.e)) * 31) + a.i(this.f)) * 31) + a.i(this.g);
    }

    public final String toString() {
        return "ThreadProcessingContext(notificationTarget=" + this.a + ", timeout=" + this.b + ", traceInfo=" + this.c + ", localThreadState=" + this.d + ", muteNotification=" + this.e + ", forceNotification=" + this.f + ", applyTrayManagementInstructions=" + this.g + ")";
    }
}
