package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dab extends dad {
    private final elo e;

    public dab(List list) {
        super(list);
        elo eloVar = (elo) ((dfc) list.get(0)).b;
        int length = eloVar != null ? ((int[]) eloVar.b).length : 0;
        this.e = new elo(new float[length], new int[length]);
    }

    @Override // defpackage.czw
    public final /* bridge */ /* synthetic */ Object f(dfc dfcVar, float f) {
        elo eloVar = (elo) dfcVar.b;
        elo eloVar2 = (elo) dfcVar.c;
        int length = ((int[]) eloVar.b).length;
        int length2 = ((int[]) eloVar2.b).length;
        if (length == length2) {
            for (int i = 0; i < ((int[]) eloVar.b).length; i++) {
                elo eloVar3 = this.e;
                float f2 = ((float[]) eloVar.a)[i];
                float f3 = ((float[]) eloVar2.a)[i];
                PointF pointF = dew.a;
                ((float[]) eloVar3.a)[i] = f2 + ((f3 - f2) * f);
                ((int[]) eloVar3.b)[i] = bpv.f(f, ((int[]) eloVar.b)[i], ((int[]) eloVar2.b)[i]);
            }
            return this.e;
        }
        throw new IllegalArgumentException(a.aj(length2, length, "Cannot interpolate between gradients. Lengths vary (", " vs ", ")"));
    }
}
