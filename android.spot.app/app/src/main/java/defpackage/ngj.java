package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngj {
    public Object a;
    public Object b;
    public Object c;
    public final Object d;
    private Object e;

    public ngj(fai faiVar) {
        this.d = faiVar;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, fai] */
    private final void A(int i, int i2, fak fakVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        float f;
        int i7;
        double d;
        double d2;
        float f2 = fakVar.j;
        if (f2 > 0.0f && i3 >= (i5 = fakVar.e)) {
            float f3 = (i3 - i5) / f2;
            fakVar.e = i4 + fakVar.f;
            int i8 = 0;
            if (!z) {
                fakVar.g = Integer.MIN_VALUE;
            }
            boolean z2 = false;
            int i9 = 0;
            float f4 = 0.0f;
            while (i8 < fakVar.h) {
                int i10 = fakVar.o + i8;
                View u = this.d.u(i10);
                if (u != null && u.getVisibility() != 8) {
                    faj fajVar = (faj) u.getLayoutParams();
                    int k = this.d.k();
                    if (k != 0 && k != 1) {
                        int measuredHeight = u.getMeasuredHeight();
                        Object obj = this.e;
                        if (obj != null) {
                            measuredHeight = u(((long[]) obj)[i10]);
                        }
                        int measuredWidth = u.getMeasuredWidth();
                        Object obj2 = this.e;
                        if (obj2 != null) {
                            i6 = i5;
                            measuredWidth = (int) ((long[]) obj2)[i10];
                        } else {
                            i6 = i5;
                        }
                        if (!((boolean[]) this.a)[i10] && fajVar.b() > 0.0f) {
                            float b = measuredHeight + (fajVar.b() * f3);
                            if (i8 == fakVar.h - 1) {
                                b += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(b);
                            if (round > fajVar.j()) {
                                round = fajVar.j();
                                ((boolean[]) this.a)[i10] = true;
                                fakVar.j -= fajVar.b();
                                z2 = true;
                            } else {
                                f4 += b - round;
                                double d3 = f4;
                                if (d3 > 1.0d) {
                                    round++;
                                    d2 = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    d2 = d3 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int x = x(i, fajVar, fakVar.m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            u.measure(x, makeMeasureSpec);
                            measuredWidth = u.getMeasuredWidth();
                            measuredHeight = u.getMeasuredHeight();
                            E(i10, x, makeMeasureSpec, u);
                            this.d.J(i10, u);
                        }
                        i7 = Math.max(i9, measuredWidth + fajVar.g() + fajVar.h() + this.d.i(u));
                        fakVar.e += measuredHeight + fajVar.i() + fajVar.f();
                        f = f3;
                    } else {
                        i6 = i5;
                        int measuredWidth2 = u.getMeasuredWidth();
                        Object obj3 = this.e;
                        if (obj3 != null) {
                            measuredWidth2 = (int) ((long[]) obj3)[i10];
                        }
                        int measuredHeight2 = u.getMeasuredHeight();
                        Object obj4 = this.e;
                        if (obj4 != null) {
                            measuredHeight2 = u(((long[]) obj4)[i10]);
                        }
                        if (!((boolean[]) this.a)[i10]) {
                            if (fajVar.b() > 0.0f) {
                                float b2 = measuredWidth2 + (fajVar.b() * f3);
                                if (i8 == fakVar.h - 1) {
                                    b2 += f4;
                                    f4 = 0.0f;
                                }
                                int round2 = Math.round(b2);
                                if (round2 > fajVar.k()) {
                                    round2 = fajVar.k();
                                    z2 = true;
                                    ((boolean[]) this.a)[i10] = true;
                                    fakVar.j -= fajVar.b();
                                    f = f3;
                                } else {
                                    f4 += b2 - round2;
                                    f = f3;
                                    double d4 = f4;
                                    if (d4 > 1.0d) {
                                        round2++;
                                        d = d4 - 1.0d;
                                    } else if (d4 < -1.0d) {
                                        round2--;
                                        d = d4 + 1.0d;
                                    }
                                    f4 = (float) d;
                                }
                                int w = w(i2, fajVar, fakVar.m);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                u.measure(makeMeasureSpec2, w);
                                int measuredWidth3 = u.getMeasuredWidth();
                                int measuredHeight3 = u.getMeasuredHeight();
                                E(i10, makeMeasureSpec2, w, u);
                                this.d.J(i10, u);
                                measuredWidth2 = measuredWidth3;
                                measuredHeight2 = measuredHeight3;
                            } else {
                                f = f3;
                            }
                        } else {
                            f = f3;
                        }
                        int max = Math.max(i9, measuredHeight2 + fajVar.i() + fajVar.f() + this.d.i(u));
                        fakVar.e += measuredWidth2 + fajVar.g() + fajVar.h();
                        i7 = max;
                    }
                    fakVar.g = Math.max(fakVar.g, i7);
                    i9 = i7;
                } else {
                    i6 = i5;
                    f = f3;
                }
                i8++;
                f3 = f;
                i5 = i6;
            }
            int i11 = i5;
            if (z2 && i11 != fakVar.e) {
                A(i, i2, fakVar, i3, i4, true);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, fai] */
    private final void B(int i, int i2, fak fakVar, int i3, int i4, boolean z) {
        float f;
        int i5;
        fak fakVar2 = fakVar;
        int i6 = fakVar2.e;
        float f2 = fakVar2.k;
        float f3 = 0.0f;
        if (f2 > 0.0f && i3 <= i6) {
            float f4 = (i6 - i3) / f2;
            fakVar2.e = i4 + fakVar2.f;
            int i7 = 0;
            if (!z) {
                fakVar2.g = Integer.MIN_VALUE;
            }
            boolean z2 = false;
            int i8 = 0;
            float f5 = 0.0f;
            while (i7 < fakVar2.h) {
                int i9 = fakVar2.o + i7;
                View u = this.d.u(i9);
                if (u != null && u.getVisibility() != 8) {
                    faj fajVar = (faj) u.getLayoutParams();
                    int k = this.d.k();
                    if (k != 0 && k != 1) {
                        int measuredHeight = u.getMeasuredHeight();
                        Object obj = this.e;
                        if (obj != null) {
                            measuredHeight = u(((long[]) obj)[i9]);
                        }
                        int measuredWidth = u.getMeasuredWidth();
                        Object obj2 = this.e;
                        if (obj2 != null) {
                            measuredWidth = (int) ((long[]) obj2)[i9];
                        }
                        if (!((boolean[]) this.a)[i9] && fajVar.c() > f3) {
                            float c = measuredHeight - (fajVar.c() * f4);
                            if (i7 == fakVar2.h - 1) {
                                c += f5;
                                f5 = 0.0f;
                            }
                            int round = Math.round(c);
                            if (round < fajVar.l()) {
                                round = fajVar.l();
                                ((boolean[]) this.a)[i9] = true;
                                fakVar2.k -= fajVar.c();
                                z2 = true;
                            } else {
                                f5 += c - round;
                                double d = f5;
                                if (d > 1.0d) {
                                    round++;
                                    f5 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f5 += 1.0f;
                                }
                                fakVar2 = fakVar;
                            }
                            int x = x(i, fajVar, fakVar2.m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            u.measure(x, makeMeasureSpec);
                            int measuredWidth2 = u.getMeasuredWidth();
                            int measuredHeight2 = u.getMeasuredHeight();
                            E(i9, x, makeMeasureSpec, u);
                            this.d.J(i9, u);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        i5 = Math.max(i8, measuredWidth + fajVar.g() + fajVar.h() + this.d.i(u));
                        fakVar2.e += measuredHeight + fajVar.i() + fajVar.f();
                        f = f4;
                    } else {
                        int measuredWidth3 = u.getMeasuredWidth();
                        Object obj3 = this.e;
                        if (obj3 != null) {
                            measuredWidth3 = (int) ((long[]) obj3)[i9];
                        }
                        int measuredHeight3 = u.getMeasuredHeight();
                        Object obj4 = this.e;
                        if (obj4 != null) {
                            measuredHeight3 = u(((long[]) obj4)[i9]);
                        }
                        if (!((boolean[]) this.a)[i9]) {
                            if (fajVar.c() > 0.0f) {
                                float c2 = measuredWidth3 - (fajVar.c() * f4);
                                if (i7 == fakVar2.h - 1) {
                                    c2 += f5;
                                    f5 = 0.0f;
                                }
                                int round2 = Math.round(c2);
                                if (round2 < fajVar.m()) {
                                    round2 = fajVar.m();
                                    z2 = true;
                                    ((boolean[]) this.a)[i9] = true;
                                    fakVar2.k -= fajVar.c();
                                    f = f4;
                                } else {
                                    f5 += c2 - round2;
                                    f = f4;
                                    double d2 = f5;
                                    if (d2 > 1.0d) {
                                        round2++;
                                        f5 -= 1.0f;
                                    } else if (d2 < -1.0d) {
                                        round2--;
                                        f5 += 1.0f;
                                    }
                                }
                                int w = w(i2, fajVar, fakVar2.m);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                u.measure(makeMeasureSpec2, w);
                                int measuredWidth4 = u.getMeasuredWidth();
                                int measuredHeight4 = u.getMeasuredHeight();
                                E(i9, makeMeasureSpec2, w, u);
                                this.d.J(i9, u);
                                measuredWidth3 = measuredWidth4;
                                measuredHeight3 = measuredHeight4;
                            } else {
                                f = f4;
                            }
                        } else {
                            f = f4;
                        }
                        int max = Math.max(i8, measuredHeight3 + fajVar.i() + fajVar.f() + this.d.i(u));
                        fakVar2.e += measuredWidth3 + fajVar.g() + fajVar.h();
                        i5 = max;
                    }
                    fakVar2.g = Math.max(fakVar2.g, i5);
                    i8 = i5;
                } else {
                    f = f4;
                }
                i7++;
                f4 = f;
                f3 = 0.0f;
            }
            if (z2 && i6 != fakVar2.e) {
                B(i, i2, fakVar, i3, i4, true);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, fai] */
    private final void C(View view, int i, int i2) {
        int measuredHeight;
        faj fajVar = (faj) view.getLayoutParams();
        int min = Math.min(Math.max(((i - fajVar.g()) - fajVar.h()) - this.d.i(view), fajVar.m()), fajVar.k());
        Object obj = this.e;
        if (obj != null) {
            measuredHeight = u(((long[]) obj)[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        E(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.d.J(i2, view);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, fai] */
    private final void D(View view, int i, int i2) {
        int measuredWidth;
        faj fajVar = (faj) view.getLayoutParams();
        int min = Math.min(Math.max(((i - fajVar.i()) - fajVar.f()) - this.d.i(view), fajVar.l()), fajVar.j());
        Object obj = this.e;
        if (obj != null) {
            measuredWidth = (int) ((long[]) obj)[i2];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        E(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.d.J(i2, view);
    }

    private final void E(int i, int i2, int i3, View view) {
        Object obj = this.c;
        if (obj != null) {
            ((long[]) obj)[i] = t(i2, i3);
        }
        Object obj2 = this.e;
        if (obj2 != null) {
            ((long[]) obj2)[i] = t(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private static final List F(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        fak fakVar = new fak();
        fakVar.g = (i - i2) / 2;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            if (i3 == 0) {
                arrayList.add(fakVar);
                i3 = 0;
            }
            arrayList.add((fak) list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(fakVar);
            }
            i3++;
        }
        return arrayList;
    }

    private static final int G(faj fajVar, boolean z) {
        if (z) {
            return fajVar.f();
        }
        return fajVar.h();
    }

    private static final int H(faj fajVar, boolean z) {
        if (z) {
            return fajVar.h();
        }
        return fajVar.f();
    }

    private static final int I(faj fajVar, boolean z) {
        if (z) {
            return fajVar.i();
        }
        return fajVar.g();
    }

    private static final int J(faj fajVar, boolean z) {
        if (z) {
            return fajVar.g();
        }
        return fajVar.i();
    }

    private static final int K(faj fajVar, boolean z) {
        if (z) {
            return fajVar.e();
        }
        return fajVar.o();
    }

    private static final int L(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private static final boolean M(int i, int i2, fak fakVar) {
        if (i == i2 - 1 && fakVar.a() != 0) {
            return true;
        }
        return false;
    }

    static final long t(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    public static final int u(long j) {
        return (int) (j >> 32);
    }

    public static final int[] v(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            fam famVar = (fam) it.next();
            int i3 = famVar.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, famVar.b);
            i2++;
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, fai] */
    private final int w(int i, faj fajVar, int i2) {
        ?? r0 = this.d;
        int c = this.d.c(i, r0.getPaddingTop() + r0.getPaddingBottom() + fajVar.i() + fajVar.f() + i2, fajVar.e());
        int size = View.MeasureSpec.getSize(c);
        if (size > fajVar.j()) {
            return View.MeasureSpec.makeMeasureSpec(fajVar.j(), View.MeasureSpec.getMode(c));
        }
        if (size < fajVar.l()) {
            return View.MeasureSpec.makeMeasureSpec(fajVar.l(), View.MeasureSpec.getMode(c));
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, fai] */
    private final int x(int i, faj fajVar, int i2) {
        ?? r0 = this.d;
        int g = this.d.g(i, r0.getPaddingLeft() + r0.getPaddingRight() + fajVar.g() + fajVar.h() + i2, fajVar.o());
        int size = View.MeasureSpec.getSize(g);
        if (size > fajVar.k()) {
            return View.MeasureSpec.makeMeasureSpec(fajVar.k(), View.MeasureSpec.getMode(g));
        }
        if (size < fajVar.m()) {
            return View.MeasureSpec.makeMeasureSpec(fajVar.m(), View.MeasureSpec.getMode(g));
        }
        return g;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, fai] */
    private final void y(List list, fak fakVar, int i, int i2) {
        fakVar.m = i2;
        this.d.H(fakVar);
        fakVar.p = i;
        list.add(fakVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, fai] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            faj r0 = (defpackage.faj) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.m()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.m()
        L19:
            r3 = 1
            goto L27
        L1b:
            int r3 = r0.k()
            if (r1 <= r3) goto L26
            int r1 = r0.k()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.l()
            if (r2 >= r5) goto L32
            int r2 = r0.l()
            goto L3e
        L32:
            int r5 = r0.j()
            if (r2 <= r5) goto L3d
            int r2 = r0.j()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.E(r8, r1, r0, r7)
            java.lang.Object r0 = r6.d
            r0.J(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngj.z(android.view.View, int):void");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    public final ngk a() {
        Map unmodifiableMap;
        Object obj = this.a;
        if (obj != null) {
            Object obj2 = this.b;
            ngb m = ((ktf) this.d).m();
            Object obj3 = this.e;
            ?? r3 = this.c;
            byte[] bArr = ngt.a;
            r3.getClass();
            if (r3.isEmpty()) {
                unmodifiableMap = mly.a;
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap((Map) r3));
                unmodifiableMap.getClass();
            }
            return new ngk((ngd) obj, (String) obj2, m, (msz) obj3, unmodifiableMap);
        }
        throw new IllegalStateException("url == null");
    }

    public final void b(String str) {
        ((ktf) this.d).p(str);
    }

    public final void c(String str, String str2) {
        str2.getClass();
        ((ktf) this.d).o(str, str2);
    }

    public final void d(String str, msz mszVar) {
        if (str.length() > 0) {
            if (mszVar == null) {
                if (amr.i(str, "POST") || amr.i(str, "PUT") || amr.i(str, "PATCH") || amr.i(str, "PROPPATCH") || amr.i(str, "REPORT")) {
                    throw new IllegalArgumentException(a.ag(str, "method ", " must have a request body."));
                }
            } else if (!mkm.aZ(str)) {
                throw new IllegalArgumentException(a.ag(str, "method ", " must not have a request body."));
            }
            this.b = str;
            this.e = mszVar;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, fai] */
    public final List e(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            faj fajVar = (faj) this.d.t(i2).getLayoutParams();
            fam famVar = new fam();
            famVar.b = fajVar.n();
            famVar.a = i2;
            arrayList.add(famVar);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0227, code lost:            if (r14 > (r27 + 1)) goto L83;     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0236, code lost:            if (r7 < (r3 + r20)) goto L88;     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r12v49, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r14v42, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, fai] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.fal r31, int r32, int r33, int r34, int r35, int r36, java.util.List r37) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngj.f(fal, int, int, int, int, int, java.util.List):void");
    }

    public final void g(fal falVar, int i, int i2, int i3, int i4, List list) {
        f(falVar, i, i2, i3, i4, -1, list);
    }

    public final void h(fal falVar, int i, int i2, int i3, int i4, List list) {
        f(falVar, i2, i, i3, i4, -1, list);
    }

    public final void i(List list, int i) {
        int i2 = ((int[]) this.b)[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = (int[]) this.b;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.c;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, fai] */
    public final void j(int i, int i2, int i3) {
        int mode;
        int size;
        int round;
        int k = this.d.k();
        if (k != 0 && k != 1) {
            if (k != 2 && k != 3) {
                throw new IllegalArgumentException(a.ae(k, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        } else {
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        }
        ?? r6 = this.d;
        List<fak> v = r6.v();
        if (mode == 1073741824) {
            int r = r6.r() + i3;
            int i4 = 0;
            if (v.size() == 1) {
                ((fak) v.get(0)).g = size - i3;
                return;
            }
            if (v.size() >= 2) {
                ?? r62 = this.d;
                int a = r62.a();
                if (a != 1) {
                    if (a != 2) {
                        if (a != 3) {
                            if (a != 4) {
                                if (a == 5 && r < size) {
                                    float size2 = v.size();
                                    int size3 = v.size();
                                    float f = 0.0f;
                                    while (i4 < size3) {
                                        fak fakVar = (fak) v.get(i4);
                                        float f2 = fakVar.g + ((size - r) / size2);
                                        if (i4 == v.size() - 1) {
                                            f2 += f;
                                            f = 0.0f;
                                        }
                                        int round2 = Math.round(f2);
                                        f += f2 - round2;
                                        if (f > 1.0f) {
                                            round2++;
                                            f -= 1.0f;
                                        } else if (f < -1.0f) {
                                            round2--;
                                            f += 1.0f;
                                        }
                                        fakVar.g = round2;
                                        i4++;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (r >= size) {
                                r62.I(F(v, size, r));
                                return;
                            }
                            int size4 = v.size();
                            int i5 = (size - r) / (size4 + size4);
                            ArrayList arrayList = new ArrayList();
                            fak fakVar2 = new fak();
                            fakVar2.g = i5;
                            for (fak fakVar3 : v) {
                                arrayList.add(fakVar2);
                                arrayList.add(fakVar3);
                                arrayList.add(fakVar2);
                            }
                            this.d.I(arrayList);
                            return;
                        }
                        if (r < size) {
                            int size5 = v.size() - 1;
                            ArrayList arrayList2 = new ArrayList();
                            int size6 = v.size();
                            float f3 = 0.0f;
                            while (i4 < size6) {
                                arrayList2.add((fak) v.get(i4));
                                if (i4 != v.size() - 1) {
                                    fak fakVar4 = new fak();
                                    float f4 = (size - r) / size5;
                                    if (i4 == v.size() - 2) {
                                        int round3 = Math.round(f3 + f4);
                                        fakVar4.g = round3;
                                        round = round3;
                                        f3 = 0.0f;
                                    } else {
                                        round = Math.round(f4);
                                        fakVar4.g = round;
                                    }
                                    f3 += f4 - round;
                                    if (f3 > 1.0f) {
                                        fakVar4.g = round + 1;
                                        f3 -= 1.0f;
                                    } else if (f3 < -1.0f) {
                                        fakVar4.g = round - 1;
                                        f3 += 1.0f;
                                    }
                                    arrayList2.add(fakVar4);
                                }
                                i4++;
                            }
                            this.d.I(arrayList2);
                            return;
                        }
                        return;
                    }
                    r62.I(F(v, size, r));
                    return;
                }
                int i6 = size - r;
                fak fakVar5 = new fak();
                fakVar5.g = i6;
                v.add(0, fakVar5);
            }
        }
    }

    public final void k(int i, int i2) {
        l(i, i2, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, fai] */
    public final void l(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int l = this.d.l();
        Object obj = this.a;
        int i4 = 0;
        if (obj == null) {
            this.a = new boolean[Math.max(l, 10)];
        } else {
            boolean[] zArr = (boolean[]) obj;
            int length = zArr.length;
            if (length < l) {
                this.a = new boolean[Math.max(length + length, l)];
            } else {
                Arrays.fill(zArr, false);
            }
        }
        if (i3 < this.d.l()) {
            ?? r0 = this.d;
            int k = r0.k();
            int k2 = r0.k();
            if (k2 != 0 && k2 != 1) {
                if (k2 != 2 && k2 != 3) {
                    throw new IllegalArgumentException(a.ae(k, "Invalid flex direction: "));
                }
                int mode = View.MeasureSpec.getMode(i2);
                size = View.MeasureSpec.getSize(i2);
                if (mode != 1073741824) {
                    size = this.d.n();
                }
                ?? r02 = this.d;
                paddingLeft = r02.getPaddingTop();
                paddingRight = r02.getPaddingBottom();
            } else {
                int mode2 = View.MeasureSpec.getMode(i);
                size = View.MeasureSpec.getSize(i);
                int n = this.d.n();
                if (mode2 != 1073741824) {
                    size = Math.min(n, size);
                }
                ?? r03 = this.d;
                paddingLeft = r03.getPaddingLeft();
                paddingRight = r03.getPaddingRight();
            }
            int i5 = paddingLeft + paddingRight;
            Object obj2 = this.b;
            if (obj2 != null) {
                i4 = ((int[]) obj2)[i3];
            }
            List v = this.d.v();
            int size2 = v.size();
            while (i4 < size2) {
                fak fakVar = (fak) v.get(i4);
                if (fakVar.e < size) {
                    A(i, i2, fakVar, size, i5, false);
                } else {
                    B(i, i2, fakVar, size, i5, false);
                }
                i4++;
            }
        }
    }

    public final void m(int i) {
        Object obj = this.b;
        if (obj == null) {
            this.b = new int[Math.max(i, 10)];
            return;
        }
        int length = ((int[]) obj).length;
        if (length < i) {
            this.b = Arrays.copyOf((int[]) this.b, Math.max(length + length, i));
        }
    }

    public final void n(int i) {
        Object obj = this.c;
        if (obj == null) {
            this.c = new long[Math.max(i, 10)];
            return;
        }
        int length = ((long[]) obj).length;
        if (length < i) {
            this.c = Arrays.copyOf((long[]) this.c, Math.max(length + length, i));
        }
    }

    public final void o(int i) {
        Object obj = this.e;
        if (obj == null) {
            this.e = new long[Math.max(i, 10)];
            return;
        }
        int length = ((long[]) obj).length;
        if (length < i) {
            this.e = Arrays.copyOf((long[]) this.e, Math.max(length + length, i));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, fai] */
    public final void p(View view, fak fakVar, int i, int i2, int i3, int i4) {
        faj fajVar = (faj) view.getLayoutParams();
        int b = this.d.b();
        if (fajVar.d() != -1) {
            b = fajVar.d();
        }
        int i5 = fakVar.g;
        if (b != 0 && b != 4) {
            if (b == 3) {
                if (this.d.m() != 2) {
                    int max = Math.max(fakVar.l - view.getBaseline(), fajVar.i());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((fakVar.l - view.getMeasuredHeight()) + view.getBaseline(), fajVar.f());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            }
            if (b == 1) {
                if (this.d.m() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - fajVar.f(), i3, i6 - fajVar.f());
                    return;
                } else {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + fajVar.i(), i3, (i4 - i5) + view.getMeasuredHeight() + fajVar.i());
                    return;
                }
            }
            if (b == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + fajVar.i()) - fajVar.f()) / 2;
                if (this.d.m() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            return;
        }
        if (this.d.m() != 2) {
            view.layout(i, i2 + fajVar.i(), i3, i4 + fajVar.i());
        } else {
            view.layout(i, i2 - fajVar.f(), i3, i4 - fajVar.f());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, fai] */
    public final void q(View view, fak fakVar, boolean z, int i, int i2, int i3, int i4) {
        faj fajVar = (faj) view.getLayoutParams();
        int b = this.d.b();
        if (fajVar.d() != -1) {
            b = fajVar.d();
        }
        int i5 = fakVar.g;
        if (b != 0 && b != 4 && b != 3) {
            if (b == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - fajVar.h(), i2, ((i3 + i5) - view.getMeasuredWidth()) - fajVar.h(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + fajVar.g(), i2, (i3 - i5) + view.getMeasuredWidth() + fajVar.g(), i4);
                    return;
                }
            }
            if (b == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd()) / 2;
                if (!z) {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                } else {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                }
            }
            return;
        }
        if (!z) {
            view.layout(i + fajVar.g(), i2, i3 + fajVar.g(), i4);
        } else {
            view.layout(i - fajVar.h(), i2, i3 - fajVar.h(), i4);
        }
    }

    public final void r() {
        s(0);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, fai] */
    public final void s(int i) {
        int i2;
        View u;
        if (i < this.d.l()) {
            ?? r2 = this.d;
            int k = r2.k();
            if (r2.b() == 4) {
                Object obj = this.b;
                if (obj != null) {
                    i2 = ((int[]) obj)[i];
                } else {
                    i2 = 0;
                }
                List v = r2.v();
                int size = v.size();
                while (i2 < size) {
                    fak fakVar = (fak) v.get(i2);
                    int i3 = fakVar.h;
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = fakVar.o + i4;
                        if (i4 < this.d.l() && (u = this.d.u(i5)) != null && u.getVisibility() != 8) {
                            faj fajVar = (faj) u.getLayoutParams();
                            if (fajVar.d() == -1 || fajVar.d() == 4) {
                                if (k != 0 && k != 1) {
                                    if (k != 2 && k != 3) {
                                        throw new IllegalArgumentException(a.ae(k, "Invalid flex direction: "));
                                    }
                                    C(u, fakVar.g, i5);
                                } else {
                                    D(u, fakVar.g, i5);
                                }
                            }
                        }
                    }
                    i2++;
                }
                return;
            }
            for (fak fakVar2 : r2.v()) {
                for (Integer num : fakVar2.n) {
                    View u2 = this.d.u(num.intValue());
                    if (k != 0 && k != 1) {
                        if (k != 2 && k != 3) {
                            throw new IllegalArgumentException(a.ae(k, "Invalid flex direction: "));
                        }
                        C(u2, fakVar2.g, num.intValue());
                    } else {
                        D(u2, fakVar2.g, num.intValue());
                    }
                }
            }
        }
    }

    public ngj() {
        this.c = new LinkedHashMap();
        this.b = "GET";
        this.d = new ktf((byte[]) null, (byte[]) null);
    }

    public ngj(ngk ngkVar) {
        LinkedHashMap linkedHashMap;
        this.c = new LinkedHashMap();
        this.a = ngkVar.a;
        this.b = ngkVar.b;
        this.e = ngkVar.f;
        if (ngkVar.d.isEmpty()) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(ngkVar.d);
        }
        this.c = linkedHashMap;
        this.d = ngkVar.c.e();
    }
}
