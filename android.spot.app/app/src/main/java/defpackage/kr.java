package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kr {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int k;
    public boolean m;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public List l = null;

    public final View a(lw lwVar) {
        List list = this.l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((mh) this.l.get(i)).b;
                ls lsVar = (ls) view.getLayoutParams();
                if (!lsVar.cD() && this.d == lsVar.cB()) {
                    c(view);
                    return view;
                }
            }
            return null;
        }
        View b = lwVar.b(this.d);
        this.d += this.e;
        return b;
    }

    public final void b() {
        c(null);
    }

    public final void c(View view) {
        int cB;
        int size = this.l.size();
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        while (true) {
            if (i >= size) {
                break;
            }
            View view3 = ((mh) this.l.get(i)).b;
            ls lsVar = (ls) view3.getLayoutParams();
            if (view3 != view && !lsVar.cD() && (cB = (lsVar.cB() - this.d) * this.e) >= 0 && cB < i2) {
                if (cB == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i2 = cB;
                }
            }
            i++;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((ls) view2.getLayoutParams()).cB();
        }
    }

    public final boolean d(me meVar) {
        int i = this.d;
        if (i >= 0 && i < meVar.a()) {
            return true;
        }
        return false;
    }
}
