package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class j implements Animation.AnimationListener {
    public static final /* synthetic */ int e = 0;
    final /* synthetic */ ca a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ View c;
    final /* synthetic */ k d;

    public j(ca caVar, ViewGroup viewGroup, View view, k kVar) {
        this.a = caVar;
        this.b = viewGroup;
        this.c = view;
        this.d = kVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.b;
        viewGroup.post(new ci(viewGroup, this.c, this.d, 1));
        if (be.Z(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (be.Z(2)) {
            Objects.toString(this.a);
        }
    }
}
