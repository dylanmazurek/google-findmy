package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.a;
import defpackage.atk;
import defpackage.byi;
import defpackage.bym;
import defpackage.byn;
import defpackage.kh;
import defpackage.kl;
import defpackage.kp;
import defpackage.kr;
import defpackage.lj;
import defpackage.ls;
import defpackage.lw;
import defpackage.me;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set G = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    private int H;
    boolean a;
    int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    final Rect g;
    int h;
    int i;
    final atk j;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        atk atkVar = new atk((byte[]) null, (byte[]) null);
        this.j = atkVar;
        this.g = new Rect();
        this.H = -1;
        this.h = -1;
        this.i = -1;
        int i3 = at(context, attributeSet, i, i2).b;
        if (i3 == this.b) {
            return;
        }
        this.a = true;
        if (i3 > 0) {
            this.b = i3;
            atkVar.o();
            aQ();
            return;
        }
        throw new IllegalArgumentException(a.ae(i3, "Span count should be at least 1. Provided "));
    }

    private final Set bA(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.s;
        int bx = bx(recyclerView.e, recyclerView.M, i2);
        for (int i3 = i; i3 < i + bx; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    private final void bB(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        int i4 = i3 + 1;
        if (iArr == null || (length = iArr.length) != i4 || iArr[length - 1] != i) {
            iArr = new int[i4];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i / i3;
        int i7 = i % i3;
        int i8 = 0;
        for (int i9 = 1; i9 <= i3; i9++) {
            i5 += i7;
            if (i5 > 0 && i3 - i5 < i7) {
                i2 = i6 + 1;
                i5 -= i3;
            } else {
                i2 = i6;
            }
            i8 += i2;
            iArr[i9] = i8;
        }
        this.c = iArr;
    }

    private final void bC() {
        View[] viewArr = this.d;
        if (viewArr != null) {
            if (viewArr.length == this.b) {
                return;
            }
        }
        this.d = new View[this.b];
    }

    private final void bD(View view, int i, boolean z) {
        int i2;
        int i3;
        kl klVar = (kl) view.getLayoutParams();
        Rect rect = klVar.d;
        int i4 = rect.top + rect.bottom + klVar.topMargin + klVar.bottomMargin;
        int i5 = rect.left + rect.right + klVar.leftMargin + klVar.rightMargin;
        int c = c(klVar.a, klVar.b);
        if (this.k == 1) {
            i3 = ao(c, i, i5, klVar.width, false);
            i2 = ao(this.l.k(), this.B, i4, klVar.height, true);
        } else {
            int ao = ao(c, i, i4, klVar.height, false);
            int ao2 = ao(this.l.k(), this.A, i5, klVar.width, true);
            i2 = ao;
            i3 = ao2;
        }
        bE(view, i3, i2, z);
    }

    private final void bE(View view, int i, int i2, boolean z) {
        boolean aZ;
        ls lsVar = (ls) view.getLayoutParams();
        if (z) {
            aZ = true;
            if (this.w && a.j(view.getMeasuredWidth(), i, lsVar.width) && a.j(view.getMeasuredHeight(), i2, lsVar.height)) {
                aZ = false;
            }
        } else {
            aZ = aZ(view, i, i2, lsVar);
        }
        if (aZ) {
            view.measure(i, i2);
        }
    }

    private final void bF() {
        int paddingBottom;
        int paddingTop;
        if (this.k == 1) {
            paddingBottom = this.C - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.D - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        bB(paddingBottom - paddingTop);
    }

    private final int bt(int i) {
        if (this.k == 0) {
            RecyclerView recyclerView = this.s;
            return bv(recyclerView.e, recyclerView.M, i);
        }
        RecyclerView recyclerView2 = this.s;
        return bw(recyclerView2.e, recyclerView2.M, i);
    }

    private final int bu(int i) {
        if (this.k == 1) {
            RecyclerView recyclerView = this.s;
            return bv(recyclerView.e, recyclerView.M, i);
        }
        RecyclerView recyclerView2 = this.s;
        return bw(recyclerView2.e, recyclerView2.M, i);
    }

    private final int bv(lw lwVar, me meVar, int i) {
        if (meVar.g) {
            int a = lwVar.a(i);
            if (a != -1) {
                i = a;
            } else {
                Log.w("GridLayoutManager", a.ae(i, "Cannot find span size for pre layout position. "));
                return 0;
            }
        }
        int i2 = this.b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3++;
            if (i4 >= i) {
                break;
            }
            if (i3 == i2) {
                i5++;
                i3 = 0;
            } else if (i3 > i2) {
                i5++;
                i3 = 1;
            }
            i4++;
        }
        if (i3 > i2) {
            return i5 + 1;
        }
        return i5;
    }

    private final int bw(lw lwVar, me meVar, int i) {
        if (!meVar.g) {
            return i % this.b;
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = lwVar.a(i);
        if (a == -1) {
            Log.w("GridLayoutManager", a.ae(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
            return 0;
        }
        return a % this.b;
    }

    private final int bx(lw lwVar, me meVar, int i) {
        if (!meVar.g) {
            return 1;
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (lwVar.a(i) == -1) {
            Log.w("GridLayoutManager", a.ae(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        }
        return 1;
    }

    private final Set by(int i) {
        return bA(bt(i), i);
    }

    private final Set bz(int i) {
        return bA(bu(i), i);
    }

    @Override // defpackage.lr
    public final void A(int i, int i2) {
        this.j.o();
        this.j.n();
    }

    final int c(int i, int i2) {
        if (this.k == 1 && aa()) {
            int[] iArr = this.c;
            int i3 = this.b - i;
            return iArr[i3] - iArr[i3 - i2];
        }
        int[] iArr2 = this.c;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // defpackage.lr
    public final int cE(lw lwVar, me meVar) {
        if (this.k == 1) {
            return Math.min(this.b, ap());
        }
        if (meVar.a() <= 0) {
            return 0;
        }
        return bv(lwVar, meVar, meVar.a() - 1) + 1;
    }

    @Override // defpackage.lr
    public final int cF(lw lwVar, me meVar) {
        if (this.k == 0) {
            return Math.min(this.b, ap());
        }
        if (meVar.a() <= 0) {
            return 0;
        }
        return bv(lwVar, meVar, meVar.a() - 1) + 1;
    }

    @Override // defpackage.lr
    public final ls cG(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new kl((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new kl(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:            if (r13 == r10) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ed, code lost:            if (r13 == r4) goto L69;     */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View cH(android.view.View r23, int r24, defpackage.lw r25, defpackage.me r26) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.cH(android.view.View, int, lw, me):android.view.View");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lr
    public final void cI(lw lwVar, me meVar, byn bynVar) {
        super.cI(lwVar, meVar, bynVar);
        bynVar.t(GridView.class.getName());
        lj ljVar = this.s.l;
        if (ljVar != null && ljVar.a() > 1) {
            bynVar.j(byi.l);
        }
    }

    @Override // defpackage.lr
    public final void cJ(lw lwVar, me meVar, View view, byn bynVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof kl)) {
            super.aI(view, bynVar);
            return;
        }
        kl klVar = (kl) layoutParams;
        int bv = bv(lwVar, meVar, klVar.cB());
        if (this.k == 0) {
            bynVar.w(bym.a(klVar.a, klVar.b, bv, 1, false));
        } else {
            bynVar.w(bym.a(bv, 1, klVar.a, klVar.b, false));
        }
    }

    @Override // defpackage.lr
    public final void cK(Rect rect, int i, int i2) {
        int am;
        int am2;
        if (this.c == null) {
            super.cK(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.k == 1) {
            am2 = am(i2, rect.height() + paddingTop, ar());
            am = am(i, this.c[r7.length - 1] + paddingLeft, as());
        } else {
            am = am(i, rect.width() + paddingLeft, as());
            am2 = am(i2, this.c[r5.length - 1] + paddingTop, ar());
        }
        aT(am, am2);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cL(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.cL(int, android.os.Bundle):boolean");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lr
    public final boolean cM() {
        if (this.p == null && !this.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lr
    public final void cN() {
        this.j.o();
        this.j.n();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lr
    public final int d(int i, lw lwVar, me meVar) {
        bF();
        bC();
        return super.d(i, lwVar, meVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lr
    public final int e(int i, lw lwVar, me meVar) {
        bF();
        bC();
        return super.e(i, lwVar, meVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lr
    public final ls f() {
        if (this.k == 0) {
            return new kl(-2, -1);
        }
        return new kl(-1, -2);
    }

    @Override // defpackage.lr
    public final ls h(Context context, AttributeSet attributeSet) {
        return new kl(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View i(lw lwVar, me meVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int an = an();
        if (z2) {
            i = -1;
            i2 = an() - 1;
            i3 = -1;
        } else {
            i = an;
            i2 = 0;
            i3 = 1;
        }
        int a = meVar.a();
        R();
        int j = this.l.j();
        int f = this.l.f();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View av = av(i2);
            int be = be(av);
            if (be >= 0 && be < a && bw(lwVar, meVar, be) == 0) {
                if (((ls) av.getLayoutParams()).cD()) {
                    if (view2 == null) {
                        view2 = av;
                    }
                } else {
                    if (this.l.d(av) < f && this.l.a(av) >= j) {
                        return av;
                    }
                    if (view == null) {
                        view = av;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0219, code lost:            r1 = getPaddingTop() + r18.c[r6.a];        r12 = r1;        r1 = r18.l.c(r5) + r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x024b, code lost:            java.util.Arrays.fill(r18.d, (java.lang.Object) null);     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0251, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b7, code lost:            r12 = r21.b;        r1 = r12 + r7;        r2 = 0;        r3 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c1, code lost:            if (r21.f != (-1)) goto L84;     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c3, code lost:            r12 = r21.b;        r2 = r12 - r7;        r3 = r12;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d0, code lost:            r1 = 0;        r12 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ca, code lost:            r12 = r21.b;        r3 = r12 + r7;        r2 = r12;     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x009b, code lost:            r12 = r13 - 1;        r14 = -1;        r15 = -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:            if (r11 != 1) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:            r14 = r13;        r12 = 0;        r15 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:            r8 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:            if (r12 == r14) goto L111;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:            r7 = r18.d[r12];        r9 = (defpackage.kl) r7.getLayoutParams();        r7 = bx(r19, r20, be(r7));        r9.b = r7;        r9.a = r8;        r8 = r8 + r7;        r12 = r12 + r15;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:            r1 = 0.0f;        r2 = 0;        r7 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:            if (r2 >= r13) goto L112;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:            r8 = r18.d[r2];     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:            if (r21.l != null) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:            if (r11 != 1) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:            az(r8);        r12 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:            aB(r8, r18.g);        bD(r8, r5, r12);        r9 = r18.l.b(r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:            if (r9 <= r7) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:            r7 = r9;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:            r8 = r18.l.c(r8) / ((defpackage.kl) r8.getLayoutParams()).b;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0107, code lost:            if (r8 <= r1) goto L114;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0109, code lost:            r1 = r8;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:            r2 = r2 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:            r12 = false;        aA(r8, 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:            r12 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:            if (r11 != 1) goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:            ax(r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:            ay(r8, 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010d, code lost:            if (r10 == false) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010f, code lost:            bB(java.lang.Math.max(java.lang.Math.round(r1 * r18.b), r6));        r7 = 0;        r12 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:            if (r12 >= r13) goto L115;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:            r1 = r18.d[r12];        bD(r1, 1073741824, true);        r1 = r18.l.b(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0133, code lost:            if (r1 <= r7) goto L117;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0135, code lost:            r7 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:            r12 = r12 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0139, code lost:            r12 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013a, code lost:            if (r12 >= r13) goto L118;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013c, code lost:            r1 = r18.d[r12];     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0146, code lost:            if (r18.l.b(r1) == r7) goto L73;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0148, code lost:            r2 = (defpackage.kl) r1.getLayoutParams();        r5 = r2.d;        r6 = ((r5.top + r5.bottom) + r2.topMargin) + r2.bottomMargin;        r8 = ((r5.left + r5.right) + r2.leftMargin) + r2.rightMargin;        r5 = c(r2.a, r2.b);     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0171, code lost:            if (r18.k != 1) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0173, code lost:            r2 = ao(r5, 1073741824, r8, r2.width, false);        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r6, 1073741824);     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0193, code lost:            bE(r1, r2, r5, true);     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019b, code lost:            r12 = r12 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0183, code lost:            r8 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r8, 1073741824);        r5 = ao(r5, 1073741824, r6, r2.height, false);        r2 = r8;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019e, code lost:            r22.a = r7;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:            if (r18.k != 1) goto L81;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a9, code lost:            if (r21.f != (-1)) goto L80;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ab, code lost:            r12 = r21.b;        r2 = 0;        r3 = 0;        r12 = r12 - r7;        r1 = r12;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d2, code lost:            r7 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d3, code lost:            if (r7 >= r13) goto L121;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d5, code lost:            r5 = r18.d[r7];        r6 = (defpackage.kl) r5.getLayoutParams();     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e2, code lost:            if (r18.k != 1) goto L94;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e8, code lost:            if (aa() == false) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ea, code lost:            r2 = getPaddingLeft() + r18.c[r18.b - r6.a];        r3 = r2;        r2 = r2 - r18.l.c(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x022d, code lost:            bi(r5, r2, r12, r3, r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0234, code lost:            if (r6.cD() != false) goto L99;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x023a, code lost:            if (r6.cC() == false) goto L123;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023f, code lost:            r22.d = r5.hasFocusable() | r22.d;        r7 = r7 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023c, code lost:            r22.c = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0206, code lost:            r2 = getPaddingLeft() + r18.c[r6.a];        r3 = r18.l.c(r5) + r2;     */
    @Override // android.support.v7.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.lw r19, defpackage.me r20, defpackage.kr r21, defpackage.kq r22) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.k(lw, me, kr, kq):void");
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void l(lw lwVar, me meVar, kp kpVar, int i) {
        bF();
        if (meVar.a() > 0 && !meVar.g) {
            int bw = bw(lwVar, meVar, kpVar.b);
            if (i == 1) {
                while (bw > 0) {
                    int i2 = kpVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    kpVar.b = i3;
                    bw = bw(lwVar, meVar, i3);
                }
            } else {
                int a = meVar.a() - 1;
                int i4 = kpVar.b;
                while (i4 < a) {
                    int i5 = i4 + 1;
                    int bw2 = bw(lwVar, meVar, i5);
                    if (bw2 <= bw) {
                        break;
                    }
                    i4 = i5;
                    bw = bw2;
                }
                kpVar.b = i4;
            }
        }
        bC();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lr
    public final void o(lw lwVar, me meVar) {
        if (meVar.g) {
            int an = an();
            for (int i = 0; i < an; i++) {
                kl klVar = (kl) av(i).getLayoutParams();
                int cB = klVar.cB();
                this.e.put(cB, klVar.b);
                this.f.put(cB, klVar.a);
            }
        }
        super.o(lwVar, meVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lr
    public final void p(me meVar) {
        View O;
        super.p(meVar);
        this.a = false;
        int i = this.H;
        if (i != -1 && (O = O(i)) != null) {
            O.sendAccessibilityEvent(67108864);
            this.H = -1;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void r(boolean z) {
        if (!z) {
            super.r(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // defpackage.lr
    public final boolean s(ls lsVar) {
        return lsVar instanceof kl;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void v(me meVar, kr krVar, kh khVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && krVar.d(meVar) && i > 0; i2++) {
            khVar.a(krVar.d, Math.max(0, krVar.g));
            i--;
            krVar.d += krVar.e;
        }
    }

    @Override // defpackage.lr
    public final void w(int i, int i2) {
        this.j.o();
        this.j.n();
    }

    @Override // defpackage.lr
    public final void y(int i, int i2) {
        this.j.o();
        this.j.n();
    }

    @Override // defpackage.lr
    public final void z(int i, int i2) {
        this.j.o();
        this.j.n();
    }
}
