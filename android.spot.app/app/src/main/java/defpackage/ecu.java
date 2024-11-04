package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ecu implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ecu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.b;
        BottomSheetBehavior bottomSheetBehavior = null;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            ((View) this.a).getVisibility();
                            return;
                        }
                        isp ispVar = (isp) this.a;
                        if (ispVar.e.getVisibility() == 0) {
                            ImageView imageView = ispVar.e;
                            if (ispVar.F()) {
                                hrc.b(ispVar.k, imageView);
                            }
                        }
                        if (ispVar.l == 1) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ispVar.c.getLayoutParams();
                            int i10 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ispVar.d.getLayoutParams();
                            int i11 = ispVar.h;
                            int measuredWidth = ispVar.getMeasuredWidth();
                            int i12 = ispVar.j;
                            layoutParams2.width = Math.max(i10, Math.min(i11, measuredWidth - (i12 + i12)));
                            ispVar.d.setLayoutParams(layoutParams2);
                            return;
                        }
                        return;
                    }
                    Object obj = this.a;
                    ((evu) obj).d.e(Integer.valueOf(i4 - i2), null);
                    return;
                }
                ((evu) this.a).q();
                evu evuVar = (evu) this.a;
                BottomSheetBehavior bottomSheetBehavior2 = evuVar.b;
                if (bottomSheetBehavior2 != null && !evuVar.c) {
                    bottomSheetBehavior2.f = evuVar.g();
                    return;
                }
                return;
            }
            BottomSheetBehavior aH = ((ect) this.a).aH();
            if (aH == null) {
                return;
            }
            aH.G(i4 - i2);
            return;
        }
        jer c = ((ecw) this.a).af.c();
        if (c.g()) {
            bottomSheetBehavior = ((evq) c.c()).i();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.G(i4 - i2);
        }
    }

    public ecu(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
