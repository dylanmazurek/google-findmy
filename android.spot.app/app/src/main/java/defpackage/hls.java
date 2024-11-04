package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hls {
    public static final Property a = new hlr(Float.class);
    public final ViewTreeObserver.OnScrollChangedListener b = new hlq(this, 0);
    public final ViewTreeObserver.OnGlobalLayoutListener c = new gy(this, 6, null);
    public final View d;
    private final ObjectAnimator e;
    private boolean f;

    public hls(ExpandableDialogView expandableDialogView, Property property, View view) {
        this.f = true;
        this.d = view;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(expandableDialogView, (Property<ExpandableDialogView, Float>) property, 0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(115L);
        ofFloat.setInterpolator(new LinearInterpolator());
        b();
        if (!view.canScrollVertically(-1)) {
            this.f = false;
        }
    }

    public final void a() {
        float f;
        if (this.f == this.d.canScrollVertically(-1)) {
            return;
        }
        this.f = !this.f;
        this.e.cancel();
        ObjectAnimator objectAnimator = this.e;
        float floatValue = ((Float) objectAnimator.getAnimatedValue()).floatValue();
        if (true != this.f) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        objectAnimator.setFloatValues(floatValue, f);
        this.e.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.d.getViewTreeObserver().addOnScrollChangedListener(this.b);
        this.d.getViewTreeObserver().addOnGlobalLayoutListener(this.c);
    }
}
