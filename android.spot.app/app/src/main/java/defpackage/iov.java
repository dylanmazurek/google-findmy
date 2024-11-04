package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.adm.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iov extends dp {
    public BottomSheetBehavior a;
    public FrameLayout c;
    public boolean d;
    public boolean e;
    public boolean f;
    public iou g;
    private FrameLayout h;
    private CoordinatorLayout i;
    private final boolean j;
    private final ion k;
    private kpb l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public iov(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968778(0x7f0400ca, float:1.754622E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132018074(0x7f14039a, float:1.9674444E38)
        L1b:
            r3.<init>(r4, r5)
            r3.d = r0
            r3.e = r0
            iot r4 = new iot
            r4.<init>(r3)
            r3.k = r4
            r3.e()
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r5 = 2130969131(0x7f04022b, float:1.7546935E38)
            int[] r5 = new int[]{r5}
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            r5 = 0
            boolean r5 = r4.getBoolean(r5, r5)
            r3.j = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iov.<init>(android.content.Context, int):void");
    }

    private final View h(int i, View view, ViewGroup.LayoutParams layoutParams) {
        j();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.h.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.j) {
            bwb.n(this.c, new dvf(this, 5, null));
        }
        this.c.removeAllViews();
        if (layoutParams == null) {
            this.c.addView(view);
        } else {
            this.c.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new ewu(this, 10, null));
        bwn.q(this.c, new ior(this));
        this.c.setOnTouchListener(new ios());
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, isi] */
    private final void i() {
        kpb kpbVar = this.l;
        if (kpbVar != null) {
            if (this.d) {
                Object obj = kpbVar.b;
                if (obj != null) {
                    ((isj) obj).b(kpbVar.c, (View) kpbVar.a, false);
                    return;
                }
                return;
            }
            kpbVar.m();
        }
    }

    private final void j() {
        if (this.h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.h = frameLayout;
            this.i = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.h.findViewById(R.id.design_bottom_sheet);
            this.c = frameLayout2;
            BottomSheetBehavior x = BottomSheetBehavior.x(frameLayout2);
            this.a = x;
            x.y(this.k);
            this.a.F(this.d);
            this.l = new kpb(this.a, this.c);
        }
    }

    public final BottomSheetBehavior a() {
        if (this.a == null) {
            j();
        }
        return this.a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        a();
        super.cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.j && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            boolean z2 = !z;
            FrameLayout frameLayout = this.h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(z2);
            }
            CoordinatorLayout coordinatorLayout = this.i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(z2);
            }
            bqq.d(window, z2);
            iou iouVar = this.g;
            if (iouVar != null) {
                iouVar.d(window);
            }
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dp, defpackage.od, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        iou iouVar = this.g;
        if (iouVar != null) {
            iouVar.d(null);
        }
        kpb kpbVar = this.l;
        if (kpbVar != null) {
            kpbVar.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.od, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior != null && bottomSheetBehavior.y == 5) {
            bottomSheetBehavior.H(4);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.d != z) {
            this.d = z;
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.F(z);
            }
            if (getWindow() != null) {
                i();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.d) {
            this.d = true;
        }
        this.e = z;
        this.f = true;
    }

    @Override // defpackage.dp, defpackage.od, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(h(i, null, null));
    }

    @Override // defpackage.dp, defpackage.od, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(h(0, view, null));
    }

    @Override // defpackage.dp, defpackage.od, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(h(0, view, layoutParams));
    }
}
