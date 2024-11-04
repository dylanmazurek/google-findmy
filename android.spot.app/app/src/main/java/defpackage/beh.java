package defpackage;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beh {
    public static AutofillId a(View view) {
        AutofillId autofillId;
        autofillId = view.getAutofillId();
        return autofillId;
    }

    public static final float b(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final float c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static /* synthetic */ String d(List list, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            amr.d(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
