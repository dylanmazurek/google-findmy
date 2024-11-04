package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhf {
    public static final bhh a;

    static {
        bhh bhgVar;
        if (Build.VERSION.SDK_INT >= 23) {
            bhgVar = new bhb();
        } else {
            bhgVar = new bhg();
        }
        a = bhgVar;
    }

    public static final StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, int i6, int i7, int i8, int i9) {
        return a.a(new bhi(charSequence, i2, textPaint, i, textDirectionHeuristic, alignment, i3, truncateAt, i4, i5, i6, i7, i8, i9));
    }
}
