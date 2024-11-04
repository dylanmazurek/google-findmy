package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmy {
    private static final jeb d = jeb.j(" \t\n\r\f\u000b\u0085\u2028\u2029\u200d\uffef�\ufffe\uffff").d();
    private static final jeb e = new jdw(new jdz(new jdz(new jds(0, 31), new jdt(127)), jeb.j(" @,:<>"))).k();
    private static final jeb f = new jdw(new jdz(new jdz(new jds(0, 31), new jdt(127)), jeb.j(" @,:<>+%"))).k();
    public final String a;
    public final String b;
    public final boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f9, code lost:            if (defpackage.jdp.a.f(r10) == false) goto L80;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jmy(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmy.<init>(java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jmy) {
            jmy jmyVar = (jmy) obj;
            if (amr.g(this.a, jmyVar.a) && amr.g(this.b, jmyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.a + "@" + this.b;
    }
}
