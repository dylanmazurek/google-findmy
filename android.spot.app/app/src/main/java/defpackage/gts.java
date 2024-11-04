package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gts implements gry {
    private static final joo c = joo.m("GnpSdk");
    public final goj a;
    public final hri b;
    private final gsq d;
    private final mnb e;
    private final gty f;
    private final jer g;
    private final gvg h;
    private final Context i;
    private final guc j;
    private final gsk k;
    private final gsp l;
    private final gsb m;
    private final gry n;
    private final gnv o;
    private final String p;
    private final ddg q;
    private final hri r;

    public gts(gsq gsqVar, goj gojVar, mnb mnbVar, hri hriVar, ddg ddgVar, gty gtyVar, jer jerVar, gvg gvgVar, Context context, guc gucVar, gsk gskVar, gsp gspVar, gsb gsbVar, gry gryVar, gnv gnvVar, hri hriVar2) {
        gsqVar.getClass();
        hriVar.getClass();
        jerVar.getClass();
        gvgVar.getClass();
        gskVar.getClass();
        gspVar.getClass();
        gsbVar.getClass();
        gnvVar.getClass();
        this.d = gsqVar;
        this.a = gojVar;
        this.e = mnbVar;
        this.r = hriVar;
        this.q = ddgVar;
        this.f = gtyVar;
        this.g = jerVar;
        this.h = gvgVar;
        this.i = context;
        this.j = gucVar;
        this.k = gskVar;
        this.l = gspVar;
        this.m = gsbVar;
        this.n = gryVar;
        this.o = gnvVar;
        this.b = hriVar2;
        this.p = "GNP_REGISTRATION";
    }

    @Override // defpackage.gry
    public final int a() {
        return 15;
    }

    @Override // defpackage.gry
    public final long b() {
        return 0L;
    }

    @Override // defpackage.gry
    public final Object c(Bundle bundle, mmx mmxVar) {
        return mpp.l(this.e, new gto(this, bundle, null), mmxVar);
    }

    @Override // defpackage.gry
    public final String d() {
        return this.p;
    }

    @Override // defpackage.gry
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:            if (r8.v(r10, r12, r11, r0) != r1) goto L22;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.gna r8, java.util.Set r9, java.util.Map r10, defpackage.gny r11, defpackage.mmx r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.gtp
            if (r0 == 0) goto L13
            r0 = r12
            gtp r0 = (defpackage.gtp) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            gtp r0 = new gtp
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.c
            mne r1 = defpackage.mne.a
            int r2 = r0.e
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            defpackage.mjo.o(r12)
            goto L8c
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            gny r11 = r0.g
            java.lang.Object r10 = r0.b
            java.lang.Object r9 = r0.a
            gts r8 = r0.f
            defpackage.mjo.o(r12)
            goto L73
        L3e:
            defpackage.mjo.o(r12)
            gvg r12 = r7.h
            android.content.Context r2 = r7.i
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r5 = "FAILURE"
            r12.d(r2, r5)
            gvg r12 = r7.h
            int r2 = r9.size()
            android.content.Context r6 = r7.i
            java.lang.String r6 = r6.getPackageName()
            r12.e(r2, r6, r5)
            r8.getClass()
            gmx r8 = (defpackage.gmx) r8
            r0.f = r7
            r0.a = r9
            r0.b = r10
            r0.g = r11
            r0.e = r3
            java.lang.Object r8 = r7.i(r10, r9, r8, r0)
            if (r8 == r1) goto L8f
            r8 = r7
        L73:
            hri r8 = r8.r
            gti r12 = new gti
            r12.<init>(r9, r4)
            r9 = 0
            r0.f = r9
            r0.a = r9
            r0.b = r9
            r0.g = r9
            r0.e = r4
            java.lang.Object r8 = r8.v(r10, r12, r11, r0)
            if (r8 != r1) goto L8c
            goto L8f
        L8c:
            mlh r8 = defpackage.mlh.a
            return r8
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gts.g(gna, java.util.Set, java.util.Map, gny, mmx):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x02a9, code lost:            if (r2 != defpackage.mne.a) goto L97;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0026. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e7  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.util.Set r23, java.util.Map r24, defpackage.lgp r25, defpackage.gny r26, defpackage.gsr r27, defpackage.mmx r28) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gts.h(java.util.Set, java.util.Map, lgp, gny, gsr, mmx):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|(14:20|(4:23|(3:29|30|31)(3:25|26|27)|28|21)|32|33|(4:36|(3:41|42|43)|44|34)|47|48|(2:51|49)|52|53|(2:56|54)|57|58|(1:60))|12|13)|11|12|13))|63|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0028, code lost:            r8 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fe, code lost:            ((defpackage.jol) ((defpackage.jol) defpackage.gts.c.g()).i(r8)).r("Failed to report registration results");     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.util.Map r8, java.util.Set r9, defpackage.gmx r10, defpackage.mmx r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gts.i(java.util.Map, java.util.Set, gmx, mmx):java.lang.Object");
    }

    @Override // defpackage.gry
    public final void f() {
    }
}
