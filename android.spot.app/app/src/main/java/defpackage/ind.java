package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ind implements TypeEvaluator {
    public static final Integer a(float f, Integer num, Integer num2) {
        int intValue = num.intValue() >> 24;
        int intValue2 = num2.intValue() >> 24;
        float pow = (float) Math.pow(((r12 >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((r12 >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((r12 & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((r13 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((r13 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((r13 & 255) / 255.0f, 2.2d);
        float f2 = (intValue & 255) / 255.0f;
        return Integer.valueOf((Math.round((f2 + (f * (((intValue2 & 255) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(((float) Math.pow(pow + ((pow4 - pow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(pow2 + ((pow5 - pow2) * f), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow3 + ((pow6 - pow3) * f), 0.45454545454545453d)) * 255.0f));
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return a(f, (Integer) obj, (Integer) obj2);
    }
}
