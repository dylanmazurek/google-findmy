package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbs implements caj {
    public final mnw a;
    public final apc c;
    private final File d;
    private final dhx f;
    public final AtomicBoolean b = new AtomicBoolean(false);
    private final ncd e = new ncd();

    public cbs(File file, dhx dhxVar, apc apcVar, mnw mnwVar) {
        this.d = file;
        this.f = dhxVar;
        this.c = apcVar;
        this.a = mnwVar;
    }

    private final void d() {
        if (!this.b.get()) {
        } else {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // defpackage.caj
    public final void a() {
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|37|38|(1:40)(1:41))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:            r1 = th;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[Catch: all -> 0x0084, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:21:0x0073, B:31:0x0080, B:28:0x0083, B:27:0x007b), top: B:7:0x001f, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10, types: [cbs] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [cbq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [mom] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.mom r8, defpackage.mmx r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cbq
            if (r0 == 0) goto L13
            r0 = r9
            cbq r0 = (defpackage.cbq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cbq r0 = new cbq
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r8 = r0.a
            cbo r1 = r0.f
            cbs r0 = r0.e
            defpackage.mjo.o(r9)     // Catch: java.lang.Throwable -> L2d
            goto L63
        L2d:
            r9 = move-exception
            goto L7b
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.mjo.o(r9)
            r7.d()
            ncd r9 = r7.e
            boolean r9 = r9.c()
            cbo r2 = new cbo     // Catch: java.lang.Throwable -> L89
            java.io.File r4 = r7.d     // Catch: java.lang.Throwable -> L89
            dhx r5 = r7.f     // Catch: java.lang.Throwable -> L89
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L89
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L75
            r0.e = r7     // Catch: java.lang.Throwable -> L75
            r0.f = r2     // Catch: java.lang.Throwable -> L75
            r0.a = r9     // Catch: java.lang.Throwable -> L75
            r0.d = r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r8 = r8.a(r2, r4, r0)     // Catch: java.lang.Throwable -> L75
            if (r8 == r1) goto L74
            r0 = r7
            r1 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L63:
            r1.a()     // Catch: java.lang.Throwable -> L68
            r1 = 0
            goto L69
        L68:
            r1 = move-exception
        L69:
            if (r1 != 0) goto L73
            if (r8 == 0) goto L72
            ncd r8 = r0.e
            r8.d()
        L72:
            return r9
        L73:
            throw r1     // Catch: java.lang.Throwable -> L84
        L74:
            return r1
        L75:
            r8 = move-exception
            r0 = r7
            r1 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L7b:
            r1.a()     // Catch: java.lang.Throwable -> L7f
            goto L83
        L7f:
            r1 = move-exception
            defpackage.mjo.l(r9, r1)     // Catch: java.lang.Throwable -> L84
        L83:
            throw r9     // Catch: java.lang.Throwable -> L84
        L84:
            r9 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
            goto L8b
        L89:
            r8 = move-exception
            r0 = r7
        L8b:
            if (r9 == 0) goto L92
            ncd r9 = r0.e
            r9.d()
        L92:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbs.b(mom, mmx):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(7:(2:3|(11:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(3:20|21|22)|27|28)(1:29))(2:40|41))(1:42))(5:60|(2:62|(2:64|65))|66|(1:68)|51)|43|44|45|47|48|(5:50|14|15|16|(0)(0))|51))|44|45|47|48|(0)|51)|7|(0)(0)|43) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012c, code lost:            r11 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012d, code lost:            r12 = r2;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d6 A[Catch: all -> 0x011c, IOException -> 0x012c, TRY_ENTER, TryCatch #5 {all -> 0x011c, blocks: (B:18:0x00d6, B:20:0x00dc, B:22:0x00e1, B:24:0x00f4, B:25:0x0114, B:29:0x011b, B:56:0x0130, B:58:0x0136, B:59:0x0139, B:39:0x0128, B:36:0x012b, B:43:0x0098, B:45:0x00b4), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011b A[Catch: all -> 0x011c, IOException -> 0x012c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x011c, blocks: (B:18:0x00d6, B:20:0x00dc, B:22:0x00e1, B:24:0x00f4, B:25:0x0114, B:29:0x011b, B:56:0x0130, B:58:0x0136, B:59:0x0139, B:39:0x0128, B:36:0x012b, B:43:0x0098, B:45:0x00b4), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, ncd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.mol r11, defpackage.mmx r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbs.c(mol, mmx):java.lang.Object");
    }
}
