package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yh {
    public static final /* synthetic */ int a = 0;
    private static final FillElement b = new FillElement(2, 1.0f);
    private static final WrapContentElement c;
    private static final WrapContentElement d;

    static {
        int i = aon.a;
        c = ce.j(aom.k);
        d = ce.j(aom.j);
    }

    public static final aox a(aox aoxVar, float f) {
        FillElement fillElement;
        if (f == 1.0f) {
            fillElement = b;
        } else {
            fillElement = new FillElement(2, f);
        }
        return aoxVar.a(fillElement);
    }

    public static /* synthetic */ aox b() {
        int i = aon.a;
        aop aopVar = aom.k;
        if (amr.i(aopVar, aopVar)) {
            return c;
        }
        if (amr.i(aopVar, aom.j)) {
            return d;
        }
        return ce.j(aopVar);
    }
}
