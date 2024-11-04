package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzy extends cnf {
    public dzy() {
        z("transition_name:device_picker_selected_item");
    }

    @Override // defpackage.cnf
    public final Animator f(View view, cmn cmnVar, cmn cmnVar2) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
    }
}
