package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evw {
    public static final jnk a = jnk.l("com/google/android/apps/adm/pds/DataStoreProvider");
    public final Context b;
    public final lkq d;
    private final msw e;
    public final String c = "TermsOfServiceDetails";
    private final ncd g = new ncd();
    private final Map f = new LinkedHashMap();

    public evw(Context context, msw mswVar, lkq lkqVar) {
        this.b = context;
        this.e = mswVar;
        this.d = lkqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:11:0x004b, B:13:0x0053, B:14:0x008a), top: B:10:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.accounts.Account r11, defpackage.mmx r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.evv
            if (r0 == 0) goto L13
            r0 = r12
            evv r0 = (defpackage.evv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            evv r0 = new evv
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            ncd r11 = r0.f
            java.lang.Object r1 = r0.a
            evw r0 = r0.e
            defpackage.mjo.o(r12)
            r12 = r11
            r11 = r1
            goto L4b
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            defpackage.mjo.o(r12)
            ncd r12 = r10.g
            r0.e = r10
            r0.a = r11
            r0.f = r12
            r0.d = r3
            java.lang.Object r0 = r12.b(r0)
            if (r0 == r1) goto L95
            r0 = r10
        L4b:
            java.util.Map r1 = r0.f     // Catch: java.lang.Throwable -> L90
            java.lang.Object r2 = r1.get(r11)     // Catch: java.lang.Throwable -> L90
            if (r2 != 0) goto L8a
            dhx r2 = new dhx     // Catch: java.lang.Throwable -> L90
            lkq r4 = r0.d     // Catch: java.lang.Throwable -> L90
            r5 = 0
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L90
            msw r4 = r0.e     // Catch: java.lang.Throwable -> L90
            ddh r6 = new ddh     // Catch: java.lang.Throwable -> L90
            eeo r7 = new eeo     // Catch: java.lang.Throwable -> L90
            r8 = 10
            r7.<init>(r0, r8)     // Catch: java.lang.Throwable -> L90
            r6.<init>(r7, r5)     // Catch: java.lang.Throwable -> L90
            aqg r7 = new aqg     // Catch: java.lang.Throwable -> L90
            r8 = 12
            r7.<init>(r0, r11, r8)     // Catch: java.lang.Throwable -> L90
            mlx r0 = defpackage.mlx.a     // Catch: java.lang.Throwable -> L90
            cbp r8 = new cbp     // Catch: java.lang.Throwable -> L90
            bas r9 = defpackage.bas.p     // Catch: java.lang.Throwable -> L90
            r8.<init>(r2, r9, r7)     // Catch: java.lang.Throwable -> L90
            ceq r2 = new ceq     // Catch: java.lang.Throwable -> L90
            r2.<init>(r0, r5, r3)     // Catch: java.lang.Throwable -> L90
            java.util.List r0 = defpackage.mkm.N(r2)     // Catch: java.lang.Throwable -> L90
            hpd r2 = new hpd     // Catch: java.lang.Throwable -> L90
            r2.<init>(r8, r0, r6, r4)     // Catch: java.lang.Throwable -> L90
            r1.put(r11, r2)     // Catch: java.lang.Throwable -> L90
        L8a:
            hpd r2 = (defpackage.hpd) r2     // Catch: java.lang.Throwable -> L90
            r12.d()
            return r2
        L90:
            r11 = move-exception
            r12.d()
            throw r11
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evw.a(android.accounts.Account, mmx):java.lang.Object");
    }
}
