package com.google.android.material.bottomsheet;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.adm.R;
import defpackage.bop;
import defpackage.bos;
import defpackage.bwn;
import defpackage.ion;
import defpackage.ioy;
import defpackage.ioz;
import defpackage.iyj;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    private final AccessibilityManager a;
    private BottomSheetBehavior b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final String f;
    private final String g;
    private final String h;
    private final ion i;

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }

    private final void c(BottomSheetBehavior bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.b;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.C(this.i);
            this.b.D(null);
        }
        this.b = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.D(this);
            a(this.b.y);
            this.b.y(this.i);
        }
        d();
    }

    private final void d() {
        int i = 1;
        boolean z = false;
        if (this.c && this.b != null) {
            z = true;
        }
        this.d = z;
        if (this.b == null) {
            i = 2;
        }
        setImportantForAccessibility(i);
        setClickable(this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r3) {
        /*
            r2 = this;
            r0 = 4
            if (r3 != r0) goto L7
            r3 = 1
        L4:
            r2.e = r3
            goto Lc
        L7:
            r0 = 3
            if (r3 != r0) goto Lc
            r3 = 0
            goto L4
        Lc:
            byi r3 = defpackage.byi.a
            boolean r0 = r2.e
            if (r0 == 0) goto L15
            java.lang.String r0 = r2.f
            goto L17
        L15:
            java.lang.String r0 = r2.g
        L17:
            iox r1 = new iox
            r1.<init>()
            defpackage.bwn.o(r2, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.a(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:            if (true != r1) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:            r3 = 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:            if (true != r1) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:            if (true != r7.e) goto L19;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r7 = this;
            boolean r0 = r7.d
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r7.h
            android.view.accessibility.AccessibilityManager r1 = r7.a
            if (r1 == 0) goto L1e
            r1 = 16384(0x4000, float:2.2959E-41)
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain(r1)
            java.util.List r2 = r1.getText()
            r2.add(r0)
            android.view.accessibility.AccessibilityManager r0 = r7.a
            r0.sendAccessibilityEvent(r1)
        L1e:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.b
            boolean r1 = r0.a
            int r2 = r0.y
            r3 = 6
            r4 = 3
            r5 = 4
            r6 = 1
            if (r2 != r5) goto L2f
            if (r6 == r1) goto L2d
            goto L39
        L2d:
            r3 = 3
            goto L39
        L2f:
            if (r2 != r4) goto L34
            if (r6 == r1) goto L38
            goto L39
        L34:
            boolean r1 = r7.e
            if (r6 == r1) goto L2d
        L38:
            r3 = 4
        L39:
            r0.H(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.b():boolean");
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.c = z;
        d();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        BottomSheetBehavior bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof bos) {
                bop bopVar = ((bos) layoutParams).a;
                if (bopVar instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) bopVar;
                    break;
                }
            }
        }
        c(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.a.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        c(null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
        super(iyj.a(context, attributeSet, i, R.style.Widget_Material3_BottomSheet_DragHandle), attributeSet, i);
        this.f = getResources().getString(R.string.bottomsheet_action_expand);
        this.g = getResources().getString(R.string.bottomsheet_action_collapse);
        this.h = getResources().getString(R.string.bottomsheet_drag_handle_clicked);
        this.i = new ioy(this);
        this.a = (AccessibilityManager) getContext().getSystemService("accessibility");
        d();
        bwn.q(this, new ioz(this));
    }
}
