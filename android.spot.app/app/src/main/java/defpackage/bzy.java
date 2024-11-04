package defpackage;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzy {
    public static void a(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static Interpolator b(Context context, int i) {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, i);
        amr.p(loadInterpolator, "Failed to parse interpolator, no start tag found");
        return loadInterpolator;
    }
}
