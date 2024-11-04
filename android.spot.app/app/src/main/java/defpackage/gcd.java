package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcd {
    final /* synthetic */ gce a;
    private int b = -1;

    public gcd(gce gceVar) {
        this.a = gceVar;
    }

    public final void a(gbo gboVar) {
        boolean z;
        hwx.U(gboVar.b());
        ljj ljjVar = gboVar.c;
        juv juvVar = ((gbs) ljjVar.b).c;
        if (juvVar == null) {
            juvVar = juv.e;
        }
        if ((juvVar.a & 2048) != 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.U(z);
        int D = a.D(((gbs) ljjVar.b).d);
        if (D != 0 && D != 1) {
            return;
        }
        gce gceVar = this.a;
        int size = gceVar.e.size();
        gceVar.e.add(gboVar.a());
        gce gceVar2 = this.a;
        gceVar2.f.put(size, this.b);
        int i = this.b;
        this.b = size;
        View view = gboVar.b.a;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                gbv.g(viewGroup.getChildAt(i2), this);
            }
        }
        this.b = i;
    }
}
