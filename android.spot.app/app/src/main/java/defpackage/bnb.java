package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bnb extends bmw {
    public bmw[] aJ = new bmw[4];
    public int aK = 0;

    public final void X(ArrayList arrayList, int i, bnr bnrVar) {
        for (int i2 = 0; i2 < this.aK; i2++) {
            bnrVar.d(this.aJ[i2]);
        }
        for (int i3 = 0; i3 < this.aK; i3++) {
            ce.l(this.aJ[i3], i, arrayList, bnrVar);
        }
    }

    public void Y() {
    }
}
