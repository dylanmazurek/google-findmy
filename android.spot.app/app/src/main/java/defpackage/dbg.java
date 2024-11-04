package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbg extends mnp implements mol {
    Object a;
    int b;
    int c;
    final /* synthetic */ mom d;
    final /* synthetic */ Context e;
    final /* synthetic */ String f = "fonts/";
    final /* synthetic */ String g = "__LottieInternalDefaultCacheKey__";
    final /* synthetic */ adt h;
    final /* synthetic */ dba i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbg(mom momVar, Context context, dba dbaVar, adt adtVar, mmx mmxVar) {
        super(2, mmxVar);
        this.d = momVar;
        this.e = context;
        this.i = dbaVar;
        this.h = adtVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbg) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:            if (((java.lang.Boolean) r13).booleanValue() == false) goto L33;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008a -> B:7:0x008d). Please report as a decompilation issue!!! */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            mne r0 = defpackage.mne.a
            int r1 = r12.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L17
            int r1 = r12.b
            java.lang.Object r4 = r12.a
            defpackage.mjo.o(r13)     // Catch: java.lang.Throwable -> L13
            goto L8d
        L13:
            r13 = move-exception
            r4 = r13
            goto L99
        L17:
            int r1 = r12.b
            java.lang.Object r4 = r12.a
            defpackage.mjo.o(r13)
            goto L51
        L1f:
            defpackage.mjo.o(r13)
            r13 = 0
            r4 = r2
            r1 = 0
        L25:
            adt r13 = r12.h
            daz r13 = defpackage.bpt.q(r13)
            agt r13 = r13.a
            java.lang.Object r13 = r13.a()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L9b
            if (r1 == 0) goto L5b
            mom r13 = r12.d
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r1)
            r4.getClass()
            r12.a = r4
            r12.b = r1
            r12.c = r3
            java.lang.Object r13 = r13.a(r5, r4, r12)
            if (r13 == r0) goto L5a
        L51:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L9b
            goto L5b
        L5a:
            return r0
        L5b:
            android.content.Context r5 = r12.e     // Catch: java.lang.Throwable -> L13
            dba r6 = r12.i     // Catch: java.lang.Throwable -> L13
            java.lang.String r7 = defpackage.bpt.r(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r13 = r12.f     // Catch: java.lang.Throwable -> L13
            java.lang.String r8 = defpackage.bpt.r(r13)     // Catch: java.lang.Throwable -> L13
            java.lang.String r13 = ".ttf"
            boolean r9 = defpackage.moz.g(r13)     // Catch: java.lang.Throwable -> L13
            if (r9 != 0) goto L7b
            java.lang.String r9 = "."
            boolean r9 = defpackage.moz.I(r13, r9)     // Catch: java.lang.Throwable -> L13
            if (r9 != 0) goto L7b
            java.lang.String r13 = "..ttf"
        L7b:
            r9 = r13
            java.lang.String r10 = r12.g     // Catch: java.lang.Throwable -> L13
            r12.a = r4     // Catch: java.lang.Throwable -> L13
            r12.b = r1     // Catch: java.lang.Throwable -> L13
            r13 = 2
            r12.c = r13     // Catch: java.lang.Throwable -> L13
            r11 = r12
            java.lang.Object r13 = defpackage.bpt.s(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L13
            if (r13 != r0) goto L8d
            return r0
        L8d:
            cyb r13 = (defpackage.cyb) r13     // Catch: java.lang.Throwable -> L13
            adt r5 = r12.h     // Catch: java.lang.Throwable -> L13
            daz r5 = defpackage.bpt.q(r5)     // Catch: java.lang.Throwable -> L13
            r5.d(r13)     // Catch: java.lang.Throwable -> L13
            goto L25
        L99:
            int r1 = r1 + r3
            goto L25
        L9b:
            adt r13 = r12.h
            daz r13 = defpackage.bpt.q(r13)
            boolean r13 = r13.f()
            if (r13 != 0) goto Lb4
            if (r4 == 0) goto Lb4
            adt r13 = r12.h
            daz r13 = defpackage.bpt.q(r13)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r13.e(r4)
        Lb4:
            mlh r13 = defpackage.mlh.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new dbg(this.d, this.e, this.i, this.h, mmxVar);
    }
}
