package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqz {
    public int a = 0;
    public int b = -1;
    public final Object[] c;
    public final StringBuilder d;
    public int e;
    private final jpw f;

    public jqz(jpw jpwVar, Object[] objArr, StringBuilder sb) {
        jpwVar.getClass();
        this.f = jpwVar;
        this.e = 0;
        objArr.getClass();
        this.c = objArr;
        this.d = sb;
    }

    public static void c(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(joy.b(obj));
        sb.append("]");
    }

    public final jra a() {
        return this.f.a;
    }

    public final String b() {
        return this.f.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:            if ((r8 instanceof java.math.BigDecimal) == false) goto L15;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:            if ((r8 instanceof java.math.BigInteger) == false) goto L15;     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r8, defpackage.jor r9, defpackage.jos r10) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqz.d(java.lang.Object, jor, jos):void");
    }
}
