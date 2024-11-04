package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class um {
    public final uh a;
    public final ul b;
    public final ty c;
    public final uk d;
    public final boolean e;
    public final Map f;

    public um() {
        this(null, null, false, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um)) {
            return false;
        }
        um umVar = (um) obj;
        if (!amr.i(this.a, umVar.a)) {
            return false;
        }
        ul ulVar = umVar.b;
        if (!amr.i(null, null)) {
            return false;
        }
        ty tyVar = umVar.c;
        if (amr.i(null, null) && amr.i(this.d, umVar.d) && this.e == umVar.e && amr.i(this.f, umVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        uh uhVar = this.a;
        int i = 0;
        if (uhVar == null) {
            hashCode = 0;
        } else {
            hashCode = uhVar.hashCode();
        }
        uk ukVar = this.d;
        if (ukVar != null) {
            i = ukVar.hashCode();
        }
        return (((((hashCode * 29791) + i) * 31) + a.i(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=null, changeSize=null, scale=" + this.d + ", hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public um(uh uhVar, uk ukVar, boolean z, Map map) {
        this.a = uhVar;
        this.b = null;
        this.c = null;
        this.d = ukVar;
        this.e = z;
        this.f = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ um(defpackage.uh r4, defpackage.uk r5, boolean r6, java.util.Map r7, int r8) {
        /*
            r3 = this;
            r0 = r8 & 32
            if (r0 == 0) goto L6
            mly r7 = defpackage.mly.a
        L6:
            r0 = r8 & 16
            r1 = r8 & 8
            r2 = 1
            if (r0 == 0) goto Lf
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            r8 = r8 & r2
            r6 = r6 & r0
            r0 = 0
            if (r1 == 0) goto L16
            r5 = r0
        L16:
            if (r2 != r8) goto L19
            r4 = r0
        L19:
            r3.<init>(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um.<init>(uh, uk, boolean, java.util.Map, int):void");
    }
}
