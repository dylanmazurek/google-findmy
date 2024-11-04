package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kc extends ft {
    final /* synthetic */ ke a;

    public kc(ke keVar) {
        this.a = keVar;
    }

    @Override // defpackage.ft
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        ke keVar = this.a;
        int computeVerticalScrollRange = keVar.l.computeVerticalScrollRange();
        int i3 = keVar.k;
        if (computeVerticalScrollRange - i3 > 0 && i3 >= keVar.a) {
            z = true;
        } else {
            z = false;
        }
        keVar.m = z;
        int computeHorizontalScrollRange = keVar.l.computeHorizontalScrollRange();
        int i4 = keVar.j;
        if (computeHorizontalScrollRange - i4 > 0 && i4 >= keVar.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        keVar.n = z2;
        if (!keVar.m) {
            if (!z2) {
                if (keVar.o != 0) {
                    keVar.h(0);
                    return;
                }
                return;
            }
        } else {
            float f = i3;
            keVar.e = (int) ((f * (computeVerticalScrollOffset + (f / 2.0f))) / computeVerticalScrollRange);
            keVar.d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (keVar.n) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i4;
            keVar.h = (int) ((f3 * (f2 + (f3 / 2.0f))) / computeHorizontalScrollRange);
            keVar.g = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = keVar.o;
        if (i5 != 0 && i5 != 1) {
            return;
        }
        keVar.h(1);
    }
}
