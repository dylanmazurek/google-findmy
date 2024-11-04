package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.bym;
import defpackage.byn;
import defpackage.ij;
import defpackage.km;
import defpackage.lg;
import defpackage.lq;
import defpackage.lr;
import defpackage.ls;
import defpackage.lw;
import defpackage.mc;
import defpackage.md;
import defpackage.me;
import defpackage.mr;
import defpackage.ms;
import defpackage.mu;
import defpackage.mv;
import defpackage.mw;
import defpackage.w;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends lr implements mc {
    private int[] J;
    mw[] a;
    public lg b;
    lg c;
    private int i;
    private int j;
    private int k;
    private final km l;
    private BitSet m;
    private boolean o;
    private boolean p;
    private mv q;
    public boolean d = false;
    boolean e = false;
    int f = -1;
    int g = Integer.MIN_VALUE;
    mu h = new mu();
    private int n = 2;
    private final Rect G = new Rect();
    private final mr H = new mr(this);
    private boolean I = true;
    private final Runnable K = new w(this, 18, null);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        lq at = at(context, attributeSet, i, i2);
        int i3 = at.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        P(null);
        if (i3 != this.j) {
            this.j = i3;
            lg lgVar = this.b;
            this.b = this.c;
            this.c = lgVar;
            aQ();
        }
        int i4 = at.b;
        P(null);
        if (i4 != this.i) {
            this.h.a();
            aQ();
            this.i = i4;
            this.m = new BitSet(i4);
            this.a = new mw[this.i];
            for (int i5 = 0; i5 < this.i; i5++) {
                this.a[i5] = new mw(this, i5);
            }
            aQ();
        }
        I(at.c);
        this.l = new km();
        this.b = lg.p(this, this.j);
        this.c = lg.p(this, 1 - this.j);
    }

    private final int Q(int i) {
        boolean z;
        if (an() == 0) {
            if (!this.e) {
                return -1;
            }
            return 1;
        }
        if (i >= c()) {
            z = false;
        } else {
            z = true;
        }
        if (z != this.e) {
            return -1;
        }
        return 1;
    }

    private final int R(me meVar) {
        if (an() == 0) {
            return 0;
        }
        return ij.c(meVar, this.b, r(!this.I), l(!this.I), this, this.I);
    }

    private final int V(me meVar) {
        if (an() == 0) {
            return 0;
        }
        return ij.d(meVar, this.b, r(!this.I), l(!this.I), this, this.I, this.e);
    }

    private final int W(me meVar) {
        if (an() == 0) {
            return 0;
        }
        return ij.e(meVar, this.b, r(!this.I), l(!this.I), this, this.I);
    }

    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int, boolean] */
    private final int aa(lw lwVar, km kmVar, me meVar) {
        int i;
        int j;
        int ac;
        int i2;
        boolean z;
        mw mwVar;
        ?? r5;
        int f;
        int b;
        int j2;
        int b2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        this.m.set(0, this.i, true);
        if (this.l.i) {
            if (kmVar.e == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (kmVar.e == 1) {
            i = kmVar.g + kmVar.b;
        } else {
            i = kmVar.f - kmVar.b;
        }
        int i8 = kmVar.e;
        for (int i9 = 0; i9 < this.i; i9++) {
            if (!this.a[i9].a.isEmpty()) {
                bA(this.a[i9], i8, i);
            }
        }
        if (this.e) {
            j = this.b.f();
        } else {
            j = this.b.j();
        }
        boolean z2 = false;
        while (kmVar.a(meVar) && (this.l.i || !this.m.isEmpty())) {
            View b3 = lwVar.b(kmVar.c);
            kmVar.c += kmVar.d;
            ms msVar = (ms) b3.getLayoutParams();
            int cB = msVar.cB();
            int[] iArr = this.h.a;
            if (iArr != null && cB < iArr.length) {
                i2 = iArr[cB];
            } else {
                i2 = -1;
            }
            if (i2 == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                boolean z3 = msVar.b;
                if (bB(kmVar.e)) {
                    i4 = this.i - 1;
                    i3 = -1;
                    i5 = -1;
                } else {
                    i3 = this.i;
                    i4 = 0;
                    i5 = 1;
                }
                mw mwVar2 = null;
                if (kmVar.e == 1) {
                    int j3 = this.b.j();
                    int i10 = Integer.MAX_VALUE;
                    while (i4 != i3) {
                        mw mwVar3 = this.a[i4];
                        int d = mwVar3.d(j3);
                        if (d < i10) {
                            i7 = d;
                        } else {
                            i7 = i10;
                        }
                        if (d < i10) {
                            mwVar2 = mwVar3;
                        }
                        i4 += i5;
                        i10 = i7;
                    }
                } else {
                    int f2 = this.b.f();
                    int i11 = Integer.MIN_VALUE;
                    while (i4 != i3) {
                        mw mwVar4 = this.a[i4];
                        int f3 = mwVar4.f(f2);
                        if (f3 > i11) {
                            i6 = f3;
                        } else {
                            i6 = i11;
                        }
                        if (f3 > i11) {
                            mwVar2 = mwVar4;
                        }
                        i4 += i5;
                        i11 = i6;
                    }
                }
                mwVar = mwVar2;
                mu muVar = this.h;
                muVar.b(cB);
                muVar.a[cB] = mwVar.e;
            } else {
                mwVar = this.a[i2];
            }
            msVar.a = mwVar;
            if (kmVar.e == 1) {
                az(b3);
                r5 = 0;
            } else {
                r5 = 0;
                aA(b3, 0);
            }
            boolean z4 = msVar.b;
            if (this.j == 1) {
                bC(b3, ao(this.k, this.A, r5, msVar.width, r5), ao(this.D, this.B, getPaddingTop() + getPaddingBottom(), msVar.height, true));
            } else {
                bC(b3, ao(this.C, this.A, getPaddingLeft() + getPaddingRight(), msVar.width, true), ao(this.k, this.B, 0, msVar.height, false));
            }
            if (kmVar.e == 1) {
                boolean z5 = msVar.b;
                b = mwVar.d(j);
                f = this.b.b(b3) + b;
                if (z) {
                    boolean z6 = msVar.b;
                }
            } else {
                boolean z7 = msVar.b;
                f = mwVar.f(j);
                b = f - this.b.b(b3);
                if (z) {
                    boolean z8 = msVar.b;
                }
            }
            boolean z9 = msVar.b;
            if (kmVar.e == 1) {
                mw mwVar5 = msVar.a;
                ms n = mw.n(b3);
                n.a = mwVar5;
                mwVar5.a.add(b3);
                mwVar5.c = Integer.MIN_VALUE;
                if (mwVar5.a.size() == 1) {
                    mwVar5.b = Integer.MIN_VALUE;
                }
                if (n.cD() || n.cC()) {
                    mwVar5.d += mwVar5.f.b.b(b3);
                }
            } else {
                mw mwVar6 = msVar.a;
                ms n2 = mw.n(b3);
                n2.a = mwVar6;
                mwVar6.a.add(0, b3);
                mwVar6.b = Integer.MIN_VALUE;
                if (mwVar6.a.size() == 1) {
                    mwVar6.c = Integer.MIN_VALUE;
                }
                if (n2.cD() || n2.cC()) {
                    mwVar6.d += mwVar6.f.b.b(b3);
                }
            }
            if (N() && this.j == 1) {
                boolean z10 = msVar.b;
                b2 = this.c.f() - (((this.i - 1) - mwVar.e) * this.k);
                j2 = b2 - this.c.b(b3);
            } else {
                boolean z11 = msVar.b;
                j2 = this.c.j() + (mwVar.e * this.k);
                b2 = this.c.b(b3) + j2;
            }
            if (this.j == 1) {
                bi(b3, j2, b, b2, f);
            } else {
                bi(b3, b, j2, f, b2);
            }
            boolean z12 = msVar.b;
            bA(mwVar, this.l.e, i);
            bu(lwVar, this.l);
            if (this.l.h && b3.hasFocusable()) {
                boolean z13 = msVar.b;
                this.m.set(mwVar.e, false);
            }
            z2 = true;
        }
        if (!z2) {
            bu(lwVar, this.l);
        }
        if (this.l.e == -1) {
            ac = this.b.j() - ag(this.b.j());
        } else {
            ac = ac(this.b.f()) - this.b.f();
        }
        if (ac > 0) {
            return Math.min(kmVar.b, ac);
        }
        return 0;
    }

    private final int ac(int i) {
        int d = this.a[0].d(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int d2 = this.a[i2].d(i);
            if (d2 > d) {
                d = d2;
            }
        }
        return d;
    }

    private final int ag(int i) {
        int f = this.a[0].f(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int f2 = this.a[i2].f(i);
            if (f2 < f) {
                f = f2;
            }
        }
        return f;
    }

    private final void ah(lw lwVar, me meVar, boolean z) {
        int f;
        int i;
        int ac = ac(Integer.MIN_VALUE);
        if (ac != Integer.MIN_VALUE && (f = this.b.f() - ac) > 0) {
            int i2 = -k(-f, lwVar, meVar);
            if (z && (i = f - i2) > 0) {
                this.b.n(i);
            }
        }
    }

    private final void ai(lw lwVar, me meVar, boolean z) {
        int j;
        int ag = ag(Integer.MAX_VALUE);
        if (ag != Integer.MAX_VALUE && (j = ag - this.b.j()) > 0) {
            int k = j - k(j, lwVar, meVar);
            if (z && k > 0) {
                this.b.n(-k);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ak(int r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r10.e
            if (r0 == 0) goto L9
            int r0 = r10.i()
            goto Ld
        L9:
            int r0 = r10.c()
        Ld:
            r1 = 8
            if (r13 != r1) goto L1a
            if (r11 >= r12) goto L16
            int r2 = r12 + 1
            goto L1c
        L16:
            int r2 = r11 + 1
            r3 = r12
            goto L1d
        L1a:
            int r2 = r11 + r12
        L1c:
            r3 = r11
        L1d:
            mu r4 = r10.h
            int[] r5 = r4.a
            r6 = 1
            if (r5 != 0) goto L26
            goto L93
        L26:
            int r5 = r5.length
            if (r3 >= r5) goto L93
            java.util.List r5 = r4.b
            r7 = -1
            if (r5 != 0) goto L30
        L2e:
            r5 = -1
            goto L7a
        L30:
            int r5 = r5.size()
            int r5 = r5 + r7
        L35:
            if (r5 < 0) goto L47
            java.util.List r8 = r4.b
            java.lang.Object r8 = r8.get(r5)
            mt r8 = (defpackage.mt) r8
            int r9 = r8.a
            if (r9 != r3) goto L44
            goto L48
        L44:
            int r5 = r5 + (-1)
            goto L35
        L47:
            r8 = 0
        L48:
            if (r8 == 0) goto L4f
            java.util.List r5 = r4.b
            r5.remove(r8)
        L4f:
            java.util.List r5 = r4.b
            int r5 = r5.size()
            r8 = 0
        L56:
            if (r8 >= r5) goto L68
            java.util.List r9 = r4.b
            java.lang.Object r9 = r9.get(r8)
            mt r9 = (defpackage.mt) r9
            int r9 = r9.a
            if (r9 < r3) goto L65
            goto L69
        L65:
            int r8 = r8 + 1
            goto L56
        L68:
            r8 = -1
        L69:
            if (r8 == r7) goto L2e
            java.util.List r5 = r4.b
            java.lang.Object r5 = r5.get(r8)
            mt r5 = (defpackage.mt) r5
            java.util.List r9 = r4.b
            r9.remove(r8)
            int r5 = r5.a
        L7a:
            if (r5 != r7) goto L86
            int[] r5 = r4.a
            int r8 = r5.length
            java.util.Arrays.fill(r5, r3, r8, r7)
            int[] r4 = r4.a
            int r4 = r4.length
            goto L93
        L86:
            int r5 = r5 + r6
            int[] r8 = r4.a
            int r8 = r8.length
            int r5 = java.lang.Math.min(r5, r8)
            int[] r4 = r4.a
            java.util.Arrays.fill(r4, r3, r5, r7)
        L93:
            if (r13 == r6) goto Lac
            r4 = 2
            if (r13 == r4) goto La6
            if (r13 == r1) goto L9b
            goto Lb1
        L9b:
            mu r13 = r10.h
            r13.d(r11, r6)
            mu r11 = r10.h
            r11.c(r12, r6)
            goto Lb1
        La6:
            mu r13 = r10.h
            r13.d(r11, r12)
            goto Lb1
        Lac:
            mu r13 = r10.h
            r13.c(r11, r12)
        Lb1:
            if (r2 > r0) goto Lb4
            goto Lc6
        Lb4:
            boolean r11 = r10.e
            if (r11 == 0) goto Lbd
            int r11 = r10.c()
            goto Lc1
        Lbd:
            int r11 = r10.i()
        Lc1:
            if (r3 > r11) goto Lc6
            r10.aQ()
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ak(int, int, int):void");
    }

    private final void bA(mw mwVar, int i, int i2) {
        int i3 = mwVar.d;
        if (i == -1) {
            if (mwVar.e() + i3 <= i2) {
                this.m.set(mwVar.e, false);
            }
        } else if (mwVar.c() - i3 >= i2) {
            this.m.set(mwVar.e, false);
        }
    }

    private final boolean bB(int i) {
        boolean z;
        boolean z2;
        int i2 = this.j;
        if (i != -1) {
            z = false;
        } else {
            z = true;
        }
        if (i2 == 0) {
            if (z == this.e) {
                return false;
            }
            return true;
        }
        if (z != this.e) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 != N()) {
            return false;
        }
        return true;
    }

    private final void bC(View view, int i, int i2) {
        aB(view, this.G);
        ms msVar = (ms) view.getLayoutParams();
        int bD = bD(i, msVar.leftMargin + this.G.left, msVar.rightMargin + this.G.right);
        int bD2 = bD(i2, msVar.topMargin + this.G.top, msVar.bottomMargin + this.G.bottom);
        if (aZ(view, bD, bD2, msVar)) {
            view.measure(bD, bD2);
        }
    }

    private static final int bD(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 != 0) {
                i2 = 0;
            }
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                mode = 1073741824;
            }
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x03d6, code lost:            if (K() != false) goto L504;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bt(defpackage.lw r12, defpackage.me r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.bt(lw, me, boolean):void");
    }

    private final void bu(lw lwVar, km kmVar) {
        int min;
        int min2;
        if (kmVar.a && !kmVar.i) {
            if (kmVar.b == 0) {
                if (kmVar.e == -1) {
                    bv(lwVar, kmVar.g);
                    return;
                } else {
                    bw(lwVar, kmVar.f);
                    return;
                }
            }
            int i = 1;
            if (kmVar.e == -1) {
                int i2 = kmVar.f;
                int f = this.a[0].f(i2);
                while (i < this.i) {
                    int f2 = this.a[i].f(i2);
                    if (f2 > f) {
                        f = f2;
                    }
                    i++;
                }
                int i3 = i2 - f;
                if (i3 < 0) {
                    min2 = kmVar.g;
                } else {
                    min2 = kmVar.g - Math.min(i3, kmVar.b);
                }
                bv(lwVar, min2);
                return;
            }
            int i4 = kmVar.g;
            int d = this.a[0].d(i4);
            while (i < this.i) {
                int d2 = this.a[i].d(i4);
                if (d2 < d) {
                    d = d2;
                }
                i++;
            }
            int i5 = d - kmVar.g;
            if (i5 < 0) {
                min = kmVar.f;
            } else {
                min = Math.min(i5, kmVar.b) + kmVar.f;
            }
            bw(lwVar, min);
        }
    }

    private final void bv(lw lwVar, int i) {
        int an = an();
        while (true) {
            an--;
            if (an >= 0) {
                View av = av(an);
                if (this.b.d(av) >= i && this.b.m(av) >= i) {
                    ms msVar = (ms) av.getLayoutParams();
                    boolean z = msVar.b;
                    if (msVar.a.a.size() != 1) {
                        mw mwVar = msVar.a;
                        int size = mwVar.a.size();
                        View view = (View) mwVar.a.remove(size - 1);
                        ms n = mw.n(view);
                        n.a = null;
                        if (n.cD() || n.cC()) {
                            mwVar.d -= mwVar.f.b.b(view);
                        }
                        if (size == 1) {
                            mwVar.b = Integer.MIN_VALUE;
                        }
                        mwVar.c = Integer.MIN_VALUE;
                        aN(av, lwVar);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void bw(lw lwVar, int i) {
        while (an() > 0) {
            View av = av(0);
            if (this.b.a(av) <= i && this.b.l(av) <= i) {
                ms msVar = (ms) av.getLayoutParams();
                boolean z = msVar.b;
                if (msVar.a.a.size() != 1) {
                    mw mwVar = msVar.a;
                    View view = (View) mwVar.a.remove(0);
                    ms n = mw.n(view);
                    n.a = null;
                    if (mwVar.a.size() == 0) {
                        mwVar.c = Integer.MIN_VALUE;
                    }
                    if (n.cD() || n.cC()) {
                        mwVar.d -= mwVar.f.b.b(view);
                    }
                    mwVar.b = Integer.MIN_VALUE;
                    aN(av, lwVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void bx() {
        boolean z;
        if (this.j != 1 && N()) {
            z = !this.d;
        } else {
            z = this.d;
        }
        this.e = z;
    }

    private final void by(int i) {
        boolean z;
        km kmVar = this.l;
        kmVar.e = i;
        boolean z2 = this.e;
        int i2 = 1;
        if (i != -1) {
            z = false;
        } else {
            z = true;
        }
        if (z2 != z) {
            i2 = -1;
        }
        kmVar.d = i2;
    }

    private final void bz(int i, me meVar) {
        int i2;
        int i3;
        RecyclerView recyclerView;
        int i4;
        boolean z;
        km kmVar = this.l;
        boolean z2 = false;
        kmVar.b = 0;
        kmVar.c = i;
        if (aX() && (i4 = meVar.a) != -1) {
            boolean z3 = this.e;
            if (i4 >= i) {
                z = false;
            } else {
                z = true;
            }
            if (z3 == z) {
                i2 = this.b.k();
            } else {
                i3 = this.b.k();
                i2 = 0;
                recyclerView = this.s;
                if (recyclerView == null && recyclerView.i) {
                    this.l.f = this.b.j() - i3;
                    this.l.g = this.b.f() + i2;
                } else {
                    this.l.g = this.b.e() + i2;
                    this.l.f = -i3;
                }
                km kmVar2 = this.l;
                kmVar2.h = false;
                kmVar2.a = true;
                if (this.b.h() == 0 && this.b.e() == 0) {
                    z2 = true;
                }
                kmVar2.i = z2;
            }
        } else {
            i2 = 0;
        }
        i3 = 0;
        recyclerView = this.s;
        if (recyclerView == null) {
        }
        this.l.g = this.b.e() + i2;
        this.l.f = -i3;
        km kmVar22 = this.l;
        kmVar22.h = false;
        kmVar22.a = true;
        if (this.b.h() == 0) {
            z2 = true;
        }
        kmVar22.i = z2;
    }

    @Override // defpackage.lr
    public final void A(int i, int i2) {
        ak(i, i2, 4);
    }

    @Override // defpackage.lr
    public final int B(me meVar) {
        return R(meVar);
    }

    @Override // defpackage.lr
    public final int C(me meVar) {
        return V(meVar);
    }

    @Override // defpackage.lr
    public final int D(me meVar) {
        return W(meVar);
    }

    @Override // defpackage.lr
    public final int E(me meVar) {
        return R(meVar);
    }

    @Override // defpackage.lr
    public final int F(me meVar) {
        return V(meVar);
    }

    @Override // defpackage.lr
    public final int G(me meVar) {
        return W(meVar);
    }

    final void H(int i, me meVar) {
        int c;
        int i2;
        if (i > 0) {
            c = i();
            i2 = 1;
        } else {
            c = c();
            i2 = -1;
        }
        this.l.a = true;
        bz(c, meVar);
        by(i2);
        km kmVar = this.l;
        kmVar.c = c + kmVar.d;
        kmVar.b = Math.abs(i);
    }

    public final void I(boolean z) {
        P(null);
        mv mvVar = this.q;
        if (mvVar != null && mvVar.h != z) {
            mvVar.h = z;
        }
        this.d = z;
        aQ();
    }

    final void J(int i) {
        this.k = i / this.i;
        View.MeasureSpec.makeMeasureSpec(i, this.c.h());
    }

    public final boolean K() {
        int c;
        if (an() != 0 && this.n != 0 && this.v) {
            if (this.e) {
                c = i();
                c();
            } else {
                c = c();
                i();
            }
            if (c == 0 && v() != null) {
                this.h.a();
                this.u = true;
                aQ();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.mc
    public final PointF L(int i) {
        int Q = Q(i);
        PointF pointF = new PointF();
        if (Q == 0) {
            return null;
        }
        float f = Q;
        if (this.j == 0) {
            pointF.x = f;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = f;
        }
        return pointF;
    }

    @Override // defpackage.lr
    public final Parcelable M() {
        int c;
        View r;
        int f;
        int j;
        int[] iArr;
        mv mvVar = this.q;
        if (mvVar != null) {
            return new mv(mvVar);
        }
        mv mvVar2 = new mv();
        mvVar2.h = this.d;
        mvVar2.i = this.o;
        mvVar2.j = this.p;
        mu muVar = this.h;
        if (muVar != null && (iArr = muVar.a) != null) {
            mvVar2.f = iArr;
            mvVar2.e = mvVar2.f.length;
            mvVar2.g = muVar.b;
        } else {
            mvVar2.e = 0;
        }
        int i = -1;
        if (an() > 0) {
            if (this.o) {
                c = i();
            } else {
                c = c();
            }
            mvVar2.a = c;
            if (this.e) {
                r = l(true);
            } else {
                r = r(true);
            }
            if (r != null) {
                i = be(r);
            }
            mvVar2.b = i;
            int i2 = this.i;
            mvVar2.c = i2;
            mvVar2.d = new int[i2];
            for (int i3 = 0; i3 < this.i; i3++) {
                if (this.o) {
                    f = this.a[i3].d(Integer.MIN_VALUE);
                    if (f != Integer.MIN_VALUE) {
                        j = this.b.f();
                        f -= j;
                        mvVar2.d[i3] = f;
                    } else {
                        mvVar2.d[i3] = f;
                    }
                } else {
                    f = this.a[i3].f(Integer.MIN_VALUE);
                    if (f != Integer.MIN_VALUE) {
                        j = this.b.j();
                        f -= j;
                        mvVar2.d[i3] = f;
                    } else {
                        mvVar2.d[i3] = f;
                    }
                }
            }
        } else {
            mvVar2.a = -1;
            mvVar2.b = -1;
            mvVar2.c = 0;
        }
        return mvVar2;
    }

    final boolean N() {
        if (aq() == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lr
    public final void P(String str) {
        if (this.q == null) {
            super.P(str);
        }
    }

    @Override // defpackage.lr
    public final void S(AccessibilityEvent accessibilityEvent) {
        super.S(accessibilityEvent);
        if (an() > 0) {
            View r = r(false);
            View l = l(false);
            if (r != null && l != null) {
                int be = be(r);
                int be2 = be(l);
                if (be < be2) {
                    accessibilityEvent.setFromIndex(be);
                    accessibilityEvent.setToIndex(be2);
                } else {
                    accessibilityEvent.setFromIndex(be2);
                    accessibilityEvent.setToIndex(be);
                }
            }
        }
    }

    @Override // defpackage.lr
    public final void T(Parcelable parcelable) {
        if (parcelable instanceof mv) {
            mv mvVar = (mv) parcelable;
            this.q = mvVar;
            if (this.f != -1) {
                mvVar.a();
                this.q.b();
            }
            aQ();
        }
    }

    @Override // defpackage.lr
    public final void U(int i) {
        mv mvVar = this.q;
        if (mvVar != null && mvVar.a != i) {
            mvVar.a();
        }
        this.f = i;
        this.g = Integer.MIN_VALUE;
        aQ();
    }

    @Override // defpackage.lr
    public final boolean X() {
        if (this.j == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lr
    public final boolean Y() {
        if (this.j == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lr
    public final boolean Z() {
        if (this.n != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lr
    public final void aF(int i) {
        super.aF(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.lr
    public final void aG(int i) {
        super.aG(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.lr
    public final void aJ(int i) {
        if (i == 0) {
            K();
        }
    }

    @Override // defpackage.lr
    public final boolean ab() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:            if (r5.length < r4.i) goto L52;     */
    @Override // defpackage.lr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ae(int r5, int r6, defpackage.me r7, defpackage.kh r8) {
        /*
            r4 = this;
            r0 = 1
            int r1 = r4.j
            if (r0 != r1) goto L6
            r5 = r6
        L6:
            int r6 = r4.an()
            if (r6 == 0) goto L7a
            if (r5 != 0) goto Lf
            goto L7a
        Lf:
            r4.H(r5, r7)
            int[] r5 = r4.J
            r6 = 0
            if (r5 == 0) goto L1c
            int r0 = r4.i
            int r5 = r5.length
            if (r5 >= r0) goto L22
        L1c:
            int r5 = r4.i
            int[] r5 = new int[r5]
            r4.J = r5
        L22:
            r5 = 0
            r0 = 0
        L24:
            int r1 = r4.i
            if (r5 >= r1) goto L54
            km r1 = r4.l
            int r2 = r1.d
            r3 = -1
            if (r2 != r3) goto L3a
            int r1 = r1.f
            mw[] r2 = r4.a
            r2 = r2[r5]
            int r2 = r2.f(r1)
            goto L48
        L3a:
            mw[] r2 = r4.a
            r2 = r2[r5]
            int r1 = r1.g
            int r1 = r2.d(r1)
            km r2 = r4.l
            int r2 = r2.g
        L48:
            int r1 = r1 - r2
            if (r1 < 0) goto L51
            int[] r2 = r4.J
            r2[r0] = r1
            int r0 = r0 + 1
        L51:
            int r5 = r5 + 1
            goto L24
        L54:
            int[] r5 = r4.J
            java.util.Arrays.sort(r5, r6, r0)
        L59:
            if (r6 >= r0) goto L7a
            km r5 = r4.l
            boolean r5 = r5.a(r7)
            if (r5 == 0) goto L7a
            km r5 = r4.l
            int r5 = r5.c
            int[] r1 = r4.J
            r1 = r1[r6]
            r8.a(r5, r1)
            km r5 = r4.l
            int r1 = r5.c
            int r2 = r5.d
            int r1 = r1 + r2
            r5.c = r1
            int r6 = r6 + 1
            goto L59
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ae(int, int, me, kh):void");
    }

    @Override // defpackage.lr
    public final void aj(RecyclerView recyclerView) {
        bm(this.K);
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.lr
    public final void al(RecyclerView recyclerView, int i) {
        md mdVar = new md(recyclerView.getContext());
        mdVar.b = i;
        aW(mdVar);
    }

    @Override // defpackage.lr
    public final void bj() {
        this.h.a();
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
    }

    final int c() {
        if (an() == 0) {
            return 0;
        }
        return be(av(0));
    }

    @Override // defpackage.lr
    public final int cE(lw lwVar, me meVar) {
        if (this.j == 1) {
            return Math.min(this.i, meVar.a());
        }
        return -1;
    }

    @Override // defpackage.lr
    public final int cF(lw lwVar, me meVar) {
        if (this.j == 0) {
            return Math.min(this.i, meVar.a());
        }
        return -1;
    }

    @Override // defpackage.lr
    public final ls cG(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ms((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ms(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x003a, code lost:            if (r8.j == 1) goto L175;     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x003f, code lost:            if (r8.j == 0) goto L175;     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x004c, code lost:            if (N() == false) goto L169;     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0059, code lost:            if (N() == false) goto L175;     */
    @Override // defpackage.lr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View cH(android.view.View r9, int r10, defpackage.lw r11, defpackage.me r12) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.cH(android.view.View, int, lw, me):android.view.View");
    }

    @Override // defpackage.lr
    public final void cI(lw lwVar, me meVar, byn bynVar) {
        super.cI(lwVar, meVar, bynVar);
        bynVar.t("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override // defpackage.lr
    public final void cJ(lw lwVar, me meVar, View view, byn bynVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ms)) {
            super.aI(view, bynVar);
            return;
        }
        ms msVar = (ms) layoutParams;
        if (this.j == 0) {
            int d = msVar.d();
            boolean z = msVar.b;
            bynVar.w(bym.a(d, 1, -1, -1, false));
        } else {
            int d2 = msVar.d();
            boolean z2 = msVar.b;
            bynVar.w(bym.a(-1, -1, d2, 1, false));
        }
    }

    @Override // defpackage.lr
    public final void cK(Rect rect, int i, int i2) {
        int am;
        int am2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j == 1) {
            am2 = am(i2, rect.height() + paddingTop, ar());
            am = am(i, (this.k * this.i) + paddingLeft, as());
        } else {
            am = am(i, rect.width() + paddingLeft, as());
            am2 = am(i2, (this.k * this.i) + paddingTop, ar());
        }
        aT(am, am2);
    }

    @Override // defpackage.lr
    public final boolean cM() {
        if (this.q == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lr
    public final void cN() {
        this.h.a();
        aQ();
    }

    @Override // defpackage.lr
    public final int d(int i, lw lwVar, me meVar) {
        return k(i, lwVar, meVar);
    }

    @Override // defpackage.lr
    public final int e(int i, lw lwVar, me meVar) {
        return k(i, lwVar, meVar);
    }

    @Override // defpackage.lr
    public final ls f() {
        if (this.j == 0) {
            return new ms(-2, -1);
        }
        return new ms(-1, -2);
    }

    @Override // defpackage.lr
    public final ls h(Context context, AttributeSet attributeSet) {
        return new ms(context, attributeSet);
    }

    final int i() {
        int an = an();
        if (an == 0) {
            return 0;
        }
        return be(av(an - 1));
    }

    final int k(int i, lw lwVar, me meVar) {
        if (an() == 0 || i == 0) {
            return 0;
        }
        H(i, meVar);
        int aa = aa(lwVar, this.l, meVar);
        if (this.l.b >= aa) {
            if (i < 0) {
                i = -aa;
            } else {
                i = aa;
            }
        }
        this.b.n(-i);
        this.o = this.e;
        km kmVar = this.l;
        kmVar.b = 0;
        bu(lwVar, kmVar);
        return i;
    }

    final View l(boolean z) {
        int j = this.b.j();
        int f = this.b.f();
        View view = null;
        for (int an = an() - 1; an >= 0; an--) {
            View av = av(an);
            int d = this.b.d(av);
            int a = this.b.a(av);
            if (a > j && d < f) {
                if (a > f && z) {
                    if (view == null) {
                        view = av;
                    }
                } else {
                    return av;
                }
            }
        }
        return view;
    }

    @Override // defpackage.lr
    public final void o(lw lwVar, me meVar) {
        bt(lwVar, meVar, true);
    }

    @Override // defpackage.lr
    public final void p(me meVar) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.q = null;
        this.H.a();
    }

    final View r(boolean z) {
        int j = this.b.j();
        int f = this.b.f();
        int an = an();
        View view = null;
        for (int i = 0; i < an; i++) {
            View av = av(i);
            int d = this.b.d(av);
            if (this.b.a(av) > j && d < f) {
                if (d < j && z) {
                    if (view == null) {
                        view = av;
                    }
                } else {
                    return av;
                }
            }
        }
        return view;
    }

    @Override // defpackage.lr
    public final boolean s(ls lsVar) {
        return lsVar instanceof ms;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.view.View v() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.v():android.view.View");
    }

    @Override // defpackage.lr
    public final void w(int i, int i2) {
        ak(i, i2, 1);
    }

    @Override // defpackage.lr
    public final void y(int i, int i2) {
        ak(i, i2, 8);
    }

    @Override // defpackage.lr
    public final void z(int i, int i2) {
        ak(i, i2, 2);
    }
}
