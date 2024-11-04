package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apk implements View.OnAttachStateChangeListener, cem {
    public final baw a;
    public boolean d;
    public bfi h;
    private final mnw i;
    private long n;
    private bfi q;
    private final se o = new se((byte[]) null);
    private final sg p = new sg((byte[]) null);
    private final long j = 100;
    public int f = 1;
    public boolean b = true;
    private final rz k = new rz((byte[]) null);
    private final mvy l = moz.at(1, 0, 6);
    public final Handler c = new Handler(Looper.getMainLooper());
    private se m = sf.a();
    public final se g = new se((byte[]) null);
    public final Runnable e = new Runnable() { // from class: aph
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            bfs bfsVar;
            bfs bfsVar2;
            bfs bfsVar3;
            apk apkVar = apk.this;
            if (apkVar.k()) {
                apkVar.a.o(true);
                apkVar.m(apkVar.a.g.a(), apkVar.h);
                apkVar.l(apkVar.a.g.a(), apkVar.h);
                se g = apkVar.g();
                int[] iArr = g.b;
                long[] jArr = g.a;
                int length = jArr.length - 2;
                char c = 7;
                long j = -9187201950435737472L;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j2 = jArr[i];
                        if ((((~j2) << c) & j2 & j) != j) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((j2 & 255) < 128) {
                                    int i4 = iArr[(i << 3) + i3];
                                    bfi bfiVar = (bfi) apkVar.g.a(i4);
                                    bfi bfiVar2 = (bfi) g.a(i4);
                                    if (bfiVar2 != null) {
                                        obj = bfiVar2.a;
                                    } else {
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (bfiVar == null) {
                                            bfh bfhVar = (bfh) obj;
                                            Iterator it = bfhVar.c.iterator();
                                            while (it.hasNext()) {
                                                Object key = ((Map.Entry) it.next()).getKey();
                                                bfn bfnVar = bfj.a;
                                                if (amr.i(key, bfj.s)) {
                                                    List list = (List) bej.b(bfhVar.c, bfj.s);
                                                    if (list != null) {
                                                        bfsVar3 = (bfs) mkm.X(list);
                                                    } else {
                                                        bfsVar3 = null;
                                                    }
                                                    apkVar.j(bfhVar.e, String.valueOf(bfsVar3));
                                                }
                                            }
                                        } else {
                                            bfh bfhVar2 = (bfh) obj;
                                            Iterator it2 = bfhVar2.c.iterator();
                                            while (it2.hasNext()) {
                                                bfn bfnVar2 = (bfn) ((Map.Entry) it2.next()).getKey();
                                                bfn bfnVar3 = bfj.a;
                                                if (amr.i(bfnVar2, bfj.s)) {
                                                    List list2 = (List) bej.b((bfe) bfiVar.a, bfj.s);
                                                    if (list2 != null) {
                                                        bfsVar = (bfs) mkm.X(list2);
                                                    } else {
                                                        bfsVar = null;
                                                    }
                                                    List list3 = (List) bej.b(bfhVar2.c, bfj.s);
                                                    if (list3 != null) {
                                                        bfsVar2 = (bfs) mkm.X(list3);
                                                    } else {
                                                        bfsVar2 = null;
                                                    }
                                                    if (!amr.i(bfsVar, bfsVar2)) {
                                                        apkVar.j(bfhVar2.e, String.valueOf(bfsVar2));
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        ll.h("no value for specified key");
                                        throw new mks();
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                        c = 7;
                        j = -9187201950435737472L;
                    }
                }
                apkVar.g.c();
                se g2 = apkVar.g();
                int[] iArr2 = g2.b;
                Object[] objArr = g2.c;
                long[] jArr2 = g2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j3 = jArr2[i5];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j3 & 255) < 128) {
                                    int i8 = (i5 << 3) + i7;
                                    apkVar.g.d(iArr2[i8], new bfi((bfh) ((bfi) objArr[i8]).a, apkVar.g()));
                                }
                                j3 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                apkVar.h = new bfi(apkVar.a.g.a(), apkVar.g());
                apkVar.d = false;
            }
        }
    };

    public apk(baw bawVar, mnw mnwVar) {
        this.a = bawVar;
        this.i = mnwVar;
        this.h = new bfi(bawVar.g.a(), sf.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:            if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:            r14 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n(int r18) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apk.n(int):void");
    }

    private final void o() {
        bfi bfiVar = this.q;
        if (bfiVar != null && Build.VERSION.SDK_INT >= 29) {
            char c = 7;
            if (this.o.e != 0) {
                ArrayList arrayList = new ArrayList();
                se seVar = this.o;
                Object[] objArr = seVar.c;
                long[] jArr = seVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        long[] jArr2 = jArr;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((j & 255) < 128) {
                                    arrayList.add((bet) objArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                        jArr = jArr2;
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(((bet) arrayList.get(i4)).a);
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    beg.a(apc$$ExternalSyntheticApiModelOutline0.m5m(bfiVar.a), arrayList2);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    ViewStructure a = bef.a(apc$$ExternalSyntheticApiModelOutline0.m5m(bfiVar.a), (View) bfiVar.b);
                    bee.a(a).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    bef.d(apc$$ExternalSyntheticApiModelOutline0.m5m(bfiVar.a), a);
                    for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                        bef.d(apc$$ExternalSyntheticApiModelOutline0.m5m(bfiVar.a), fr$$ExternalSyntheticApiModelOutline0.m108m(arrayList2.get(i5)));
                    }
                    ViewStructure a2 = bef.a(apc$$ExternalSyntheticApiModelOutline0.m5m(bfiVar.a), (View) bfiVar.b);
                    bee.a(a2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                    bef.d(apc$$ExternalSyntheticApiModelOutline0.m5m(bfiVar.a), a2);
                }
                this.o.c();
            }
            if (this.p.d != 0) {
                ArrayList arrayList3 = new ArrayList();
                sg sgVar = this.p;
                int[] iArr = sgVar.b;
                long[] jArr3 = sgVar.a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j2 = jArr3[i6];
                        int i7 = length2;
                        if ((((~j2) << c) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i6 - i7)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((j2 & 255) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i6 << 3) + i9]));
                                }
                                j2 >>= 8;
                            }
                            if (i8 != 8) {
                                break;
                            }
                        }
                        if (i6 == i7) {
                            break;
                        }
                        i6++;
                        length2 = i7;
                        c = 7;
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    arrayList4.add(Long.valueOf(((Number) arrayList3.get(i10)).intValue()));
                }
                long[] jArr4 = new long[arrayList4.size()];
                Iterator it = arrayList4.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    jArr4[i11] = ((Number) it.next()).longValue();
                    i11++;
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    Object obj = bfiVar.a;
                    bet e = bee.e((View) bfiVar.b);
                    e.getClass();
                    bef.f(apc$$ExternalSyntheticApiModelOutline0.m5m(obj), cs$$ExternalSyntheticApiModelOutline0.m(e.a), jArr4);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    ViewStructure a3 = bef.a(apc$$ExternalSyntheticApiModelOutline0.m5m(bfiVar.a), (View) bfiVar.b);
                    bee.a(a3).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    bef.d(apc$$ExternalSyntheticApiModelOutline0.m5m(bfiVar.a), a3);
                    Object obj2 = bfiVar.a;
                    bet e2 = bee.e((View) bfiVar.b);
                    e2.getClass();
                    bef.f(apc$$ExternalSyntheticApiModelOutline0.m5m(obj2), cs$$ExternalSyntheticApiModelOutline0.m(e2.a), jArr4);
                    ViewStructure a4 = bef.a(apc$$ExternalSyntheticApiModelOutline0.m5m(bfiVar.a), (View) bfiVar.b);
                    bee.a(a4).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                    bef.d(apc$$ExternalSyntheticApiModelOutline0.m5m(bfiVar.a), a4);
                }
                this.p.b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:            if (r8 == null) goto L88;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0235, code lost:            if (((((~r11) << 6) & r11) & (-9187201950435737472L)) == 0) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0237, code lost:            r13 = -1;     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p(defpackage.bfh r20) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apk.p(bfh):void");
    }

    private final void q(bfh bfhVar) {
        if (k()) {
            n(bfhVar.e);
            List i = bfhVar.i();
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                q((bfh) i.get(i2));
            }
        }
    }

    @Override // defpackage.cem
    public final void cT(cfc cfcVar) {
        this.q = (bfi) this.i.a();
        p(this.a.g.a());
        o();
    }

    @Override // defpackage.cem
    public final void f() {
        q(this.a.g.a());
        o();
        this.q = null;
    }

    public final se g() {
        if (this.b) {
            this.b = false;
            this.m = bdg.b(this.a.g);
            this.n = System.currentTimeMillis();
        }
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:13:0x004a, B:17:0x0057, B:19:0x005f, B:21:0x0068, B:22:0x006b, B:24:0x006f, B:25:0x0078, B:34:0x003c), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008b -> B:13:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.mmx r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.apj
            if (r0 == 0) goto L13
            r0 = r9
            apj r0 = (defpackage.apj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            apj r0 = new apj
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            mvq r2 = r0.e
            apk r5 = r0.d
            defpackage.mjo.o(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4a
        L2e:
            r9 = move-exception
            goto L99
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            mvq r2 = r0.e
            apk r5 = r0.d
            defpackage.mjo.o(r9)     // Catch: java.lang.Throwable -> L2e
            goto L57
        L40:
            defpackage.mjo.o(r9)
            mvy r9 = r8.l     // Catch: java.lang.Throwable -> L97
            mvq r2 = r9.A()     // Catch: java.lang.Throwable -> L97
            r5 = r8
        L4a:
            r0.d = r5     // Catch: java.lang.Throwable -> L2e
            r0.e = r2     // Catch: java.lang.Throwable -> L2e
            r0.c = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r2.a(r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L57
            return r1
        L57:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L8f
            r2.b()     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r5.k()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L6b
            r5.o()     // Catch: java.lang.Throwable -> L2e
        L6b:
            boolean r9 = r5.d     // Catch: java.lang.Throwable -> L2e
            if (r9 != 0) goto L78
            r5.d = r4     // Catch: java.lang.Throwable -> L2e
            android.os.Handler r9 = r5.c     // Catch: java.lang.Throwable -> L2e
            java.lang.Runnable r6 = r5.e     // Catch: java.lang.Throwable -> L2e
            r9.post(r6)     // Catch: java.lang.Throwable -> L2e
        L78:
            rz r9 = r5.k     // Catch: java.lang.Throwable -> L2e
            r9.clear()     // Catch: java.lang.Throwable -> L2e
            long r6 = r5.j     // Catch: java.lang.Throwable -> L2e
            r0.d = r5     // Catch: java.lang.Throwable -> L2e
            r0.e = r2     // Catch: java.lang.Throwable -> L2e
            r0.c = r3     // Catch: java.lang.Throwable -> L2e
            r6 = 100
            java.lang.Object r9 = defpackage.msz.i(r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 == r1) goto L8e
            goto L4a
        L8e:
            return r1
        L8f:
            rz r9 = r5.k
            r9.clear()
            mlh r9 = defpackage.mlh.a
            return r9
        L97:
            r9 = move-exception
            r5 = r8
        L99:
            rz r0 = r5.k
            r0.clear()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apk.h(mmx):java.lang.Object");
    }

    public final void i(ayr ayrVar) {
        if (this.k.add(ayrVar)) {
            this.l.j(mlh.a);
        }
    }

    public final void j(int i, String str) {
        bfi bfiVar;
        if (Build.VERSION.SDK_INT >= 29 && (bfiVar = this.q) != null) {
            AutofillId b = bfiVar.b(i);
            if (b != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    bef.e(apc$$ExternalSyntheticApiModelOutline0.m5m(bfiVar.a), b, str);
                    return;
                }
                return;
            }
            ll.h("Invalid content capture ID");
            throw new mks();
        }
    }

    public final boolean k() {
        if (this.q != null) {
            return true;
        }
        return false;
    }

    public final void l(bfh bfhVar, bfi bfiVar) {
        int i;
        List i2 = bfhVar.i();
        int size = i2.size();
        for (int i3 = 0; i3 < size; i3++) {
            bfh bfhVar2 = (bfh) i2.get(i3);
            if (se.b(g(), bfhVar2.e)) {
                if (!((sg) bfiVar.b).a(bfhVar2.e)) {
                    p(bfhVar2);
                }
            }
        }
        se seVar = this.g;
        int[] iArr = seVar.b;
        long[] jArr = seVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = i4 - length;
                    int i6 = 0;
                    while (true) {
                        i = 8 - ((~i5) >>> 31);
                        if (i6 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i7 = iArr[(i4 << 3) + i6];
                            if (!se.b(g(), i7)) {
                                n(i7);
                            }
                        }
                        j >>= 8;
                        i6++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        List i8 = bfhVar.i();
        int size2 = i8.size();
        for (int i9 = 0; i9 < size2; i9++) {
            bfh bfhVar3 = (bfh) i8.get(i9);
            if (se.b(g(), bfhVar3.e) && se.b(this.g, bfhVar3.e)) {
                Object a = this.g.a(bfhVar3.e);
                if (a != null) {
                    l(bfhVar3, (bfi) a);
                } else {
                    ll.h("node not present in pruned tree before this change");
                    throw new mks();
                }
            }
        }
    }

    public final void m(bfh bfhVar, bfi bfiVar) {
        sg sgVar = new sg((byte[]) null);
        List i = bfhVar.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            bfh bfhVar2 = (bfh) i.get(i2);
            if (se.b(g(), bfhVar2.e)) {
                if (!((sg) bfiVar.b).a(bfhVar2.e)) {
                    i(bfhVar.b);
                    return;
                }
                sgVar.d(bfhVar2.e);
            }
        }
        sg sgVar2 = (sg) bfiVar.b;
        int[] iArr = sgVar2.b;
        long[] jArr = sgVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 < i6) {
                            if ((255 & j) < 128 && !sgVar.a(iArr[(i3 << 3) + i5])) {
                                i(bfhVar.b);
                                return;
                            } else {
                                j >>= 8;
                                i5++;
                            }
                        } else if (i6 != 8) {
                            break;
                        }
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List i7 = bfhVar.i();
        int size2 = i7.size();
        for (int i8 = 0; i8 < size2; i8++) {
            bfh bfhVar3 = (bfh) i7.get(i8);
            if (se.b(g(), bfhVar3.e)) {
                Object a = this.g.a(bfhVar3.e);
                if (a != null) {
                    m(bfhVar3, (bfi) a);
                } else {
                    ll.h("node not present in pruned tree before this change");
                    throw new mks();
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.c.removeCallbacks(this.e);
        this.q = null;
    }

    @Override // defpackage.cem
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void e() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
