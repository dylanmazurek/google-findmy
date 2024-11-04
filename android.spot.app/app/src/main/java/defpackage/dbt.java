package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbt extends dcd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbt(List list) {
        super(list);
        for (int i = 0; i < list.size(); i++) {
            dfc dfcVar = (dfc) list.get(i);
            elo eloVar = (elo) dfcVar.b;
            elo eloVar2 = (elo) dfcVar.c;
            if (eloVar != null && eloVar2 != null) {
                Object obj = eloVar.a;
                int length = ((float[]) obj).length;
                Object obj2 = eloVar2.a;
                int length2 = ((float[]) obj2).length;
                if (length != length2) {
                    int i2 = length + length2;
                    float[] fArr = new float[i2];
                    System.arraycopy(obj, 0, fArr, 0, length);
                    System.arraycopy(obj2, 0, fArr, length, length2);
                    Arrays.sort(fArr);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        float f2 = fArr[i4];
                        if (f2 != f) {
                            fArr[i3] = f2;
                            i3++;
                            f = fArr[i4];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr, 0, i3);
                    dfcVar = new dfc(eloVar.K(copyOfRange), eloVar2.K(copyOfRange));
                }
            }
            list.set(i, dfcVar);
        }
    }

    @Override // defpackage.dcc
    public final czw a() {
        return new dab(this.a);
    }
}
