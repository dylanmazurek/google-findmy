package defpackage;

import android.graphics.Path;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bza {
    public static Interpolator a(Path path) {
        return new PathInterpolator(path);
    }

    static Interpolator b(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    public static Interpolator c(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    public static final void d(View view, cjz cjzVar) {
        view.getClass();
        view.setTag(R.id.view_tree_saved_state_registry_owner, cjzVar);
    }
}
