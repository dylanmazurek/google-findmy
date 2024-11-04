package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class caf extends buk {
    private static final Rect e = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager a;
    public final View b;
    private cae j;
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final int[] i = new int[2];
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;

    public caf(View view) {
        this.b = view;
        this.a = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.buk
    public final byq a(View view) {
        if (this.j == null) {
            this.j = new cae(this);
        }
        return this.j;
    }

    @Override // defpackage.buk
    public final void c(View view, byn bynVar) {
        super.c(view, bynVar);
        l(bynVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byn j(int i) {
        boolean z;
        if (i == -1) {
            byn bynVar = new byn(AccessibilityNodeInfo.obtain(this.b));
            View view = this.b;
            int[] iArr = bwn.a;
            view.onInitializeAccessibilityNodeInfo(bynVar.b);
            ArrayList arrayList = new ArrayList();
            k(arrayList);
            if (bynVar.b.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                bynVar.k(this.b, ((Integer) arrayList.get(i2)).intValue());
            }
            return bynVar;
        }
        byn b = byn.b();
        b.z(true);
        b.B(true);
        b.t("android.view.View");
        Rect rect = e;
        b.p(rect);
        b.q(rect);
        b.L(this.b);
        m(i, b);
        if (b.f() == null && b.e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        b.l(this.g);
        b.m(this.f);
        if (this.g.equals(rect) && this.f.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = b.b.getActions();
        if ((actions & 64) == 0) {
            if ((actions & 128) == 0) {
                b.J(this.b.getContext().getPackageName());
                b.Q(this.b, i);
                if (this.c == i) {
                    b.n(true);
                    b.i(128);
                } else {
                    b.n(false);
                    b.i(64);
                }
                if (this.d == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    b.i(2);
                } else if (b.Z()) {
                    b.i(1);
                }
                b.C(z);
                this.b.getLocationOnScreen(this.i);
                if (this.f.equals(rect)) {
                    Rect rect2 = this.g;
                    b.p(rect2);
                    Rect rect3 = new Rect();
                    rect3.set(rect2);
                    if (b.c != -1) {
                        byn b2 = byn.b();
                        Rect rect4 = new Rect();
                        for (int i3 = b.c; i3 != -1; i3 = b2.c) {
                            b2.M(this.b, -1);
                            b2.p(e);
                            m(i3, b2);
                            b2.l(rect4);
                            rect3.offset(rect4.left, rect4.top);
                        }
                    }
                    this.b.getLocationOnScreen(this.i);
                    rect3.offset(this.i[0] - this.b.getScrollX(), this.i[1] - this.b.getScrollY());
                    b.q(rect3);
                    b.m(this.f);
                }
                if (this.b.getLocalVisibleRect(this.h)) {
                    this.h.offset(this.i[0] - this.b.getScrollX(), this.i[1] - this.b.getScrollY());
                    if (this.f.intersect(this.h)) {
                        b.q(this.f);
                        Rect rect5 = this.f;
                        if (rect5 != null && !rect5.isEmpty() && this.b.getWindowVisibility() == 0) {
                            Object parent = this.b.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view2 = (View) parent;
                                    if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view2.getParent();
                                } else if (parent != null) {
                                    b.U(true);
                                }
                            }
                        }
                    }
                }
                return b;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    protected abstract void k(List list);

    protected void l(byn bynVar) {
        throw null;
    }

    protected abstract void m(int i, byn bynVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(int i, boolean z) {
        throw null;
    }

    public final boolean o(int i) {
        if (this.c == i) {
            this.c = Integer.MIN_VALUE;
            this.b.invalidate();
            r(i, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
            return true;
        }
        return false;
    }

    public final boolean p(int i) {
        if (this.d != i) {
            return false;
        }
        this.d = Integer.MIN_VALUE;
        n(i, false);
        r(i, 8);
        return true;
    }

    public abstract boolean q(int i, int i2);

    public final void r(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i != Integer.MIN_VALUE && this.a.isEnabled() && (parent = this.b.getParent()) != null) {
            if (i != -1) {
                obtain = AccessibilityEvent.obtain(i2);
                byn j = j(i);
                obtain.getText().add(j.f());
                obtain.setContentDescription(j.e());
                obtain.setScrollable(j.ac());
                obtain.setPassword(j.ab());
                obtain.setEnabled(j.Y());
                obtain.setChecked(j.W());
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                obtain.setClassName(j.d());
                obtain.setSource(this.b, i);
                obtain.setPackageName(this.b.getContext().getPackageName());
            } else {
                obtain = AccessibilityEvent.obtain(i2);
                this.b.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(this.b, obtain);
        }
    }
}
