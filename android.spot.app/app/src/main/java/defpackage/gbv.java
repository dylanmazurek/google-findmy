package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbv implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener {
    private static final jnk i = jnk.l("com/google/android/libraries/logging/ve/ViewNode");
    public final View a;
    public final gbo b;
    public ViewGroup d;
    public final gel f;
    public final ddg h;
    private gbo j;
    private final ViewTreeObserver.OnDrawListener o;
    private boolean k = false;
    public boolean c = false;
    private boolean l = false;
    public gbo e = null;
    private int p = 2;
    private final Rect m = new Rect();
    public Runnable g = null;
    private boolean n = false;

    public gbv(View view, gbo gboVar) {
        this.a = view;
        this.b = gboVar;
        this.h = gboVar.f;
        ljj ljjVar = gboVar.c;
        nqe nqeVar = gej.a;
        ljk ljkVar = (ljk) ljjVar.b;
        ljkVar.h(nqeVar);
        Object k = ljkVar.l.k((ljm) nqeVar.d);
        if (k == null) {
            k = nqeVar.a;
        } else {
            nqeVar.h(k);
        }
        gel gelVar = (gel) k;
        this.f = gelVar;
        int w = a.w(gelVar.a);
        if (w != 0 && w == 3) {
            this.o = new ViewTreeObserver.OnDrawListener() { // from class: gbu
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    gbv gbvVar = gbv.this;
                    if (gbvVar.d.isDirty() && gbvVar.g == null) {
                        gbvVar.g = new eta(gbvVar, 20);
                        ijs.d(gbvVar.g, gbvVar.f.b);
                    }
                }
            };
        } else {
            this.o = null;
        }
    }

    public static View a(gbo gboVar) {
        gbv gbvVar = gboVar.b;
        if (gbvVar instanceof gbv) {
            return gbvVar.a;
        }
        return null;
    }

    public static gbo b(View view) {
        return (gbo) view.getTag(R.id.ve_tag);
    }

    public static boolean f(View view) {
        if (view.getId() == 16908290) {
            return true;
        }
        return false;
    }

    public static void g(View view, gcd gcdVar) {
        gbo b = b(view);
        if (b != null) {
            gbv gbvVar = b.b;
            if (gbvVar instanceof gbv) {
                gbo gboVar = gbvVar.j;
                if (gbvVar.l) {
                    return;
                }
            }
            gcdVar.a(b);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                g(viewGroup.getChildAt(i2), gcdVar);
            }
        }
    }

    private final void j() {
        Runnable runnable = this.g;
        if (runnable != null) {
            ijs.f(runnable);
            this.g = null;
        }
    }

    private final void k() {
        int w;
        j();
        int w2 = a.w(this.f.a);
        if (w2 != 0 && w2 == 3) {
            this.a.getViewTreeObserver().removeOnDrawListener(this.o);
        }
        if (this.d == null || ((w = a.w(this.f.a)) != 0 && w == 2)) {
            this.a.removeOnLayoutChangeListener(this);
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
            this.d = null;
        }
    }

    private final void l() {
        int w;
        hwx.U(this.k);
        if (this.l) {
            ViewGroup viewGroup = (ViewGroup) this.a.getRootView().findViewById(android.R.id.content);
            viewGroup.getClass();
            this.d = viewGroup;
        } else {
            this.d = (ViewGroup) this.a.getParent();
        }
        ViewGroup viewGroup2 = this.d;
        if (viewGroup2 != null) {
            viewGroup2.addOnLayoutChangeListener(this);
        }
        if (this.d == null || ((w = a.w(this.f.a)) != 0 && w == 2)) {
            this.a.addOnLayoutChangeListener(this);
        }
        int w2 = a.w(this.f.a);
        if (w2 != 0 && w2 == 3) {
            this.a.getViewTreeObserver().addOnDrawListener(this.o);
        }
    }

    public final gbo c() {
        if (!e() && !this.l) {
            gbo gboVar = this.e;
            if (gboVar != null) {
                return gboVar;
            }
            for (ViewParent parent = this.a.getParent(); parent != null && (parent instanceof View); parent = parent.getParent()) {
                View view = (View) parent;
                gbo b = b(view);
                if (b != null) {
                    if (this.k) {
                        this.e = b;
                    }
                    return b;
                }
                if (f(view)) {
                    break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set, java.lang.Object] */
    public final void d() {
        j();
        int i2 = i();
        if (i2 != this.p) {
            this.p = i2;
            if (this.c) {
                ddg ddgVar = this.h;
                gbo gboVar = this.b;
                if (!ddgVar.a.isEmpty()) {
                    for (njz njzVar : ddgVar.a) {
                        Object obj = njzVar.a;
                        long c = fzo.c();
                        if (c != -1) {
                            ljj ljjVar = gboVar.c;
                            long j = c * 1000;
                            if (!ljjVar.b.y()) {
                                ljjVar.t();
                            }
                            gbs gbsVar = (gbs) ljjVar.b;
                            gbs gbsVar2 = gbs.h;
                            gbsVar.a |= 4;
                            gbsVar.e = j;
                        }
                        if (((gcc) njzVar.a).b.d(gboVar, i2)) {
                            ((gcc) njzVar.a).b();
                        }
                    }
                }
            }
        }
        this.g = null;
    }

    public final boolean e() {
        if (!f(this.a) && !this.l) {
            return false;
        }
        return true;
    }

    public final void h(boolean z) {
        if (this.l != z) {
            boolean z2 = true;
            hwx.U(true);
            if (z && f(this.a)) {
                z2 = false;
            }
            hwx.J(z2);
            ((jni) ((jni) i.e()).j("com/google/android/libraries/logging/ve/ViewNode", "setIsolated", 152, "ViewNode.java")).u("setIsolated %s", this.a);
            if (this.k) {
                k();
            }
            this.l = z;
            if (this.k) {
                l();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:            if (r8.a.getBottom() < r8.m.bottom) goto L26;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i() {
        /*
            r8 = this;
            android.view.View r0 = r8.a
            int r0 = r0.getVisibility()
            r1 = 2
            if (r0 == 0) goto La
            return r1
        La:
            boolean r0 = r8.l
            if (r0 == 0) goto L18
            android.view.View r0 = r8.a
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L17
            goto L18
        L17:
            return r1
        L18:
            gel r0 = r8.f
            int r0 = r0.a
            int r0 = defpackage.a.w(r0)
            r2 = 1
            if (r0 != 0) goto L25
            goto Lcc
        L25:
            if (r0 == r2) goto Lcc
            android.view.ViewGroup r0 = r8.d
            if (r0 != 0) goto L2c
            return r1
        L2c:
            android.graphics.Rect r3 = r8.m
            int r0 = r0.getScrollX()
            android.view.ViewGroup r4 = r8.d
            int r4 = r4.getScrollY()
            android.view.ViewGroup r5 = r8.d
            int r5 = r5.getWidth()
            android.view.ViewGroup r6 = r8.d
            int r6 = r6.getScrollX()
            int r5 = r5 + r6
            android.view.ViewGroup r6 = r8.d
            int r6 = r6.getHeight()
            android.view.ViewGroup r7 = r8.d
            int r7 = r7.getScrollY()
            int r6 = r6 + r7
            r3.set(r0, r4, r5, r6)
            android.view.View r0 = r8.a
            android.graphics.Rect r3 = r8.m
            int r0 = r0.getLeft()
            int r3 = r3.left
            if (r0 > r3) goto L85
            android.view.View r0 = r8.a
            android.graphics.Rect r3 = r8.m
            int r0 = r0.getTop()
            int r3 = r3.top
            if (r0 > r3) goto L85
            android.view.View r0 = r8.a
            android.graphics.Rect r3 = r8.m
            int r0 = r0.getRight()
            int r3 = r3.right
            if (r0 < r3) goto L85
            android.view.View r0 = r8.a
            android.graphics.Rect r3 = r8.m
            int r0 = r0.getBottom()
            int r3 = r3.bottom
            if (r0 >= r3) goto Lcc
        L85:
            android.graphics.Rect r0 = r8.m
            android.view.View r3 = r8.a
            int r4 = r3.getLeft()
            int r5 = r3.getTop()
            int r6 = r3.getRight()
            int r3 = r3.getBottom()
            boolean r0 = r0.intersect(r4, r5, r6, r3)
            if (r0 == 0) goto Lcb
            android.graphics.Rect r0 = r8.m
            r0.toString()
            android.graphics.Rect r0 = r8.m
            int r3 = r0.width()
            int r0 = r0.height()
            int r3 = r3 * r0
            android.view.View r0 = r8.a
            int r4 = r0.getWidth()
            int r0 = r0.getHeight()
            int r4 = r4 * r0
            gel r0 = r8.f
            int r3 = r3 * 100
            int r3 = r3 / r4
            gei r0 = r0.c
            if (r0 != 0) goto Lc7
            gei r0 = defpackage.gei.b
        Lc7:
            int r0 = r0.a
            if (r3 >= r0) goto Lcc
        Lcb:
            return r1
        Lcc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbv.i():int");
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        int w = a.w(this.f.a);
        boolean z2 = true;
        if (w != 0 && w == 2) {
            if (this.n && view == this.d) {
                this.n = false;
                return;
            }
            View view2 = this.a;
            if (view == view2) {
                z = false;
            } else {
                z = true;
            }
            if (view == view2) {
                this.n = true;
            } else {
                this.n = false;
            }
            if (this.d == null) {
                hwx.U(!z);
                ViewGroup viewGroup = (ViewGroup) this.a.getParent();
                this.d = viewGroup;
                viewGroup.addOnLayoutChangeListener(this);
            }
        } else if (view == this.a) {
            if (this.d != null) {
                z2 = false;
            }
            hwx.U(z2);
            ViewGroup viewGroup2 = (ViewGroup) this.a.getParent();
            this.d = viewGroup2;
            viewGroup2.addOnLayoutChangeListener(this);
            this.a.removeOnLayoutChangeListener(this);
        }
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ((jni) ((jni) i.e()).j("com/google/android/libraries/logging/ve/ViewNode", "onViewAttachedToWindow", 389, "ViewNode.java")).y("onViewAttachedToWindow self=%s, view=%s", this.a, view);
        hwx.U(!this.k);
        this.k = true;
        l();
        if (this.k && !this.c) {
            this.c = true;
            this.h.z(this.b);
        }
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((jni) ((jni) i.e()).j("com/google/android/libraries/logging/ve/ViewNode", "onViewDetachedFromWindow", 405, "ViewNode.java")).y("onViewDetachedToWindow self=%s, view=%s", this.a, view);
        hwx.U(this.k);
        this.k = false;
        k();
        if (this.c) {
            this.c = false;
            this.h.A(this.b);
            this.e = null;
        }
    }
}
