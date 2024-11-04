package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cae extends byq {
    final /* synthetic */ caf a;

    public cae(caf cafVar) {
        this.a = cafVar;
    }

    @Override // defpackage.byq
    public final byn a(int i) {
        return new byn(AccessibilityNodeInfo.obtain(this.a.j(i).b));
    }

    @Override // defpackage.byq
    public final byn b(int i) {
        int i2;
        if (i == 2) {
            i2 = this.a.c;
        } else {
            i2 = this.a.d;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.byq
    public final boolean d(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        caf cafVar = this.a;
        if (i != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 64) {
                        if (i2 != 128) {
                            return cafVar.q(i, i2);
                        }
                        return cafVar.o(i);
                    }
                    if (cafVar.a.isEnabled() && cafVar.a.isTouchExplorationEnabled() && (i4 = cafVar.c) != i) {
                        if (i4 != Integer.MIN_VALUE) {
                            cafVar.o(i4);
                        }
                        cafVar.c = i;
                        cafVar.b.invalidate();
                        cafVar.r(i, 32768);
                        return true;
                    }
                } else {
                    return cafVar.p(i);
                }
            } else if ((cafVar.b.isFocused() || cafVar.b.requestFocus()) && (i3 = cafVar.d) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    cafVar.p(i3);
                }
                if (i != Integer.MIN_VALUE) {
                    cafVar.d = i;
                    cafVar.n(i, true);
                    cafVar.r(i, 8);
                    return true;
                }
            }
            return false;
        }
        return cafVar.b.performAccessibilityAction(i2, bundle);
    }
}
