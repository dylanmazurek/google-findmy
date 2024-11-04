package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eru {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Object e;
    private final int f = R.raw.inner_star;
    private final int g = R.raw.outer_star;

    public eru(Integer num, Integer num2, Integer num3, Integer num4, Object obj) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eru)) {
            return false;
        }
        eru eruVar = (eru) obj;
        int i = eruVar.f;
        int i2 = eruVar.g;
        if (amr.i(this.a, eruVar.a) && amr.i(this.b, eruVar.b) && amr.i(this.c, eruVar.c) && amr.i(this.d, eruVar.d) && amr.i(this.e, eruVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.a.hashCode() + 1707103738) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        Object obj = this.e;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "ProximityUiConfig(innerStarRes=2131886102, outerStarRes=2131886108, outerCompassRes=" + this.a + ", innerCompassRes=" + this.b + ", innerCompassCelebrationRes=" + this.c + ", dialPrecisionRes=" + this.d + ", deviceImageGlideModel=" + this.e + ")";
    }
}
