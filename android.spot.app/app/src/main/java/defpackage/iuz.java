package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuz implements iva {
    private final iva a;
    private final float b;

    public iuz(float f, iva ivaVar) {
        while (ivaVar instanceof iuz) {
            ivaVar = ((iuz) ivaVar).a;
            f += ((iuz) ivaVar).b;
        }
        this.a = ivaVar;
        this.b = f;
    }

    @Override // defpackage.iva
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuz)) {
            return false;
        }
        iuz iuzVar = (iuz) obj;
        if (this.a.equals(iuzVar.a) && this.b == iuzVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
