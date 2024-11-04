package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzs implements but {
    final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public bzs(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // defpackage.but
    public final float a() {
        float a;
        if (this.b != 0) {
            if (((RecyclerView) this.a).m.Y()) {
                return -((RecyclerView) this.a).I;
            }
            if (!((RecyclerView) this.a).m.X()) {
                return 0.0f;
            }
            a = ((RecyclerView) this.a).H;
        } else {
            a = ((NestedScrollView) this.a).a();
        }
        return -a;
    }

    @Override // defpackage.but
    public final void b() {
        if (this.b != 0) {
            ((RecyclerView) this.a).ab();
        } else {
            ((NestedScrollView) this.a).a.abortAnimation();
        }
    }

    @Override // defpackage.but
    public final boolean c(float f) {
        int i;
        int i2;
        if (this.b != 0) {
            if (((RecyclerView) this.a).m.Y()) {
                i2 = (int) f;
                i = 0;
            } else {
                if (((RecyclerView) this.a).m.X()) {
                    i = (int) f;
                } else {
                    i = 0;
                }
                i2 = 0;
            }
            if (i == 0) {
                if (i2 == 0) {
                    return false;
                }
                i = 0;
            }
            ((RecyclerView) this.a).ab();
            return ((RecyclerView) this.a).ae(i, i2, 0, Integer.MAX_VALUE);
        }
        if (f == 0.0f) {
            return false;
        }
        b();
        ((NestedScrollView) this.a).i((int) f);
        return true;
    }
}
