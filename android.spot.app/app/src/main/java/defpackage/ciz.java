package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ciz {
    public static final /* synthetic */ int e = 0;
    private static final String[] f = {"INSERT", "UPDATE", "DELETE"};
    public final Map a;
    public final chw c;
    private final cih g;
    private final Map h;
    private final Map i;
    private final String[] k;
    public final ReentrantLock b = new ReentrantLock();
    private final mro l = new mro(false, mrs.a);
    public mnw d = bcf.m;
    private final Map j = new LinkedHashMap();

    public ciz(cih cihVar, Map map, Map map2, String[] strArr) {
        String str;
        this.g = cihVar;
        this.h = map;
        this.i = map2;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.j.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.h.get(strArr[i]);
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ROOT);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.k = strArr2;
        for (Map.Entry entry : this.h.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (this.j.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                Map map3 = this.j;
                map3.put(lowerCase3, mkm.G(map3, lowerCase2));
            }
        }
        this.a = new LinkedHashMap();
        this.c = new chw(this.k.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.chs r18, defpackage.mmx r19) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciz.a(chs, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.chx r6, defpackage.mmx r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cis
            if (r0 == 0) goto L13
            r0 = r7
            cis r0 = (defpackage.cis) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cis r0 = new cis
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.a
            java.util.Set r6 = (java.util.Set) r6
            defpackage.mjo.o(r7)
            goto L66
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.a
            chx r6 = (defpackage.chx) r6
            defpackage.mjo.o(r7)
            goto L4f
        L3e:
            defpackage.mjo.o(r7)
            bas r7 = defpackage.bas.t
            r0.a = r6
            r0.d = r4
            java.lang.String r2 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r7 = r6.a(r2, r7, r0)
            if (r7 == r1) goto L67
        L4f:
            java.util.Set r7 = (java.util.Set) r7
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L65
            r0.a = r7
            r0.d = r3
            java.lang.String r2 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r6 = defpackage.bwh.g(r6, r2, r0)
            if (r6 == r1) goto L64
            goto L65
        L64:
            return r1
        L65:
            r6 = r7
        L66:
            return r6
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciz.b(chx, mmx):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #2 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x007b, B:14:0x0083, B:44:0x0105, B:47:0x010a, B:48:0x010d, B:16:0x0088, B:17:0x0092, B:19:0x0098, B:22:0x00ab, B:24:0x00ba, B:26:0x00cb, B:28:0x00d4, B:31:0x00d8, B:32:0x00f0, B:35:0x00f6, B:39:0x00dd, B:41:0x00eb, B:42:0x00ee), top: B:10:0x0028, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.mmx r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciz.c(mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.chs r18, defpackage.mmx r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            boolean r2 = r0 instanceof defpackage.ciu
            if (r2 == 0) goto L17
            r2 = r0
            ciu r2 = (defpackage.ciu) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            ciu r2 = new ciu
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.b
            mne r3 = defpackage.mne.a
            int r4 = r2.d
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L36
            if (r4 != r6) goto L2e
            int r2 = r2.a
            defpackage.mjo.o(r0)
            goto L94
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L36:
            defpackage.mjo.o(r0)
            java.util.concurrent.locks.ReentrantLock r4 = r1.b
            r4.lock()
            java.util.Map r0 = r1.a     // Catch: java.lang.Throwable -> L9d
            r7 = r18
            java.lang.Object r0 = r0.remove(r7)     // Catch: java.lang.Throwable -> L9d
            eld r0 = (defpackage.eld) r0     // Catch: java.lang.Throwable -> L9d
            r4.unlock()
            if (r0 == 0) goto L84
            chw r4 = r1.c
            java.util.concurrent.locks.ReentrantLock r7 = r4.a
            r7.lock()
            java.lang.Object r0 = r0.d
            r8 = r0
            int[] r8 = (int[]) r8     // Catch: java.lang.Throwable -> L7f
            int r8 = r8.length     // Catch: java.lang.Throwable -> L7f
            r9 = 0
            r10 = 0
        L5c:
            if (r9 >= r8) goto L78
            r11 = r0
            int[] r11 = (int[]) r11     // Catch: java.lang.Throwable -> L7f
            r11 = r11[r9]     // Catch: java.lang.Throwable -> L7f
            long[] r12 = r4.b     // Catch: java.lang.Throwable -> L7f
            r13 = r12[r11]     // Catch: java.lang.Throwable -> L7f
            r15 = -1
            long r15 = r15 + r13
            r12[r11] = r15     // Catch: java.lang.Throwable -> L7f
            r11 = 1
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 != 0) goto L75
            r4.d = r6     // Catch: java.lang.Throwable -> L7f
            r10 = 1
        L75:
            int r9 = r9 + 1
            goto L5c
        L78:
            r7.unlock()
            if (r10 == 0) goto L84
            r0 = 1
            goto L85
        L7f:
            r0 = move-exception
            r7.unlock()
            throw r0
        L84:
            r0 = 0
        L85:
            if (r0 == 0) goto L93
            r2.a = r6
            r2.d = r6
            java.lang.Object r2 = r1.g(r2)
            if (r2 == r3) goto L92
            goto L93
        L92:
            return r3
        L93:
            r2 = r0
        L94:
            if (r6 == r2) goto L97
            goto L98
        L97:
            r5 = 1
        L98:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L9d:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciz.d(chs, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00be -> B:11:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.chx r12, int r13, defpackage.mmx r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.civ
            if (r0 == 0) goto L13
            r0 = r14
            civ r0 = (defpackage.civ) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            civ r0 = new civ
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f
            mne r1 = defpackage.mne.a
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            int r12 = r0.e
            int r13 = r0.d
            int r2 = r0.c
            java.lang.String[] r5 = r0.i
            java.lang.Object r6 = r0.b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.a
            chx r7 = (defpackage.chx) r7
            defpackage.mjo.o(r14)
            goto Lc1
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            int r13 = r0.c
            java.lang.Object r12 = r0.b
            chx r12 = (defpackage.chx) r12
            java.lang.Object r2 = r0.a
            ciz r2 = (defpackage.ciz) r2
            defpackage.mjo.o(r14)
            goto L6b
        L51:
            defpackage.mjo.o(r14)
            java.lang.String r14 = "INSERT OR IGNORE INTO room_table_modification_log VALUES("
            java.lang.String r2 = ", 0)"
            java.lang.String r14 = defpackage.a.am(r13, r14, r2)
            r0.a = r11
            r0.b = r12
            r0.c = r13
            r0.h = r4
            java.lang.Object r14 = defpackage.bwh.g(r12, r14, r0)
            if (r14 == r1) goto Lc6
            r2 = r11
        L6b:
            java.lang.String[] r14 = r2.k
            r14 = r14[r13]
            java.lang.String[] r2 = defpackage.ciz.f
            r5 = 3
            r6 = 0
            r7 = r12
            r6 = r14
            r5 = r2
            r12 = 3
            r2 = r13
            r13 = 0
        L79:
            if (r13 >= r12) goto Lc3
            r14 = r5[r13]
            java.lang.String r8 = defpackage.bwi.f(r6, r14)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "CREATE TEMP TRIGGER IF NOT EXISTS `"
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = "` AFTER "
            r9.append(r8)
            r9.append(r14)
            java.lang.String r14 = " ON `"
            r9.append(r14)
            r9.append(r6)
            java.lang.String r14 = "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "
            r9.append(r14)
            r9.append(r2)
            java.lang.String r14 = " AND invalidated = 0; END"
            r9.append(r14)
            java.lang.String r14 = r9.toString()
            r0.a = r7
            r0.b = r6
            r0.i = r5
            r0.c = r2
            r0.d = r13
            r0.e = r12
            r0.h = r3
            java.lang.Object r14 = defpackage.bwh.g(r7, r14, r0)
            if (r14 != r1) goto Lc1
            return r1
        Lc1:
            int r13 = r13 + r4
            goto L79
        Lc3:
            mlh r12 = defpackage.mlh.a
            return r12
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciz.e(chx, int, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007a -> B:10:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.chx r9, int r10, defpackage.mmx r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ciw
            if (r0 == 0) goto L13
            r0 = r11
            ciw r0 = (defpackage.ciw) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ciw r0 = new ciw
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            mne r1 = defpackage.mne.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r9 = r0.b
            int r10 = r0.a
            java.lang.String[] r2 = r0.g
            java.lang.String r4 = r0.f
            cie r5 = r0.h
            defpackage.mjo.o(r11)
            r11 = r4
            goto L7c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            defpackage.mjo.o(r11)
            java.lang.String[] r11 = r8.k
            r10 = r11[r10]
            java.lang.String[] r11 = defpackage.ciz.f
            r2 = 3
            r4 = 0
            r2 = r11
            r11 = r10
            r10 = r9
            r9 = 3
        L49:
            if (r4 >= r9) goto L80
            r5 = r2[r4]
            java.lang.String r5 = defpackage.bwi.f(r11, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.<init>(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = r10
            cie r6 = (defpackage.cie) r6
            r0.h = r6
            r0.f = r11
            r0.g = r2
            r0.a = r4
            r0.b = r9
            r0.e = r3
            java.lang.Object r5 = defpackage.bwh.g(r10, r5, r0)
            if (r5 != r1) goto L7a
            return r1
        L7a:
            r5 = r10
            r10 = r4
        L7c:
            int r4 = r10 + 1
            r10 = r5
            goto L49
        L80:
            mlh r9 = defpackage.mlh.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciz.f(chx, int, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.mmx r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.cix
            if (r0 == 0) goto L13
            r0 = r9
            cix r0 = (defpackage.cix) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cix r0 = new cix
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            elo r0 = r0.d
            defpackage.mjo.o(r9)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r9 = move-exception
            goto L5d
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            defpackage.mjo.o(r9)
            cih r9 = r8.g
            elo r9 = r9.i
            boolean r2 = r9.B()
            if (r2 == 0) goto L61
            cih r2 = r8.g     // Catch: java.lang.Throwable -> L59
            cbk r4 = new cbk     // Catch: java.lang.Throwable -> L59
            r5 = 6
            r6 = 0
            r4.<init>(r8, r6, r5, r6)     // Catch: java.lang.Throwable -> L59
            r0.d = r9     // Catch: java.lang.Throwable -> L59
            r0.c = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r2.u(r4, r0)     // Catch: java.lang.Throwable -> L59
            if (r0 == r1) goto L58
            r0 = r9
        L54:
            r0.A()
            goto L61
        L58:
            return r1
        L59:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L5d:
            r0.A()
            throw r9
        L61:
            mlh r9 = defpackage.mlh.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciz.g(mmx):java.lang.Object");
    }

    public final void h(mnw mnwVar) {
        if (this.l.a(false, true)) {
            mpp.q(this.g.j(), null, 0, new bdu(this, mnwVar, (mmx) null, 6), 3);
        }
    }
}
