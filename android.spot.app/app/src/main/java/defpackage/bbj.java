package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.adm.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbj extends buk {
    public static final sc a;
    private final long C;
    private final bbd D;
    private final rz E;
    private final mvy F;
    private se G;
    private final moh H;
    private final se I;
    private final se J;
    public final baw b;
    public final AccessibilityManager d;
    public final AccessibilityManager.AccessibilityStateChangeListener e;
    public final AccessibilityManager.TouchExplorationStateChangeListener f;
    public List g;
    public final Handler h;
    public int i;
    public final tb j;
    public final tb k;
    public int l;
    public Integer m;
    public boolean n;
    public bbe o;
    public final String p;
    public final String q;
    public boolean r;
    public final Runnable s;
    public final List t;
    public final sg u;
    public final sb v;
    public final sb w;
    public final se x;
    public final bso y;
    public bfi z;
    public int c = Integer.MIN_VALUE;
    private final moh B = new zc(this, 18);

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        sc scVar = new sc(32);
        int i = scVar.b;
        if (i >= 0) {
            int i2 = i + 32;
            scVar.c(i2);
            int[] iArr2 = scVar.a;
            int i3 = scVar.b;
            if (i != i3) {
                mkm.p(iArr2, iArr2, i2, i, i3);
            }
            mkm.s(iArr, iArr2, i, 0, 12);
            scVar.b += 32;
            a = scVar;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + scVar.b);
    }

    public bbj(baw bawVar) {
        this.b = bawVar;
        Object systemService = bawVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.d = accessibilityManager;
        this.C = 100L;
        this.e = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: bax
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                List<AccessibilityServiceInfo> list;
                bbj bbjVar = bbj.this;
                if (z) {
                    list = bbjVar.d.getEnabledAccessibilityServiceList(-1);
                } else {
                    list = mlx.a;
                }
                bbjVar.g = list;
            }
        };
        this.f = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: bay
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                bbj bbjVar = bbj.this;
                bbjVar.g = bbjVar.d.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.g = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.h = new Handler(Looper.getMainLooper());
        this.D = new bbd(this);
        this.i = Integer.MIN_VALUE;
        this.I = new se((byte[]) null);
        this.J = new se((byte[]) null);
        this.j = new tb(null);
        this.k = new tb(null);
        this.l = -1;
        this.E = new rz((byte[]) null);
        this.F = moz.at(1, 0, 6);
        this.n = true;
        this.G = sf.a();
        this.u = new sg((byte[]) null);
        this.v = new sb(null);
        this.w = new sb(null);
        this.p = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.q = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.y = new bso();
        this.x = new se((byte[]) null);
        this.z = new bfi(bawVar.g.a(), sf.a());
        bawVar.addOnAttachStateChangeListener(new bba(this, 0));
        this.s = new Runnable() { // from class: baz
            /* JADX WARN: Code restructure failed: missing block: B:223:0x00e6, code lost:            if (r6 == false) goto L41;     */
            /* JADX WARN: Code restructure failed: missing block: B:308:0x0774, code lost:            r26 = r9;     */
            /* JADX WARN: Code restructure failed: missing block: B:309:0x077e, code lost:            if (((r0 & ((~r0) << 6)) & (-9187201950435737472L)) == 0) goto L259;     */
            /* JADX WARN: Code restructure failed: missing block: B:312:0x0780, code lost:            r0 = -1;     */
            /* JADX WARN: Code restructure failed: missing block: B:365:0x0890, code lost:            r0 = move-exception;     */
            /* JADX WARN: Code restructure failed: missing block: B:367:0x0894, code lost:            throw r0;     */
            /* JADX WARN: Code restructure failed: missing block: B:371:0x089a, code lost:            r0 = move-exception;     */
            /* JADX WARN: Code restructure failed: missing block: B:373:0x089e, code lost:            throw r0;     */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [bbj] */
            /* JADX WARN: Type inference failed for: r14v11 */
            /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r14v31 */
            /* JADX WARN: Type inference failed for: r1v113, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
            /* JADX WARN: Type inference failed for: r3v47, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
            /* JADX WARN: Type inference failed for: r5v49, types: [bfs] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2212
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.baz.run():void");
            }
        };
        this.t = new ArrayList();
        this.H = new zc(this, 19);
    }

    public static final boolean D(bfh bfhVar) {
        boolean z;
        bfn bfnVar = bfj.a;
        bfo bfoVar = (bfo) bej.b(bfhVar.c, bfj.y);
        bfb bfbVar = (bfb) bej.b(bfhVar.c, bfj.q);
        Boolean bool = (Boolean) bej.b(bfhVar.c, bfj.x);
        if (bfoVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (bool != null) {
            bool.booleanValue();
            if (bfbVar == null) {
                return true;
            }
            throw null;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void E(bbj bbjVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        bbjVar.H(i, i2, num, null);
    }

    public static final bfs G(bfe bfeVar) {
        bfn bfnVar = bfj.a;
        return (bfs) bej.b(bfeVar, bfj.v);
    }

    public static final CharSequence I(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
            return charSequence;
        }
        return charSequence;
    }

    public static final bfs J(bfh bfhVar) {
        bfs bfsVar;
        bfs G = G(bfhVar.c);
        bfn bfnVar = bfj.a;
        List list = (List) bej.b(bfhVar.c, bfj.s);
        if (list != null) {
            bfsVar = (bfs) mkm.X(list);
        } else {
            bfsVar = null;
        }
        if (G == null) {
            return bfsVar;
        }
        return G;
    }

    public static final String K(bfh bfhVar) {
        bfs bfsVar;
        if (bfhVar != null) {
            bfn bfnVar = bfj.a;
            if (!bfhVar.c.d(bfj.a)) {
                bfe bfeVar = bfhVar.c;
                bfn bfnVar2 = bfd.a;
                if (bfeVar.d(bfd.h)) {
                    bfsVar = G(bfhVar.c);
                    if (bfsVar == null) {
                        return null;
                    }
                } else {
                    List list = (List) bej.b(bfhVar.c, bfj.s);
                    if (list == null || (bfsVar = (bfs) mkm.X(list)) == null) {
                        return null;
                    }
                }
                return bfsVar.a;
            }
            return beh.d((List) bfhVar.c.a(bfj.a), ",");
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca A[LOOP:1: B:8:0x002f->B:22:0x00ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf A[EDGE_INSN: B:23:0x00cf->B:29:0x00cf BREAK  A[LOOP:1: B:8:0x002f->B:22:0x00ca], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List O(boolean r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbj.O(boolean, java.util.List):java.util.List");
    }

    private final void P(bfh bfhVar, ArrayList arrayList, se seVar) {
        boolean c = bbb.c(bfhVar);
        bfn bfnVar = bfj.a;
        boolean booleanValue = ((Boolean) bfhVar.c.b(bfj.l, ph.u)).booleanValue();
        if (booleanValue || A(bfhVar)) {
            if (se.b(p(), bfhVar.e)) {
                arrayList.add(bfhVar);
            }
            if (booleanValue) {
                seVar.d(bfhVar.e, O(c, new ArrayList(bfhVar.h())));
                return;
            }
        }
        List h = bfhVar.h();
        int size = h.size();
        for (int i = 0; i < size; i++) {
            P((bfh) h.get(i), arrayList, seVar);
        }
    }

    public static final float j(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            if (Math.abs(f) < Math.abs(f2)) {
                return f;
            }
            return f2;
        }
        return 0.0f;
    }

    public final boolean A(bfh bfhVar) {
        String str;
        boolean z;
        bfn bfnVar = bfj.a;
        List list = (List) bej.b(bfhVar.c, bfj.a);
        if (list != null) {
            str = (String) mkm.X(list);
        } else {
            str = null;
        }
        if (str == null && J(bfhVar) == null && r(bfhVar) == null && !D(bfhVar)) {
            z = false;
        } else {
            z = true;
        }
        if (!bfhVar.c.b && (bfhVar.d || !bfhVar.i().isEmpty() || amr.c(bfhVar.b, bas.l) != null || !z)) {
            return false;
        }
        return true;
    }

    public final boolean B() {
        if (!this.d.isEnabled() || !this.d.isTouchExplorationEnabled()) {
            return false;
        }
        return true;
    }

    public final boolean C(bfh bfhVar, int i, int i2, boolean z) {
        String K;
        Integer num;
        Integer num2;
        bfn bfnVar = bfd.a;
        if (bfhVar.c.d(bfd.g) && bbb.b(bfhVar)) {
            return ((Boolean) ((mom) ((bev) bfhVar.c.a(bfd.g)).a).a(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        }
        boolean z2 = false;
        if ((i == i2 && i2 == this.l) || (K = K(bfhVar)) == null) {
            return false;
        }
        if (i < 0 || i != i2 || i2 > K.length()) {
            i = -1;
        }
        this.l = i;
        if (K.length() > 0) {
            z2 = true;
        }
        int m = m(bfhVar.e);
        Integer num3 = null;
        if (z2) {
            num = Integer.valueOf(this.l);
        } else {
            num = null;
        }
        if (z2) {
            num2 = Integer.valueOf(this.l);
        } else {
            num2 = null;
        }
        if (z2) {
            num3 = Integer.valueOf(K.length());
        }
        L(o(m, num, num2, num3, K));
        w(bfhVar.e);
        return true;
    }

    public final void F(boolean z, long j) {
        bfn bfnVar;
        if (amr.i(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            se p = p();
            if (!a.n(j, 9205357640488583168L) && aqk.h(j)) {
                if (z) {
                    bfn bfnVar2 = bfj.a;
                    bfnVar = bfj.p;
                } else {
                    bfn bfnVar3 = bfj.a;
                    bfnVar = bfj.o;
                }
                Object[] objArr = p.c;
                long[] jArr = p.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j2 = jArr[i];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = i - length;
                            int i3 = 0;
                            while (true) {
                                int i4 = 8 - ((~i2) >>> 31);
                                if (i3 < i4) {
                                    if ((255 & j2) < 128) {
                                        bfi bfiVar = (bfi) objArr[(i << 3) + i3];
                                        aql c = arj.c((Rect) bfiVar.b);
                                        if (aqk.b(j) >= c.b && aqk.b(j) < c.d && aqk.c(j) >= c.c && aqk.c(j) < c.e && ((bfc) bej.b(((bfh) bfiVar.a).c, bfnVar)) != null) {
                                            throw null;
                                        }
                                    }
                                    j2 >>= 8;
                                    i3++;
                                } else if (i4 != 8) {
                                    return;
                                }
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void H(int i, int i2, Integer num, List list) {
        if (i != Integer.MIN_VALUE && z()) {
            AccessibilityEvent n = n(i, i2);
            if (num != null) {
                n.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                n.setContentDescription(beh.d(list, ","));
            }
            Trace.beginSection("sendEvent");
            try {
                L(n);
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void L(AccessibilityEvent accessibilityEvent) {
        if (!z()) {
            return;
        }
        if (accessibilityEvent.getEventType() != 2048) {
            accessibilityEvent.getEventType();
        }
        ((Boolean) this.B.a(accessibilityEvent)).booleanValue();
    }

    public final void M(bfh bfhVar, bfi bfiVar) {
        sg sgVar = new sg((byte[]) null);
        List i = bfhVar.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            bfh bfhVar2 = (bfh) i.get(i2);
            if (se.b(p(), bfhVar2.e)) {
                if (!((sg) bfiVar.b).a(bfhVar2.e)) {
                    t(bfhVar.b);
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
                                t(bfhVar.b);
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
            if (se.b(p(), bfhVar3.e)) {
                Object a2 = this.x.a(bfhVar3.e);
                a2.getClass();
                M(bfhVar3, (bfi) a2);
            }
        }
    }

    @Override // defpackage.buk
    public final byq a(View view) {
        return this.D;
    }

    public final int k(bfh bfhVar) {
        bfn bfnVar = bfj.a;
        if (!bfhVar.c.d(bfj.a) && bfhVar.c.d(bfj.w)) {
            return bgl.a(0L);
        }
        return this.l;
    }

    public final int l(bfh bfhVar) {
        bfn bfnVar = bfj.a;
        if (!bfhVar.c.d(bfj.a) && bfhVar.c.d(bfj.w)) {
            return bgl.b(0L);
        }
        return this.l;
    }

    public final int m(int i) {
        if (i == this.b.g.a().e) {
            return -1;
        }
        return i;
    }

    public final AccessibilityEvent n(int i, int i2) {
        bfi bfiVar;
        Trace.beginSection("obtainAccessibilityEvent");
        try {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            Trace.endSection();
            obtain.setEnabled(true);
            obtain.setClassName("android.view.View");
            Trace.beginSection("event.packageName");
            try {
                obtain.setPackageName(this.b.getContext().getPackageName());
                Trace.endSection();
                Trace.beginSection("event.setSource");
                try {
                    obtain.setSource(this.b, i);
                    Trace.endSection();
                    if (z() && (bfiVar = (bfi) p().a(i)) != null) {
                        bfn bfnVar = bfj.a;
                        obtain.setPassword(((bfh) bfiVar.a).c.d(bfj.z));
                    }
                    return obtain;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent n = n(i, 8192);
        if (num != null) {
            n.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            n.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            n.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            n.getText().add(charSequence);
        }
        return n;
    }

    public final se p() {
        Object obj;
        if (this.n) {
            this.n = false;
            Trace.beginSection("generateCurrentSemanticsNodes");
            try {
                se b = bdg.b(this.b.g);
                Trace.endSection();
                this.G = b;
                if (z()) {
                    Trace.beginSection("setTraversalValues");
                    try {
                        this.v.c();
                        this.w.c();
                        bfi bfiVar = (bfi) p().a(-1);
                        if (bfiVar != null) {
                            obj = bfiVar.a;
                        } else {
                            obj = null;
                        }
                        obj.getClass();
                        int i = 1;
                        List O = O(bbb.c((bfh) obj), mkm.Q((bfh) obj));
                        int O2 = mkm.O(O);
                        if (O2 > 0) {
                            while (true) {
                                int i2 = ((bfh) O.get(i - 1)).e;
                                int i3 = ((bfh) O.get(i)).e;
                                this.v.d(i2, i3);
                                this.w.d(i3, i2);
                                if (i == O2) {
                                    break;
                                }
                                i++;
                            }
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
        return this.G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0037, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b7, code lost:            throw r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0163, code lost:            r9.n(r10, 4096);     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0168, code lost:            r12.getClass();     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016b, code lost:            throw null;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ca, code lost:            android.os.Trace.beginSection("GetSemanticsNode");     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cf, code lost:            r13 = new defpackage.mpn();     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dc, code lost:            if (r12.n.j(8) == false) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00de, code lost:            r14 = r12;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e6, code lost:            r13.a = r14;        r14 = (defpackage.ayr) r13.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ec, code lost:            if (r14 == null) goto L70;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ee, code lost:            r14 = r14.u();     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f2, code lost:            if (r14 != null) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f7, code lost:            if (r14.b != false) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f9, code lost:            r10 = defpackage.amr.c((defpackage.ayr) r13.a, defpackage.bas.d);     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0103, code lost:            if (r10 == null) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0105, code lost:            r13.a = r10;     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0107, code lost:            r10 = (defpackage.ayr) r13.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010b, code lost:            if (r10 == null) goto L70;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010d, code lost:            r10 = r10.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x010f, code lost:            android.os.Trace.endSection();     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0116, code lost:            if (r8.d(r10) == false) goto L74;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0118, code lost:            E(r9, r9.m(r10), 2048, 1, 8);     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0126, code lost:            android.os.Trace.endSection();     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e0, code lost:            r14 = defpackage.amr.c(r12, defpackage.bas.e);     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x012a, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012e, code lost:            throw r0;     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #5 {all -> 0x004c, blocks: (B:15:0x01ae, B:16:0x005e, B:21:0x0072, B:23:0x007a, B:107:0x01b4, B:108:0x01b7, B:112:0x0048, B:13:0x0031, B:24:0x0082, B:26:0x0088, B:28:0x008f, B:33:0x012f, B:39:0x016c, B:55:0x0174, B:56:0x0177, B:95:0x0179, B:96:0x017c, B:98:0x017d, B:100:0x0184, B:101:0x018d, B:35:0x0137, B:40:0x013e, B:42:0x014c, B:48:0x0163, B:50:0x016b, B:30:0x009c, B:57:0x00a4, B:59:0x00b2, B:61:0x00b9, B:63:0x00c7, B:66:0x00ca, B:84:0x010f, B:86:0x0118, B:87:0x0126, B:91:0x012b, B:92:0x012e), top: B:7:0x0025, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01aa -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(defpackage.mmx r18) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbj.q(mmx):java.lang.Object");
    }

    public final String r(bfh bfhVar) {
        Collection collection;
        CharSequence charSequence;
        float floatValue;
        int ae;
        bfn bfnVar = bfj.a;
        Object b = bej.b(bfhVar.c, bfj.b);
        bfo bfoVar = (bfo) bej.b(bfhVar.c, bfj.y);
        bfb bfbVar = (bfb) bej.b(bfhVar.c, bfj.q);
        Object obj = null;
        if (bfoVar != null) {
            int ordinal = bfoVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 && b == null) {
                        b = this.b.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else if (bfbVar != null) {
                    throw null;
                }
            } else if (bfbVar != null) {
                throw null;
            }
            bfbVar = null;
        }
        Boolean bool = (Boolean) bej.b(bfhVar.c, bfj.x);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (bfbVar == null) {
                if (b == null) {
                    if (booleanValue) {
                        b = this.b.getContext().getResources().getString(R.string.selected);
                    } else {
                        b = this.b.getContext().getResources().getString(R.string.not_selected);
                    }
                }
            } else {
                throw null;
            }
        }
        bfa bfaVar = (bfa) bej.b(bfhVar.c, bfj.c);
        if (bfaVar != null) {
            if (bfaVar != bfa.a) {
                if (b == null) {
                    mqd mqdVar = bfaVar.b;
                    if (((Number) mqdVar.a()).floatValue() - ((Number) mqdVar.b()).floatValue() == 0.0f) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = (-((Number) mqdVar.b()).floatValue()) / (((Number) mqdVar.a()).floatValue() - ((Number) mqdVar.b()).floatValue());
                    }
                    if (floatValue < 0.0f) {
                        floatValue = 0.0f;
                    }
                    if (floatValue > 1.0f) {
                        floatValue = 1.0f;
                    }
                    if (floatValue == 0.0f) {
                        ae = 0;
                    } else if (floatValue == 1.0f) {
                        ae = 100;
                    } else {
                        ae = moz.ae(Math.round(floatValue * 100.0f), 1, 99);
                    }
                    b = this.b.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(ae));
                }
            } else if (b == null) {
                b = this.b.getContext().getResources().getString(R.string.in_progress);
            }
        }
        bfe bfeVar = bfhVar.c;
        bfn bfnVar2 = bfd.a;
        if (bfeVar.d(bfd.h)) {
            bfe e = bfhVar.f().e();
            Collection collection2 = (Collection) bej.b(e, bfj.a);
            if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) bej.b(e, bfj.s)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) bej.b(e, bfj.v)) == null || charSequence.length() == 0))) {
                obj = this.b.getContext().getResources().getString(R.string.state_empty);
            }
        } else {
            obj = b;
        }
        return (String) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(int r18, defpackage.byn r19, java.lang.String r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbj.s(int, byn, java.lang.String, android.os.Bundle):void");
    }

    public final void t(ayr ayrVar) {
        if (this.E.add(ayrVar)) {
            this.F.j(mlh.a);
        }
    }

    public final void u(bdf bdfVar) {
        if (!bdfVar.y()) {
            return;
        }
        baw bawVar = this.b;
        bawVar.l.d(bdfVar, this.H, new azp(bdfVar, 5));
    }

    public final void v(int i, int i2, String str) {
        AccessibilityEvent n = n(m(i), 32);
        n.setContentChangeTypes(i2);
        if (str != null) {
            n.getText().add(str);
        }
        L(n);
    }

    public final void w(int i) {
        bbe bbeVar = this.o;
        if (bbeVar != null) {
            if (i != bbeVar.a.e) {
                return;
            }
            if (SystemClock.uptimeMillis() - bbeVar.f <= 1000) {
                AccessibilityEvent n = n(m(bbeVar.a.e), 131072);
                n.setFromIndex(bbeVar.d);
                n.setToIndex(bbeVar.e);
                n.setAction(bbeVar.b);
                n.setMovementGranularity(bbeVar.c);
                n.getText().add(K(bbeVar.a));
                L(n);
            }
        }
        this.o = null;
    }

    public final void x(int i) {
        int i2 = this.c;
        if (i2 == i) {
            return;
        }
        this.c = i;
        E(this, i, 128, null, 12);
        E(this, i2, 256, null, 12);
    }

    public final boolean y(int i) {
        if (this.i == i) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        if (this.d.isEnabled() && !this.g.isEmpty()) {
            return true;
        }
        return false;
    }
}
