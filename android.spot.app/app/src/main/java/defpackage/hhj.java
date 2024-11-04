package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhj {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public hhj() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        if (this.h > 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hhj) {
            hhj hhjVar = (hhj) obj;
            if (this.a == hhjVar.a && this.b == hhjVar.b && this.c == hhjVar.c) {
                if (Float.floatToIntBits(this.d) == Float.floatToIntBits(hhjVar.d) && this.e == hhjVar.e) {
                    if (Float.floatToIntBits(this.f) == Float.floatToIntBits(hhjVar.f) && this.g == hhjVar.g && this.h == hhjVar.h && this.i == hhjVar.i && this.j == hhjVar.j && this.k == hhjVar.k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d)) * 1000003) ^ this.e) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k;
    }

    public final String toString() {
        return "ExpressSignInAttributes{contentContainerPaddingTop=" + this.a + ", containerExternalHorizontalSpacing=" + this.b + ", containerInternalAdditionalHorizontalSpacing=" + this.c + ", dialogCornerRadius=" + this.d + ", importantBoxBackgroundColor=" + this.e + ", importantBoxCornerRadius=" + this.f + ", importantBoxMarginTop=" + this.g + ", dialogMarginBottom=" + this.h + ", legalDisclaimerBottomPadding=" + this.i + ", legalDisclaimerTopPadding=" + this.j + ", selectedAccountViewMarginVertical=" + this.k + "}";
    }

    public hhj(int i, int i2, int i3, float f, int i4, float f2, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = i4;
        this.f = f2;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
    }
}
