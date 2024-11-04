package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jex extends jdm {
    final /* synthetic */ jey f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jex(jey jeyVar, kru kruVar, CharSequence charSequence) {
        super(kruVar, charSequence);
        this.f = jeyVar;
    }

    @Override // defpackage.jdm
    public final int a(int i) {
        return i + ((String) this.f.a).length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:            r7 = r7 + 1;     */
    @Override // defpackage.jdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r7) {
        /*
            r6 = this;
            jey r0 = r6.f
            java.lang.Object r0 = r0.a
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            java.lang.CharSequence r1 = r6.b
            int r1 = r1.length()
            int r1 = r1 - r0
        L11:
            if (r7 > r1) goto L31
            r2 = 0
        L14:
            if (r2 >= r0) goto L30
            java.lang.CharSequence r3 = r6.b
            int r4 = r2 + r7
            jey r5 = r6.f
            java.lang.Object r5 = r5.a
            char r3 = r3.charAt(r4)
            java.lang.String r5 = (java.lang.String) r5
            char r4 = r5.charAt(r2)
            if (r3 == r4) goto L2d
            int r7 = r7 + 1
            goto L11
        L2d:
            int r2 = r2 + 1
            goto L14
        L30:
            return r7
        L31:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jex.b(int):int");
    }
}
