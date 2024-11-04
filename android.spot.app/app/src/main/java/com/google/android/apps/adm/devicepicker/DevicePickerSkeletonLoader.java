package com.google.android.apps.adm.devicepicker;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.adm.R;
import com.google.android.material.card.MaterialCardView;
import defpackage.dzq;
import defpackage.gem;
import defpackage.ivl;
import defpackage.jdl;
import defpackage.jer;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DevicePickerSkeletonLoader extends ConstraintLayout {
    public jer i;
    public boolean j;

    public DevicePickerSkeletonLoader(Context context) {
        super(context);
        this.i = jdl.a;
        this.j = false;
        e();
    }

    private final void e() {
        inflate(getContext(), R.layout.include_adm_devicepicker_fragment_skeleton, this);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        int i2;
        super.setVisibility(i);
        if (i == 8) {
            this.j = false;
            if (this.i.g()) {
                ((Animator) this.i.c()).end();
                return;
            }
            return;
        }
        this.j = true;
        if (this.i.g() && ((Animator) this.i.c()).isRunning()) {
            return;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            MaterialCardView materialCardView = (MaterialCardView) getChildAt(i3);
            materialCardView.findViewById(R.id.icon).setVisibility(4);
            Context context = getContext();
            if (i3 == 0) {
                i2 = R.style.ShapeAppearance_Fmd_DevicePickerItem_AllCorners;
            } else if (i3 == 1) {
                i2 = R.style.ShapeAppearance_Fmd_DevicePickerItem_Top;
            } else if (i3 == childCount - 1) {
                i2 = R.style.ShapeAppearance_Fmd_DevicePickerItem_Bottom;
            } else {
                i2 = R.style.ShapeAppearance_Fmd_DevicePickerItem;
            }
            materialCardView.cy(new ivl(ivl.b(context, i2, 0)));
            materialCardView.setClickable(false);
        }
        int childCount2 = getChildCount();
        ArrayList arrayList = new ArrayList(childCount2);
        for (int i4 = 0; i4 < childCount2; i4++) {
            MaterialCardView materialCardView2 = (MaterialCardView) getChildAt(i4);
            ObjectAnimator duration = ObjectAnimator.ofFloat(materialCardView2, (Property<MaterialCardView, Float>) View.ALPHA, 0.0f).setDuration(500L);
            duration.setStartDelay(i4 * 100);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(materialCardView2, (Property<MaterialCardView, Float>) View.ALPHA, 1.0f).setDuration(1000L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(gem.a);
            animatorSet.playSequentially(duration, duration2);
            arrayList.add(animatorSet);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        animatorSet2.start();
        animatorSet2.addListener(new dzq(this, animatorSet2));
        this.i = jer.i(animatorSet2);
    }

    public DevicePickerSkeletonLoader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = jdl.a;
        this.j = false;
        e();
    }

    public DevicePickerSkeletonLoader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = jdl.a;
        this.j = false;
        e();
    }
}
