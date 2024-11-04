package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bij implements agt {
    public boolean a = true;
    public final bym b;
    private final List c;
    private final bjj d;
    private final moh e;
    private final adt f;
    private final eld g;

    public bij(List list, Object obj, bjj bjjVar, eld eldVar, moh mohVar, bym bymVar) {
        this.c = list;
        this.d = bjjVar;
        this.g = eldVar;
        this.e = mohVar;
        this.b = bymVar;
        this.f = new aee(obj, agw.a);
    }

    @Override // defpackage.agt
    public final Object a() {
        return this.f.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0030, B:15:0x0063, B:17:0x0072), top: B:11:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:23:0x0094, B:31:0x00bc, B:43:0x004a), top: B:42:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:23:0x0094, B:31:0x00bc, B:43:0x004a), top: B:42:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:13:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ce -> B:13:0x00d1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.mmx r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bij.b(mmx):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.bio r6, defpackage.mmx r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.bii
            if (r0 == 0) goto L13
            r0 = r7
            bii r0 = (defpackage.bii) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bii r0 = new bii
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.mjo.o(r7)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            goto L7f
        L2a:
            r7 = move-exception
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.mjo.o(r7)
            bdu r7 = new bdu     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r2 = 3
            r7.<init>(r5, r6, r4, r2)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r0.a = r6     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r0.d = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r7 = defpackage.mkm.ay(r2, r7, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            if (r7 != r1) goto L7f
            return r1
        L4a:
            mnb r1 = r0.o()
            bcr r2 = kotlinx.coroutines.CoroutineExceptionHandler.a
            mmz r1 = r1.get(r2)
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            if (r1 != 0) goto L59
            goto L7e
        L59:
            mnb r0 = r0.o()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r3 = "Unable to load font "
            java.lang.String r6 = r3.concat(r6)
            r2.<init>(r6, r7)
            r1.handleException(r0, r2)
            return r4
        L73:
            r6 = move-exception
            mnb r7 = r0.o()
            boolean r7 = defpackage.mkm.aD(r7)
            if (r7 == 0) goto L80
        L7e:
            r7 = r4
        L7f:
            return r7
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bij.c(bio, mmx):java.lang.Object");
    }
}
