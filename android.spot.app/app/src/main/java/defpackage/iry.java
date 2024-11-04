package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iry extends cmd {
    private static final void e(cmn cmnVar) {
        View view = cmnVar.b;
        if (view instanceof TextView) {
            cmnVar.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.cmd
    public final Animator a(ViewGroup viewGroup, cmn cmnVar, cmn cmnVar2) {
        float f;
        if (cmnVar != null && cmnVar2 != null && (cmnVar.b instanceof TextView)) {
            View view = cmnVar2.b;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                Map map = cmnVar.a;
                Map map2 = cmnVar2.a;
                float f2 = 1.0f;
                if (map.get("android:textscale:scale") != null) {
                    f = ((Float) map.get("android:textscale:scale")).floatValue();
                } else {
                    f = 1.0f;
                }
                if (map2.get("android:textscale:scale") != null) {
                    f2 = ((Float) map2.get("android:textscale:scale")).floatValue();
                }
                if (f != f2) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
                    ofFloat.addUpdateListener(new ioj(textView, 2));
                    return ofFloat;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.cmd
    public final void b(cmn cmnVar) {
        e(cmnVar);
    }

    @Override // defpackage.cmd
    public final void c(cmn cmnVar) {
        e(cmnVar);
    }
}
