package defpackage;

import android.view.View;
import com.google.android.apps.adm.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ix {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static final void b(View view, oy oyVar) {
        view.getClass();
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, oyVar);
    }

    public static final void c() {
        throw new IllegalStateException("Size is unspecified");
    }

    public static final String d(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            if (f < 0.0f) {
                return "-Infinity";
            }
            return "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        if (max > 0) {
            return String.valueOf(f3);
        }
        return String.valueOf((int) f3);
    }
}
