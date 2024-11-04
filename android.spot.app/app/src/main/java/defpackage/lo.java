package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lo {
    private static TimeInterpolator o;
    boolean a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public njz m;
    private final ArrayList n;

    public lo(byte[] bArr) {
        this.m = null;
        this.n = new ArrayList();
        this.a = true;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    public static final ln c(mh mhVar) {
        ln lnVar = new ln();
        lnVar.a(mhVar);
        return lnVar;
    }

    public static void k(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((mh) list.get(size)).b.animate().cancel();
            } else {
                return;
            }
        }
    }

    public static void l(mh mhVar) {
        int i = mhVar.k;
        if (!mhVar.q() && (i & 4) == 0) {
            int i2 = mhVar.e;
            mhVar.a();
        }
    }

    private final void m(List list, mh mhVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                jt jtVar = (jt) list.get(size);
                if (o(jtVar, mhVar) && jtVar.a == null && jtVar.b == null) {
                    list.remove(jtVar);
                }
            } else {
                return;
            }
        }
    }

    private final void n(jt jtVar) {
        mh mhVar = jtVar.a;
        if (mhVar != null) {
            o(jtVar, mhVar);
        }
        mh mhVar2 = jtVar.b;
        if (mhVar2 != null) {
            o(jtVar, mhVar2);
        }
    }

    private final boolean o(jt jtVar, mh mhVar) {
        if (jtVar.b == mhVar) {
            jtVar.b = null;
        } else if (jtVar.a == mhVar) {
            jtVar.a = null;
        } else {
            return false;
        }
        mhVar.b.setAlpha(1.0f);
        mhVar.b.setTranslationX(0.0f);
        mhVar.b.setTranslationY(0.0f);
        a(mhVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.mh r9) {
        /*
            r8 = this;
            njz r0 = r8.m
            if (r0 == 0) goto L9d
            r1 = 1
            r9.k(r1)
            mh r2 = r9.i
            r3 = 0
            if (r2 == 0) goto L13
            mh r2 = r9.j
            if (r2 != 0) goto L13
            r9.i = r3
        L13:
            r9.j = r3
            int r2 = r9.k
            r2 = r2 & 16
            if (r2 == 0) goto L1d
            goto L9d
        L1d:
            android.view.View r2 = r9.b
            java.lang.Object r3 = r0.a
            android.support.v7.widget.RecyclerView r3 = (android.support.v7.widget.RecyclerView) r3
            r3.Y()
            jm r4 = r3.h
            int r5 = r4.c
            r6 = 0
            if (r5 != r1) goto L3b
            android.view.View r1 = r4.d
            if (r1 != r2) goto L33
        L31:
            r1 = 0
            goto L6a
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r9.<init>(r0)
            throw r9
        L3b:
            r7 = 2
            if (r5 == r7) goto L95
            r4.c = r7     // Catch: java.lang.Throwable -> L91
            njz r5 = r4.e     // Catch: java.lang.Throwable -> L91
            int r5 = r5.D(r2)     // Catch: java.lang.Throwable -> L91
            r7 = -1
            if (r5 != r7) goto L4f
            r4.l(r2)     // Catch: java.lang.Throwable -> L91
            r4.c = r6
            goto L6a
        L4f:
            jl r7 = r4.a     // Catch: java.lang.Throwable -> L91
            boolean r7 = r7.f(r5)     // Catch: java.lang.Throwable -> L91
            if (r7 == 0) goto L67
            jl r7 = r4.a     // Catch: java.lang.Throwable -> L91
            r7.g(r5)     // Catch: java.lang.Throwable -> L91
            r4.l(r2)     // Catch: java.lang.Throwable -> L91
            njz r7 = r4.e     // Catch: java.lang.Throwable -> L91
            r7.G(r5)     // Catch: java.lang.Throwable -> L91
            r4.c = r6
            goto L6a
        L67:
            r4.c = r6
            goto L31
        L6a:
            if (r1 == 0) goto L7a
            mh r2 = android.support.v7.widget.RecyclerView.h(r2)
            lw r4 = r3.e
            r4.m(r2)
            lw r4 = r3.e
            r4.k(r2)
        L7a:
            r2 = r1 ^ 1
            r3.Z(r2)
            if (r1 != 0) goto L9d
            boolean r1 = r9.u()
            if (r1 == 0) goto L9d
            java.lang.Object r0 = r0.a
            android.view.View r9 = r9.b
            android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
            r0.removeDetachedView(r9, r6)
            return
        L91:
            r9 = move-exception
            r4.c = r6
            throw r9
        L95:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r9.<init>(r0)
            throw r9
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo.a(mh):void");
    }

    public final void b() {
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            ((lm) this.n.get(i)).a();
        }
        this.n.clear();
    }

    public final boolean d(mh mhVar, mh mhVar2, ln lnVar, ln lnVar2) {
        int i;
        int i2;
        int i3 = lnVar.a;
        int i4 = lnVar.b;
        if (mhVar2.x()) {
            int i5 = lnVar.a;
            i2 = lnVar.b;
            i = i5;
        } else {
            i = lnVar2.a;
            i2 = lnVar2.b;
        }
        if (mhVar == mhVar2) {
            return i(mhVar, i3, i4, i, i2);
        }
        float translationX = mhVar.b.getTranslationX();
        float translationY = mhVar.b.getTranslationY();
        float alpha = mhVar.b.getAlpha();
        h(mhVar);
        float f = (i - i3) - translationX;
        float f2 = (i2 - i4) - translationY;
        mhVar.b.setTranslationX(translationX);
        mhVar.b.setTranslationY(translationY);
        mhVar.b.setAlpha(alpha);
        if (mhVar2 != null) {
            h(mhVar2);
            mhVar2.b.setTranslationX(-((int) f));
            mhVar2.b.setTranslationY(-((int) f2));
            mhVar2.b.setAlpha(0.0f);
        }
        this.e.add(new jt(mhVar, mhVar2, i3, i4, i, i2));
        return true;
    }

    public final void e() {
        if (!j()) {
            b();
        }
    }

    public final void f(mh mhVar) {
        View view = mhVar.b;
        view.animate().cancel();
        int size = this.d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ju) this.d.get(size)).a == mhVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                a(mhVar);
                this.d.remove(size);
            }
        }
        m(this.e, mhVar);
        if (this.b.remove(mhVar)) {
            view.setAlpha(1.0f);
            a(mhVar);
        }
        if (this.c.remove(mhVar)) {
            view.setAlpha(1.0f);
            a(mhVar);
        }
        int size2 = this.h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.h.get(size2);
            m(arrayList, mhVar);
            if (arrayList.isEmpty()) {
                this.h.remove(size2);
            }
        }
        int size3 = this.g.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.g.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((ju) arrayList2.get(size4)).a == mhVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    a(mhVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.g.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = (ArrayList) this.f.get(size5);
                if (arrayList3.remove(mhVar)) {
                    view.setAlpha(1.0f);
                    a(mhVar);
                    if (arrayList3.isEmpty()) {
                        this.f.remove(size5);
                    }
                }
            } else {
                this.k.remove(mhVar);
                this.i.remove(mhVar);
                this.l.remove(mhVar);
                this.j.remove(mhVar);
                e();
                return;
            }
        }
    }

    public final void g() {
        int size = this.d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ju juVar = (ju) this.d.get(size);
            View view = juVar.a.b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            a(juVar.a);
            this.d.remove(size);
        }
        int size2 = this.b.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            a((mh) this.b.get(size2));
            this.b.remove(size2);
        }
        int size3 = this.c.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            mh mhVar = (mh) this.c.get(size3);
            mhVar.b.setAlpha(1.0f);
            a(mhVar);
            this.c.remove(size3);
        }
        int size4 = this.e.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                n((jt) this.e.get(size4));
            }
        }
        this.e.clear();
        if (!j()) {
            return;
        }
        int size5 = this.g.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.g.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    ju juVar2 = (ju) arrayList.get(size6);
                    View view2 = juVar2.a.b;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    a(juVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.g.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.f.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    mh mhVar2 = (mh) arrayList2.get(size8);
                    mhVar2.b.setAlpha(1.0f);
                    a(mhVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.h.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList arrayList3 = (ArrayList) this.h.get(size9);
                int size10 = arrayList3.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        n((jt) arrayList3.get(size10));
                        if (arrayList3.isEmpty()) {
                            this.h.remove(arrayList3);
                        }
                    }
                }
            } else {
                k(this.k);
                k(this.j);
                k(this.i);
                k(this.l);
                b();
                return;
            }
        }
    }

    public final void h(mh mhVar) {
        if (o == null) {
            o = new ValueAnimator().getInterpolator();
        }
        mhVar.b.animate().setInterpolator(o);
        f(mhVar);
    }

    public final boolean i(mh mhVar, int i, int i2, int i3, int i4) {
        View view = mhVar.b;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) mhVar.b.getTranslationY();
        h(mhVar);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                a(mhVar);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.d.add(new ju(mhVar, i5, i7, i3, i4));
        return true;
    }

    public final boolean j() {
        if (this.c.isEmpty() && this.e.isEmpty() && this.d.isEmpty() && this.b.isEmpty() && this.j.isEmpty() && this.k.isEmpty() && this.i.isEmpty() && this.l.isEmpty() && this.g.isEmpty() && this.f.isEmpty() && this.h.isEmpty()) {
            return false;
        }
        return true;
    }

    public lo() {
        this.m = null;
        this.n = new ArrayList();
    }
}
