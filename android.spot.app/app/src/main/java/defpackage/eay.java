package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eay {
    private static final jnk g = jnk.l("com/google/android/apps/adm/devices/DevicesFetcherImpl");
    public final dvt a;
    public final Map b;
    public final ewg c;
    public final eyi d;
    public final msw e;
    public final elo f;
    private final evy h;
    private final mnb i;
    private final ezl j;
    private final dxf k;
    private final bym l;

    public eay(dvt dvtVar, Map map, elo eloVar, ewg ewgVar, evy evyVar, ezl ezlVar, bym bymVar, dxf dxfVar, eyi eyiVar, msw mswVar, mnb mnbVar) {
        dvtVar.getClass();
        map.getClass();
        eloVar.getClass();
        ewgVar.getClass();
        evyVar.getClass();
        bymVar.getClass();
        dxfVar.getClass();
        this.a = dvtVar;
        this.b = map;
        this.f = eloVar;
        this.c = ewgVar;
        this.h = evyVar;
        this.j = ezlVar;
        this.l = bymVar;
        this.k = dxfVar;
        this.d = eyiVar;
        this.e = mswVar;
        this.i = mnbVar;
    }

    private final void c(List list) {
        int i;
        lnb lnbVar;
        if (list != null) {
            bym bymVar = this.l;
            dxo dxoVar = dxo.a;
            long size = list.size();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            fma.bp("&t", "event", hashMap);
            fma.br("Network", hashMap);
            fma.bq(dxoVar.b, hashMap);
            fma.bs(dxoVar.c, hashMap);
            fma.bp("&ev", Long.toString(size), hashMap);
            ((fbr) bymVar.a).b(fma.bo(hashMap, hashMap2, arrayList, arrayList2));
        }
        ljh k = lms.d.k();
        k.getClass();
        boolean b = this.j.b();
        if (!k.b.y()) {
            k.t();
        }
        lms lmsVar = (lms) k.b;
        lmsVar.a |= 2;
        lmsVar.c = b;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (!k.b.y()) {
            k.t();
        }
        lms lmsVar2 = (lms) k.b;
        lmsVar2.a |= 1;
        lmsVar2.b = i;
        ljn q = k.q();
        q.getClass();
        lms lmsVar3 = (lms) q;
        if (list != null) {
            lnbVar = lnb.DEVICE_LIST_REFRESHED;
        } else {
            lnbVar = lnb.DEVICE_LIST_REFRESH_FAILED;
        }
        dxf dxfVar = this.k;
        ljh k2 = lmu.i.k();
        k2.getClass();
        if (!k2.b.y()) {
            k2.t();
        }
        lmu lmuVar = (lmu) k2.b;
        lmuVar.c = lmsVar3;
        lmuVar.a |= 2;
        dxfVar.b(lnbVar, jer.h(hzc.as(k2)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(5:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(3:18|19|20))(3:21|22|23))(1:27))(3:30|(1:32)|25)|28))|38|6|7|(0)(0)|28) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:            if (defpackage.mpp.l(r11, r4, r0) == r1) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:            if (r11 == r1) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:            r11 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:            r5 = r2.i.plus(defpackage.mut.a);        r6 = new defpackage.eat(r2, (defpackage.mmx) null, 0);        r0.a = r11;        r0.d = r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:            if (defpackage.mpp.l(r5, r6, r0) != r1) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:            throw r11;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6, types: [eay] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eat, mol] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.mmx r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.eas
            if (r0 == 0) goto L13
            r0 = r11
            eas r0 = (defpackage.eas) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            eas r0 = new eas
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.d
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L55
            if (r2 == r7) goto L4d
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L36
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            java.lang.Object r0 = r0.a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.mjo.o(r11)
            goto Lb1
        L3f:
            defpackage.mjo.o(r11)
            goto L95
        L43:
            java.lang.Object r2 = r0.a
            eay r2 = (defpackage.eay) r2
            defpackage.mjo.o(r11)     // Catch: java.lang.Throwable -> L4b
            goto L7d
        L4b:
            r11 = move-exception
            goto L98
        L4d:
            java.lang.Object r2 = r0.a
            eay r2 = (defpackage.eay) r2
            defpackage.mjo.o(r11)
            goto L73
        L55:
            defpackage.mjo.o(r11)
            dxf r11 = r10.k
            lnb r2 = defpackage.lnb.DEVICE_LIST_REFRESH_REQUESTED
            jdl r9 = defpackage.jdl.a
            r11.b(r2, r9)
            mnb r11 = r10.i
            eat r2 = new eat
            r2.<init>(r10, r8, r7, r8)
            r0.a = r10
            r0.d = r7
            java.lang.Object r11 = defpackage.mpp.l(r11, r2, r0)
            if (r11 == r1) goto Lb2
            r2 = r10
        L73:
            r0.a = r2     // Catch: java.lang.Throwable -> L4b
            r0.d = r6     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r11 = r2.b(r0)     // Catch: java.lang.Throwable -> L4b
            if (r11 == r1) goto Lb2
        L7d:
            mnb r11 = r2.i
            mut r4 = defpackage.mut.a
            mnb r11 = r11.plus(r4)
            eat r4 = new eat
            r4.<init>(r2, r8, r3)
            r0.a = r8
            r0.d = r5
            java.lang.Object r11 = defpackage.mpp.l(r11, r4, r0)
            if (r11 != r1) goto L95
            goto Lb2
        L95:
            mlh r11 = defpackage.mlh.a
            return r11
        L98:
            mnb r5 = r2.i
            mut r6 = defpackage.mut.a
            mnb r5 = r5.plus(r6)
            eat r6 = new eat
            r6.<init>(r2, r8, r3)
            r0.a = r11
            r0.d = r4
            java.lang.Object r0 = defpackage.mpp.l(r5, r6, r0)
            if (r0 != r1) goto Lb0
            goto Lb2
        Lb0:
            r0 = r11
        Lb1:
            throw r0
        Lb2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eay.a(mmx):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:            if (defpackage.mpp.l(r2, r4, r0) == r1) goto L41;     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.mmx r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.eav
            if (r0 == 0) goto L13
            r0 = r9
            eav r0 = (defpackage.eav) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            eav r0 = new eav
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L42
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.mjo.o(r9)
            goto Lab
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            java.lang.Object r1 = r0.a
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            eay r0 = r0.e
            defpackage.mjo.o(r9)
            goto Lc6
        L42:
            java.lang.Object r2 = r0.a
            android.accounts.Account r2 = (android.accounts.Account) r2
            eay r7 = r0.e
            defpackage.mjo.o(r9)     // Catch: java.lang.Throwable -> L4c
            goto L6a
        L4c:
            r9 = move-exception
            goto Lb0
        L4e:
            defpackage.mjo.o(r9)
            evy r9 = r8.h
            android.accounts.Account r2 = r9.b()
            r0.e = r8     // Catch: java.lang.Throwable -> Lae
            r0.a = r2     // Catch: java.lang.Throwable -> Lae
            r0.d = r5     // Catch: java.lang.Throwable -> Lae
            eaw r9 = new eaw     // Catch: java.lang.Throwable -> Lae
            r9.<init>(r8, r6)     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r9 = defpackage.msz.l(r9, r0)     // Catch: java.lang.Throwable -> Lae
            if (r9 != r1) goto L69
            goto Lc3
        L69:
            r7 = r8
        L6a:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L4c
            evy r4 = r7.h
            android.accounts.Account r4 = r4.b()
            boolean r2 = defpackage.amr.i(r2, r4)
            if (r2 != 0) goto L94
            jnk r9 = defpackage.eay.g
            jnx r9 = r9.e()
            java.lang.String r0 = "fetchDevicesInternal"
            r1 = 102(0x66, float:1.43E-43)
            java.lang.String r2 = "com/google/android/apps/adm/devices/DevicesFetcherImpl"
            java.lang.String r3 = "DevicesFetcher.kt"
            jnx r9 = r9.j(r2, r0, r1, r3)
            jni r9 = (defpackage.jni) r9
            java.lang.String r0 = "Account changed, dropping received device list"
            r9.r(r0)
            mlh r9 = defpackage.mlh.a
            return r9
        L94:
            r7.c(r9)
            mnb r2 = r7.i
            era r4 = new era
            r4.<init>(r7, r9, r6, r5)
            r0.e = r6
            r0.a = r6
            r0.d = r3
            java.lang.Object r9 = defpackage.mpp.l(r2, r4, r0)
            if (r9 != r1) goto Lab
            goto Lc3
        Lab:
            mlh r9 = defpackage.mlh.a
            return r9
        Lae:
            r9 = move-exception
            r7 = r8
        Lb0:
            mnb r2 = r7.i
            eat r3 = new eat
            r3.<init>(r7, r6, r4, r6)
            r0.e = r7
            r0.a = r9
            r0.d = r4
            java.lang.Object r0 = defpackage.mpp.l(r2, r3, r0)
            if (r0 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            r1 = r9
            r0 = r7
        Lc6:
            r0.c(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eay.b(mmx):java.lang.Object");
    }
}
