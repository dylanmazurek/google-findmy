package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpa extends mnp implements mol {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ gpb f;
    final /* synthetic */ cpn g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpa(gpb gpbVar, cpn cpnVar, int i, mmx mmxVar) {
        super(2, mmxVar);
        this.f = gpbVar;
        this.g = cpnVar;
        this.h = i;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gpa) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0120: INVOKE (r5 I:java.io.Closeable), (r12 I:java.lang.Throwable) STATIC call: mjo.r(java.io.Closeable, java.lang.Throwable):void A[MD:(java.io.Closeable, java.lang.Throwable):void (m)] (LINE:289), block:B:51:0x0120 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066 A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:5:0x0010, B:6:0x00b5, B:10:0x00c6, B:11:0x00fd, B:14:0x0108, B:18:0x010e, B:19:0x0114, B:20:0x00dc, B:21:0x00f2, B:23:0x0027, B:26:0x0031, B:28:0x0042, B:31:0x0046, B:33:0x0066, B:36:0x007c, B:38:0x0086, B:41:0x009c, B:45:0x005f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[Catch: all -> 0x0015, TRY_ENTER, TryCatch #0 {all -> 0x0015, blocks: (B:5:0x0010, B:6:0x00b5, B:10:0x00c6, B:11:0x00fd, B:14:0x0108, B:18:0x010e, B:19:0x0114, B:20:0x00dc, B:21:0x00f2, B:23:0x0027, B:26:0x0031, B:28:0x0042, B:31:0x0046, B:33:0x0066, B:36:0x007c, B:38:0x0086, B:41:0x009c, B:45:0x005f), top: B:2:0x0006 }] */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new gpa(this.f, this.g, this.h, mmxVar);
    }
}
