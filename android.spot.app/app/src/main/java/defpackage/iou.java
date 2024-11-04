package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iou extends ion {
    private final Boolean a;
    private final bya b;
    private Window c;
    private boolean d;

    public iou(View view, bya byaVar) {
        ColorStateList d;
        Integer num;
        this.b = byaVar;
        ivf ivfVar = BottomSheetBehavior.x(view).d;
        if (ivfVar != null) {
            d = ivfVar.A();
        } else {
            d = bwb.d(view);
        }
        if (d == null) {
            ColorStateList b = iqh.b(view.getBackground());
            if (b != null) {
                num = Integer.valueOf(b.getDefaultColor());
            } else {
                num = null;
            }
            if (num != null) {
                this.a = Boolean.valueOf(iqg.i(num.intValue()));
                return;
            } else {
                this.a = null;
                return;
            }
        }
        this.a = Boolean.valueOf(iqg.i(d.getDefaultColor()));
    }

    private final void e(View view) {
        boolean booleanValue;
        if (view.getTop() < this.b.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                if (bool == null) {
                    booleanValue = this.d;
                } else {
                    booleanValue = bool.booleanValue();
                }
                iqg.j(window, booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), this.b.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                iqg.j(window2, this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.ion
    public final void a(View view, float f) {
        e(view);
    }

    @Override // defpackage.ion
    public final void b(View view, int i) {
        e(view);
    }

    @Override // defpackage.ion
    public final void c(View view) {
        e(view);
    }

    public final void d(Window window) {
        bqs bybVar;
        if (this.c != window) {
            this.c = window;
            if (window != null) {
                window.getDecorView();
                if (Build.VERSION.SDK_INT >= 35) {
                    bybVar = new byf(window);
                } else if (Build.VERSION.SDK_INT >= 30) {
                    bybVar = new bye(window);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    bybVar = new byd(window);
                } else if (Build.VERSION.SDK_INT >= 23) {
                    bybVar = new byc(window);
                } else {
                    bybVar = new byb(window);
                }
                this.d = bybVar.f();
            }
        }
    }
}
