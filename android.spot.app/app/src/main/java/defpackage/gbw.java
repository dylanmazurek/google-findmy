package defpackage;

import android.view.View;
import com.google.android.apps.adm.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbw {
    public final ddg a;

    public gbw(ddg ddgVar) {
        this.a = ddgVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.Set, java.lang.Object] */
    public final void a(View view, gbl gblVar) {
        boolean z;
        boolean z2;
        ijs.c();
        boolean z3 = false;
        if (gblVar.a == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "Cannot create CVE twice.");
        ljj ljjVar = gblVar.b;
        if (!ljjVar.b.y()) {
            ljjVar.t();
        }
        ljh ljhVar = gblVar.c;
        ddg ddgVar = this.a;
        gbs gbsVar = (gbs) ljjVar.b;
        juv juvVar = (juv) ljhVar.q();
        gbs gbsVar2 = gbs.h;
        juvVar.getClass();
        gbsVar.c = juvVar;
        gbsVar.a |= 1;
        gbs gbsVar3 = (gbs) gblVar.b.q();
        ljh ljhVar2 = (ljh) gbsVar3.z(5);
        ljhVar2.w(gbsVar3);
        gblVar.a = new gbo((ljj) ljhVar2, gblVar.d, ddgVar);
        ddg ddgVar2 = gblVar.a.f;
        if (!ddgVar2.a.isEmpty()) {
            Iterator it = ddgVar2.a.iterator();
            while (it.hasNext()) {
                if (!((gcc) ((njz) it.next()).a).d) {
                    ijs.c();
                }
            }
        }
        gbo gboVar = gblVar.a;
        gbo b = gbv.b(view);
        if (b == null) {
            gbv gbvVar = new gbv(view, gboVar);
            gboVar.b = gbvVar;
            gbvVar.a.setTag(R.id.ve_tag, gbvVar.b);
            if (gbvVar.h.B()) {
                gbvVar.a.addOnAttachStateChangeListener(gbvVar);
                View view2 = gbvVar.a;
                int[] iArr = bwn.a;
                if (view2.isAttachedToWindow()) {
                    gbvVar.onViewAttachedToWindow(gbvVar.a);
                    return;
                }
                return;
            }
            return;
        }
        if (!b.b()) {
            if (gboVar.b == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            hwx.U(z2);
            hwx.U(!b.b());
            if (b.e == gboVar.e) {
                z3 = true;
            }
            hwx.U(z3);
            boolean z4 = b.b.c;
            if (z4) {
                b.f.A(b);
            }
            ljj ljjVar2 = b.c;
            if (!ljjVar2.a.y()) {
                ljjVar2.b = ljjVar2.p();
                b.c.w((gbs) gboVar.c.q());
                if (z4) {
                    b.f.z(b);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        if (b.c()) {
            frx.p(new IllegalStateException("CVE is already impressed and cannot be replaced."));
        } else {
            frx.p(new IllegalStateException("CVE is already attached and cannot be replaced."));
        }
    }
}
