package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.material.card.MaterialCardView;
import java.io.Closeable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzd extends cmd {
    public static final /* synthetic */ int w = 0;
    private final dzb x;

    public dzd(dzb dzbVar) {
        this.x = dzbVar;
        z("transitionName:container_bottom_sheet_scroll");
    }

    @Override // defpackage.cmd
    public final Animator a(ViewGroup viewGroup, cmn cmnVar, cmn cmnVar2) {
        Integer num;
        Object obj;
        evq evqVar = this.x.a;
        evqVar.getClass();
        MaterialCardView j = evqVar.j();
        if (j != null) {
            bya e = bwn.e(this.x.K());
            if (e != null) {
                num = Integer.valueOf(e.f(1).c);
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = this.x.F().getResources().getDisplayMetrics().heightPixels + num.intValue();
                if (cmnVar2 != null) {
                    obj = cmnVar2.a.get("device_panel_entry_transition:height");
                } else {
                    obj = null;
                }
                obj.getClass();
                int intValue2 = ((Integer) obj).intValue();
                Object obj2 = cmnVar2.a.get("device_panel_entry_transition:corner_radius");
                obj2.getClass();
                float floatValue = ((Float) obj2).floatValue();
                AnimatorSet animatorSet = new AnimatorSet();
                Animator[] animatorArr = new Animator[3];
                bsd.g(j, intValue);
                Closeable k = evqVar.k();
                ValueAnimator ofInt = ValueAnimator.ofInt(intValue, intValue2);
                ofInt.setStartDelay(100L);
                ofInt.setDuration(500L);
                ofInt.setInterpolator(new ced());
                ofInt.addUpdateListener(new bwy(j, 3, null));
                ofInt.addListener(new dzc(j, k));
                ofInt.getClass();
                animatorArr[0] = ofInt;
                ArrayList arrayList = new ArrayList();
                int childCount = j.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = j.getChildAt(i);
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat.getClass();
                    arrayList.add(ofFloat);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setStartDelay(400L);
                animatorSet2.setDuration(200L);
                animatorSet2.setInterpolator(new LinearInterpolator());
                animatorSet2.playTogether(arrayList);
                animatorArr[1] = animatorSet2;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, floatValue);
                ofFloat2.setStartDelay(100L);
                ofFloat2.setDuration(500L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.addUpdateListener(new bwy(j, 4, null));
                ofFloat2.getClass();
                animatorArr[2] = ofFloat2;
                animatorSet.playTogether(animatorArr);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // defpackage.cmd
    public final void b(cmn cmnVar) {
        MaterialCardView j = this.x.a.j();
        if (j == null) {
            return;
        }
        cmnVar.a.put("device_panel_entry_transition:height", Integer.valueOf(Math.min(j.getHeight(), this.x.a.g())));
        cmnVar.a.put("device_panel_entry_transition:corner_radius", Float.valueOf(j.i.d.u()));
    }

    @Override // defpackage.cmd
    public final void c(cmn cmnVar) {
    }
}
