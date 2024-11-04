package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fao {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public fao(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public final void a() {
        int j;
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (!flexboxLayoutManager.K() && flexboxLayoutManager.c) {
            if (this.e) {
                j = flexboxLayoutManager.e.f();
            } else {
                j = flexboxLayoutManager.C - flexboxLayoutManager.e.j();
            }
        } else if (this.e) {
            j = flexboxLayoutManager.e.f();
        } else {
            j = flexboxLayoutManager.e.j();
        }
        this.c = j;
    }

    public final void b() {
        this.a = -1;
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        boolean z = false;
        this.f = false;
        this.g = false;
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (flexboxLayoutManager.K()) {
            if (flexboxLayoutManager.b == 0) {
                if (flexboxLayoutManager.a == 1) {
                    z = true;
                }
                this.e = z;
                return;
            }
            this.e = false;
            return;
        }
        if (flexboxLayoutManager.b == 0) {
            if (flexboxLayoutManager.a == 3) {
                z = true;
            }
            this.e = z;
            return;
        }
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + "}";
    }
}
