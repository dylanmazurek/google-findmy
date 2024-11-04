package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpb implements goy {
    public static final joo a = joo.m("GnpSdk");
    public final Map b;
    private final mnb c;

    public gpb(Map map, frx frxVar, mnb mnbVar) {
        map.getClass();
        frxVar.getClass();
        this.b = map;
        this.c = mnbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.goy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.cpn r8, int r9, defpackage.mmx r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.goz
            if (r0 == 0) goto L13
            r0 = r10
            goz r0 = (defpackage.goz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            goz r0 = new goz
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            gnk r8 = r0.d
            defpackage.mjo.o(r10)     // Catch: java.lang.Throwable -> L2a
            goto L50
        L2a:
            r9 = move-exception
            goto L5d
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.mjo.o(r10)
            gnk r10 = new gnk
            r10.<init>(r4)
            mnb r2 = r7.c     // Catch: java.lang.Throwable -> L5a
            gpa r5 = new gpa     // Catch: java.lang.Throwable -> L5a
            r5.<init>(r7, r8, r9, r3)     // Catch: java.lang.Throwable -> L5a
            r0.d = r10     // Catch: java.lang.Throwable -> L5a
            r0.c = r4     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r8 = defpackage.mpp.l(r2, r5, r0)     // Catch: java.lang.Throwable -> L5a
            if (r8 == r1) goto L59
            r6 = r10
            r10 = r8
            r8 = r6
        L50:
            boy r10 = (defpackage.boy) r10     // Catch: java.lang.Throwable -> L2a
            defpackage.mjo.r(r8, r3)
            r10.getClass()
            return r10
        L59:
            return r1
        L5a:
            r8 = move-exception
            r9 = r8
            r8 = r10
        L5d:
            throw r9     // Catch: java.lang.Throwable -> L5e
        L5e:
            r10 = move-exception
            defpackage.mjo.r(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpb.a(cpn, int, mmx):java.lang.Object");
    }
}
