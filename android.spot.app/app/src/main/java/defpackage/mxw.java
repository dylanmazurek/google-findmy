package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxw extends mnp implements mol {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxw(gva gvaVar, List list, String str, lem lemVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.f = i;
        this.b = gvaVar;
        this.c = list;
        this.e = str;
        this.d = lemVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((mxw) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((mxw) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:            if (r10.a(r1, r9) == r0) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:            if (r10.a(r1, r9) == r0) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:            if (defpackage.mpd.x(r10, r2, r9) != r0) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:            if (r10 == r0) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:            if (r3 != 1) goto L16;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, myk] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, mwv] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, mwv] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, mxy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, mxy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mwv] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, mww] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, mww] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, mxy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxw.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, myk] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, mwv] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, mxy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        if (this.f != 0) {
            Object obj2 = this.b;
            ?? r4 = this.c;
            Object obj3 = this.e;
            return new mxw((gva) obj2, (List) r4, (String) obj3, (lem) this.d, mmxVar, 1);
        }
        return new mxw((myk) this.c, (mwv) this.d, (mxy) this.e, this.b, mmxVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxw(myk mykVar, mwv mwvVar, mxy mxyVar, Object obj, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.f = i;
        this.c = mykVar;
        this.d = mwvVar;
        this.e = mxyVar;
        this.b = obj;
    }
}
