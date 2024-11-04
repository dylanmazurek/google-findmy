package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afy implements Iterable, aoj, mpq {
    private final afx a;
    private final int b;
    private final int c;

    public afy(afx afxVar, int i, int i2) {
        this.a = afxVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        aav aavVar;
        int i;
        if (this.a.g != this.c) {
            afz.l();
        }
        afx afxVar = this.a;
        int i2 = this.b;
        HashMap hashMap = afxVar.i;
        acx acxVar = null;
        if (hashMap != null) {
            if (afxVar.f) {
                abr.i("use active SlotWriter to crate an anchor for location instead");
            }
            if (i2 >= 0 && i2 < (i = afxVar.b)) {
                aavVar = afz.k(afxVar.h, i2, i);
            } else {
                aavVar = null;
            }
            if (aavVar != null) {
                acxVar = (acx) hashMap.get(aavVar);
            }
        }
        if (acxVar != null) {
            return new agr();
        }
        afx afxVar2 = this.a;
        int i3 = this.b;
        return new acw(afxVar2, i3 + 1, i3 + afz.c(afxVar2.a, i3));
    }
}
