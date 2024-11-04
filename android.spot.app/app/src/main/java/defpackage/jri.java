package defpackage;

import java.math.BigDecimal;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jri implements Comparable {
    public final BigDecimal a;
    public final BigDecimal b;
    public final BigDecimal c;

    public jri(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        jri jriVar = (jri) obj;
        int compareTo = this.a.compareTo(jriVar.a);
        if (compareTo != 0 || (compareTo = this.b.compareTo(jriVar.b)) != 0) {
            return compareTo;
        }
        return this.c.compareTo(jriVar.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jri)) {
            return false;
        }
        jri jriVar = (jri) obj;
        if (!this.a.equals(jriVar.a) || !this.b.equals(jriVar.b) || !this.c.equals(jriVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public jri(jro jroVar) {
        this(new BigDecimal(jroVar.b), new BigDecimal(jroVar.c), new BigDecimal(jroVar.d));
    }
}
