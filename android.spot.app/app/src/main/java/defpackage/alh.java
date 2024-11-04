package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alh {
    public static final boolean a(float f) {
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) > 2139095040) {
            return true;
        }
        return false;
    }
}
